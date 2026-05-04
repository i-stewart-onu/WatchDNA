package com.example.watchdna

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun BensonScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(bottom = 24.dp)
    ) {
        BrandSectionHeader("Overview")
        Text(
            text = "Benson Watchwinders is a Dutch manufacturer founded in 2012 in Groesbeek, The Netherlands, specializing in watch winders and storage solutions for automatic timepieces. The brand targets collectors, enthusiasts, and professionals seeking reliable, well-designed accessories at competitive pricing.",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        )

        BrandSectionHeader("Product Lines")
        Text(
            text = "• Swiss Series — Premium motors with Swiss engineering, introduced 2020\n• Black Series — Sleek aesthetic line launched in 2015\n• Smart-Tech II — Enhanced smart technology, introduced 2018\n• Compact Series — Space-efficient models for smaller collections, launched 2017",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        )

        BrandSectionHeader("Technology")
        Text(
            text = "Benson winders feature Japanese or Swiss motors, touchscreen and LCD controls, overwind protection, and anti-magnetic components. Their engineering balances modern technology with a refined aesthetic, ensuring proper oil circulation for automatic movements when watches are not being worn.",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        )

        BrandSectionHeader("Global Reach")
        Text(
            text = "By 2022, Benson had achieved distribution across 250+ retail points worldwide, including authorized jewelers and specialized watch retailers. The brand launched a redesigned official website in 2023 to expand its online presence.",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        )

        BrandSectionHeader("Headquarters")
        Text(
            text = "Groesbeek, The Netherlands",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        )
    }
}
