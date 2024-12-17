package com.example.odev4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.odev4.ui.screens.AnaSayfa
import com.example.odev4.ui.screens.SayfaA
import com.example.odev4.ui.screens.SayfaB
import com.example.odev4.ui.screens.SayfaX
import com.example.odev4.ui.screens.SayfaY
import com.example.odev4.ui.theme.Odev4Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Odev4Theme {
                val navController = rememberNavController()
                Scaffold { padding ->
                    NavHost(
                        navController = navController,
                        startDestination = "AnaSayfa",
                        modifier = Modifier.padding(padding)
                    ) {
                        composable("AnaSayfa") {
                            AnaSayfa(navController = navController)
                        }
                        composable("SayfaA") {
                            SayfaA(navController = navController)
                        }
                        composable("SayfaB") {
                            SayfaB(navController = navController)
                        }
                        composable("SayfaY") {
                            SayfaY(navController = navController)
                        }
                        composable("SayfaX") {
                            SayfaX(navController = navController)
                        }
                    }
                }
            }
        }
    }
}
