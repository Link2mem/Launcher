package com.link2mem.linkit2me
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HomeScreen() {
    Column(modifier = Modifier.fillMaxSize().padding(24.dp)) {
        Text("أهلاً بك يا Link2mem", fontSize = 28.sp, fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(16.dp))
        Card(modifier = Modifier.fillMaxWidth()) {
            Text("إحصائياتك وروابطك تظهر هنا", modifier = Modifier.padding(16.dp))
        }
    }
}
