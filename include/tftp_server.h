#ifndef TFTPSERVER
#define TFTPSERVER

//#include "main."
#include "main.h"
//#include "../client/tftp_packet.h"
#include "tftp_packet.h"

#define TFTP_SERVER_MAX_CLIENTS 10

#define TFTP_SERVER_REQUEST_UNDEFINED 0
#define TFTP_SERVER_REQUEST_READ 1
#define TFTP_SERVER_REQUEST_WRITE 2

#define TFTP_SERVER_CLIENT_NOT_CONNECTED 0
#define TFTP_SERVER_CLIENT_CONNECTED 1

#define TFPT_SERVER_CLIENT_ACK_WAITING 0
#define TFPT_SERVER_CLIENT_ACK_OK 1

#ifndef WIN32
#define SOCKET int
#endif

using namespace std;

class TFTPServer {

  public:

	struct ServerClient {

		ServerClient() {

			request = TFTP_SERVER_REQUEST_UNDEFINED;
			connected = TFTP_SERVER_CLIENT_NOT_CONNECTED;
			acknowledged = TFPT_SERVER_CLIENT_ACK_WAITING;
			block = 0;
			disconnect_on_ack = false;

		}

		int connected;						//- en línea | sin conexión
		int request;						//- Tipo de solicitud de cliente que ha iniciado sesión
		int block;							//- Numeración de paquetes
		int temp;							//- del winsock/recv() implementacion
		int acknowledged;					//- ¿Es posible enviar al cliente?

		char* ip;							//- dirección IP, para la visualización del mensaje sobre el cliente

		fd_set set;

		SOCKET client_socket;				
		sockaddr_in address;

		ifstream* file_rrq;
		ofstream* file_wrq;
		bool disconnect_on_ack;

		TFTP_Packet last_packet,
					last_sent_packet;		//- mientras que lo enviamos cuando recibimos ACK, Solo se necesita 1 último paquete para almacenar
											//- The sender has to keep just one packet on hand for retransmission, since
											//- El remitente tiene que tener un solo paquete a mano para la retransmisión, ya que
											//- the lock step acknowledgment guarantees that all older packets have
											//- El acuse de recibo por pasos de bloqueo garantiza que todos los paquetes más antiguos hayan sido
											//- recibidos
											//- been received.

	} clients[TFTP_SERVER_MAX_CLIENTS];


	TFTPServer(int port, char* ftproot);
	~TFTPServer();

  private:

    int server_port;
    char* server_ftproot;

    SOCKET server_socket;
    struct sockaddr_in server_address;
    int listener;

  protected:

    int sendBuffer(char *);

	bool sendPacket(TFTP_Packet* packet, ServerClient* client);
	bool sendPacketData(ServerClient* client);

	bool waitForPacket(TFTP_Packet* packet, int current_client_socket, int timeout_ms);
	bool waitForPacketACK(int packet_number, int timeout_ms);

	void acceptClients();
	bool acceptClient(ServerClient* client);

	void receiveFromClients();
	void sendToClients();

	bool receivePacket(ServerClient* client);

	bool sendError(ServerClient* client, int error_no, char* custom_message = (char*)"");
	bool disconnectClient(ServerClient* client);

	void clientStatus(ServerClient* client, char* message);

};

class ETFTPSocketBind: public std::exception {
  virtual const char* what() const throw() {
    return "Unable to bind to an address";
  }
};

class ETFTPSocketCreate: public std::exception {
  virtual const char* what() const throw() {
    return "Unable to create a socket";
  }
};

class ETFTPSocketInitialize: public std::exception {
  virtual const char* what() const throw() {
    return "Unable to find socket library";
  }
};

class ETFTPSocketListen: public std::exception {
  virtual const char* what() const throw() {
    return "Unable to start listening for incoming connectinos";
  }
};

#endif