package com.example.watchdna

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun NewsletterScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(bottom = 24.dp)
    ) {

        BrandSectionHeader("Newsletter")

        Text(
            "Subscribe to the WatchDNA newsletter to stay informed about the latest watch releases, industry news, and exclusive updates.",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(16.dp)
        )

        Text(
            "Our newsletter is designed to keep enthusiasts, collectors, and newcomers engaged with curated insights and opportunities.",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(16.dp)
        )

        BrandSectionHeader("Stay Connected")
        Text(
            "Be the first to know about new brands, features, and community initiatives.",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(16.dp)
        )
    }
}