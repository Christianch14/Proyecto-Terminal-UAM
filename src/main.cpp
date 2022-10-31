#include <Arduino.h>
#include <ESPmDNS.h>
#include <WiFi.h>

//Se cambian cuando se conectan a otra red
const char* ssdi = "INFINITUMD79B_2.4";
const char* psswd = "Agosto2016";


/**
 * @brief En primera instancia se dara de alta el servicio que ofrece el dispositivo
 * para que la aplicacion pueda encontrarlo y posteriormente hacer la comunicación
 * cliente servidor
 */

void setup() {
  
  Serial.begin(115200);

  WiFi.begin(ssdi,psswd);

  while (WiFi.status()!= WL_CONNECTED){
    
    delay(1000);
    Serial.println("Conectando al wifi");
  
  }

  if(MDNS.begin("UamSensor")){
    Serial.println("Error al iniciar mDNS");
    return;
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
  // put your main code here, to run repeatedly:
}