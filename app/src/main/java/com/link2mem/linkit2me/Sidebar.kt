package com.link2mem.linkit2me
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun SidebarContent(onNavigate: (String) -> Unit) {
    ModalDrawerSheet {
        Spacer(modifier = Modifier.height(20.dp))
        Text("Linkit2me Menu", modifier = Modifier.padding(16.dp))
        NavigationDrawerItem(
            icon = { Icon(Icons.Default.Home, contentDescription = null) },
            label = { Text("الرئيسية") },
            selected = false,
            onClick = { onNavigate("home") }
        )
        NavigationDrawerItem(
            icon = { Icon(Icons.Default.Settings, contentDescription = null) },
            label = { Text("الإعدادات") },
            selected = false,
            onClick = { onNavigate("settings") }
        )
        NavigationDrawerItem(
            icon = { Icon(Icons.Default.Search, contentDescription = null) },
            label = { Text("البحث") },
            selected = false,
            onClick = { onNavigate("search") }
        )
    }
}
