package com.fifty.learnnotification

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.fifty.learnnotification.ui.theme.LearnNotificationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val service = CounterNotificationService(applicationContext)
        setContent {
            LearnNotificationTheme {
                // A surface container using the 'background' color from the theme
                Box(modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center) {
                    Button(onClick = {
                        service.showNotification(Counter.value)
                    }) {
                        Text(text = "Show Notification")
                    }
                }
            }
        }
    }
}