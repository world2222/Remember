package com.example.remember.graphs

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.remember.presentation.home.HomeScreen
import com.example.remember.presentation.main.MainScreen
import com.example.remember.presentation.mypage.MyPageScreen
import com.example.remember.presentation.random.RandomScreen
import com.example.remember.presentation.review.ReviewScreen

@Composable
fun MainNavGraph(
    navController: NavHostController,
    paddingValues: PaddingValues
) {
    NavHost(
        navController = navController,
        route = RootGraph.MainScreen.route,
        startDestination = MainGraph.HomeScreen.route
    ) {
        composable(route = MainGraph.HomeScreen.route) {
            HomeScreen(
                navController = navController,
                paddingValues = paddingValues
            )
        }
        composable(route = MainGraph.ReviewScreen.route) {
            ReviewScreen(
                navController = navController,
                paddingValues = paddingValues
            )
        }
        composable(route = MainGraph.RandomScreen.route) {
            RandomScreen(
                navController = navController,
                paddingValues = paddingValues
            )
        }
        composable(route = MainGraph.MyPageScreen.route) {
            MyPageScreen(
                navController = navController,
                paddingValues = paddingValues
            )
        }
    }
}

sealed class MainGraph(val route: String) {
    data object HomeScreen: MainGraph(route = "HomeScreen")
    data object ReviewScreen: MainGraph(route = "ReviewScreen")
    data object RandomScreen: MainGraph(route = "RandomScreen")
    data object MyPageScreen: MainGraph(route = "MyPageScreen")
}