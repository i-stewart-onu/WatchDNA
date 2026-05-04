package com.example.watchdna

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Wolf1834Screen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(bottom = 24.dp)
    ) {
        BrandSectionHeader("Overview")
        Text(
            text = "WOLF 1834 is one of the oldest luxury watch and jewelry storage brands in the world, founded in 1834 by Philipp Wolf I, a German silversmith in Hanau. Now in its fifth generation of family leadership, WOLF is headquartered in West Sussex, United Kingdom.",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        )

        BrandSectionHeader("History")
        Text(
            text = "• 1834 — Founded by Philipp Wolf I in Hanau, Germany after noticing his silver pieces sold better when presented in elegant boxes\n• 1895 — Relocated to Malmö, Sweden under Philipp Wolf II\n• 1962 — Philip Wolf IV moved operations to England\n• 1988 — Simon Philip Wolf V expanded into US and Canadian markets\n• 2001 — Opened Asia-Pacific operations in Hong Kong\n• 2009 — Patented proprietary watch-winder technology with precise rotation counting\n• 2018 — Established Rock offices and distribution center in West Sussex, UK",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        )

        BrandSectionHeader("Products")
        Text(
            text = "• Patented watch winders with turn-counting technology\n• Luxury jewelry boxes and display cases\n• Safes and high-security storage\n• Travel rolls and portable accessories\n• Premium leather goods",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        )

        BrandSectionHeader("Innovation")
        Text(
            text = "WOLF holds a patent on watch-winder technology that accurately counts turns per day, ensuring automatic movements receive precise winding cycles without overwinding. Products are crafted with premium materials and refined finishes, designed to last for decades.",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        )

        BrandSectionHeader("Headquarters")
        Text(
            text = "West Sussex, United Kingdom",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        )
    }
}
