package com.example.watchdna

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

data class MediaCategory(
    val title: String,
    val mediaList: List<String>
)

val watchDnaMediaDirectory = listOf(
    MediaCategory("Dedicated Watch Media", listOf(
        "A Timely Perspective", "A blog to watch", "Escapement Magazine",
        "Fratello Watches", "Hodinkee", "Monochrome", "Neue Uhren\uD83C\uDDE9\uD83C\uDDEA",
        "Orafix\uD83C\uDDEE\uD83C\uDDF9", "Passion horlogère\uD83C\uDDEB\uD83C\uDDF7", "Quill & Pad", "Revolution",
        "Swiss Watches Magazine", "The Calibrated Wrist", "Time + Tide",
        "Time Square Magazine\uD83C\uDDF9\uD83C\uDDFC", "Watch Collecting Lifestyle", "Watch Journal",
        "Watchonista", "Watch Pro", "Watch Time", "Watch Your Time",
        "Worn & Wound", "Wrist Enthusiast"
    )),
    MediaCategory("Lifestyle & Fashion Media", listOf(
        "BDC Magazine", "Collection Magazine", "Elle", "Elle Canada",
        "Elle Quebec\uD83C\uDDEB\uD83C\uDDF7", "Fairmont Magazine", "Fashion Magazine", "Gear Patrol",
        "Globe & Mail Style magazine", "Glory Sports", "GQ", "Haute Living",
        "Hollywood Reporter", "Nuvo Magazine", "Robb Report", "Sharp Magazine",
        "The Kit"
    )),
    MediaCategory("Financial & Business Media", listOf(
        "Forbes"
    )),
    MediaCategory("Trade & Industry Media (B2B)", listOf(
        "Canadian Jeweller", "Haute Horlogerie", "Jewellery Business",
        "Federation of the Swiss Watch Industry"
    )),
    MediaCategory("Digital Creators & YouTube Media", listOf(
        "Cagdas Onen", "Flybackpodcast\uD83C\uDDEB\uD83C\uDDF7", "LeCalibre\uD83C\uDDEB\uD83C\uDDF7", "Smartwatch Dick",
        "Teddy Baldassarre", "The Time Bum", "Time 2 calibrate",
        "Scottish watches", "Watch David", "Watch You Talking About"
    )),
    MediaCategory("Newspapers", listOf(
        "The Globe & Mail"
    )),
    MediaCategory("Brand Magazines", listOf(
        "Patek Philippe Magazine"
    ))
)

@Composable
fun MediaDirectoryScreen(modifier: Modifier = Modifier) {
    LazyColumn(modifier = modifier.fillMaxSize()) {
        watchDnaMediaDirectory.forEach { category ->
            item {
                Text(
                    text = category.title.uppercase(),
                    style = MaterialTheme.typography.labelMedium,
                    color = MaterialTheme.colorScheme.primary,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(horizontal = 16.dp)
                        .padding(top = 24.dp, bottom = 4.dp)
                )
            }
            items(category.mediaList) { mediaItem ->
                Column {
                    ListItem(
                        headlineContent = { Text(mediaItem, style = MaterialTheme.typography.bodyLarge) }
                    )
                    HorizontalDivider(modifier = Modifier.padding(horizontal = 16.dp))
                }
            }
        }
        item { Spacer(modifier = Modifier.height(16.dp)) }
    }
}