package com.example.watchdna

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun JUStrapsScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(bottom = 24.dp)
    ) {
        BrandSectionHeader("Overview")
        Text(
            text = "JU Straps is an independent watch strap manufacturer founded in 2012 in Guangdong Province, China. The brand specializes in premium aftermarket watch bands and accessories designed for watch enthusiasts and collectors worldwide, filling a gap in the market for luxury-grade replacement straps.",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        )

        BrandSectionHeader("Materials")
        Text(
            text = "• Crocodile and alligator leather\n• Premium calf and exotic leathers\n• Nylon and woven fabrics\n• High-performance FKM rubber\n• Custom and bespoke designs",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        )

        BrandSectionHeader("Compatibility")
        Text(
            text = "JU Straps are crafted to fit renowned luxury timepiece brands including Rolex, Omega, IWC, and Panerai, among many others. Their broad lug-width range ensures compatibility with most modern and vintage watch cases.",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        )

        BrandSectionHeader("Innovation")
        Text(
            text = "• 2018–2021 — Developed proprietary crocodile leather processing that exceeds European standards for waterproofing and durability, backed by over 30,000 hours of R&D\n• 2025 — Launched textured FKM rubber straps engineered for elevated comfort and tactile appeal",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        )

        BrandSectionHeader("Recognition")
        Text(
            text = "By 2024, JU Straps achieved top rankings on major Chinese e-commerce platforms and established itself as a leading premium strap brand domestically. The brand combines traditional leatherworking skills with modern innovation, prioritizing craftsmanship, material quality, and functionality.",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        )

        BrandSectionHeader("Headquarters")
        Text(
            text = "Guangdong Province, China",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        )
    }
}
