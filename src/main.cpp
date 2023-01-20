#include <Arduino.h>
#include <time.h>
#include <stdlib.h>
#include <string.h>

// - Conexión Wifi y registro de servicios
#include <ESPmDNS.h>
#include <WiFi.h>

// - Sistema de archivos
#include "SPIFFS.h"

// - Servidor TFTP

#include "./main.h"
#include "./tftp_server.h"



#define MAX_DEVICES 50
#define BASE_NAME "UamSensor"
#define TFTP_PORT 69

//Variable para saber en que momento iniciar el servidor TFTP (Solo una vez)
bool configurado = false;


//Se cambian cuando se conectan a otra red
const char* ssdi = "labred";
const char* psswd = "labred2017";
const char* ssdi2 = "INFINITUMD79B_2.4";
const char* psswd2 = "Agosto2016";


/**
 * @brief Funcion para generar los nombres de los dispositivos
 * 
 * @param nombre 
 * @param claveMax 
 * @return char*
 */

String generarNombre(String nombre, int claveMax){

  srand(time(NULL));

  String nuevoNombre;

  //Numero entre 1 y claveMax
  int numero = 1 + rand() % claveMax;

  String numString = String(numero);
  
  nuevoNombre = nombre+ numString;

  return nuevoNombre;

}




/**
 * @brief En primera instancia se dara de alta el servicio que ofrece el dispositivo
 * para que la aplicacion pueda encontrarlo y posteriormente hacer la comunicación
 * cliente servidor
 */

void setup() {

  int port = TFTP_DEFAULT_PORT;
  String nombreDispositivo;
  Serial.begin(115200);


  /************* CONEXION A WIFI *************************/

  WiFi.begin(ssdi2,psswd2);

  while (WiFi.status()!= WL_CONNECTED){
    delay(1000);
    Serial.println("Conectando al wifi");
  
  }
  /********************************************************/

  /************** CREACION DEL SERVICIO TFTP Y MDNS ***********************/
  nombreDispositivo = generarNombre(BASE_NAME,MAX_DEVICES);

  Serial.print("Nombre");
  Serial.println(nombreDispositivo.c_str());

  if(!MDNS.begin(nombreDispositivo.c_str())){
    Serial.println("Error al iniciar mDNS");
    return;
  } else{
    Serial.println("MDNS iniciado");
  } 
  

  //Agregamos el servicio que ofrece el dispositivo
  MDNS.addService("tftp","udp",TFTP_PORT);

  //Imprimimos la direccion IP de la ESP32
  Serial.print("Ip del dispositivo: ");
  Serial.println(WiFi.localIP());
  /************************************************************************/



  /************************ SISTEMA DE ARCHIVOS ***************************/
  //Agregar sistema de archivos SPIFFS
 
 /*
  if(!SPIFFS.begin(true)){
    Serial.println("Ocurrio un error mientras se montaba SPIFFS");
    return;
  }

  File file = SPIFFS.open("/firmware.json");

  //Se imprime el contenido del archivo
  while(file.available()){
    Serial.write(file.read());
  }

  file.close();

  /************************************************************************/
  

  /***************** SERVIDOR TFTP Y LECTURA DE ARCHIVO *******************/
  Serial.println("Iniciando servidor...");
  Serial.println(configurado);
  
  Serial.print("Starting TFTP server on port: ");
  Serial.println(port);
  
  TFTPServer server(port, (char*)"data/");  
  /*  
  //Se abre el archivo json y se hace la configuracion
  Serial.println("TFTP Server was shut down");
  */

   
}
/****************************************************************************/



/**
 * @brief El servidor estará siempre activo en un bucle recibiendo las peticiones del cliente (app) 
 * ya sea de RRQ o WRQ y este solo empaqueta el archivo json para enviarlo a la aplicacion y 
 * esta pueda realizar su trabajo
 */

void loop() {
  /*Codigo del servidor aqui 
    Se va a ocupar el modo no bloquenate
    Debemos recordar que el servidor va a empaquetar los datos en formato JSON 
  **/ 

    
}

