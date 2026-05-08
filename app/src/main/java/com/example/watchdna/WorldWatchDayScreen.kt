package com.example.watchdna

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

private data class WWDFounder(val name: String, val description: String)
private data class WWDActivity(val title: String, val detail: String)

private val wwdFoundingOrgs = listOf(
    WWDFounder(
        "Fondation de la Haute Horlogerie (FHH)",
        "The global authority on fine watchmaking culture and education, promoting the values of haute horlogerie worldwide."
    ),
    WWDFounder(
        "Grand Prix d'Horlogerie de Genève (GPHG)",
        "The preeminent annual awards celebrating excellence in watchmaking — the 'Oscars of the watch world.'"
    ),
    WWDFounder(
        "Watch Library Foundation",
        "Dedicated to archiving and preserving horological knowledge and heritage for future generations."
    ),
    WWDFounder(
        "Horopedia",
        "The open-access encyclopedia of horology, making watch knowledge freely available to enthusiasts everywhere."
    )
)

private val wwdActivities = listOf(
    WWDActivity(
        "Wear Your Watch",
        "Put on your favourite timepiece — new or vintage, luxury or everyday — and share it with the world. Every watch has a story."
    ),
    WWDActivity(
        "Share the Moment",
        "Post a photo of your watch at 10:10 on October 10th. Use #WorldWatchDay to connect with collectors, enthusiasts, and brands across the globe."
    ),
    WWDActivity(
        "Visit a Local Watch Event",
        "Retailers, brands, and communities host special events on 10/10. Find a gathering near you and discover the watch community in your city."
    ),
    WWDActivity(
        "Introduce Someone to Horology",
        "Give a friend or family member their first look at the world of watches. World Watch Day is an open invitation — bring someone new into the community."
    ),
    WWDActivity(
        "Explore the Archives",
        "Dive into watch history, movements, and heritage. World Watch Day is the perfect occasion to learn about a piece you've always been curious about."
    )
)

@Composable
fun WorldWatchDayScreen(modifier: Modifier = Modifier) {
    LazyColumn(modifier = modifier.fillMaxSize()) {

        // Hero
        item {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .background(
                        brush = Brush.verticalGradient(
                            colors = listOf(Color(0xFF1A1A1A), Color(0xFF2C2416))
                        )
                    ),
                contentAlignment = Alignment.Center
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(
                        text = "10:10",
                        color = MaterialTheme.colorScheme.primary,
                        style = MaterialTheme.typography.displayMedium,
                        fontWeight = FontWeight.Black,
                        letterSpacing = 4.sp
                    )
                    Spacer(Modifier.height(4.dp))
                    Text(
                        text = "WORLD WATCH DAY",
                        color = Color.White,
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.Bold,
                        letterSpacing = 3.sp
                    )
                    Spacer(Modifier.height(6.dp))
                    Surface(
                        shape = RoundedCornerShape(20.dp),
                        color = MaterialTheme.colorScheme.primary.copy(alpha = 0.2f)
                    ) {
                        Text(
                            text = "Every October 10th",
                            color = MaterialTheme.colorScheme.primary,
                            style = MaterialTheme.typography.labelMedium,
                            fontWeight = FontWeight.Medium,
                            modifier = Modifier.padding(horizontal = 14.dp, vertical = 5.dp)
                        )
                    }
                }
            }
        }

        // Intro
        item {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.3f))
                    .padding(horizontal = 20.dp, vertical = 16.dp)
            ) {
                Text(
                    text = "A global celebration of time, craft, and the people who love watches — held every year on October 10th.",
                    style = MaterialTheme.typography.bodyLarge,
                    fontStyle = FontStyle.Italic,
                    textAlign = TextAlign.Center,
                    color = MaterialTheme.colorScheme.onSurface,
                    modifier = Modifier.fillMaxWidth()
                )
            }
        }

        // Why 10/10
        item {
            BrandSectionHeader("Why October 10th?")
            Text(
                text = "The date is no accident. October 10th — 10/10 — mirrors the iconic 10:10 position displayed on virtually every watch advertisement and retail display in the world. At 10:10, a watch's hands form a symmetrical frame around the dial, showcasing the brand's name and logo in their finest form.",
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
            )
            Text(
                text = "Twice a day, every day, watches offer us this quiet symmetry. October 10th turns that moment into an annual global celebration — a day when the world stops, looks down at its wrist, and appreciates the art of time.",
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
            )
        }

        // Origin
        item {
            BrandSectionHeader("How It Began")
            Text(
                text = "World Watch Day was officially unveiled at Watches & Wonders Geneva — the watch industry's most prestigious annual showcase. The inaugural celebration streamed across multiple time zones on October 10th, 2025, featuring contributions from media outlets, professional associations, collectors, and creative professionals from around the world.",
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
            )
            Text(
                text = "The initiative was established as a nonprofit organization bringing together some of the industry's most respected institutions — a unified signal that the global watch community had something worth celebrating together.",
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
            )
        }

        // Founding organizations
        item {
            BrandSectionHeader("Founding Organizations")
        }

        itemsIndexed(wwdFoundingOrgs) { _, org ->
            WWDOrgCard(org)
        }

        // What watches mean
        item {
            BrandSectionHeader("More Than a Tool")
            Text(
                text = "We don't merely own watches — we wear them through life's varied moments, from the wilderness to the boardroom, from celebrations to quiet mornings. A watch given as a gift becomes a carrier of memory. A watch worn through a milestone becomes a record of it.",
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
            )
            Text(
                text = "World Watch Day is a recognition of that relationship — the one between a person and their timepiece. It invites everyone, from the seasoned collector to the first-time wearer, to pause and reflect on what time means to them.",
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
            )
        }

        // The anatomy pull — a visual content break
        item {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 12.dp),
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(
                    containerColor = MaterialTheme.colorScheme.surfaceVariant
                )
            ) {
                Column(modifier = Modifier.padding(20.dp)) {
                    Text(
                        text = "THE ANATOMY OF A TIMEPIECE",
                        style = MaterialTheme.typography.labelMedium,
                        color = MaterialTheme.colorScheme.primary,
                        fontWeight = FontWeight.Bold,
                        letterSpacing = 1.sp
                    )
                    Spacer(Modifier.height(12.dp))
                    WatchAnatomyItem("Case & Bracelet", "Materials and finishes that create visual and tactile presence")
                    WatchAnatomyItem("Movement", "The heartbeat — the mechanism that defines all else")
                    WatchAnatomyItem("Dial", "The watch's character and identity")
                    WatchAnatomyItem("Hands", "The voice that guides us through time")
                    WatchAnatomyItem("Crystal", "The lens that preserves the mystery within")
                }
            }
        }

        // How to participate
        item {
            BrandSectionHeader("How to Celebrate")
        }

        itemsIndexed(wwdActivities) { i, activity ->
            WWDActivityItem(index = i + 1, activity = activity)
        }

        // WatchDNA note
        item {
            BrandSectionHeader("WatchDNA & World Watch Day")
            Text(
                text = "WatchDNA believes in building a community where everyone is welcome. World Watch Day reflects that mission perfectly — it is an open invitation, extended to anyone who has ever looked down at their wrist and felt something.",
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
            )
            Text(
                text = "Whether you wear a vintage heirloom or a digital sports watch, whether you've been collecting for decades or just started — World Watch Day is your day too.",
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
            )
            Spacer(Modifier.height(24.dp))
        }
    }
}

@Composable
private fun WWDOrgCard(org: WWDFounder) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 5.dp),
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.5f)
        )
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(
                text = org.name,
                style = MaterialTheme.typography.bodyMedium,
                fontWeight = FontWeight.SemiBold
            )
            Spacer(Modifier.height(4.dp))
            Text(
                text = org.description,
                style = MaterialTheme.typography.bodySmall,
                color = MaterialTheme.colorScheme.onSurfaceVariant,
                lineHeight = 18.sp
            )
        }
    }
}

@Composable
private fun WatchAnatomyItem(part: String, description: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 5.dp),
        verticalAlignment = Alignment.Top
    ) {
        Text(
            text = "·",
            color = MaterialTheme.colorScheme.primary,
            fontWeight = FontWeight.Bold,
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(end = 8.dp, top = 2.dp)
        )
        Column {
            Text(
                text = part,
                style = MaterialTheme.typography.bodyMedium,
                fontWeight = FontWeight.SemiBold
            )
            Text(
                text = description,
                style = MaterialTheme.typography.bodySmall,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
        }
    }
}

@Composable
private fun WWDActivityItem(index: Int, activity: WWDActivity) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp),
        verticalAlignment = Alignment.Top
    ) {
        Surface(
            shape = RoundedCornerShape(6.dp),
            color = MaterialTheme.colorScheme.primary,
            modifier = Modifier.size(28.dp)
        ) {
            Box(contentAlignment = Alignment.Center) {
                Text(
                    text = index.toString(),
                    color = MaterialTheme.colorScheme.onPrimary,
                    style = MaterialTheme.typography.labelMedium,
                    fontWeight = FontWeight.Bold
                )
            }
        }
        Spacer(Modifier.width(12.dp))
        Column {
            Text(
                text = activity.title,
                style = MaterialTheme.typography.bodyMedium,
                fontWeight = FontWeight.SemiBold
            )
            Spacer(Modifier.height(2.dp))
            Text(
                text = activity.detail,
                style = MaterialTheme.typography.bodySmall,
                color = MaterialTheme.colorScheme.onSurfaceVariant,
                lineHeight = 18.sp
            )
        }
    }
}
