package com.example.watchdna

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun CompassScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(bottom = 24.dp)
    ) {
        BrandSectionHeader("Overview")
        Text(
            text = "Compass offers a focused range of watch cases and storage solutions designed to protect and organize timepiece collections. With four products featured in the WatchDNA accessories directory, Compass provides practical and well-crafted options for collectors seeking reliable everyday storage.",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        )

        BrandSectionHeader("Products")
        Text(
            text = "Compass specializes in watch cases built for both home storage and travel, combining protective design with clean aesthetics. Their lineup is curated for watch enthusiasts who value function and portability.",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        )

        BrandSectionHeader("Available Through WatchDNA")
        Text(
            text = "Compass products are listed in the WatchDNA accessories collection. WatchDNA operates as a discovery platform and does not sell products directly — visit an authorized retailer or the brand's official channels to purchase.",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        )
    }
}
