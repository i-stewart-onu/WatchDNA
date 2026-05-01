package com.example.watchdna

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun OnePercentPlanetScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(bottom = 24.dp)
    ) {

        BrandSectionHeader("1% for the Planet")
        Text(
            text = "1% for the Planet is a global movement that encourages businesses to contribute a portion of their revenue to environmental causes. It represents a commitment to sustainability and long-term ecological responsibility.",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        )

        BrandSectionHeader("Why It Matters")
        Text(
            text = "Environmental challenges such as climate change, pollution, and resource depletion continue to impact the planet. Despite their importance, environmental initiatives receive only a small percentage of global philanthropic funding.",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        )

        BrandSectionHeader("Our Commitment")
        Text(
            text = "WatchDNA proudly supports environmental initiatives by integrating giving into our business model. Through our commitment, we contribute to organizations working toward a more sustainable future.",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        )

        BrandSectionHeader("Focus Areas")
        Text(
            text = "Our efforts focus on climate awareness, environmental protection, and supporting long-term sustainability projects that create measurable impact.",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        )

        BrandSectionHeader("Call to Action")
        Text(
            text = "Join us in supporting a cleaner, healthier planet. Together, we can drive meaningful change and build a future rooted in responsibility and impact.",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        )
    }
}