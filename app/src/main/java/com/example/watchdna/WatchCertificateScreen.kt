package com.example.watchdna

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun WatchCertificateScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(bottom = 24.dp)
    ) {
        BrandSectionHeader("Overview")
        Text(
            text = "Watch Certificate is described as \"the passport for watches\" — a documentation and authentication service that establishes verified provenance and ownership records for timepieces. It provides collectors and buyers with a trusted, standardized record tied to a specific watch.",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        )

        BrandSectionHeader("What It Does")
        Text(
            text = "A Watch Certificate creates a permanent, verifiable record for your timepiece, including key identification details, ownership history, and provenance information. This documentation adds transparency and confidence to buying, selling, and insuring watches.",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        )

        BrandSectionHeader("Why It Matters")
        Text(
            text = "As the secondary watch market grows, provenance documentation has become increasingly valuable. A certified record helps authenticate a watch's history, supports insurance claims, and gives buyers confidence when purchasing pre-owned timepieces.",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        )

        BrandSectionHeader("Pricing")
        Text(
            text = "Watch Certificate services start from CAD \$199. Available through the WatchDNA accessories collection.",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        )
    }
}
