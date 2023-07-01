package com.rujirakongsomran.jc_navigationbasics

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun SetupNavGraph(
    navHostController: NavHostController
) {
    NavHost(
        navController = navHostController,
        startDestination = Screen.Home.route
    ) {
        composable(
            route = Screen.Home.route
        ){
            HomeScreen()
        }
    }
}