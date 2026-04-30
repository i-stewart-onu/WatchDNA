package com.example.watchdna

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

data class WatchTerm(
    val name: String,
    val description: String
)

data class WatchSection(
    val title: String,
    val terms: List<WatchTerm>
)

val watchmaking101Sections = listOf(
    WatchSection(
        title = "External Components",
        terms = listOf(
            WatchTerm("Case", "The main body protecting internal parts; usually made of steel, titanium, or ceramic."),
            WatchTerm("Bezel", "The ring surrounding the crystal; used for timing or measuring speed."),
            WatchTerm("Crystal", "Transparent cover (usually sapphire) protecting the dial."),
            WatchTerm("Crown", "The knob on the side used to set time/date; often \"screw-down\" for water resistance."),
            WatchTerm("Dial", "The face where time is displayed; often features luminescent markers."),
            WatchTerm("Hands", "Pointers for hours, minutes, and seconds."),
            WatchTerm("Bracelet / Strap", "The band (metal, leather, rubber, or fabric) holding the watch to the wrist.")
        )
    ),
    WatchSection(
        title = "Internal Mechanics (The Movement)",
        terms = listOf(
            WatchTerm("Mainspring", "The energy source; a metal spring that tightens when wound."),
            WatchTerm("Train of Wheels", "Series of gears (wheels and pinions) that transmit energy to the hands."),
            WatchTerm("Escapement & Balance Wheel", "The regulating organ that keeps time, functioning like a clock's pendulum."),
            WatchTerm("Jewel Bearings", "Synthetic stones used to reduce friction on moving parts.")
        )
    ),
    WatchSection(
        title = "Maintenance & Care",
        terms = listOf(
            WatchTerm("Water Resistance", "Should be checked every two years to ensure seals remain intact."),
            WatchTerm("Servicing", "Mechanical watches generally require professional service every 3 to 5 years.")
        )
    )
)

val repairCenters = listOf(
    "Trillium Watch Services (North York, Canada)",
    "Right Time (Toronto, Canada)"
)

@Composable
fun Watchmaking101Screen(modifier: Modifier = Modifier) {
    LazyColumn(modifier = modifier.fillMaxSize()) {
        watchmaking101Sections.forEach { section ->
            item {
                Text(
                    text = section.title.uppercase(),
                    style = MaterialTheme.typography.labelMedium,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.primary,
                    modifier = Modifier
                        .padding(horizontal = 16.dp)
                        .padding(top = 24.dp, bottom = 4.dp)
                )
            }
            section.terms.forEachIndexed { index, term ->
                item {
                    Column(modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)) {
                        Text(term.name, style = MaterialTheme.typography.bodyLarge, fontWeight = FontWeight.SemiBold)
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(term.description, style = MaterialTheme.typography.bodyMedium, color = MaterialTheme.colorScheme.onSurfaceVariant)
                        Spacer(modifier = Modifier.height(8.dp))
                        if (index < section.terms.lastIndex) {
                            HorizontalDivider()
                        }
                    }
                }
            }
        }

        item {
            Text(
                text = "Repair Centers".uppercase(),
                style = MaterialTheme.typography.labelMedium,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.primary,
                modifier = Modifier
                    .padding(horizontal = 16.dp)
                    .padding(top = 24.dp, bottom = 4.dp)
            )
        }
        repairCenters.forEachIndexed { index, center ->
            item {
                Column(modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)) {
                    Text(center, style = MaterialTheme.typography.bodyLarge)
                    Spacer(modifier = Modifier.height(8.dp))
                    if (index < repairCenters.lastIndex) {
                        HorizontalDivider()
                    }
                }
            }
        }

        item { Spacer(modifier = Modifier.height(16.dp)) }
    }
}