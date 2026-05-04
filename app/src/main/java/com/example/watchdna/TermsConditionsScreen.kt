package com.example.watchdna

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun TermsConditionsScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(bottom = 24.dp)
    ) {

        BrandSectionHeader("Terms & Conditions")

        Text(
            "By using WatchDNA, you agree to comply with our terms and conditions, which govern the use of our platform and services.",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(16.dp)
        )

        BrandSectionHeader("Use of Platform")
        Text(
            "Users are expected to use WatchDNA responsibly and in accordance with all applicable laws and regulations.",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(16.dp)
        )

        BrandSectionHeader("Intellectual Property")
        Text(
            "All content, branding, and materials on WatchDNA are protected and may not be used without permission.",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(16.dp)
        )
    }
}