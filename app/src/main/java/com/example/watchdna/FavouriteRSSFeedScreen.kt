package com.example.watchdna

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

data class RssFeed(
    val name: String,
    val url: String
)

val watchDnaRssFeeds = listOf(
    RssFeed("A Timely Perspective", "Atimelyperspective.com"),
    RssFeed("Calibre321", "Calibre321.com"),
    RssFeed("Calibre magazine", "Calibremagazine.com"),
    RssFeed("Collection Magazine", "Collection-magazine.com"),
    RssFeed("Federation of the Swiss Watch Industry", "FHS.swiss"),
    RssFeed("First Class Watches", "Firstclasswatches.co.uk"),
    RssFeed("Fratello Watches", "Fratellowatches.com"),
    RssFeed("G central", "G-central.com"),
    RssFeed("Gear Patrol", "Gearpatrol.com"),
    RssFeed("HODINKEE", "Hodinkee.com"),
    RssFeed("Monochrome", "Monochrome-watches.com"),
    RssFeed("Montre Watch Portal", "Montre24.com"),
    RssFeed("Passion Horlogère", "Passion-Horlogere.com"),
    RssFeed("Quill & Pad", "Quillandpad.com"),
    RssFeed("Sharp Magazine", "Sharpmagazine.com"),
    RssFeed("Swiss Watches Magazine", "Swisswatches-magazine.com"),
    RssFeed("Time + Tide", "Timeandtidewatches.com"),
    RssFeed("Watch Collecting Lifestyle", "Watchcollectinglifestyle.com"),
    RssFeed("Worn & Wound", "Wornandwound.com"),
    RssFeed("Wrist Enthusiast", "Wristenthusiast.com")
)

@Composable
fun FavouriteRSSFeedScreen(modifier: Modifier = Modifier) {
    LazyColumn(modifier = modifier.fillMaxSize()) {
        items(watchDnaRssFeeds) { feed ->
            Column {
                ListItem(
                    headlineContent = {
                        Text(
                            text = feed.name,
                            style = MaterialTheme.typography.titleMedium,
                            fontWeight = FontWeight.SemiBold,
                            color = MaterialTheme.colorScheme.primary
                        )
                    },
                    supportingContent = {
                        Text(
                            text = feed.url,
                            style = MaterialTheme.typography.bodyMedium,
                            color = MaterialTheme.colorScheme.secondary
                        )
                    }
                )
                HorizontalDivider(modifier = Modifier.padding(horizontal = 16.dp))
            }
        }
        item { Spacer(modifier = Modifier.height(16.dp)) }
    }
}