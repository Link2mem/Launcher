package com.link2mem.linkit2me
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.navigation.compose.*

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val scope = rememberCoroutineScope()

    ModalNavigationDrawer(
        drawerState = drawerState,
        drawerContent = {
            SidebarContent(onNavigate = { route ->
                navController.navigate(route)
            })
        }
    ) {
        NavHost(navController = navController, startDestination = "home") {
            composable("home") { HomeScreen() }
            composable("settings") { SettingsScreen() }
            composable("search") { SearchScreen() }
        }
    }
}
