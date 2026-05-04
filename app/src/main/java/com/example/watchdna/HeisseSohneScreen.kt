package com.example.watchdna

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun HeisseSohneScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(bottom = 24.dp)
    ) {
        BrandSectionHeader("Overview")
        Text(
            text = "Heisse & Söhne is a German brand specializing in high-quality watch winders, watch boxes, safes, and related accessories for automatic watch enthusiasts. The family business was originally established in 1976 and integrated into Designhütte GmbH's portfolio in 2010 as its premium segment.",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        )

        BrandSectionHeader("Products")
        Text(
            text = "• Solid wood watch winders with quiet, efficient motors\n• LCD-programmable winders with adjustable watch holders\n• LED-lit display cases and watch boxes\n• Premium leather and wood storage solutions\n• Multi-watch safe-integrated winding systems",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        )

        BrandSectionHeader("Design Philosophy")
        Text(
            text = "Heisse & Söhne merges classic materials — solid wood and premium leather — with modern technology. The brand emphasizes sustainability, durability, and German-engineered precision, creating products designed to protect and display automatic timepieces with both visual appeal and reliable performance.",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        )

        BrandSectionHeader("Innovations")
        Text(
            text = "• 2020 — V21 winder system introduced\n• 2024 — V25 technology launched, enhancing winding efficiency and electronic control precision",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        )

        BrandSectionHeader("Headquarters")
        Text(
            text = "Germany",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        )
    }
}
