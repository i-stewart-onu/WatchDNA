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
fun B1G1Screen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(bottom = 24.dp)
    ) {

        BrandSectionHeader("B1G1: Business for Good")
        Text(
            text = "B1G1 (Business for Good) is a global initiative that enables businesses to integrate giving into their everyday operations. It transforms ordinary transactions into meaningful contributions toward global causes.",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        )

        BrandSectionHeader("Global Impact")
        Text(
            text = "Through thousands of participating businesses worldwide, B1G1 has created millions of positive impacts by supporting carefully vetted projects across the globe.",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        )

        BrandSectionHeader("How It Works")
        Text(
            text = "Every interaction—whether a purchase, engagement, or milestone—can contribute to a meaningful cause. This model ensures that giving is consistent, measurable, and directly tied to business activity.",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        )

        BrandSectionHeader("Sustainable Development Goals")
        Text(
            text = "B1G1 aligns its initiatives with the United Nations Sustainable Development Goals, addressing issues such as poverty, education, clean water, and environmental sustainability.",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        )

        BrandSectionHeader("Our Commitment")
        Text(
            text = "WatchDNA partners with B1G1 to ensure that our platform contributes to meaningful global impact. Every user interaction has the potential to create positive change.",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        )

        BrandSectionHeader("Call to Action")
        Text(
            text = "Be part of a global movement that turns everyday actions into lasting impact. Together, we can build a more sustainable and equitable world.",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        )
    }
}