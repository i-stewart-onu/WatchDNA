package com.example.watchdna

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

data class Platform(
    val name: String,
    val description: String
)

data class PlatformCountry(
    val country: String,
    val platforms: List<Platform>
)

val platformsByCountry = listOf(
    PlatformCountry(
        country = "Switzerland",
        platforms = listOf(
            Platform(
                name = "Horopedia",
                description = "A free, independent online video encyclopaedia governed by the Horopedia Foundation. It is dedicated to preserving and sharing horological knowledge through multilingual documentary films and a detailed technical glossary."
            ),
            Platform(
                name = "Swiss Prodig",
                description = "A professional B2B industrial directory and networking platform that connects manufacturers and service providers across high-precision sectors, including horology, micro-mechanics, and aerospace."
            )
        )
    )
)

@Composable
fun PlatformsScreen(modifier: Modifier = Modifier) {
    LazyColumn(modifier = modifier.fillMaxSize()) {
        platformsByCountry.forEach { country ->
            item {
                Text(
                    text = country.country.uppercase(),
                    style = MaterialTheme.typography.labelMedium,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.primary,
                    modifier = Modifier
                        .padding(horizontal = 16.dp)
                        .padding(top = 24.dp, bottom = 4.dp)
                )
            }
            country.platforms.forEachIndexed { index, platform ->
                item {
                    Column(modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)) {
                        Text(
                            text = platform.name,
                            style = MaterialTheme.typography.bodyLarge,
                            fontWeight = FontWeight.SemiBold
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(
                            text = platform.description,
                            style = MaterialTheme.typography.bodyMedium,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                        Spacer(modifier = Modifier.height(8.dp))
                        if (index < country.platforms.lastIndex) {
                            HorizontalDivider()
                        }
                    }
                }
            }
        }
        item { Spacer(modifier = Modifier.height(16.dp)) }
    }
}