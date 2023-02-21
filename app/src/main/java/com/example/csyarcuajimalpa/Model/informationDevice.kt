package com.example.csyarcuajimalpa.Model

import java.io.File

class informationDevice {

    var nombreDispositivo:String

    private var servicioOfrecido: String

    private var imagen:Int

    private var ip:String

    // private var fileDevice:File

    constructor(nombreDispositivo: String, servicioOfrecido:String, imagen:Int, ip:String,
                /*fileDevice: File*/){

        this.nombreDispositivo = nombreDispositivo
        this.servicioOfrecido = servicioOfrecido
        this.imagen = imagen
        this.ip = ip
        //this.fileDevice = fileDevice
    }
}

