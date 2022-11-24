package com.example.app_cf.Components

import android.app.AlertDialog
import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
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
import com.example.app_cf.Model.ServiceDevice
import com.example.app_cf.R
import com.example.app_cf.View.DetailServiceActivity


@Composable
fun DeviceListScreen(
    listDevices: ArrayList<ServiceDevice>,
    context: Context
){
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
        ShowList(listDevices,context)
    }

}

@Composable
@Preview(showBackground = true)
fun DeviceListScreenPreview(){
   //dialog()
}

@Composable
fun ShowList(listDevices: ArrayList<ServiceDevice>,context: Context){

    println("tam deviceList ${listDevices.size}")
    LazyColumn(contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(20.dp)
    ){
        items(listDevices){item->
         DesignItem(item,context)
       }
    }
}



@Composable
fun DesignItem(item: ServiceDevice,context: Context) {

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

                painter = painterResource(id = item.image),
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
                Text(text = item.deviceServiceName,
                    fontSize = 20.sp)
                Spacer(modifier = Modifier.height(5.dp))
                Text("Tipo de servicio:",
                    fontSize = 20.sp)
                Text(text = item.deviceServiceType,
                    fontSize = 20.sp)
            }
            Button(
                onClick = { ShowDialog(context)},
            ) {
                Text("Conectar")
            }
        }

    }
}


fun ShowDialog(context: Context) {

    var alertDialog: AlertDialog? = null
    val alertBuilder = AlertDialog.Builder(context)
    alertBuilder.setTitle("Conectar")
    alertBuilder.setMessage("Estas seguro que te quieres conectar")
    alertBuilder.setPositiveButton("Si") { _: DialogInterface, _:Int ->
        var intent = Intent(context, DetailServiceActivity::class.java)
        context.startActivity(intent)
    }
    alertBuilder.setNegativeButton("No", { dialogInterface: DialogInterface, i:Int ->})
    alertDialog = alertBuilder.create()
    alertDialog?.show()
}






