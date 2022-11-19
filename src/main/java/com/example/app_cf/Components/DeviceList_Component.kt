package com.example.app_cf.Components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.app_cf.R



@Composable
fun DeviceListScreen(){
    //Area general de toda la pantalla
    Column(
        modifier= Modifier
            .fillMaxSize()
            .background(Color.Red)
            .padding(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        //Area de titulo
        Row(
            modifier= Modifier.background(Color.Cyan),
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                "Devices Found",
                fontSize = 40.sp,
            )
        }
        //Area de la lista
        ShowList()
    }

}

@Composable
@Preview(showBackground = true)
fun DeviceListScreenPreview(){
    DeviceListScreen()
}

@Composable
fun ShowList(){


    //println("tam deviceList ${listItemsExample.size}")
    LazyColumn(contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(20.dp)
    ){
        items(){item->
            DesignItem()
        }
    }
}



@Composable
fun DesignItem() {

    Card(
        modifier = Modifier,
        shape = RoundedCornerShape(10.dp),
        elevation = 10.dp,
        border = BorderStroke(1.dp, Color.Black),
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(colorResource(id = R.color.mainColor)),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center

        ){
            Image(

                painter = painterResource(id = R.drawable.logoesp32),
                contentDescription = "Logo dispositivo",
                contentScale = ContentScale.FillWidth
                ,modifier = Modifier
                    .clip(CircleShape)
                    .size(80.dp)
            )
            Column(
                modifier= Modifier.padding(10.dp)
            ){
                Text("Dispositivo:",
                    fontSize = 20.sp)
                Text(text = "",
                    fontSize = 20.sp)
                Spacer(modifier = Modifier.height(5.dp))
                Text("Tipo de servicio:",
                    fontSize = 20.sp)
                Text(text = "",
                    fontSize = 20.sp)
            }
            Button(onClick = { /*Conect to Server TFTP*/ },
            ) {
                Text("Conectar")
            }
        }

    }
}

