#include <Arduino.h>
#include <ESPmDNS.h>
#include <WiFi.h>
#include <time.h>
#include <stdlib.h>
#include <string.h>

#define MAX 15
#define MAX_DEVICES 50
#define BASE_NAME "UamSensor"

//Se cambian cuando se conectan a otra red
const char* ssdi = "INFINITUMD79B_2.4";
const char* psswd = "Agosto2016";

using namespace std;

/**
 * @brief Funcion para generar los nombres de los dispositivos
 * 
 * @param nombre 
 * @param claveMax 
 * @return char*
 */
String generarNombre(String nombre, int claveMax){

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

  srand(time(NULL));

  String nombreDispositivo;
  
  Serial.begin(115200);

  WiFi.begin(ssdi,psswd);

  while (WiFi.status()!= WL_CONNECTED){
    delay(1000);
    Serial.println("Conectando al wifi");
  
  }

  // Funcion para generar nombre
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
  MDNS.addService("tftp","udp",69);

  //Imprimimos la direccion IP de la ESP32
  Serial.print("Ip del dispositivo: ");
  Serial.println(WiFi.localIP());

}



/**
 * @brief El servidor estará siempre activo en un bucle recibiendo las peticiones del cliente (app) 
 * ya sea de RRQ o WRQ y este solo empaqueta el archivo json para enviarlo a la aplicacion y 
 * esta pueda realizar su trabajo
 */

void loop() {
  // Codigo del servidor aqui
}

