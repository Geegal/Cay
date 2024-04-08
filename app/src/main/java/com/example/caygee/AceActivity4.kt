package com.example.caygee

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri
import com.example.caygee.ui.theme.CayGeeTheme
import com.example.caygee.ui.theme.Cream5

class AceActivity4 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Mypage()

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Mypage() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
        val mContext = LocalContext.current
        //TopAppBar
        TopAppBar(
            title = { Text(text = "", color = Color.Black) },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.White),
            navigationIcon = {
                IconButton(onClick = {
                    mContext.startActivity(
                        Intent(
                            mContext,
                            MainActivity::class.java
                        )
                    )
                }) {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = "arrowback",
                        tint = Color.Black
                    )

                }
            },
            actions = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.Lock,
                        contentDescription = "share",
                        tint = Color.Black
                    )

                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.Menu,
                        contentDescription = "settings",
                        tint = Color.Black
                    )

                }
            },

            )//End of TopAppBar
        Spacer(modifier = Modifier.height(5.dp))

        Row(
            modifier = Modifier
                .horizontalScroll(rememberScrollState())
                .padding(start = 5.dp)
        ) {
            Text(
                text = "Chairs",
                fontSize = 35.sp,
                fontWeight = FontWeight.ExtraBold
            )
            Spacer(modifier = Modifier.width(15.dp))
            Text(
                text = "Tables",
                fontSize = 35.sp,
                fontWeight = FontWeight.ExtraBold,
                color = Color.Gray,
            )
            Spacer(modifier = Modifier.width(15.dp))
            Text(
                text = "Sofa",
                fontSize = 35.sp,
                fontWeight = FontWeight.ExtraBold,
                color = Color.Gray,
            )
            Spacer(modifier = Modifier.width(15.dp))
            Text(
                text = "Beds",
                fontSize = 35.sp,
                fontWeight = FontWeight.ExtraBold,
                color = Color.Gray,
            )


        }
        Spacer(modifier = Modifier.height(15.dp))
        Row {
            Text(
                text = " 120 products",
                fontSize = 15.sp,
            )

            Text(
                text = " Popular ",
                fontSize = 20.sp,
                fontWeight = FontWeight.ExtraBold,
                modifier = Modifier.padding(start = 170.dp),
            )
            Icon(
                imageVector = Icons.Default.KeyboardArrowDown,
                contentDescription = "ArrowDown",
                modifier = Modifier.padding(top = 5.dp)
            )
        }
        Column {
            Row(
                modifier = Modifier.padding(start = 10.dp)
            ) {
                //Column1
               Card (modifier = Modifier.padding(start = 5.dp)){
                   Column {
                       Card(
                           modifier = Modifier
                               .height(100.dp)
                               .width(150.dp)
                               .padding(15.dp)

                       ) {
                           Box(
                               modifier = Modifier.fillMaxWidth(),
                               contentAlignment = Alignment.Center
                           ) {
                               Image(
                                   painter = painterResource(id = R.drawable.c10),
                                   contentDescription = "chair10",
                                   modifier = Modifier.fillMaxSize(),
                                   contentScale = ContentScale.FillBounds
                               )

                           }

                       }
                       Spacer(modifier = Modifier.height(5.dp))
                       Text(
                           text = "Amos Chair",
                           fontSize = 20.sp,
                           fontFamily = FontFamily.Serif,
                           fontWeight = FontWeight.Bold,
                       )

                       Spacer(modifier = Modifier.height(5.dp))


                       Spacer(modifier = Modifier.height(5.dp))
                       Text(
                           text = "The Best of All",
                           fontSize = 15.sp,
                           fontFamily = FontFamily.Serif,

                           )
                       Text(
                           text = "Times",
                           fontSize = 15.sp,
                           fontFamily = FontFamily.Serif,

                           )
                       Spacer(modifier = Modifier.height(5.dp))
                       Row {
                           Text(
                               text = "Kshs.380000",
                               fontSize = 15.sp,
                               fontFamily = FontFamily.Serif,
                               color = Color.Black

                           )
                           Icon(
                               imageVector =Icons.Default.Lock ,
                               contentDescription ="Basket",
                               tint = Color.Black,
                               modifier = Modifier.padding(start = 20.dp)
                           )
                       }


                   }
               }
                Spacer(modifier = Modifier.width(25.dp))
                Card {
                   Column {
                       Card(
                           modifier = Modifier
                               .height(100.dp)
                               .width(150.dp)
                               .padding(15.dp)

                       ) {
                           Box(
                               modifier = Modifier.fillMaxWidth(),
                               contentAlignment = Alignment.Center
                           ) {
                               Image(
                                   painter = painterResource(id = R.drawable.c10),
                                   contentDescription = "chair10",
                                   modifier = Modifier.fillMaxSize(),
                                   contentScale = ContentScale.FillBounds
                               )

                           }

                       }
                       Spacer(modifier = Modifier.height(5.dp))
                       Text(
                           text = "Amos Chair",
                           fontSize = 20.sp,
                           fontFamily = FontFamily.Serif,
                           fontWeight = FontWeight.Bold,
                       )

                       Spacer(modifier = Modifier.height(5.dp))


                       Spacer(modifier = Modifier.height(5.dp))
                       Text(
                           text = "The Best of All",
                           fontSize = 15.sp,
                           fontFamily = FontFamily.Serif,

                           )
                       Text(
                           text = "Times",
                           fontSize = 15.sp,
                           fontFamily = FontFamily.Serif,

                           )
                       Spacer(modifier = Modifier.height(5.dp))
                       Row {
                           Text(
                               text = "Kshs.380000",
                               fontSize = 15.sp,
                               fontFamily = FontFamily.Serif,
                               color = Color.Black

                           )
                           Icon(
                               imageVector =Icons.Default.Lock ,
                               contentDescription ="Basket",
                               tint = Color.Black,
                               modifier = Modifier.padding(start = 20.dp)
                           )
                       }


                   }
               }





            }
            Spacer(modifier = Modifier.height(25.dp))
            Row(
                modifier = Modifier.padding(start = 10.dp)
            ) {
                //Column1
               Card (modifier = Modifier.padding(start = 5.dp)){
                   Column {
                       Card(
                           modifier = Modifier
                               .height(100.dp)
                               .width(150.dp)
                               .padding(15.dp)

                       ) {
                           Box(
                               modifier = Modifier.fillMaxWidth(),
                               contentAlignment = Alignment.Center
                           ) {
                               Image(
                                   painter = painterResource(id = R.drawable.c10),
                                   contentDescription = "chair10",
                                   modifier = Modifier.fillMaxSize(),
                                   contentScale = ContentScale.FillBounds
                               )

                           }

                       }
                       Spacer(modifier = Modifier.height(5.dp))
                       Text(
                           text = "Amos Chair",
                           fontSize = 20.sp,
                           fontFamily = FontFamily.Serif,
                           fontWeight = FontWeight.Bold,
                       )

                       Spacer(modifier = Modifier.height(5.dp))


                       Spacer(modifier = Modifier.height(5.dp))
                       Text(
                           text = "The Best of All",
                           fontSize = 15.sp,
                           fontFamily = FontFamily.Serif,

                           )
                       Text(
                           text = "Times",
                           fontSize = 15.sp,
                           fontFamily = FontFamily.Serif,

                           )
                       Spacer(modifier = Modifier.height(5.dp))
                       Row {
                           Text(
                               text = "Kshs.380000",
                               fontSize = 15.sp,
                               fontFamily = FontFamily.Serif,
                               color = Color.Black

                           )
                           Icon(
                               imageVector =Icons.Default.Lock ,
                               contentDescription ="Basket",
                               tint = Color.Black,
                               modifier = Modifier.padding(start = 20.dp)
                           )
                       }


                   }
               }
                Spacer(modifier = Modifier.width(25.dp))
                Card {
                   Column {
                       Card(
                           modifier = Modifier
                               .height(100.dp)
                               .width(150.dp)
                               .padding(15.dp)

                       ) {
                           Box(
                               modifier = Modifier.fillMaxWidth(),
                               contentAlignment = Alignment.Center
                           ) {
                               Image(
                                   painter = painterResource(id = R.drawable.c10),
                                   contentDescription = "chair10",
                                   modifier = Modifier.fillMaxSize(),
                                   contentScale = ContentScale.FillBounds
                               )

                           }

                       }
                       Spacer(modifier = Modifier.height(5.dp))
                       Text(
                           text = "Amos Chair",
                           fontSize = 20.sp,
                           fontFamily = FontFamily.Serif,
                           fontWeight = FontWeight.Bold,
                       )

                       Spacer(modifier = Modifier.height(5.dp))


                       Spacer(modifier = Modifier.height(5.dp))
                       Text(
                           text = "The Best of All",
                           fontSize = 15.sp,
                           fontFamily = FontFamily.Serif,

                           )
                       Text(
                           text = "Times",
                           fontSize = 15.sp,
                           fontFamily = FontFamily.Serif,

                           )
                       Spacer(modifier = Modifier.height(5.dp))
                       Row {
                           Text(
                               text = "Kshs.380000",
                               fontSize = 15.sp,
                               fontFamily = FontFamily.Serif,
                               color = Color.Black

                           )
                           Icon(
                               imageVector =Icons.Default.Lock ,
                               contentDescription ="Basket",
                               tint = Color.Black,
                               modifier = Modifier.padding(start = 20.dp)
                           )
                       }


                   }
               }





            }
            Spacer(modifier = Modifier.height(25.dp))
            Row(
                modifier = Modifier.padding(start = 10.dp)
            ) {
                //Column1
               Card (modifier = Modifier.padding(start = 5.dp)){
                   Column {
                       Card(
                           modifier = Modifier
                               .height(100.dp)
                               .width(150.dp)
                               .padding(15.dp)

                       ) {
                           Box(
                               modifier = Modifier.fillMaxWidth(),
                               contentAlignment = Alignment.Center
                           ) {
                               Image(
                                   painter = painterResource(id = R.drawable.c10),
                                   contentDescription = "chair10",
                                   modifier = Modifier.fillMaxSize(),
                                   contentScale = ContentScale.FillBounds
                               )

                           }

                       }
                       Spacer(modifier = Modifier.height(5.dp))
                       Text(
                           text = "Amos Chair",
                           fontSize = 20.sp,
                           fontFamily = FontFamily.Serif,
                           fontWeight = FontWeight.Bold,
                       )

                       Spacer(modifier = Modifier.height(5.dp))


                       Spacer(modifier = Modifier.height(5.dp))
                       Text(
                           text = "The Best of All",
                           fontSize = 15.sp,
                           fontFamily = FontFamily.Serif,

                           )
                       Text(
                           text = "Times",
                           fontSize = 15.sp,
                           fontFamily = FontFamily.Serif,

                           )
                       Spacer(modifier = Modifier.height(5.dp))
                       Row {
                           Text(
                               text = "Kshs.380000",
                               fontSize = 15.sp,
                               fontFamily = FontFamily.Serif,
                               color = Color.Black

                           )
                           Icon(
                               imageVector =Icons.Default.Lock ,
                               contentDescription ="Basket",
                               tint = Color.Black,
                               modifier = Modifier.padding(start = 20.dp)
                           )
                       }


                   }
               }
                Spacer(modifier = Modifier.width(25.dp))
                Card {
                   Column {
                       Card(
                           modifier = Modifier
                               .height(100.dp)
                               .width(150.dp)
                               .padding(15.dp)

                       ) {
                           Box(
                               modifier = Modifier.fillMaxWidth(),
                               contentAlignment = Alignment.Center
                           ) {
                               Image(
                                   painter = painterResource(id = R.drawable.c10),
                                   contentDescription = "chair10",
                                   modifier = Modifier.fillMaxSize(),
                                   contentScale = ContentScale.FillBounds
                               )

                           }

                       }
                       Spacer(modifier = Modifier.height(5.dp))
                       Text(
                           text = "Amos Chair",
                           fontSize = 20.sp,
                           fontFamily = FontFamily.Serif,
                           fontWeight = FontWeight.Bold,
                       )

                       Spacer(modifier = Modifier.height(5.dp))


                       Spacer(modifier = Modifier.height(5.dp))
                       Text(
                           text = "The Best of All",
                           fontSize = 15.sp,
                           fontFamily = FontFamily.Serif,

                           )
                       Text(
                           text = "Times",
                           fontSize = 15.sp,
                           fontFamily = FontFamily.Serif,

                           )
                       Spacer(modifier = Modifier.height(5.dp))
                       Row {
                           Text(
                               text = "Kshs.380000",
                               fontSize = 15.sp,
                               fontFamily = FontFamily.Serif,
                               color = Color.Black

                           )
                           Icon(
                               imageVector =Icons.Default.Lock ,
                               contentDescription ="Basket",
                               tint = Color.Black,
                               modifier = Modifier.padding(start = 20.dp)
                           )
                       }


                   }
               }





            }
            Spacer(modifier = Modifier.height(25.dp))
            Row(
                modifier = Modifier.padding(start = 10.dp)
            ) {
                //Column1
               Card (modifier = Modifier.padding(start = 5.dp)){
                   Column {
                       Card(
                           modifier = Modifier
                               .height(100.dp)
                               .width(150.dp)
                               .padding(15.dp)

                       ) {
                           Box(
                               modifier = Modifier.fillMaxWidth(),
                               contentAlignment = Alignment.Center
                           ) {
                               Image(
                                   painter = painterResource(id = R.drawable.c10),
                                   contentDescription = "chair10",
                                   modifier = Modifier.fillMaxSize(),
                                   contentScale = ContentScale.FillBounds
                               )

                           }

                       }
                       Spacer(modifier = Modifier.height(5.dp))
                       Text(
                           text = "Amos Chair",
                           fontSize = 20.sp,
                           fontFamily = FontFamily.Serif,
                           fontWeight = FontWeight.Bold,
                       )

                       Spacer(modifier = Modifier.height(5.dp))


                       Spacer(modifier = Modifier.height(5.dp))
                       Text(
                           text = "The Best of All",
                           fontSize = 15.sp,
                           fontFamily = FontFamily.Serif,

                           )
                       Text(
                           text = "Times",
                           fontSize = 15.sp,
                           fontFamily = FontFamily.Serif,

                           )
                       Spacer(modifier = Modifier.height(5.dp))
                       Row {
                           Text(
                               text = "Kshs.380000",
                               fontSize = 15.sp,
                               fontFamily = FontFamily.Serif,
                               color = Color.Black

                           )
                           Icon(
                               imageVector =Icons.Default.Lock ,
                               contentDescription ="Basket",
                               tint = Color.Black,
                               modifier = Modifier.padding(start = 20.dp)
                           )
                       }


                   }
               }
                Spacer(modifier = Modifier.width(25.dp))

                Card {
                   Column {
                       Card(
                           modifier = Modifier
                               .height(100.dp)
                               .width(150.dp)
                               .padding(15.dp)

                       ) {
                           Box(
                               modifier = Modifier.fillMaxWidth(),
                               contentAlignment = Alignment.Center
                           ) {
                               Image(
                                   painter = painterResource(id = R.drawable.c10),
                                   contentDescription = "chair10",
                                   modifier = Modifier.fillMaxSize(),
                                   contentScale = ContentScale.FillBounds
                               )

                           }

                       }
                       Spacer(modifier = Modifier.height(5.dp))
                       Text(
                           text = "Amos Chair",
                           fontSize = 20.sp,
                           fontFamily = FontFamily.Serif,
                           fontWeight = FontWeight.Bold,
                       )

                       Spacer(modifier = Modifier.height(5.dp))


                       Spacer(modifier = Modifier.height(5.dp))
                       Text(
                           text = "The Best of All",
                           fontSize = 15.sp,
                           fontFamily = FontFamily.Serif,

                           )
                       Text(
                           text = "Times",
                           fontSize = 15.sp,
                           fontFamily = FontFamily.Serif,

                           )
                       Spacer(modifier = Modifier.height(5.dp))
                       Row {
                           Text(
                               text = "Kshs.380000",
                               fontSize = 15.sp,
                               fontFamily = FontFamily.Serif,
                               color = Color.Black

                           )
                           Icon(
                               imageVector =Icons.Default.Lock ,
                               contentDescription ="Basket",
                               tint = Color.Black,
                               modifier = Modifier.padding(start = 20.dp)
                           )
                       }


                   }
               }





            }
        }




//End of Column1

    }
}












@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MypagePreview(){
    Mypage()
}