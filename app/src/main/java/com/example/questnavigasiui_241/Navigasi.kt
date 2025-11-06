package com.example.questnavigasiui_241

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import java.lang.reflect.Modifier

enum class Navigasi {

    Formulir,

    Detail
}

@Composable

fun DetaApp(
    navController: NavHostController = rememberNavController(),
    modifier: Modifier
){
    Scaffold { IsiRuang->
        NavHost(
            navController = navController,
            startDestination = Navigasi.Formulir.name,

            modifier = Modifier.padding(padding.values = IsiRuang)







        )

    }
}