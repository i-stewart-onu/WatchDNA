package com.example.watchdna

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun FAQScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(bottom = 24.dp)
    ) {

        BrandSectionHeader("Frequently Asked Questions")

        BrandSectionHeader("What is WatchDNA?")
        Text(
            "WatchDNA is a platform designed to help users discover watch brands, explore collections, and connect with authorized dealers and the global watch community.",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(16.dp)
        )

        BrandSectionHeader("How do I purchase a watch?")
        Text(
            "You can browse watches on WatchDNA and complete your purchase through authorized retailers or directly through brand partners.",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(16.dp)
        )

        BrandSectionHeader("Do you sell watches directly?")
        Text(
            "WatchDNA acts as a discovery platform and does not directly sell watches. Instead, we connect you with trusted retailers.",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(16.dp)
        )

        BrandSectionHeader("How can I contact support?")
        Text(
            "You can reach out through our Contact Us page for any assistance or inquiries.",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(16.dp)
        )
    }
}