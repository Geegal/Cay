package com.example.caygee

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.caygee.ui.theme.CayGeeTheme
import com.example.caygee.ui.theme.Purple11
import com.example.caygee.ui.theme.Purple12
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class AceActivity1 : ComponentActivity() {
    @SuppressLint("CoroutineCreationDuringComposition")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Myslide()

            val mContext = LocalContext.current
            val coroutineScope = rememberCoroutineScope()
            coroutineScope.launch {
                delay(3000)
                mContext.startActivity(Intent(mContext, AceActivity2::class.java))


            }
        }
    }

    @Composable
    fun Myslide() {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Purple11),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,

            ) {
            val mContext = LocalContext.current

            Image(
                painter = painterResource(id = R.drawable.gg1),
                contentDescription = "water",
                modifier = Modifier
                    .size(400.dp)
                    .clip(shape = CircleShape),
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.height(15.dp))
            Spacer(modifier = Modifier.height(15.dp))
            Text(
                text = "Choose Your Product",
                fontWeight = FontWeight.ExtraBold,
                fontSize = 30.sp,
            )
            Spacer(modifier = Modifier.height(35.dp))

            Text(text = "Wherever thou art be thy we shall endeavour")
            Text(text = "to be by your side oh great divine. Dear")
            Text(text = "Be not dismayed but courageous")

            Spacer(modifier = Modifier.height(35.dp))

            Button(
                onClick = { mContext.startActivity(Intent(mContext, LottieActivity::class.java)) },
                shape = RoundedCornerShape(5.dp),
                colors = ButtonDefaults.buttonColors(Purple12),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 30.dp, end = 30.dp)
            ) {
                Text(text = "Lottie")

            }
        }

    }

    @Preview(showBackground = true)
    @Composable
    fun MyslidePreview() {
        Myslide()
    }
}