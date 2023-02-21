package com.example.csyarcuajimalpa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Looper
import android.view.WindowManager
import  android.os.*
import com.example.csyarcuajimalpa.Screens.mainScreen
import java.util.logging.Handler

class splashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_screen)

        /**
         * Estos metodos son permiten ocultar la barra de estado del dispositivo,
         * esto para que la splash screen abarque la pantalla completa.
         */
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
        WindowManager.LayoutParams.FLAG_FULLSCREEN)


        /**
         * Utilizamos el metodo postDelayed() para enviar un mensaje con una demora de X tiempo,
         * en este caso nuestro mensaje sera que se direccione a la pantalla principal de
         * de la apliación para que siga con el flujo de usuario esperado.
         */
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, mainScreen::class.java)
            startActivity(intent)
            finish()
        },300)
    }
}