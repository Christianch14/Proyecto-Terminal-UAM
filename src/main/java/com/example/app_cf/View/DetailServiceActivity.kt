package com.example.app_cf.View

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.app_cf.Services_NSD.DiscoverServices
import com.example.app_cf.View.ui.theme.APP_CFTheme

class DetailServiceActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        /**\ En un proceso en segundo plano es cuando se
         * realiza la recepcion del archivo proveniente del servidor
         * una vez que lo recibe pasa a deserializarlo para pasarlo a
         * un objeto para que se pueda modificar en la interfaz y
         * posteriormente volverlo a serealizar para mandarselo al servidor
         */

        Handler(Looper.getMainLooper()).postDelayed({},
            DiscoverServices.TIME_OUT)


        setContent {
            APP_CFTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    //DetailService_Component(file)
                }
            }
        }
    }
}
