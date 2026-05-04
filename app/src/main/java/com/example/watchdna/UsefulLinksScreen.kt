package com.example.watchdna

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun UsefulLinksScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(bottom = 24.dp)
    ) {

        BrandSectionHeader("Useful Links")

        Text(
            "Explore our curated collection of useful resources, including social media platforms, brand partners, and community links.",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(16.dp)
        )

        BrandSectionHeader("Social Media")
        Text(
            "Follow WatchDNA on Instagram, LinkedIn, and other platforms to stay updated with the latest content and releases.",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(16.dp)
        )

        BrandSectionHeader("Community Resources")
        Text(
            "Discover forums, blogs, and communities where watch enthusiasts share knowledge and experiences.",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(16.dp)
        )
    }
}