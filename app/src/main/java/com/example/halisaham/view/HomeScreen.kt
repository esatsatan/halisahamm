package com.example.halisaham.view

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.*
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.halisaham.components.CustomAppBar

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen() {

    var text by remember {
        mutableStateOf("")
    }
    CustomAppBar()

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            TextField(
                value = text,
                onValueChange = { newText ->
                       text = newText
                },
                label = { Text(text = "Input")},
                modifier = Modifier.padding(16.dp)
            )
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Button")
            }
        }
    }



}