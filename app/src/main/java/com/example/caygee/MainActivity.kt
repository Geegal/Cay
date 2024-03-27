package com.example.caygee

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.caygee.ui.theme.CayGeeTheme
import com.example.caygee.LayoutActivity
import com.example.caygee.R

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Demo()

        }
    }
}

@Composable
fun Demo(){
    Column(modifier = Modifier.fillMaxSize()) {

        val mContext = LocalContext.current



        Text(
            text = "Welcome to Android",
            color = Color.Red,
            fontSize = 30.sp,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.Bold
        )
        Text(text = "Android is an open source and Linux-based operating system for mobile devices such as smartphones and tablet computers. ")

        Spacer(modifier = Modifier.height(15.dp))
        Column(
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.align(Alignment.CenterHorizontally)

        ) {
            Button(onClick = { mContext.startActivity(Intent(mContext, DestinationActivity::class.java)) },
                shape = RoundedCornerShape(5.dp),
                colors = ButtonDefaults.buttonColors(Color.Red),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 30.dp, end = 30.dp)) {
                Text(text = "Destination")

            }

        }
        Text(text = "Types of cars",
            fontSize = 20.sp,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Red)
            ,
            textAlign = TextAlign.Center,
            textDecoration = TextDecoration.Underline,
            color = Color.White,
            fontWeight = FontWeight.Bold)
        Text(text = "1. BMW")
        Text(text = "2. Mercedes Benz")
        Text(text = "3. Ferari")
        Text(text = "4. Bughatti")

        Spacer(modifier = Modifier.height(15.dp))
        Text(text = "Courses offered",
            fontSize = 20.sp,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Red)
            ,
            textAlign = TextAlign.Center,
            textDecoration = TextDecoration.Underline,
            color = Color.White,
            fontWeight = FontWeight.Bold)
        Text(text = "1. MIT")
        Text(text = "2. CYBER SECURITY")
        Text(text = "3. DATASCIENCE")
        Spacer(modifier = Modifier.height(15.dp))
        Text(text = "Introduction",
            fontSize = 20.sp,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Red)
            ,

            textAlign = TextAlign.Center,
            textDecoration = TextDecoration.Underline,
            color = Color.DarkGray,
            fontWeight = FontWeight.Bold
        )
        Text(text = "There are various types of cars, each designed for different purposes.")

        Spacer(modifier = Modifier.height(15.dp))
        Divider()


        //CENTERING AN IMAGE start
        Box (modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center){

            Image(painter = painterResource(id = R.drawable.doggie) ,
                contentDescription ="C'est un chien.Il est tres beau.Je l' aime.",
                modifier = Modifier
                    .size(200.dp)
                    .clip(shape = CircleShape),
                contentScale = ContentScale.Crop
            )


        }
        //CENTERING AN IMAGE end
        Text(
            text = "eMobilis Mobile Training Institute",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
        )
        Spacer(modifier = Modifier.height(15.dp))

        Button(onClick = { mContext.startActivity(Intent(mContext, LayoutActivity::class.java)) },
            shape = RoundedCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(Color.Red),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp)) {
            Text(text = "Continue")

        }
    }
}

@Preview(showBackground = true)
@Composable
fun DemoPreview(){
    Demo()

}
