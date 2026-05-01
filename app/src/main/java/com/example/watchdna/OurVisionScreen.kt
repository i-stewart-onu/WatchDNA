package com.example.watchdna

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun OurVisionScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(bottom = 24.dp)
    ) {

        BrandSectionHeader("Our Vision")
        Text(
            text = "At WatchDNA, our vision is to build a global community of watch enthusiasts by creating a trusted and comprehensive platform for discovering timepieces, brands, and industry insights.",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        )

        BrandSectionHeader("Our Mission")
        Text(
            text = "We aim to help users explore the world of watches with confidence by connecting them to brands, authorized dealers, and valuable educational resources. Our goal is to simplify the discovery process while empowering informed purchasing decisions.",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        )

        BrandSectionHeader("Platform Experience")
        Text(
            text = "Users can browse watch brands, explore collections, and connect with authorized retailers. WatchDNA bridges the gap between digital discovery and physical retail by enabling seamless transitions between online exploration and in-store experiences.",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        )

        BrandSectionHeader("Our Values")
        Text(
            text = "We believe in education, transparency, and accessibility. By supporting both local jewelers and global brands, we aim to create a balanced ecosystem that benefits consumers and the industry alike.",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        )

        BrandSectionHeader("Community Impact")
        Text(
            text = "WatchDNA is committed to making a positive difference by partnering with organizations that support environmental and social initiatives. We believe that business can be a force for good.",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        )

        BrandSectionHeader("Philosophy")
        Text(
            text = "Our philosophy is rooted in the idea that passion and purpose should align. We encourage our community to explore, learn, and contribute to meaningful change.",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        )

        BrandSectionHeader("Call to Action")
        Text(
            text = "Discover your ideal timepiece, connect with the watch community, and be part of a movement that values purpose, impact, and giving. The time is now.",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        )
    }
}