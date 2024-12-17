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
fun SayfaA(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize().background(Color.Red),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Text(text = "SAYFA A", fontSize = 50.sp)
        Button(onClick = { navController.navigate("SayfaB") },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Black,
            )
            ) { // Geri dönmek için
            Text(text = "Sayfa B git")
        }
    }
}
