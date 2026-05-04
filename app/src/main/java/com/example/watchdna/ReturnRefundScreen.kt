package com.example.watchdna

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ReturnRefundScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(bottom = 24.dp)
    ) {

        BrandSectionHeader("Return & Refund Policy")

        Text(
            "WatchDNA does not directly process sales. All purchases are completed through authorized retailers or brand partners.",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(16.dp)
        )

        BrandSectionHeader("Returns")
        Text(
            "Return policies vary depending on the retailer or brand. Please refer to the seller’s individual policy for details.",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(16.dp)
        )

        BrandSectionHeader("Refunds")
        Text(
            "Refund requests must be handled directly through the retailer from whom the purchase was made.",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(16.dp)
        )
    }
}