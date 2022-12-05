package com.example.app_cf.JSON

import com.example.app_cf.Model.ServiceDevice

class OperationswithJSON {

    fun packJSON(serviceDevice: ServiceDevice){

    }


    fun unpackJSON():ServiceDevice{

        var jsonDevice = ServiceDevice("h","g")


        return jsonDevice
    }


}