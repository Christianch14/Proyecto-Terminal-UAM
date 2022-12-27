# Aplicación Móvil para la configuración de sensores y actuadores remotos 


## Contexto 

En la época actual la tecnología y su uso ha evolucionado a pasos agigantados, cada vez es mas común su presencia en la vida cotidiana de las personas ayudandolas en sus necesidades más básicas. Por esto no es nada raro pensar también en la IoT *"Internet Of Things"* ya que en conjunto con la tecnología son un gran apoyo al momento de realizar tareas desde las más sencillas *p. ej.* prender la luz de una habitación o abrir una puerta, hasta cosas más sofisticadas *p. ej.* en empresas especializadas en transporte se utiliza para dar seguimiento a sus activos y optimizar el consumo de combustible y de las rutas marítimas, y asi podemos hacer una lista enorme sobre todas las cosas que podemos hacer usando las *IoT*.

Antes de continuar, que son la *IoT*?, bueno en términos sencillos se refiere a la red de objetos físicos que tienen incorporados sensores, softwares y otro tipo de tecnologías con el propósito de conectarse  e intercambiar datos con otros dispositivos y sistemas a través de Internet. Se puede apreciar un esquema en la figura 1.

![Figura 1: Ejemplo de una red IoT](./images/IoTxm.png "Figura 1: Ejemplo de una red IoT")

Cabe mencionar que puede tomar un enfoque ligeramente diferente cuando su uso se aplica en el sector industrial, conocida como "*IoT* Industrial" hace referencia al uso de sensores inteligentes y mecanismos de automatización cuya funcion en conjunto permite mejorar la eficiencia de procesos industriales a niveles diferentes.En resumen, consiste en conectar máquinas con dispositivos y sistemas empresariales mediante la arquitectura de red para que puedan comunicarse, recopilar información y analizar esos datos en tiempo real.

Con esto las personas, máquinas y los datos pueden trabajar de manera sincronizada para ofrecer un valor añadido 

## Marco Teórico

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

