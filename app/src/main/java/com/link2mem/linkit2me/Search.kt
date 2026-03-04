package com.link2mem.linkit2me
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun SearchScreen() {
    var query by remember { mutableStateOf("") }
    Column(modifier = Modifier.fillMaxSize().padding(24.dp)) {
        OutlinedTextField(
            value = query,
            onValueChange = { query = it },
            label = { Text("ابحث في linkit2me...") },
            modifier = Modifier.fillMaxWidth()
        )
    }
}
