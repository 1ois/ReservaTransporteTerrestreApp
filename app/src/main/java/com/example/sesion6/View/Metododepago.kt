package com.example.sesion6.View

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.BottomAppBar

import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import androidx.navigation.NavHostController
import com.example.sesion6.R

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)

@Composable
fun ImagenView(navController:NavHostController) {
    Scaffold(
        bottomBar = {

            BottomAppBar()
            {
                Row(horizontalArrangement = Arrangement.SpaceEvenly, // Alinea los elementos de manera uniforme
                    modifier = Modifier.fillMaxWidth()) {


                    val iconSize = 30.dp // Tamaño de los iconos


                    //boton1
                    IconButton(onClick = { navController.navigate("main") }) {
                        Icon(
                            Icons.Filled.Home,
                            contentDescription = "Localized description",
                            modifier = Modifier
                                .size(iconSize)
                        )

                    }
                    //boton2
                    IconButton(onClick = {navController.navigate("pago")}) {
                        Icon(
                            Icons.Filled.LocationOn,
                            contentDescription = "Localized description",
                            modifier = Modifier.size(iconSize)
                        )

                    }
                    //boton3
                    IconButton(onClick = {navController.navigate("usuarios")}) {
                        Icon(
                            Icons.Filled.ShoppingCart,
                            contentDescription = "Localized description",
                            modifier = Modifier.size(iconSize)
                        )

                    }
                    //boton4
                    IconButton(onClick = {}) {
                        Icon(
                            Icons.Filled.AccountCircle,
                            contentDescription = "Localized description",
                            modifier = Modifier.size(iconSize)
                        )

                    }

                }
            }


        },
        //el contenedor dentro
        content = { metododetarjeta(navController) }
    )


}



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun metododetarjeta(navController:NavHostController){
    Box(modifier= Modifier
        .fillMaxSize()
        .background(Color(106, 57, 0))
    )
    {
        Image(  painter = painterResource(id = R.drawable.caminos_andinos),
            contentDescription = "Descripción de la imagen",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(400.dp)
                .align(Alignment.Center)
                .alpha(0.3f)
                )

       Column {
            //primer cuadro
            Box(contentAlignment = Alignment.Center, modifier = Modifier
                .fillMaxWidth()
                .height(120.dp)){
                Text("Método de Pago"
                    , fontSize = 25.sp
                    , fontWeight = FontWeight.Bold
                    ,color=Color(225, 171, 7)
                    )
                Divider(
                    color=Color.Black,
                    thickness = 2.dp,
                    modifier = Modifier
                        .align(Alignment.BottomCenter)
                        .width(210.dp)
                        .padding(bottom = 40.dp))
            }

            //segundo cuadro
            Box(contentAlignment = Alignment.Center,modifier = Modifier
                .fillMaxSize()
                .padding(bottom = 70.dp)){
                //2.1

                Box(contentAlignment = Alignment.Center,modifier= Modifier
                    .width(150.dp)
                    .height(20.dp)

                    .offset(x = 35.dp, y = 140.dp)
                    .background(Color(106, 57, 0))
                    .align(Alignment.TopStart)

                    .zIndex(1f)){
                    Text("Datos de la tarjeta")
                }


                //2.2
                Box(contentAlignment = Alignment.Center,modifier= Modifier
                    .fillMaxWidth()
                    .height(380.dp)
                    .padding(26.dp)
                    .clip(RoundedCornerShape(20.dp))

                    .border(4.dp, Color.Black, RoundedCornerShape(20.dp))
                    //.background(Color.Gray)
                ){
                    Column() {
                        //texfiel dentro del cuadro
                        var tarjeta by remember{ mutableStateOf("") }
                        var clave by remember{ mutableStateOf("")}
                        var hidden by remember { mutableStateOf(true)
                        }
                        OutlinedTextField(value = tarjeta,
                            onValueChange = { newTarjeta -> tarjeta = newTarjeta }
                            , label = { Text("#Tarjerta:",color=Color.White)},
                            placeholder = { Text("Ingrese solo valores enteros",color=Color.White)},
                            keyboardOptions = KeyboardOptions(keyboardType =KeyboardType.Number),
                            leadingIcon = {
                                Icon(imageVector = Icons.Default.AccountCircle,contentDescription = null
                                    , tint =Color.White)
                            }, colors = TextFieldDefaults.outlinedTextFieldColors(
                                textColor = Color.White
                            , focusedBorderColor = Color.White
                            , unfocusedBorderColor = Color.White)
                                )




                        Spacer(modifier = Modifier.size(20.dp))

                        //segundo texfiel


                        OutlinedTextField(value = clave
                            , onValueChange = {newClave ->clave =newClave}
                            ,label={ Text("Clave:",color=Color.White)}
                            , placeholder = { Text("Ingrese solo valores enteros",color=Color.White)}
                            ,
                            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                            , leadingIcon ={Icon(imageVector = Icons.Default.Lock,contentDescription = null,
                               tint=Color.White)}
                            //,modifier=Modifier.padding(start=10.dp)
                            , visualTransformation = if (hidden) PasswordVisualTransformation() else VisualTransformation.None
                             ,colors=TextFieldDefaults.outlinedTextFieldColors(
                                 textColor = Color.White,
                                 focusedBorderColor = Color.White,
                                 unfocusedBorderColor = Color.White
                             ) )

                        Spacer(modifier = Modifier.size(70.dp))


                        //boton
                        Button(onClick ={},
                            shape = RoundedCornerShape(0.dp)
                            , modifier = Modifier.align(Alignment.End)
                        ) {
                            Text("Siguiente")

                        }
                    }
                   }
                //aca comineza
                    //aca termina

                }









            }
        }
    }
