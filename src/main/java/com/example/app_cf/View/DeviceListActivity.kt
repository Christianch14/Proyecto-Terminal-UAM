package com.example.app_cf.View

import android.app.AlertDialog
import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import com.example.app_cf.Components.DeviceListScreen
import com.example.app_cf.Model.ServiceDevice
import com.example.app_cf.View.ui.theme.APP_CFTheme

class DeviceListActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        //Recibo el array que me mandaron
        var listDeviceRecibed:ArrayList<ServiceDevice> =
            intent.getParcelableArrayListExtra<ServiceDevice>("listDeviceSend") 
                    as ArrayList<ServiceDevice>

        setContent {
            APP_CFTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    val context = LocalContext.current
                    DeviceListScreen(listDevices = listDeviceRecibed,
                        context = context)
                }
            }
        }
    }


}
