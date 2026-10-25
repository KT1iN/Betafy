package com.betafy.betafyapp

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.betafy.feature.auth.presentation.LoginScreen
import com.betafy.feature.auth.presentation.RegisterScreen
import com.betafy.feature.auth.presentation.SessionViewModel

private const val LOGIN = "login"
private const val REGISTER = "register"
private const val HOME = "home"
private const val REGISTERED_KEY = "registered"

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    val session: SessionViewModel = hiltViewModel()
    val start = if (session.isLoggedIn()) HOME else LOGIN

    NavHost(navController = navController, startDestination = start) {
        composable(LOGIN) { entry ->
            val registered by entry.savedStateHandle
                .getStateFlow(REGISTERED_KEY, false)
                .collectAsStateWithLifecycle()
            LoginScreen(
                onAuthorized = {
                    navController.navigate(HOME) { popUpTo(LOGIN) { inclusive = true } }
                },
                onRegisterClick = { navController.navigate(REGISTER) },
                registered = registered
            )
        }
        composable(REGISTER) {
            RegisterScreen(
                onRegistered = {
                    navController.previousBackStackEntry?.savedStateHandle?.set(REGISTERED_KEY, true)
                    navController.popBackStack()
                },
                onBackToLogin = { navController.popBackStack() }
            )
        }
        composable(HOME) {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text("Betafy")
                Button(onClick = {
                    session.signOut()
                    navController.navigate(LOGIN) { popUpTo(HOME) { inclusive = true } }
                }) { Text("Выйти") }
            }
        }
    }
}
