package com.example.sesion6.View

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.content.contentReceiver
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.surfaceColorAtElevation
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import coil.compose.AsyncImage
import com.example.sesion6.ui.theme.Purple40

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun usuarios(navController: NavHostController) {
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
                    IconButton(onClick = {}) {
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
        content = { contenUsuario() }
    )


}
@Composable
fun contenUsuario () {
        Box() {
            Column {



                //CUADRO 1
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(120.dp)
                        .border(1.dp, Color.Gray),
                    colors = ButtonDefaults.buttonColors(Color.Red),
                    shape = CutCornerShape(0.dp)
                )
                {

                    Box(
                        contentAlignment = Alignment.Center, modifier = Modifier
                            .fillMaxWidth()
                            .widthIn(300.dp)
                            .height(80.dp)

                    ) {


                        //la parte top del primer cuadrado
                        //con esto los acomodo en los espacioes extremos centrados
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceBetween,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 0.dp)
                        )
                        {

                            Column() {
                                Text(
                                    "Luna",
                                    color = Color.Black,
                                    fontSize = 24.sp,
                                    fontWeight = FontWeight.Bold
                                )
                                Text("Añadir alias", color = Color.Black, fontSize = 13.sp,)

                            }

                            AsyncImage(
                                model = "https://img.freepik.com/foto-gratis/hermosa-escena-dibujos-animados-personajes-anime_23-2151035157.jpg?size=626&ext=jpg&ga=GA1.1.672697106.1715126400&semt=sph",
                                contentDescription = null,
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .size(80.dp)
                                    .border(0.dp, Color.Black, RoundedCornerShape(40.dp))
                                    .clip(
                                        RoundedCornerShape(40.dp)
                                    )

                            )


                        }

                    }


                }
                //CUADRO De Cuenta
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(80.dp)

                        .border(1.dp, Color.Gray),
                    colors = ButtonDefaults.buttonColors(Purple40),
                    shape = CutCornerShape(0.dp),



                )
                {
                    Row(
                        horizontalArrangement = Arrangement.Start,
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.fillMaxWidth()

                    ) {
                        Icon(
                            imageVector = Icons.Default.AccountBox,
                            contentDescription = null,
                            modifier = Modifier
                                .size(40.dp),
                            tint = Color.Black

                        )
                        Spacer(modifier = Modifier.size(ButtonDefaults.IconSize))
                        Column {
                            Text(
                                "Cuenta",
                                color = Color.Black,
                                fontWeight = FontWeight.Bold,
                                fontSize = 15.sp
                            )
                            Text(
                                "Notificaciones de seguridad",
                                color = Color.Black,
                                fontSize = 13.sp
                            )
                        }

                    }

                }
                //CUADRO De Invitarfriend
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(80.dp)

                        .border(0.5.dp, Color.Gray),
                    colors = ButtonDefaults.buttonColors(Purple40),
                    shape = CutCornerShape(0.dp)

                )
                {
                    Row(
                        horizontalArrangement = Arrangement.Start,
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Icon(
                            imageVector = Icons.Default.Face,
                            contentDescription = null,
                            modifier = Modifier
                                .size(40.dp),
                            tint = Color.Black
                        )
                        Spacer(modifier = Modifier.size(ButtonDefaults.IconSize))
                        Column {
                            Text(
                                "Invitar",
                                color = Color.Black,
                                fontWeight = FontWeight.Bold,
                                fontSize = 15.sp
                            )

                        }

                    }

                }
                //CUADRO De Idioma de la aplicaion
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(80.dp)

                        .border(1.dp, Color.Gray),
                    colors = ButtonDefaults.buttonColors(Purple40),
                    shape = CutCornerShape(0.dp)

                )
                {
                    Row(
                        horizontalArrangement = Arrangement.Start,
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Icon(
                            imageVector = Icons.Default.Notifications,
                            contentDescription = null,
                            modifier = Modifier
                                .size(40.dp),
                            tint = Color.Black
                        )
                        Spacer(modifier = Modifier.size(ButtonDefaults.IconSize))
                        Column {
                            Text(
                                "Idioma de la aplicacion",
                                color = Color.Black,
                                fontWeight = FontWeight.Bold,
                                fontSize = 15.sp
                            )
                            Text(
                                "Esapañol(Idioma prederteminado)",
                                color = Color.Black,
                                fontSize = 13.sp
                            )
                        }

                    }

                }
                //CUADRO De HELP
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(80.dp)

                        .border(1.dp, Color.Gray),
                    colors = ButtonDefaults.buttonColors(Purple40),
                    shape = CutCornerShape(0.dp)

                )
                {
                    Row(
                        horizontalArrangement = Arrangement.Start,
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Icon(
                            imageVector = Icons.Default.Info,
                            contentDescription = null,
                            modifier = Modifier
                                .size(40.dp),
                            tint = Color.Black
                        )
                        Spacer(modifier = Modifier.size(ButtonDefaults.IconSize))
                        Column {
                            Text(
                                "Ayuda",
                                color = Color.Black,
                                fontWeight = FontWeight.Bold,
                                fontSize = 15.sp
                            )
                            Text(
                                "Centro de Ayuda,contactanos,politica de privacidad)",
                                color = Color.Black,
                                fontSize = 13.sp
                            )
                        }

                    }

                }
                //CUADRO De Almacenamiento y Datos
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(80.dp)

                        .border(1.dp, Color.Gray),
                    colors = ButtonDefaults.buttonColors(Purple40),
                    shape = CutCornerShape(0.dp)

                )
                {
                    Row(
                        horizontalArrangement = Arrangement.Start,
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Icon(
                            imageVector = Icons.Default.DateRange,
                            contentDescription = null,
                            modifier = Modifier
                                .size(40.dp),
                            tint = Color.Black
                        )
                        Spacer(modifier = Modifier.size(ButtonDefaults.IconSize))
                        Column {
                            Text(
                                "Almacenamientos y Datos",
                                color = Color.Black,
                                fontWeight = FontWeight.Bold,
                                fontSize = 15.sp
                            )
                            Text(
                                "Uso de red,descarga automatica,registros",
                                color = Color.Black,
                                fontSize = 13.sp
                            )
                        }

                    }

                }
                //CUADRO Cambio de cuenta
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(80.dp)

                        .border(1.dp, Color.Gray),
                    colors = ButtonDefaults.buttonColors(Purple40),
                    shape = CutCornerShape(0.dp)

                )
                {
                    Row(
                        horizontalArrangement = Arrangement.Start,
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Icon(
                            imageVector = Icons.Default.Email,
                            contentDescription = null,
                            modifier = Modifier
                                .size(40.dp),
                            tint = Color.Black


                        )
                        Spacer(modifier = Modifier.size(ButtonDefaults.IconSize))
                        Column {
                            Text(
                                "Cambio de cuenta",
                                color = Color.Black,
                                fontWeight = FontWeight.Bold,
                                fontSize = 15.sp
                            )
                            Text(
                                "modificaicond de correo, telefono)",
                                color = Color.Black,
                                fontSize = 13.sp
                            )
                        }

                    }

                }
                //CUADRO SALIR
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(80.dp)

                        .border(1.dp, Color.Gray),
                    colors = ButtonDefaults.buttonColors(Purple40),
                    shape = CutCornerShape(0.dp)

                )
                {
                    Row(
                        horizontalArrangement = Arrangement.Start,
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Icon(
                            imageVector = Icons.Default.Close,
                            contentDescription = null,
                            modifier = Modifier
                                .size(40.dp),
                            tint = Color.Black


                        )
                        Spacer(modifier = Modifier.size(ButtonDefaults.IconSize))
                        Column {
                            Text(
                                "Salir",
                                color = Color.Black,
                                fontWeight = FontWeight.Bold,
                                fontSize = 15.sp
                            )
                            Text(
                                "Salir de la cuenta",
                                color = Color.Black,
                                fontSize = 13.sp
                            )
                        }

                    }

                }
            }
            //primer cuadro
        }
}


