package com.example.caygee

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.caygee.ui.theme.CayGeeTheme

class WoofActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Woof()

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Woof(){


    Column (modifier = Modifier
        .fillMaxSize()
        .verticalScroll(rememberScrollState())
        ){


      Box (
          modifier = Modifier.fillMaxWidth(),
          contentAlignment = Alignment.Center
      ){

          Text(
              text = "Woof",
              fontSize = 40.sp,
              fontWeight = FontWeight.Bold
              )

      }


        Spacer(modifier = Modifier.height(15.dp))
        Column {
            Card (
                modifier = Modifier
                    .height(70.dp)
                    .fillMaxWidth()
                    .padding(10.dp)
            ){
               Row {
                   Image(
                       painter = painterResource(id = R.drawable.doggie),
                       contentDescription = "Dog",
                       modifier = Modifier
                           .width(60.dp)
                           .padding(start = 5.dp, top = 5.dp)

                           .clip(shape = CircleShape),
                       contentScale = ContentScale.Crop)

                   Spacer(modifier = Modifier.height(20.dp))
                   Column(
                       modifier = Modifier.padding(start = 5.dp)
                   ) {
                       Text(
                           text = "Koda",
                           fontSize = 20.sp,
                           fontWeight = FontWeight.Bold,

                           )
                       Text(text = "2 years old")

                   }
               }

            }
            Spacer(modifier = Modifier.height(1.dp))

            Card (
                modifier = Modifier
                    .height(70.dp)
                    .fillMaxWidth()
                    .padding(10.dp)
            ){
               Row {
                   Image(
                       painter = painterResource(id = R.drawable.d2),
                       contentDescription = "Dog",
                       modifier = Modifier
                           .width(60.dp)
                           .padding(start = 5.dp, top = 5.dp)

                           .clip(shape = CircleShape),
                       contentScale = ContentScale.Crop)

                   Spacer(modifier = Modifier.height(20.dp))
                   Column (
                       modifier = Modifier.padding(start = 5.dp)
                   ){
                       Text(
                           text = "Lola",
                           fontSize = 20.sp,
                           fontWeight = FontWeight.Bold
                           )
                       Text(text = "16 years old")

                   }
               }

            }
            Spacer(modifier = Modifier.height(5.dp))

            Card (
                modifier = Modifier
                    .height(70.dp)
                    .fillMaxWidth()
                    .padding(10.dp)
            ){
               Row {
                   Image(
                       painter = painterResource(id = R.drawable.d3),
                       contentDescription = "Dog",
                       modifier = Modifier
                           .width(60.dp)
                           .padding(start = 5.dp, top = 5.dp)

                           .clip(shape = CircleShape),
                       contentScale = ContentScale.Crop)

                   Spacer(modifier = Modifier.height(20.dp))
                   Column (
                       modifier = Modifier.padding(start = 5.dp)
                   ){
                       Text(
                           text = "Frankie",
                           fontSize = 20.sp,
                           fontWeight = FontWeight.Bold
                           )
                       Text(text = "2 years old")

                   }
               }

            }
            Spacer(modifier = Modifier.height(5.dp))

            Card (
                modifier = Modifier
                    .height(70.dp)
                    .fillMaxWidth()
                    .padding(10.dp)
            ){
               Row {
                   Image(
                       painter = painterResource(id = R.drawable.d4),
                       contentDescription = "Dog",
                       modifier = Modifier
                           .width(60.dp)
                           .padding(start = 5.dp, top = 5.dp)

                           .clip(shape = CircleShape),
                       contentScale = ContentScale.Crop)

                   Spacer(modifier = Modifier.height(20.dp))
                   Column (
                       modifier = Modifier.padding(start = 5.dp)
                   ){
                       Text(
                           text = "Nox",
                           fontSize = 20.sp,
                           fontWeight = FontWeight.Bold,

                           )
                       Text(text = "8 years old")

                   }
               }

            }
            Spacer(modifier = Modifier.height(5.dp))

            Card (
                modifier = Modifier
                    .height(70.dp)
                    .fillMaxWidth()
                    .padding(10.dp)
            ){
               Row {
                   Image(
                       painter = painterResource(id = R.drawable.d5),
                       contentDescription = "Dog",
                       modifier = Modifier
                           .width(60.dp)
                           .padding(start = 5.dp, top = 5.dp)

                           .clip(shape = CircleShape),
                       contentScale = ContentScale.Crop)

                   Spacer(modifier = Modifier.height(20.dp))
                   Column (
                       modifier = Modifier.padding(start = 5.dp)
                   ){
                       Text(
                           text = "Faye",
                           fontSize = 20.sp,
                           fontWeight = FontWeight.Bold
                           )
                       Text(text = "8 years old")

                   }
               }

            }
            Spacer(modifier = Modifier.height(5.dp))

            Card (
                modifier = Modifier
                    .height(70.dp)
                    .fillMaxWidth()
                    .padding(10.dp)
            ){
               Row {
                   Image(
                       painter = painterResource(id = R.drawable.d6),
                       contentDescription = "Dog",
                       modifier = Modifier
                           .width(60.dp)
                           .padding(start = 5.dp, top = 5.dp)

                           .clip(shape = CircleShape),
                       contentScale = ContentScale.Crop)

                   Spacer(modifier = Modifier.height(20.dp))
                   Column (
                       modifier = Modifier.padding(start = 5.dp)
                   ){
                       Text(
                           text = "Bella",
                           fontSize = 20.sp,
                           fontWeight = FontWeight.Bold
                           )
                       Text(text = "14 years old")

                   }
               }

            }
            Spacer(modifier = Modifier.height(5.dp))

            Card (
                modifier = Modifier
                    .height(70.dp)
                    .fillMaxWidth()
                    .padding(10.dp)
            ){
               Row {
                   Image(
                       painter = painterResource(id = R.drawable.d7),
                       contentDescription = "Dog",
                       modifier = Modifier
                           .width(60.dp)
                           .padding(start = 5.dp, top = 5.dp)

                           .clip(shape = CircleShape),
                       contentScale = ContentScale.Crop)

                   Spacer(modifier = Modifier.height(20.dp))
                   Column (
                       modifier = Modifier.padding(start = 5.dp)
                   ){
                       Text(
                           text = "Moana",
                           fontSize = 20.sp,
                           fontWeight = FontWeight.Bold
                           )
                       Text(text = "2 years old")

                   }
               }

            }
            Spacer(modifier = Modifier.height(5.dp))

            Card (
                modifier = Modifier
                    .height(70.dp)
                    .fillMaxWidth()
                    .padding(10.dp)
            ){
               Row {
                   Image(
                       painter = painterResource(id = R.drawable.doggie),
                       contentDescription = "Dog",
                       modifier = Modifier
                           .width(60.dp)
                           .padding(start = 5.dp, top = 5.dp)

                           .clip(shape = CircleShape),
                       contentScale = ContentScale.Crop)

                   Spacer(modifier = Modifier.height(20.dp))
                   Column(
                       modifier = Modifier.padding(start = 5.dp)
                   ) {
                       Text(
                           text = "Tzeitel",
                           fontSize = 20.sp,
                           fontWeight = FontWeight.Bold
                           )
                       Text(text = "7 years old")

                   }
               }

            }
            Spacer(modifier = Modifier.height(5.dp))

            Card (
                modifier = Modifier
                    .height(70.dp)
                    .fillMaxWidth()
                    .padding(10.dp)
            ){
               Row {
                   Image(
                       painter = painterResource(id = R.drawable.doggie),
                       contentDescription = "Dog",
                       modifier = Modifier
                           .width(60.dp)
                           .padding(start = 5.dp, top = 5.dp)

                           .clip(shape = CircleShape),
                       contentScale = ContentScale.Crop)

                   Spacer(modifier = Modifier.height(20.dp))
                   Column(
                       modifier = Modifier.padding(start = 5.dp)
                   ) {
                       Text(
                           text = "Koda",
                           fontSize = 20.sp,
                           fontWeight = FontWeight.Bold
                           )
                       Text(text = "2 years old")

                   }
               }

            }
            Spacer(modifier = Modifier.height(5.dp))

            Card (
                modifier = Modifier
                    .height(70.dp)
                    .fillMaxWidth()
                    .padding(10.dp)
            ){
               Row {
                   Image(
                       painter = painterResource(id = R.drawable.doggie),
                       contentDescription = "Dog",
                       modifier = Modifier
                           .width(60.dp)
                           .padding(start = 5.dp, top = 5.dp)

                           .clip(shape = CircleShape),
                       contentScale = ContentScale.Crop)

                   Spacer(modifier = Modifier.height(20.dp))
                   Column (
                       modifier = Modifier.padding(start = 5.dp)
                   ){
                       Text(
                           text = "Koda",
                           fontSize = 20.sp,
                           fontWeight = FontWeight.Bold
                           )
                       Text(text = "2 years old")

                   }
               }

            }
            Spacer(modifier = Modifier.height(5.dp))

            Card (
                modifier = Modifier
                    .height(70.dp)
                    .fillMaxWidth()
                    .padding(10.dp)
            ){
               Row {
                   Image(
                       painter = painterResource(id = R.drawable.doggie),
                       contentDescription = "Dog",
                       modifier = Modifier
                           .width(60.dp)
                           .padding(start = 5.dp, top = 5.dp)

                           .clip(shape = CircleShape),
                       contentScale = ContentScale.Crop)

                   Spacer(modifier = Modifier.height(20.dp))
                   Column (
                       modifier = Modifier.padding(start = 5.dp)
                   ){
                       Text(
                           text = "Koda",
                           fontSize = 20.sp,
                           fontWeight = FontWeight.Bold
                           )
                       Text(text = "2 years old")

                   }
               }

            }
            Spacer(modifier = Modifier.height(5.dp))

            Card (
                modifier = Modifier
                    .height(70.dp)
                    .fillMaxWidth()
                    .padding(10.dp)
            ){
               Row {
                   Image(
                       painter = painterResource(id = R.drawable.doggie),
                       contentDescription = "Dog",
                       modifier = Modifier
                           .width(60.dp)
                           .padding(start = 5.dp, top = 5.dp)

                           .clip(shape = CircleShape),
                       contentScale = ContentScale.Crop)

                   Spacer(modifier = Modifier.height(20.dp))
                   Column(
                       modifier = Modifier.padding(start = 5.dp)
                   ) {
                       Text(
                           text = "Koda",
                           fontSize = 20.sp,
                           fontWeight = FontWeight.Bold
                           )
                       Text(text = "2 years old")

                   }
               }

            }
            Spacer(modifier = Modifier.height(5.dp))

            Card (
                modifier = Modifier
                    .height(70.dp)
                    .fillMaxWidth()
                    .padding(10.dp)
            ){
               Row {
                   Image(
                       painter = painterResource(id = R.drawable.doggie),
                       contentDescription = "Dog",
                       modifier = Modifier
                           .width(60.dp)
                           .padding(start = 5.dp, top = 5.dp)

                           .clip(shape = CircleShape),
                       contentScale = ContentScale.Crop)

                   Spacer(modifier = Modifier.height(20.dp))
                   Column (
                       modifier = Modifier.padding(start = 5.dp)
                   ){
                       Text(
                           text = "Koda",
                           fontSize = 20.sp,
                           fontWeight = FontWeight.Bold
                           )
                       Text(text = "2 years old")

                   }
               }

            }
            Spacer(modifier = Modifier.height(5.dp))

            Card (
                modifier = Modifier
                    .height(70.dp)
                    .fillMaxWidth()
                    .padding(10.dp)
            ){
               Row {
                   Image(
                       painter = painterResource(id = R.drawable.doggie),
                       contentDescription = "Dog",
                       modifier = Modifier
                           .width(60.dp)
                           .padding(start = 5.dp, top = 5.dp)

                           .clip(shape = CircleShape),
                       contentScale = ContentScale.Crop)

                   Spacer(modifier = Modifier.height(20.dp))
                   Column (
                       modifier = Modifier.padding(start = 5.dp)
                   ){
                       Text(
                           text = "Koda",
                           fontSize = 20.sp,
                           fontWeight = FontWeight.Bold
                           )
                       Text(text = "2 years old")

                   }
               }

            }
            Spacer(modifier = Modifier.height(5.dp))

            Card (
                modifier = Modifier
                    .height(70.dp)
                    .fillMaxWidth()
                    .padding(10.dp)
            ){
               Row {
                   Image(
                       painter = painterResource(id = R.drawable.doggie),
                       contentDescription = "Dog",
                       modifier = Modifier
                           .width(60.dp)
                           .padding(start = 5.dp, top = 5.dp)

                           .clip(shape = CircleShape),
                       contentScale = ContentScale.Crop)

                   Spacer(modifier = Modifier.height(20.dp))
                   Column(
                       modifier = Modifier.padding(start = 5.dp)
                   ) {
                       Text(
                           text = "Koda",
                           fontSize = 20.sp,
                           fontWeight = FontWeight.Bold
                           )
                       Text(text = "2 years old")

                   }
               }

            }
            Spacer(modifier = Modifier.height(5.dp))

            Card (
                modifier = Modifier
                    .height(70.dp)
                    .fillMaxWidth()
                    .padding(10.dp)
            ){
               Row {
                   Image(
                       painter = painterResource(id = R.drawable.doggie),
                       contentDescription = "Dog",
                       modifier = Modifier
                           .width(60.dp)
                           .padding(start = 5.dp, top = 5.dp)

                           .clip(shape = CircleShape),
                       contentScale = ContentScale.Crop)

                   Spacer(modifier = Modifier.height(20.dp))
                   Column (
                       modifier = Modifier.padding(start = 5.dp)
                   ){
                       Text(
                           text = "Koda",
                           fontSize = 20.sp,
                           fontWeight = FontWeight.Bold
                           )
                       Text(text = "2 years old")

                   }
               }

            }
            Spacer(modifier = Modifier.height(5.dp))

            Card (
                modifier = Modifier
                    .height(70.dp)
                    .fillMaxWidth()
                    .padding(10.dp)
            ){
               Row {
                   Image(
                       painter = painterResource(id = R.drawable.doggie),
                       contentDescription = "Dog",
                       modifier = Modifier
                           .width(60.dp)
                           .padding(start = 5.dp, top = 5.dp)

                           .clip(shape = CircleShape),
                       contentScale = ContentScale.Crop)

                   Spacer(modifier = Modifier.height(20.dp))
                   Column (
                       modifier = Modifier.padding(start = 5.dp)
                   ){
                       Text(
                           text = "Koda",
                           fontSize = 20.sp,
                           fontWeight = FontWeight.Bold
                           )
                       Text(text = "2 years old")

                   }
               }

            }
            Spacer(modifier = Modifier.height(5.dp))

            Card (
                modifier = Modifier
                    .height(70.dp)
                    .fillMaxWidth()
                    .padding(10.dp)
            ){
               Row {
                   Image(
                       painter = painterResource(id = R.drawable.doggie),
                       contentDescription = "Dog",
                       modifier = Modifier
                           .width(60.dp)
                           .padding(start = 5.dp, top = 5.dp)

                           .clip(shape = CircleShape),
                       contentScale = ContentScale.Crop)

                   Spacer(modifier = Modifier.height(20.dp))
                   Column (
                       modifier = Modifier.padding(start = 5.dp)
                   ){
                       Text(
                           text = "Koda",
                           fontSize = 20.sp,
                           fontWeight = FontWeight.Bold
                           )
                       Text(text = "2 years old")

                   }
               }

            }
            Spacer(modifier = Modifier.height(5.dp))

            Card (
                modifier = Modifier
                    .height(70.dp)
                    .fillMaxWidth()
                    .padding(10.dp)
            ){
               Row {
                   Image(
                       painter = painterResource(id = R.drawable.doggie),
                       contentDescription = "Dog",
                       modifier = Modifier
                           .width(60.dp)
                           .padding(start = 5.dp, top = 5.dp)

                           .clip(shape = CircleShape),
                       contentScale = ContentScale.Crop)

                   Spacer(modifier = Modifier.height(20.dp))
                   Column(
                       modifier = Modifier.padding(start = 5.dp)
                   ) {
                       Text(
                           text = "Koda",
                           fontSize = 20.sp,
                           fontWeight = FontWeight.Bold
                           )
                       Text(text = "2 years old")

                   }
               }

            }
            Spacer(modifier = Modifier.height(5.dp))

            Card (
                modifier = Modifier
                    .height(70.dp)
                    .fillMaxWidth()
                    .padding(10.dp)
            ){
               Row {
                   Image(
                       painter = painterResource(id = R.drawable.doggie),
                       contentDescription = "Dog",
                       modifier = Modifier
                           .width(60.dp)
                           .padding(start = 5.dp, top = 5.dp)

                           .clip(shape = CircleShape),
                       contentScale = ContentScale.Crop)

                   Spacer(modifier = Modifier.height(20.dp))
                   Column (
                       modifier = Modifier.padding(start = 5.dp)
                   ){
                       Text(
                           text = "Koda",
                           fontSize = 20.sp,
                           fontWeight = FontWeight.Bold
                           )
                       Text(text = "2 years old")

                   }
               }

            }
            Spacer(modifier = Modifier.height(5.dp))

            Card (
                modifier = Modifier
                    .height(70.dp)
                    .fillMaxWidth()
                    .padding(10.dp)
            ){
               Row {
                   Image(
                       painter = painterResource(id = R.drawable.doggie),
                       contentDescription = "Dog",
                       modifier = Modifier
                           .width(60.dp)
                           .padding(start = 5.dp, top = 5.dp)

                           .clip(shape = CircleShape),
                       contentScale = ContentScale.Crop)

                   Spacer(modifier = Modifier.height(20.dp))
                   Column (
                       modifier = Modifier.padding(start = 5.dp)
                   ){
                       Text(
                           text = "Koda",
                           fontSize = 20.sp,
                           fontWeight = FontWeight.Bold
                           )
                       Text(text = "2 years old")

                   }
               }

            }
            Spacer(modifier = Modifier.height(5.dp))

            Card (
                modifier = Modifier
                    .height(70.dp)
                    .fillMaxWidth()
                    .padding(10.dp)
            ){
               Row {
                   Image(
                       painter = painterResource(id = R.drawable.doggie),
                       contentDescription = "Dog",
                       modifier = Modifier
                           .width(60.dp)
                           .padding(start = 5.dp, top = 5.dp)

                           .clip(shape = CircleShape),
                       contentScale = ContentScale.Crop)

                   Spacer(modifier = Modifier.height(20.dp))
                   Column(
                       modifier = Modifier.padding(start = 5.dp)
                   ) {
                       Text(
                           text = "Koda",
                           fontSize = 20.sp,
                           fontWeight = FontWeight.Bold
                           )
                       Text(text = "2 years old")

                   }
               }

            }
            Spacer(modifier = Modifier.height(5.dp))

        }
    }
}


@Preview(showBackground = true)
@Composable
fun WoofPreview(){
    Woof()
}