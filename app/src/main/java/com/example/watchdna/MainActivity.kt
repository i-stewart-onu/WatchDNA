package com.example.watchdna

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.*
import androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.PreviewScreenSizes
import androidx.compose.ui.unit.dp
import com.example.watchdna.ui.theme.WatchDNATheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            WatchDNATheme {
                WatchDNAApp()
            }
        }
    }
}

@PreviewScreenSizes
@Composable
fun WatchDNAApp() {
    var currentDestination by rememberSaveable { mutableStateOf(AppDestinations.EDUCATE) }

    NavigationSuiteScaffold(
        navigationSuiteItems = {
            AppDestinations.entries.forEach {
                item(
                    icon = {
                        Icon(it.icon, contentDescription = it.label)
                    },
                    label = { Text(it.label) },
                    selected = it == currentDestination,
                    onClick = { currentDestination = it }
                )
            }
        }
    ) {
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
            ScreenContent(
                destination = currentDestination,
                modifier = Modifier.padding(innerPadding)
            )
        }
    }
}

enum class AppDestinations(
    val label: String,
    val icon: ImageVector,
) {
    EDUCATE("Educate", Icons.Default.Home),
    ENTERTAIN("Entertain", Icons.Default.Favorite),
    CONNECT("Explore", Icons.Default.AccountBox),
    COMMUNITY("Community", Icons.Default.AccountBox),
    DNA("Our DNA", Icons.Default.AccountBox),
}

@Composable
fun ScreenContent(destination: AppDestinations, modifier: Modifier = Modifier) {
    when (destination) {
        AppDestinations.EDUCATE -> EducateScreen(modifier)
        AppDestinations.ENTERTAIN -> EntertainScreen(modifier)
        AppDestinations.CONNECT -> ConnectScreen(modifier)
        AppDestinations.COMMUNITY -> CommunityScreen(modifier)
        AppDestinations.DNA -> DNAScreen(modifier)
    }
}

@Composable
fun Section(title: String, items: List<String>) {
    Column(modifier = Modifier.padding(bottom = 16.dp)) {
        Text(title, style = MaterialTheme.typography.titleLarge)
        Spacer(modifier = Modifier.height(8.dp))
        items.forEach {
            Text("• $it", style = MaterialTheme.typography.bodyLarge)
        }
    }
}

/* ---------------- SCREENS ---------------- */

@Composable
fun EducateScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .padding(16.dp)
            .verticalScroll(rememberScrollState())
    ) {
        Section("Directories", listOf(
            "Watch Brands", "Groups", "Accessories", "Tradeshows", "Committee", "Platforms"
        ))

        Section("Awards", listOf(
            "Alexander Awards",
            "Timepiece World Awards",
            "Temporis International Awards",
            "Grand Prix D’Horlogerie de Genève",
            "Hong Kong Watch & Clock Design Competition"
        ))

        Section("Education", listOf(
            "Watchmaking 101", "World of Watches"
        ))
    }
}

@Composable
fun EntertainScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .padding(16.dp)
            .verticalScroll(rememberScrollState())
    ) {
        Section("Articles", listOf(
            "Our Stories", "Press Releases", "Meet Our Contributors"
        ))

        Section("Media", listOf(
            "Directory", "Favourite RSS Feed", "Community Reads"
        ))
    }
}

@Composable
fun ConnectScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .padding(16.dp)
            .verticalScroll(rememberScrollState())
    ) {
        Section("Buyer’s Guide", listOf(
            "Timepieces", "Accessories"
        ))

        Section("Authorized Dealers", listOf(
            "AD Directory", "Store Locator"
        ))
    }
}

@Composable
fun CommunityScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .padding(16.dp)
            .verticalScroll(rememberScrollState())
    ) {
        Section("Community", listOf(
            "Articles",
            "Aficionados",
            "Your Daily Routine",
            "RedBar",
            "World Watch Day"
        ))
    }
}

@Composable
fun DNAScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .padding(16.dp)
            .verticalScroll(rememberScrollState())
    ) {
        // Original DNA content
        Section("Our DNA", listOf(
            "Our Vision",
            "1% for the Planet",
            "B1G1 | Business for Good"
        ))

        // Nested Support & Legal
        Section("Support & Legal", listOf(
            "FAQ's",
            "Useful Links",
            "Newsletter",
            "Contact Us",
            "Local Community",
            "Terms & Conditions",
            "Return & Refund"
        ))
    }
}