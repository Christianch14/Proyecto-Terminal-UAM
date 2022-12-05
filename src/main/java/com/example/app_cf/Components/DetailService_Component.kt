package com.example.app_cf.Components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.app_cf.Model.ServiceDevice
import com.example.app_cf.R


/**-
 * Una vez que el objeto se deserializo se manda a esta funcion
 * la cual va a desplegar cada uno d    e las caracteristicas
 * y las va a poner en el campo que les corresponde.
 */
@Composable
fun DetailService_Component(service:ServiceDevice){

    var field1 by remember { mutableStateOf("")}
    var field2 by remember { mutableStateOf("")}
    var field3 by remember { mutableStateOf("")}
    var field4 by remember { mutableStateOf("")}

    val space = 20.dp

    Column(modifier = Modifier
        .background(Color.Green)
        .fillMaxSize()
        .padding(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(service.deviceServiceName,
        fontSize = 40.sp, textAlign = TextAlign.Center
            )
        Spacer(modifier = Modifier.height(space))
        
        Image(painter = painterResource(id = service.image),
        contentDescription = null,
            contentScale = ContentScale.FillWidth,
            modifier = Modifier
                .clip(CircleShape)
                .size(150.dp)
        )

        Spacer(modifier = Modifier.height(10.dp))
        
        Column(
            modifier = Modifier
                .background(colorResource(id = R.color.mainColor))
                .fillMaxSize()
                .padding(space),
            horizontalAlignment = Alignment.CenterHorizontally
        )
        {
            OutlinedTextField(value = "campo1", onValueChange = {field1 = it},
                label = {Text("Field1")},
                placeholder = {Text("Ingrese campo 1")}
            )
            
            Spacer(modifier = Modifier.height(10.dp))
            
            OutlinedTextField(value = "campo2", onValueChange = {field2= it},
            label = {Text("Field2")},
                placeholder = { Text("Ingrese campo 2")}
            )
            Spacer(modifier = Modifier.height(space))

            OutlinedTextField(value = "campo3" , onValueChange ={field3 = it},
                label = {Text("Field3")},
                placeholder = { Text("Ingrese campo 3")}
            )
            
            Spacer(modifier = Modifier.height(space))

            OutlinedTextField(value = "campo4", onValueChange ={field4 = it},
                label = { Text("Field4")},
                placeholder =  { Text("Ingrese campo4")}
            )
            Spacer(modifier= Modifier.height(space))

            /**
             * SendFile() hara la acción de upload que enviara el archivo al
             * TFTP Server
             */
            Row(modifier = Modifier.background(Color.Gray)
                .fillMaxSize(),
            verticalAlignment = Alignment.Bottom,
                horizontalArrangement = Arrangement.End
                ) {
                FloatingActionButton(
                    onClick = { /*sendFile()*/ },
                    backgroundColor = Color.Red,
                    modifier = Modifier.size(80.dp)
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_send),
                        contentDescription = null,
                        modifier = Modifier.size(50.dp)
                    )
                }

            }

        }
    }

}


@Composable
@Preview(showBackground = true)
fun displayDetailScreen(){
    val sv = ServiceDevice("UamSensor(1)","_tftp._udp",)
    DetailService_Component(sv)
}

