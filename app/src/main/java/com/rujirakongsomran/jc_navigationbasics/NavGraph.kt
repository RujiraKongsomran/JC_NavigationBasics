package com.rujirakongsomran.jc_navigationbasics

import androidx.compose.runtime.Composable
import androidx.media3.common.util.Log
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument

@androidx.media3.common.util.UnstableApi
@Composable
fun  SetupNavGraph(
    navHostController: NavHostController
) {
    NavHost(
        navController = navHostController,
        startDestination = Screen.Home.route
    ) {
        composable(
            route = Screen.Home.route
        ) {
            HomeScreen(navController = navHostController)
        }
        composable(
            route = Screen.Detail.route,
            arguments = listOf(navArgument(DETAIL_ARGUMENT_KEY) {
                type = NavType.IntType
            })

        ) {
            Log.d("Args", it.arguments?.getInt("id").toString())
            DetailScreen(navController = navHostController)
        }
    }
}