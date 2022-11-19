package com.example.app_cf.Components

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.app_cf.R
import com.example.app_cf.Services_NSD.DiscoverServices

@Composable
fun MainScreen(){

    val context = LocalContext.current
    val discoverSv = DiscoverServices()

    // Showbars(flag =false)
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp)
            .background(color = Color.Red)
    ) {
        Box(
            modifier = Modifier
                .size(1000.dp, 100.dp)
                .clip(RoundedCornerShape(30.dp))
                .background(colorResource(id =R.color.mainColor)),
            contentAlignment = Alignment.Center,
        ) {
            Text(
                "Bienvenido!!",
                style = MaterialTheme.typography.h3,
                fontWeight = FontWeight.Bold
            )
        }
        Spacer(modifier = Modifier.height(20.dp))
        Box(
            modifier = Modifier
                .size(350.dp, 150.dp)
                .background(color = Color.Blue)
                .padding(5.dp)
                .align(Alignment.CenterHorizontally),
            contentAlignment = Alignment.Center,
        ) {
            Text("Texto corto y claro acerca de lal objetivo de esta aplicacion" +
                    " y como usarla en general",
                style = MaterialTheme.typography.h6,
                textAlign = TextAlign.Justify
            )
        }
        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = {
            Toast.makeText(context,"Buscando dispositivos..", Toast.LENGTH_SHORT).show()
            },
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.align(Alignment.CenterHorizontally)
        ) {
            Icon(
                Icons.Default.Search,
                contentDescription = null,
                modifier = Modifier.size(40.dp)
            )
            Text(
                text="Buscar dispositivos",
                modifier = Modifier,
                fontSize = 20.sp
            )
        }
    }
}