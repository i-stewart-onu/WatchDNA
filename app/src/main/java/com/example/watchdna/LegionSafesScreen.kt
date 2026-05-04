package com.example.watchdna

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun LegionSafesScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(bottom = 24.dp)
    ) {
        BrandSectionHeader("Overview")
        Text(
            text = "Legion Safes provides premium high-security storage solutions engineered for serious watch collectors and valuables protection. Their safes combine robust construction with sophisticated locking mechanisms, offering peace of mind for significant collections.",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        )

        BrandSectionHeader("Product Lines")
        Text(
            text = "Vanguard Series\nLegion's flagship line designed for maximum security with a refined exterior finish.\n\n• Model 3016 — CAD \$7,899\n• Model 1814 — CAD \$6,499\n\nTL-30 Series\nTL-30 rated safes offering certified burglary resistance for high-value collections.\n\n• Model 211513 — CAD \$4,790",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        )

        BrandSectionHeader("Security Standards")
        Text(
            text = "The TL-30 rating is an industry-recognized standard certifying that a safe can resist a sustained tool attack for a minimum of 30 minutes. Legion Safes are built to meet and exceed these certifications, making them a trusted choice for protecting watches, jewelry, and documents.",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        )

        BrandSectionHeader("Ideal For")
        Text(
            text = "• Serious watch collectors with high-value timepieces\n• Jewelry and document storage\n• Home or office security applications",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        )
    }
}
