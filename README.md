# Proyecto - Aplicación Móvil para la configuración de sensores y actuadores remotos 
## Contexto 
___

En la época actual la tecnología y su uso ha evolucionado a pasos agigantados, cada vez es mas común su presencia en la vida cotidiana de las personas ayudandolas en sus necesidades más básicas. Por esto no es nada raro pensar también en la IoT *"Internet Of Things"* ya que en conjunto con la tecnología son un gran apoyo al momento de realizar tareas desde las más sencillas *p. ej.* prender la luz de una habitación o abrir una puerta, hasta cosas más sofisticadas *p. ej.* en empresas especializadas en transporte se utiliza para dar seguimiento a sus activos y optimizar el consumo de combustible y de las rutas marítimas, y asi podemos hacer una lista enorme sobre todas las cosas que podemos hacer usando las *IoT*.

Antes de continuar, que son la *IoT*?, bueno en términos sencillos se refiere a la red de objetos físicos que tienen incorporados sensores, softwares y otro tipo de tecnologías con el propósito de conectarse  e intercambiar datos con otros dispositivos y sistemas a través de Internet. Se puede apreciar un esquema en la figura 1.

![Figura 1: Ejemplo de una red IoT](./images/IoTxm.png "Figura 1: Ejemplo de una red IoT")

Cabe mencionar que puede tomar un enfoque ligeramente diferente cuando su uso se aplica en el sector industrial, conocida como "*IoT* Industrial" hace referencia al uso de sensores inteligentes y mecanismos de automatización cuya funcion en conjunto permite mejorar la eficiencia de procesos industriales a niveles diferentes.En resumen, consiste en conectar máquinas con dispositivos y sistemas empresariales mediante la arquitectura de red para que puedan comunicarse, recopilar información y analizar esos datos en tiempo real.

Con esto las personas, máquinas y los datos pueden trabajar de manera sincronizada para ofrecer un valor añadido 

## Marco Teórico
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

# Caso de estudio

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


# Aplicación  CF APP

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



# Diseño de la aplicación



