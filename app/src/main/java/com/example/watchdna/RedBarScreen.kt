package com.example.watchdna

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

private data class RedBarRegion(val name: String, val chapters: List<String>)

private val redBarRegions = listOf(
    RedBarRegion(
        "Americas",
        listOf(
            "New York City", "Los Angeles", "Chicago", "San Francisco",
            "Miami", "Houston", "Seattle", "Boston",
            "Toronto", "Vancouver", "Montreal",
            "Mexico City", "São Paulo"
        )
    ),
    RedBarRegion(
        "Europe",
        listOf(
            "London", "Paris", "Geneva", "Zürich",
            "Amsterdam", "Berlin", "Munich", "Milan",
            "Madrid", "Barcelona", "Vienna", "Copenhagen"
        )
    ),
    RedBarRegion(
        "Asia-Pacific",
        listOf(
            "Tokyo", "Hong Kong", "Singapore", "Sydney",
            "Melbourne", "Seoul", "Taipei", "Shanghai", "Bangkok"
        )
    ),
    RedBarRegion(
        "Middle East & Africa",
        listOf("Dubai", "Abu Dhabi", "Tel Aviv", "Johannesburg")
    )
)

@Composable
fun RedBarScreen(modifier: Modifier = Modifier) {
    LazyColumn(modifier = modifier.fillMaxSize()) {

        item {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color(0xFFBB0000))
                    .padding(horizontal = 20.dp, vertical = 32.dp)
            ) {
                Column {
                    Text(
                        text = "REDBAR",
                        color = Color.White,
                        style = MaterialTheme.typography.headlineLarge,
                        fontWeight = FontWeight.Black,
                        letterSpacing = 3.sp
                    )
                    Spacer(Modifier.height(6.dp))
                    Text(
                        text = "Drinks. Watches. Hangs.",
                        color = Color.White.copy(alpha = 0.80f),
                        style = MaterialTheme.typography.bodyLarge,
                        fontStyle = FontStyle.Italic
                    )
                }
            }
        }

        item {
            BrandSectionHeader("About RedBar")
            Text(
                text = "RedBar is one of the world's most recognized grassroots watch communities — a global network of enthusiasts united by a shared passion for horology, no pretension required. What began as informal gatherings in New York City has grown into a worldwide movement with chapters on every major continent.",
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
            )
        }

        item {
            BrandSectionHeader("Origin Story")
            Text(
                text = "RedBar was founded by Adam Craniotes in 2006. The concept was straightforward: bring watch lovers together in a relaxed, unpretentious setting — a bar — and let the conversation flow naturally around the things they love. No velvet ropes, no dress codes, no gatekeeping. Just people who love watches.",
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
            )
            Text(
                text = "What started as a handful of collectors meeting monthly in Manhattan became a template replicated by passionate organizers in cities across the world. Each chapter maintains its own local personality while sharing the same inclusive spirit.",
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
            )
        }

        item {
            BrandSectionHeader("The RedBar Philosophy")
            Text(
                text = "RedBar stands for accessibility and inclusion in a hobby that can sometimes feel intimidating or exclusive. Members wear anything from a vintage Patek Philippe to a Casio F-91W — what matters is the conversation, the curiosity, and the community.",
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
            )
            Text(
                text = "The community has also served as a launching pad for many voices in watch media and the broader industry. Journalists, collectors, brand ambassadors, and independent watchmakers have all found their footing through RedBar gatherings.",
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
            )
        }

        item {
            BrandSectionHeader("RedBar Events")
            Text(
                text = "RedBar events are deliberately informal. Chapters organize their own meetups — typically monthly or bi-monthly — at local bars, lounges, or watch retailers. There are no tickets, no keynote speakers, and no agenda. You show up, meet people, admire watches, and talk about time.",
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
            )
            Text(
                text = "Events also coincide with major industry moments — Watches & Wonders Geneva, WatchTime New York, and other milestone occasions — bringing the global community together around shared experiences.",
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
            )
        }

        item {
            BrandSectionHeader("Leadership")
        }

        item {
            RedBarLeaderCard(
                name = "Adam Craniotes",
                title = "Founder",
                description = "Adam founded RedBar in 2006 in New York City, building one of the most beloved grassroots watch communities in the world. His vision of an inclusive, barrier-free gathering for collectors of every level defined RedBar's DNA from the very beginning."
            )
        }

        item {
            RedBarLeaderCard(
                name = "Kathleen McGivney",
                title = "Chief Executive Officer",
                description = "Kathleen leads RedBar's global operations and strategic direction, championing diverse voices within the watch community. Under her leadership, RedBar has expanded its chapter network and deepened its commitment to making horology welcoming to everyone."
            )
        }

        item {
            BrandSectionHeader("Global Chapters")
            Text(
                text = "RedBar chapters exist across the globe, each with their own local character. The common thread: a love of watches and an open door for anyone who shares it.",
                style = MaterialTheme.typography.bodyMedium,
                color = MaterialTheme.colorScheme.onSurfaceVariant,
                modifier = Modifier.padding(horizontal = 16.dp, vertical = 4.dp)
            )
        }

        items(redBarRegions) { region ->
            RedBarRegionBlock(region)
        }

        item {
            BrandSectionHeader("RedBar & WatchDNA")
            Text(
                text = "WatchDNA proudly supports the RedBar community and its mission to make horology more welcoming and accessible. Our platform aligns with RedBar's core belief: the best part of watches isn't the watches — it's the people who love them.",
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
            )
            Spacer(Modifier.height(24.dp))
        }
    }
}

@Composable
private fun RedBarLeaderCard(name: String, title: String, description: String) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 6.dp),
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.5f)
        )
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Row(verticalAlignment = androidx.compose.ui.Alignment.CenterVertically) {
                Surface(
                    shape = RoundedCornerShape(4.dp),
                    color = Color(0xFFBB0000)
                ) {
                    Text(
                        text = title.uppercase(),
                        color = Color.White,
                        style = MaterialTheme.typography.labelSmall,
                        fontWeight = FontWeight.Bold,
                        letterSpacing = 0.8.sp,
                        modifier = Modifier.padding(horizontal = 8.dp, vertical = 3.dp)
                    )
                }
                Spacer(Modifier.width(10.dp))
                Text(
                    text = name,
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.SemiBold
                )
            }
            Spacer(Modifier.height(8.dp))
            Text(
                text = description,
                style = MaterialTheme.typography.bodyMedium,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
        }
    }
}

@Composable
private fun RedBarRegionBlock(region: RedBarRegion) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
            .padding(top = 12.dp, bottom = 4.dp)
    ) {
        Text(
            text = region.name.uppercase(),
            style = MaterialTheme.typography.labelSmall,
            color = Color(0xFFBB0000),
            fontWeight = FontWeight.Bold,
            letterSpacing = 1.sp
        )
        Spacer(Modifier.height(6.dp))
        Text(
            text = region.chapters.joinToString("  ·  "),
            style = MaterialTheme.typography.bodyMedium,
            color = MaterialTheme.colorScheme.onSurfaceVariant,
            lineHeight = 22.sp
        )
        Spacer(Modifier.height(4.dp))
        HorizontalDivider(color = MaterialTheme.colorScheme.outlineVariant.copy(alpha = 0.4f))
    }
}
