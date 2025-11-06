package com.example.questnavigasiui_241

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
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

}