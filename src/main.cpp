#include <Arduino.h>
#include <ESPmDNS.h>
#include <WiFi.h>
#include <time.h>
#include <stdlib.h>
#include <string.h>
#include "SPIFFS.h"
#include "tftp_server.h"

#define MAX_DEVICES 50
#define BASE_NAME "UamSensor"
#define TFTP_PORT 69

//Variable para saber en que momento iniciar el servidor TFTP (Solo una vez)
bool configurado = false;

//Se instancia un objeto de tipo TFTP 
TFTP server;

//Se cambian cuando se conectan a otra red
const char* ssdi = "labred";
const char* psswd = "labred2017";


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

  String nombreDispositivo;
  Serial.begin(115200);


  /************* CONEXION A WIFI *************************/

  WiFi.begin(ssdi,psswd);

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
  Serial.println("valor de configurado");
  Serial.println(configurado);

   //iniciar servidor TFTP
  if(configurado == false) {
    Serial.print("Servidor TFTP iniciado");
    server.start();
    while (server.run(false)>= 0){
      delay(5000);
      Serial.println("Trabajando");
    }

    server.stop(); 
    Serial.print("mensaje del servidor ");
    Serial.println(/*mensajeServer*/);
  }
  else{
    Serial.print("El dispositivo ya esta configurado");
    server.stop();
  }
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

