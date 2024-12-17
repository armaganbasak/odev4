package com.example.odev4.ui.screens


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun AnaSayfa(navController: NavController) {
    Column(

        modifier = Modifier.fillMaxSize().background(Color.Blue),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Text(text = "ANASAYFA", fontSize = 50.sp)
        Button(onClick = { navController.navigate("SayfaA") },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Black,
            )
            ) {
            Text(text = "Sayfa A git")
        }

        Button(onClick = { navController.navigate("SayfaX")},
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Black,
            )
            ) {
            Text(text = "Sayfa X git")
        }
    }

}