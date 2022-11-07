package com.example.mynewapp1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.runtime.Composable as Composable1

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                modifier = Modifier
                    //.width(200.dp)
                    .fillMaxWidth()
                    .fillMaxSize()
                    .padding(50.dp)
                    .border(10.dp, Color.Blue)
                    .padding(10.dp)
                    .border(5.dp, Color.Yellow)
                    .padding(10.dp)
                    .border(5.dp,Color.Blue)
                    .background(Color.Green),
                verticalArrangement = Arrangement.SpaceAround,
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Text(text = "Hello", Modifier.clickable {  })
                Text(text = "World !!!!")

            }

        }

    }

    @Composable1
    fun CardWithShape() {
        val paddingModifier = Modifier.padding(10.dp)
        Card(shape = RoundedCornerShape(20.dp),elevation = 10.dp, modifier = paddingModifier) {
            Text(text = "Round corner shape", modifier = paddingModifier)
        }
    }

}
