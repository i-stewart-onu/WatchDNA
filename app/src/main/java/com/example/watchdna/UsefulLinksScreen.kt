package com.example.watchdna

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.unit.dp

@Composable
fun UsefulLinksScreen(modifier: Modifier = Modifier) {

    val uriHandler = LocalUriHandler.current

    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(bottom = 24.dp)
    ) {

        BrandSectionHeader("Useful Links")

        Text(
            "Explore WatchDNA resources, directories, and tools.",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(16.dp)
        )

        // --- DISCOVER ---
        BrandSectionHeader("Discover WatchDNA")

        LinkButton("Visit Website") {
            uriHandler.openUri("https://watchdna.com/?utm_source=campsite.bio&utm_medium=social&utm_campaign=DISCOVER+WatchDNA.com")
        }

        LinkButton("Read Articles") {
            uriHandler.openUri("http://watchdna.com/pages/stories?utm_source=campsite.bio&utm_medium=social&utm_campaign=READ+OUR+ARTICLES")
        }

        LinkButton("Community Reads") {
            uriHandler.openUri("https://watchdna.com/pages/community-reads?utm_medium=social&utm_source=campsite.bio&utm_campaign=COMMUNITY+READ")
        }

        // --- DIRECTORIES ---
        BrandSectionHeader("Directories")

        LinkButton("Brands Directory") {
            uriHandler.openUri("https://watchdna.com/pages/brands-dna?utm_source=campsite.bio&utm_medium=social&utm_campaign=BRANDS+DIRECTORY")
        }

        LinkButton("Groups Directory") {
            uriHandler.openUri("https://watchdna.com/pages/groups?utm_medium=social&utm_source=campsite.bio&utm_campaign=GROUPS+DIRECTORY")
        }

        LinkButton("Authorized Dealers") {
            uriHandler.openUri("https://watchdna.com/tools/storelocator?utm_source=campsite.bio&utm_medium=social&utm_campaign=AUTHORIZED+DEALERS+DIRECTORY")
        }

        // --- TOOLS / SHOPPING ---
        BrandSectionHeader("Tools & Guides")

        LinkButton("Buyer’s Guide") {
            uriHandler.openUri("https://watchdna.com/collections/watches?utm_medium=social&utm_source=campsite.bio&utm_campaign=BUYER%E2%80%99S+GUIDE")
        }

        LinkButton("Trusted Platforms") {
            uriHandler.openUri("http://watchdna.com/pages/favourite-rssfeeds?utm_medium=social&utm_source=campsite.bio&utm_campaign=DISCOVER+OTHER+TRUSTED+PLATFORMS")
        }
    }
}

// Reusable button
@Composable
fun LinkButton(text: String, onClick: () -> Unit) {
    Button(
        onClick = onClick,
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 6.dp)
    ) {
        Text(text)
    }
}