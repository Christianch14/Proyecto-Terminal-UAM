package com.example.app_cf.Services_NSD

import android.content.Context
import android.net.nsd.NsdManager
import android.net.nsd.NsdServiceInfo
import android.os.Handler
import android.os.Looper
import android.util.Log

class DiscoverServices {

    companion object{
        /** Limite de 30 segundos para buscar los servicioa
         */
        const val TIME_OUT: Long = 10000

        /**Como orientacion acerca de los mensajes de depuracion en el Logcat
         */
        private val TAG =DiscoverServices::class.java.simpleName
    }

    var listServices =ArrayList</*Model*/>()


    private lateinit var nsdManager: NsdManager
    private var discoveryInProgess: Boolean = false
    private var mServiceName = "UamSensor"
    private var mServiceType = "_tftp._udp."


    /** Instanciamos un escuchador para la deteccion de servicios
     * */

    private val discoveryListener = object: NsdManager.DiscoveryListener{

        override fun onDiscoveryStarted(regType: String?) {
            //Log.d(TAG,"/onDiscovertStarted()")
            println("Buscando servicios del tipo ${mServiceType}")
            Log.d(TAG,"Quedan ${TIME_OUT /1000} segundos")
            discoveryInProgess = true
        }

        override fun onServiceFound(service: NsdServiceInfo) {
            when{
                //Significa que encontro un servicio diferente al que estaba buscando
                service.serviceType != mServiceType ->
                    Log.d(TAG,"Servicio desconocido: ${service.serviceType}")

                service.serviceName == mServiceName ->
                    Log.d(TAG,"Misma maquina ${mServiceName}")
            }
            /** Cuando encuentre el servicio deseado lo agrega a la lista para despues mostrarlo
             *  en la interfaz correspondiente
             */

            if(service.serviceName.contains(mServiceName)){
                Log.d(TAG,"Servicio ${service.serviceName} encontrado")

                //Lo agrega a la lista
                listServices.add()
                Log.d(TAG,"Tam lista ${listServices.size}")
            }
        }


        override fun onServiceLost(service: NsdServiceInfo) {
            /** Cuando el servicio no esta disponible se avisa
             */
            Log.d(TAG,"Servicio ${service.serviceName} perdido")
        }

        override fun onDiscoveryStopped(serviceType: String?) {
            /** Cuando el descubrimiento de servicios para se hace lo siguiente
             *
             */
            Log.d(TAG,"Servicio detenido")

            for ( i in listServices){
                Log.d(TAG,"Detalles Servicio $i")
            }

            discoveryInProgess = false
        }


        override fun onStartDiscoveryFailed(servciceType: String, errorCode: Int) {
            /** Cuando al inicio de la busqueda falla se ejecuta el sigueinte bloque de
             * codigo
             */

            Log.e(TAG,"onStartDiscoveryFailed error-code $errorCode")
            if(discoveryInProgess){
                nsdManager.stopServiceDiscovery(this)
                discoveryInProgess = false

            }
            else{
                Log.d(TAG,"Codigo de error ${errorCode}")
            }
        }

        override fun onStopDiscoveryFailed(serviceType: String, errorCode: Int) {
            // Log.e(TAG,"onStopDiscoveryFailed() error code $errorCode")
            if(discoveryInProgess){
                nsdManager.stopServiceDiscovery(this)
                discoveryInProgess = false
            }
            else{
                Log.e(TAG,"error-code $errorCode")
            }
        }
    }

    fun InitDiscoveryService(context: Context){

        nsdManager = (context.getSystemService(Context.NSD_SERVICE)as NsdManager)

        // if(!discoveryInProgess){
        //   InitDiscoveryService()
        //}

        if(::nsdManager.isInitialized) {
            Log.d(TAG,"se inicializo")
            nsdManager.apply {
                discoverServices(mServiceType, NsdManager.PROTOCOL_DNS_SD, discoveryListener)

            }
        }
        else{ Log.d(TAG,"no se inicializo")}


        /** Lo que hace este bloque de código es que despues de x segundos va a detener la
         *  busqueda de servicios esto lo hace con un hilo que se ejecuta en segundo plano
         *  con ayuda de la clase handler
         *
         *  el objeto Runnable es el que se va a estar ejecutando en segundo plano
         */
        Handler(Looper.getMainLooper()).postDelayed({
            if(discoveryInProgess){
                Log.d(TAG,"Discovery time out")
                nsdManager.stopServiceDiscovery(discoveryListener)
                /* Se tendria que mandar la lista como parámetro
                *  y la pantalla  deviceListScreen debe de recibir la lista y mostrarla
                * en su propia interfaz
                * */

            }
        },TIME_OUT)
    }

}