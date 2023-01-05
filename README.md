# Proyecto - Aplicación Móvil para la configuración de sensores y actuadores remotos 
## 1 Contexto 
___

En la época actual la tecnología y su uso ha evolucionado a pasos agigantados, cada vez es mas común su presencia en la vida cotidiana de las personas ayudandolas en sus necesidades más básicas. Por esto no es nada raro pensar también en la IoT *"Internet Of Things"* ya que en conjunto con la tecnología son un gran apoyo al momento de realizar tareas desde las más sencillas *p. ej.* prender la luz de una habitación o abrir una puerta, hasta cosas más sofisticadas *p. ej.* en empresas especializadas en transporte se utiliza para dar seguimiento a sus activos y optimizar el consumo de combustible y de las rutas marítimas, y asi podemos hacer una lista enorme sobre todas las cosas que podemos hacer usando las *IoT*.

Antes de continuar, que son la *IoT*?, bueno en términos sencillos se refiere a la red de objetos físicos que tienen incorporados sensores, softwares y otro tipo de tecnologías con el propósito de conectarse  e intercambiar datos con otros dispositivos y sistemas a través de Internet. Se puede apreciar un esquema en la figura 1.

![Figura 1: Ejemplo de una red IoT](./images/IoTxm.png "Figura 1: Ejemplo de una red IoT")

Cabe mencionar que puede tomar un enfoque ligeramente diferente cuando su uso se aplica en el sector industrial, conocida como "*IoT* Industrial" hace referencia al uso de sensores inteligentes y mecanismos de automatización cuya funcion en conjunto permite mejorar la eficiencia de procesos industriales a niveles diferentes.En resumen, consiste en conectar máquinas con dispositivos y sistemas empresariales mediante la arquitectura de red para que puedan comunicarse, recopilar información y analizar esos datos en tiempo real.

Con esto las personas, máquinas y los datos pueden trabajar de manera sincronizada para ofrecer un valor añadido 

## 2 Marco Teórico
___ 

A lo largo de los ultimos años, la industria ha optado por hacer más recurrente el uso de sensores dentro de su marco de trabajo, ya que es un elemento muy versátil que ayuda en muchas tareas, como facilitar las tareas de automatización.

Gracias a que miden variables de diferente indole:

*Ambientales*: Hace referencia a los elementos naturales como la velocidad y dirección del viento, temperatura del ambiente, humedad, la intensidad de la luz entre otras cosas.

*Mecánicas*: Relacionadas con la maquinaria de la organización.

*Variables de proceso*: Son aquellas relacionadas con las condiciones físicas o químicas que se originan durante los procesos activos.

*Eléctricas*: Son aquellas variables que afectan directamente a los activos de la organización, como por ejemplo, el voltaje, la corriente, la frecuencia, la resistencia, potencia, etc.

Debemos recordar que en función del tipo de variable que miden se pueden categorizar los sensores p. ej.:

|Tipo de sensor        | Descripción |
|----------------------|-------------|
|Temperatura         | Este tipo de sensor reúne estímulos referentes a la temperatura de una fuente concreta y lo transforma en información.|
| Presión          | Estos sensores obtienen la información en forma de presión y la transforman en señales eléctricas.| 
|Medición|Los sensores de mediación tienen la función de medir la distancia entre dos elementos o su posición, por lo que hacen más eficiente la optimización de los procesos de control.|
|Proximidad |La función de estos sensores es detectar objetos, señales o personas que se encuentren cerca del sensor.|

![Figura 2: Tipos de sensores](./images/tiposSensores.png "Figura 2: Tipos de sensores")

Como se observa en la figura 2 se muestran algunos tipos de sensores como de proximidad (izqueirda), de temperatura (en medio) y de presión (derecha). Sin embargo este tipo de elementos tienen algunos inconvenientes como lo es su manipulación la cual es exclusivamente para personas con amplia experiencia tanto en el tema como en la interaccion con este tipo de aparatos. Si por alguna razón logramos acceder a este tipo de herramientas podemos notar que usan lenguaje técnico lo que ocaciona que para nosotros sea una tarea practicamente imposible tan siquiera saber lo que queremos hacer, si bien también las empresas suelen dar guías de configuración, estas generan el mismo problema, p. ej. para configurar un sensor optico de fibra digital es necesario leer un manual extenso, engorroso y puede que hasta confuso como el que se muestra en la figura 3  

![Figura 3: Manual de configuración](/images/guiaConfiguraci%C3%B3n.png "Figura 3: Manual de configuración")

Otras empresas optan por el desarrollo de aplicaciones ya sean móviles o de escritorio para realizar este mismo proceso lo cual facilita enormemente este proceso aunque sus principales usuarios siguen siendo especialistas o gente experimentada, en la figura 4  podemos ver ejemplos de aplicaciones de configuración de sensores.

![Figura 4: Aplicaciones de confguración](/images/apps.png "Figura 4: Aplicaciones de configuración")

En base a estos antecedentes, nosotros queremos llevar un poco más allá esta idea al grado de simplificar aún más este proceso para los usuarios y hacer en lo mayor de lo posible que cualquier persona con los conocimientos mínimos pueda llevar a cabo estar tareas.

# 3 Caso de estudio

Durante el año 2020 y 2021 el mundo sufrió una serie de cambios que nos llevo al confinamiento durante la pandemia ocacionada por el *SARS COV 2*, Coronavirus o *COVID-19* como también se le conoce, este confinamiento llego a limitar algunas tareas para las personas debido a que el nivel de contagio era alto y lo más recomendable era no salir para nada de sus hogares, aunado a esto se marcó un auge en el uso de aplicaciones móviles y otras herramientas digitales  que hicieron más accesible sobrellevar toda esta situació.

Conforme iban avazando las etapas de la pandemia, la sociedad poco a poco se adaptó a esta nueva normalidad teniendo como fuente de interacción principal sus dispositivos móviles, aproximadamente entre finales del 2021 e inicios del 2022 los gobiernos de varios países crearon y estructuraron planes de emergencia para el manejo de esta crisis sanitaria que se extendió al sector económico debido al cierre de comercios y las perdidas de empleo masivas a nivel global.

Dichos planes o iniciativas se crearon con el propósito de levantar las economías de los países y empezar la transición hacía una "nueva normalidad", algunas de estas medidas son: 

* *Distancia interpersonal de 1.5 tanto para espacios públicos como cerrados.*

* *Uso de cubrebocas en todo momento, recomendando el KN-95 como la mejor opción bajo estas circunstancias*.

* *Lavado de manos frecuentemente*

* *Tener un control de la capacidad de personas que pueden estar en un establecimiento (principalmente restaurantes, bares, centros comerciales, escuelas etc..)

Si bien los primeros 3 puntos son sencillos de seguir, el último puede generar varios obstáculos para que se cumpla de la mejor manera ya que en algún momento puede salirse de control la situación y ser un punto de contagio que pone en riesgo la vida de las personas, puede que en un principio pensemos que no podemos tomar el control o que simplemente seria una tarea dificíl o tediosa estar contando a las personas que entran y salen, además de saber cuando el ambiente es el más apropiado para evitar contagios.

Este seguimiento puede llevarse a cabo con un sistema de monitorización ya que de esta manera se obtiene información del entorno donde se despliega para después hacer su respectivo análisis, cabe señalar que estos tipos de sistemas ofrecen diversas ventajas como:

* Prevención y detección de problemas.
* Ahorro de costes y tiempo.
* Detectar el origen del problema
* Acceso al estado del sistema en tiempo real.

Entonces la idea principal queda de la siguiente manera:

El sistema de monitorización consta de una red de sensores inalámbricos de 4 tipos (temperatura, CO2, humedad, infrarrojos para conteo de personas) cada uno recolecta y analiza sus propios datos y los mandan a un sumidero de datos para que puedan ser consultados a través de un servicio web.

Por otro lado, la configuración de los sensores se puede hacer a través de una aplicacion móvil diseñada principalmente para el sistema operativo Android (desde su versión 5.0 *Lollipop* hasta una versión antes de Android 11), los detalles acerca de la aplicación se describen en la siguiente sección.


# 4 Aplicación  CF APP

Como se mencionó anteriormente, varias empresas han desarrollado aplicaciones que se encargan de la configuración de sus propios sensores vía remota, se toma esto como base dando como valor agregado el poder simplificar este proceso bajo nuestro caso de estudio.

El objetivo de la aplicación es que de manera intuitiva y fácil un usuario con poca experiencia en el campo pueda realizar la configuración/actualización necesaria para cada uno de los dispositivos, el proceso que se lleva a cabo para realizar esto es el siguiente:

1- Cada uno de los sensores debe estar conectado ya sea a una red *WIFI* o un *Hotspot*.

![Figura 5: Sensores concetados a  la red](/images/step1.png "Figura 5: Sensores conectados a la red")


2- Una vez que la conexión esta hecha, la aplicación detecta los dispositivos que se encuentran en la misma red y los enlista para que el usuario escoja cual es el que desea configurar/actualizar.

![Figura 6: Conexión inicial y listado de sensores](/images/step2.png "Figura 6: Conexión inicial y listado de sensores")


3- Al momento de seleccionar el dispositivo de su interés, enseguida se muestra una interfaz con todas las características configurables del dispositivo, en este caso son dos secciones una dedicada al apartado de Red y otro a las características en general.

![Figura 7: Interfaz de configuración de la aplicación](/images/step3.png "Figura 7: Interfaz de configuración de la aplicación")


4- Una vez que el usuario terminó de configurar, para que el proceso este completado debe enviar la información con ayuda de un botón.

![Figura 8: Envío de configuración](/images/step4.png "Figura 8: Envío de configuración")


5- Por último, el dispositivo recibe la información y aplica los ajustes correspondientes para que este listo para funcionar según las necesidades del usuario.

![Figura 9: Aplicación de configuración en el dispositivo](/images/step5.png "Figura 9: Aplicación de configuración en el dispositivo")

## 4.1- Desarrollo de la aplicación
___

En principio, debemos de tener claro las herramientas que se van a utilizar, en este caso usamos los lenguajes *C++* para la programación de los sensores, *Java* y *Kotlin* en la parte de la aplicación móvil, editores de texto como *Visual Studio Code*, *Android Studio*, programas de diseño para las interfaces como *Figma*, la parte del hardware es brindada por los microcontroladores *ESP-32* que en conjunto con los sensores infrarrojos, temperatura, humedad y *C02* forman el dispositivo que se puede configurar a través de la aplicación, ya por último para realizar la configuración de los dispositivos es con ayuda de archivos en formato *JSON* a los cuales bajo nuestro caso de estudio se llaman archivos de configuración.

## 4.2 Detección de dispositivos en la red 
(*NSD* API ANDROID)
___

Para iniciar el proceso de la conexión inicial, primero tanto la app como cada uno de los dispositivos deben de estar conectados a la misma red *WIFI* o un *hotspot*, enseguida, se hace una búsqueda a nivel de servicios de la red para los dispositivos compatibles, cabe resaltar que la aplicación esta diseñada para que reconozca aquellos dispositivos que implementen el servicio *TFTP* que se explica con detalle más adelante, toda esta información esta oculta para el usuario ya que es ocupada a nivel interno de la aplicación y lo único que se le muestra al usuario es la lista final de los dispositivos compatibles. Cada dispositivo dentro de la red tiene un identificador único, esto facilita a la aplicación a no cometer errores al mandar los archivos de configuración al dispositivo incorrecto, en el caso de que se detecte algún problema saber el origen de este y por último llevar un orden. `Uamensor(#)` es el identificador elegido para los dispositivos donde `#` es un número generado de forma aleatoria.

El descubrimiento de servicios en la red es posible gracias a una *API* de *Android* que simplifica este proceso, cuyo nombre es *NSD "Network Services Discovery"*, la cual otorga a la app acceso a los servicios que otros dispositivos proporcionan en una red local. Así, los usuarios podrán identificar otros dispositivos de la red local que admitan los servicios que la aplicación solicita. Cabe señalar que cada dispositivo registra/anuncia el tipo de servicio que ofrece (*TFTP*) de manera automática para que sea encontrado en la red más adelante, esto es posible usando *MDNS*, el cual permite anunciar información sobre los servicios de red que ofrece el dispositivo.


En base a lo anterior, la aplicación se encarga de buscar en la red por un periodo de tiempo aquellos dispositivos que brinden el servicio *TFTP*, preguntando el tipo de sevicio que ofrece, en caso de que la respuesta sea afirmativa, se añade a una lista que posteriormente se le muestra al usuario dentro de la app para seguir con el proceso de configuración. En la figura 10 se observa un esquema general del trabajo que realiza la API y como es ocupada en el desarrollo del proyecto.

![Figura 10: Esquema general de funcionamiento API NSD](/images/nsd.png "Figura 10: Esquema general de funcionamiento API NSD")


## 4.3 Proceso de Comunicación App - Dispositivo 
___

Enseguida de que son listados los dispositivos disponibles para ser configurados, se presenta una parte importante del proyecto: la comunicación entre la aplicación y el dispositivo para que se lleve a cabo su configuración.

Para lograr esto, el proceso se basa en una arquitectura tipo cliente-servidor debido a la naturaleza del servicio *TFTP*, la labor del servidor esta dada por el dispositivo y del lado del cliente nos encontramos con la aplicación, cabe señalar que el tipo de solicitudes que solicita el cliente son tipo *pull*, es decir, que el cliente solo se encarga de obtener la información que le es necesaria del servidor y en este caso se presentan en una interfaz dentro de la aplicación

![Figura 11: Arquitectura de la comunicación](/images/Arquitectura.png "Figura 11: Arquitectura de la comunicación")

# 5 Uso de *TFTP* para la transferenca de archivos

En secciones anteriores, indicamos que el servicio encargado de la transferencia de archivos entre el cliente y servidor está a cargo del protocolo *TFTP*, pero antes de continuar daremos más detalles acerca de este protocolo y sus motivos por los cuales fue elegido para la implementación de este proyecto.

## 5.1 Definición y características 
___

*TFTP* o *Trivial File Transfer Protocol* es un protocolo simple que se utiliza principalmente para el envío de archivos entre cliente y servidor, por lo mismo de que su concepto es simple, el diseño es sencillo, sin embargo, tiene limitaciones en algunos aspectos p. ej, no implementa ningun tipo de mecanismo de seguridad al momento de archivar la comunicación y es por esta misma razón que no se puede utilizar a través de Internet. En cambio se usaria a nivel de una red de área local.  

Por otro lado, los motivos principales por los cuales se optó por este protocolo son:

* Fácil de implementa.
* Implementa la arquitectura cliente - servidor de manera simple.
* Solo se limita a la lectura y escritura de archivos.
* Utiliza una mínima cantidad de memoria.
* Es la mejor opción si se requiere enviar archivos de arranque o de configuración entre dispositivos.
* Es ideal si el almacenamiento de los dispositivos que lo implementan son bajos.




























Admite 3 modos de transferencia: 

* *Netascii* (lo cual es *ascii* de acuerdo al código estándar para el intercambio de  información, además que es *ascii* de 8 bits).

* *Octeto* (reemplaza al modo binario que se utilizaba antes).

* *Bytes* sin procesar de 8 *bits*. 

Cualquier transferencia comienza con una solicitud para escribir o leer un archivo esto también sirve para solicitar una conexión, si el servidor concede la petición se abre la conexión y se envía el archivo en bloques fijos de 512 bytes. Cada paquete de datos contiene un bloque de datos y debe ser reconocido por un paquete de reconocimiento antes de que se pueda enviar el siguiente paquete. Un paquete de menos de 512 bytes señala la terminación de una transferencia.

Si un paquete de datos se pierde en la red el receptor previsto expirará y podrá retransmitir su último paquete (ya sean datos o un acuse de recibo) lo que provoca que el remitente  del paquete perdido retransmita ese mismo paquete perdido.

En todo momento el remitente tiene que tener solo un paquete a mano para la retransmisión ya que el acuse de recibo del paso de bloqueo garantiza que todos los  paquetes más antiguos hayan sido recibidos. Hay que tener en cuenta que ambas máquinas involucradas en una transferencia son considerados emisores y receptores, de modo que: 
> “Uno envía datos y recibe acuses de recibo y el otro envía acuses de recibo y recibe datos ”

Los errores causan la terminación de la conexión, un error es señalado mediante el envío de un paquete de error (este paquete no es transmitido y no es reconocido) un servidor o un usuario podría terminar después de enviar un mensaje de error sin embargo el otro extremo de la conexión puede que no lo consiga. 

Los timeouts  son usados para detectar una terminación cuando el paquete de error ha sido perdido.

Los errores son causados por tres tipos de eventos:

* No se satisface la petición (archivo no encontrado, violation de acceso).

* Recibimiento de un paquete que no puede ser explicado por una demora o duplicación en la red (se formó un paquete incorrectamente).

* Pérdida de acceso para un recurso necesario (disco lleno o acceso denegado durante una transferencia).

## 5.3 Estructura de los paquetes

Debido a que el protocolo actúa sobre *UDP*, e implementa el protocolo de internet, los paquetes pueden tener:

> Encabezado de internet + Encabezado del datagrama + encabezado TFTP 

Como se ilustra en la figura 12 el orden de los encabezados podría ser el siguiente:

# insertar imagen de los encbezados

![Figura 12: Estructura de un paquete](/images/encabezado.png "Figura 12: Estructura de un paquete")

Seguido del resto del paquete *TFTP* ( ya sean datos o no, dependiendo del tipo de paquete que es especificado en el encabezado *TFTP*) *TFTP* no específicos valores del encabezado de internet. Los campos de puerto origen y destino del encabezado del datagrama son usados por *TFTP*, y el campo de longitud refleja el tamaño del paquete *TFTP*.

Los identificadores de transferencia (*TID’S*) son usados por *TFTP* y son pasados a la capa del datagrama para ser usados como puertos por lo tanto hay entre 0 y 65,535.

Tipos de Paquetes TFTP







### 5.3.1 Encabezado *TFTP*

Consiste en un opcode de 2 bytes que indica el tipo de paquete ( DATA, ERROR )


## 5.4 Protocolo de conexión inicial

Una transferencia es establecida por una petición

Las peticiones pueden ser de tipo WRQ para escritura en un sistema de archivos externo o RRQ para lectura y recibiendo una respuesta positiva, un paquete de reconocimiento para escritura  o el primer paquete de datos para lectura  

Un paquete de reconocimiento puede contener el número de bloque del paquete de datos que está siendo reconocido

Cada paquete de datos tiene asociado un número de bloque, los números de bloque son consecutivos uno atrás del otro y comienza con 1. Dado que la respuesta positiva a una solicitud de escritura es un paquete de reconocimiento, en este caso en especial el número de bloque podría ser 0.

Para crear una conexión cada extremo elige un *TID* para sí mismo, que se utilizará durante la duración de la conexión, estos *TID’s* deben de elegirse aleatoriamente.

Cada paquete tiene asociado los dos *TID’s* de cada extremo:
El *TID* origen y el *TID* de destino.Estos TID’s se entregan al soporte UDP como los puertos de origen y destino.

Un host solicitante elige su TID de origen y envía su solicitud inicial al *TID* 69 en el host del servicio

La respuesta a una solicitud en funcionamiento normal, utiliza un *TID* elegido por el servidor como su *TID* de origen y el *TID* elegido para el mensaje anterior por el solicitante como su *TID* de destino. 

Los tipos de paquetes para una solicitud de escritura es lo siguiente:
* *ACK* (acuse de reconocimiento).

* *WRQ* (solicitud de escritura).

* *DATA* (datos que se van a enviar).

![Figura 13: Ejemplo de solicitud de escritura WRQ](/images/ejemplo.png "Figura 13: Ejemplo de solicitud de escritura WRQ")

Durante el proceso los host deben asegurarse de que el TID de origen coincida con el que se acordó en un inicio, si no llegan a coincidir el paquete debe ser descartado como enviado erróneamente desde otro lugar, entonces se debe de enviar un paquete de error a la gente del paquete incorrecto, sin perturbar la transferencia.




# 6 Sistema de archivos en la ESP32 *SPIFFS*


## Citas

[1] - Android Developer, . (03 de junio de 2020). Use network service discovery. Recuperado el 31 de diciembre de 2022 https://developer.android.com/training/connect-devices-wirelessly/nsd












