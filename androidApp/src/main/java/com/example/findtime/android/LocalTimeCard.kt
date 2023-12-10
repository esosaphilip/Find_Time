package com.example.findtime.android

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.compose.md_theme_dark_secondary
import com.example.compose.md_theme_light_primary
import com.example.findtime.android.theme.typography

@Composable
fun LocalTimeCard(city: String, time: String, date: String) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(140.dp)
            .background(Color.White)
            .padding(8.dp),
    ) {
        Card(
            shape = RoundedCornerShape(8.dp),
            border = BorderStroke(1.dp, Color.Black),
            elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
            modifier = Modifier.fillMaxWidth(),

        ) {
            Box(
                modifier = Modifier.background(
                    brush = Brush.horizontalGradient(
                        colors = listOf(
                            md_theme_light_primary,
                            md_theme_dark_secondary,
                        ),
                    ),

                ).padding(8.dp),
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                ) {
                    Column(
                        horizontalAlignment = Alignment.Start,
                    ) {
                        Spacer(modifier = Modifier.weight(1.0f))
                        Text(text = "Your Location", style = typography.labelLarge)
                        Spacer(modifier = Modifier.height(8.dp))
                        Text(text = "City", style = typography.bodyLarge)
                        Spacer(modifier = Modifier.height(8.dp))
                    }
                    Spacer(modifier = Modifier.weight(1.0f))
                    Column(
                        horizontalAlignment = Alignment.End,
                    ) {
                        Spacer(modifier = Modifier.weight(1.0f))
                        Text(
                            text = "Time",
                            style = typography.headlineLarge,
                        )
                        Spacer(modifier = Modifier.height(8.dp))
                        Text(text = "date", style = typography.bodyMedium)
                        Spacer(modifier = Modifier.height(8.dp))
                    }
                }
            }
        }
    }
}
