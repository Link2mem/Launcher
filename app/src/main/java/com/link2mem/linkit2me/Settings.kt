package com.link2mem.linkit2me
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun SettingsScreen() {
    var isChecked by remember { mutableStateOf(false) }
    Column(modifier = Modifier.fillMaxSize().padding(24.dp)) {
        Text("الإعدادات", style = MaterialTheme.typography.headlineMedium)
        Spacer(modifier = Modifier.height(20.dp))
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text("تفعيل وضع سامسونج الذكي", modifier = Modifier.weight(1f))
            Switch(checked = isChecked, onCheckedChange = { isChecked = it })
        }
    }
}
