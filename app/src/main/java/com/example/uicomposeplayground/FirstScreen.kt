package com.example.uicomposeplayground

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun FirstScreen(modifier: Modifier = Modifier) {
    Column(
    ) {
        Row(
            modifier = modifier
                .weight(0.5f),
        ) {
            Text(
                text = "1",
                modifier = modifier
                    .background(Color.Red)
                    .padding(8.dp)
                    .weight(0.5f)
                    .fillMaxHeight()
                    .wrapContentHeight(),
                textAlign = TextAlign.Center,
                fontSize = 70.sp,
            )
            Text(
                text = "2",
                modifier = modifier
                    .background(Color.Blue)
                    .padding(8.dp)
                    .weight(0.5f)
                    .fillMaxHeight()
                    .wrapContentHeight(),
                textAlign = TextAlign.Center,
                fontSize = 70.sp

            )
        }
        Row(
            modifier = modifier
                .weight(0.5f)
        ) {
            Text(
                text = "3",
                modifier = modifier
                    .background(Color.DarkGray)
                    .padding(8.dp)
                    .weight(0.5f)
                    .fillMaxHeight()
                    .wrapContentHeight(),
                textAlign = TextAlign.Center,
                fontSize = 70.sp
            )
            Text(
                text = "4",
                modifier = modifier
                    .background(Color.Yellow)
                    .padding(8.dp)
                    .weight(0.5f)
                    .fillMaxHeight()
                    .wrapContentHeight(),
                textAlign = TextAlign.Center,
                fontSize = 70.sp,
                color = Color.Black
            )
        }
    }

}


