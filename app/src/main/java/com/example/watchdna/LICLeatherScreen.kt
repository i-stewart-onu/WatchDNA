package com.example.watchdna

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun LICLeatherScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(bottom = 24.dp)
    ) {
        BrandSectionHeader("Overview")
        Text(
            text = "LIC — Leather International Cuir — was established in 1971 by Yves Thomas in Oostende, Belgium. Thomas trained at the prestigious French Atelier Grégoire before launching his own workshop. Over 50 years later, the company remains family-owned with craftspeople from its earliest years still employed there.",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        )

        BrandSectionHeader("Philosophy")
        Text(
            text = "LIC is guided by three core principles: authenticity, excellence, and service. Their approach positions the watch strap not as an accessory, but as an essential component — describing their craft as \"the art of dressing watches.\"",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        )

        BrandSectionHeader("Craftsmanship")
        Text(
            text = "Each LIC strap undergoes more than one hundred manual operations from raw hide to completion. The workshop sources premium materials exclusively from France and Italy's finest tanneries, with options including:\n\n• Alligator and crocodile leather\n• Nubuck and suede\n• Saffiano leather\n• Exotic and specialty hides",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        )

        BrandSectionHeader("Recognition")
        Text(
            text = "Recognized as one of the world's longest-established independent strap makers, LIC has cultivated partnerships with renowned Swiss watch brands and prestigious boutiques worldwide. Their uninterrupted 50+ years of handcraft production stands as a testament to their commitment to quality.",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        )

        BrandSectionHeader("Headquarters")
        Text(
            text = "Oostende, Belgium",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        )
    }
}
