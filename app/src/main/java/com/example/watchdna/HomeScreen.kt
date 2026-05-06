package com.example.watchdna

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowForwardIos
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

private val HeroCharcoal = Color(0xFF1C1C1E)
private val HeroGold = Color(0xFFBEA877)

@Composable
fun EducateScreen(onNavigate: (String) -> Unit, modifier: Modifier = Modifier) {
    LazyColumn(
        modifier = modifier,
        contentPadding = PaddingValues(bottom = 32.dp)
    ) {
        item { HeroBanner() }
        item { FeaturedSpotlightCard(onNavigate) }
        item {
            HomeSectionHeader("Directories")
            DirectoriesGrid(onNavigate)
        }
        item {
            HomeSectionHeader("Awards")
            AwardsScrollRow(onNavigate)
        }
        item {
            HomeSectionHeader("Education")
            EducationRow(onNavigate)
        }
    }
}

@Composable
private fun HeroBanner() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(220.dp)
            .background(
                brush = Brush.linearGradient(
                    colors = listOf(HeroCharcoal, Color(0xFF2A2417))
                )
            )
    ) {
        Box(
            modifier = Modifier
                .size(200.dp)
                .align(Alignment.CenterEnd)
                .offset(x = 50.dp)
                .background(
                    brush = Brush.radialGradient(
                        colors = listOf(HeroGold.copy(alpha = 0.2f), Color.Transparent)
                    ),
                    shape = RoundedCornerShape(100.dp)
                )
        )

        Column(
            modifier = Modifier
                .align(Alignment.CenterStart)
                .padding(start = 28.dp, end = 120.dp),
            verticalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            Surface(
                shape = RoundedCornerShape(4.dp),
                color = HeroGold.copy(alpha = 0.22f)
            ) {
                Text(
                    "YOUR WATCH COMPANION",
                    color = HeroGold,
                    style = MaterialTheme.typography.labelSmall,
                    fontWeight = FontWeight.Bold,
                    letterSpacing = 1.5.sp,
                    modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                )
            }
            Spacer(Modifier.height(6.dp))
            Text(
                "Watch",
                color = Color.White,
                style = MaterialTheme.typography.headlineMedium,
                fontWeight = FontWeight.Light,
            )
            Text(
                "DNA",
                color = HeroGold,
                style = MaterialTheme.typography.displaySmall,
                fontWeight = FontWeight.ExtraBold,
            )
            Spacer(Modifier.height(4.dp))
            Text(
                "The world of watches, curated.",
                color = Color.White.copy(alpha = 0.5f),
                style = MaterialTheme.typography.bodySmall,
                fontStyle = FontStyle.Italic
            )
        }

        Icon(
            Icons.Default.Watch,
            contentDescription = null,
            tint = HeroGold.copy(alpha = 0.22f),
            modifier = Modifier
                .size(110.dp)
                .align(Alignment.CenterEnd)
                .padding(end = 24.dp)
        )
    }
}

@Composable
private fun FeaturedSpotlightCard(onNavigate: (String) -> Unit) {
    Spacer(Modifier.height(20.dp))
    ElevatedCard(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
            .clickable { onNavigate("Watchmaking 101") },
        elevation = CardDefaults.elevatedCardElevation(defaultElevation = 6.dp),
        shape = RoundedCornerShape(16.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(
                    brush = Brush.horizontalGradient(
                        colors = listOf(HeroCharcoal, Color(0xFF2E2418))
                    )
                )
        ) {
            Column(modifier = Modifier.padding(20.dp)) {
                Surface(
                    shape = RoundedCornerShape(4.dp),
                    color = HeroGold
                ) {
                    Text(
                        "FEATURED",
                        color = Color.White,
                        style = MaterialTheme.typography.labelSmall,
                        fontWeight = FontWeight.Bold,
                        letterSpacing = 1.sp,
                        modifier = Modifier.padding(horizontal = 8.dp, vertical = 3.dp)
                    )
                }
                Spacer(Modifier.height(14.dp))
                Text(
                    "Watchmaking 101",
                    color = Color.White,
                    style = MaterialTheme.typography.titleLarge,
                    fontWeight = FontWeight.Bold
                )
                Spacer(Modifier.height(6.dp))
                Text(
                    "Dive into the craft — from escapements to complications. Everything you need to understand fine timepieces.",
                    color = Color.White.copy(alpha = 0.6f),
                    style = MaterialTheme.typography.bodyMedium,
                    maxLines = 3,
                    overflow = TextOverflow.Ellipsis
                )
                Spacer(Modifier.height(18.dp))
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(4.dp)
                ) {
                    Text(
                        "Explore",
                        color = HeroGold,
                        style = MaterialTheme.typography.labelLarge,
                        fontWeight = FontWeight.SemiBold
                    )
                    Icon(
                        Icons.AutoMirrored.Filled.ArrowForwardIos,
                        contentDescription = null,
                        tint = HeroGold,
                        modifier = Modifier.size(12.dp)
                    )
                }
            }
        }
    }
}

@Composable
private fun HomeSectionHeader(title: String) {
    Text(
        text = title.uppercase(),
        style = MaterialTheme.typography.labelMedium,
        color = MaterialTheme.colorScheme.primary,
        fontWeight = FontWeight.Bold,
        letterSpacing = 1.sp,
        modifier = Modifier
            .padding(horizontal = 16.dp)
            .padding(top = 28.dp, bottom = 12.dp)
    )
}

private data class DirectoryItem(val label: String, val icon: ImageVector, val subtitle: String)

@Composable
private fun DirectoriesGrid(onNavigate: (String) -> Unit) {
    val items = listOf(
        DirectoryItem("Watch Brands", Icons.Default.Watch, "500+ brands"),
        DirectoryItem("Groups", Icons.Default.Business, "Industry groups"),
        DirectoryItem("Accessories", Icons.Default.Checkroom, "Straps & more"),
        DirectoryItem("Tradeshows", Icons.Default.Event, "Global events"),
        DirectoryItem("Committee", Icons.Default.Groups, "Industry leaders"),
        DirectoryItem("Platforms", Icons.Default.Apps, "Watch platforms"),
    )
    Column(
        modifier = Modifier.padding(horizontal = 16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        items.chunked(2).forEach { rowItems ->
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                rowItems.forEach { item ->
                    DirectoryCard(
                        item = item,
                        onClick = { onNavigate(item.label) },
                        modifier = Modifier.weight(1f)
                    )
                }
                if (rowItems.size == 1) Spacer(Modifier.weight(1f))
            }
        }
    }
}

@Composable
private fun DirectoryCard(item: DirectoryItem, onClick: () -> Unit, modifier: Modifier = Modifier) {
    val primaryColor = MaterialTheme.colorScheme.primary
    ElevatedCard(
        modifier = modifier
            .aspectRatio(1.45f)
            .clickable { onClick() },
        elevation = CardDefaults.elevatedCardElevation(defaultElevation = 2.dp),
        shape = RoundedCornerShape(14.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(14.dp),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Box(
                modifier = Modifier
                    .size(38.dp)
                    .background(
                        color = primaryColor.copy(alpha = 0.12f),
                        shape = RoundedCornerShape(10.dp)
                    ),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    item.icon,
                    contentDescription = null,
                    tint = primaryColor,
                    modifier = Modifier.size(20.dp)
                )
            }
            Column(verticalArrangement = Arrangement.spacedBy(2.dp)) {
                Text(
                    item.label,
                    style = MaterialTheme.typography.titleSmall,
                    fontWeight = FontWeight.SemiBold,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
                Text(
                    item.subtitle,
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
            }
        }
    }
}

@Composable
private fun AwardsScrollRow(onNavigate: (String) -> Unit) {
    val awards = listOf(
        "Alexander Awards",
        "Timepiece World Awards",
        "Temporis International Awards",
        "Grand Prix D'Horlogerie de Genève",
        "Hong Kong Watch & Clock Design Competition"
    )
    Row(
        modifier = Modifier
            .horizontalScroll(rememberScrollState())
            .padding(horizontal = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        awards.forEach { award ->
            AwardCard(label = award, onClick = { onNavigate(award) })
        }
    }
}

@Composable
private fun AwardCard(label: String, onClick: () -> Unit) {
    OutlinedCard(
        modifier = Modifier
            .width(155.dp)
            .clickable { onClick() },
        shape = RoundedCornerShape(12.dp)
    ) {
        Column(
            modifier = Modifier.padding(14.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            Icon(
                Icons.Default.EmojiEvents,
                contentDescription = null,
                tint = MaterialTheme.colorScheme.primary,
                modifier = Modifier.size(26.dp)
            )
            Text(
                label,
                style = MaterialTheme.typography.bodySmall,
                fontWeight = FontWeight.Medium,
                maxLines = 3,
                overflow = TextOverflow.Ellipsis,
                lineHeight = 16.sp
            )
        }
    }
}

@Composable
private fun EducationRow(onNavigate: (String) -> Unit) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        EducationCard(
            title = "Watchmaking 101",
            subtitle = "The craft explained",
            icon = Icons.Default.School,
            onClick = { onNavigate("Watchmaking 101") },
            modifier = Modifier.weight(1f)
        )
        EducationCard(
            title = "World of Watches",
            subtitle = "Explore the industry",
            icon = Icons.Default.Public,
            onClick = { onNavigate("World of Watches") },
            modifier = Modifier.weight(1f)
        )
    }
}

@Composable
private fun EducationCard(
    title: String,
    subtitle: String,
    icon: ImageVector,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    val primaryColor = MaterialTheme.colorScheme.primary
    ElevatedCard(
        modifier = modifier.clickable { onClick() },
        elevation = CardDefaults.elevatedCardElevation(defaultElevation = 2.dp),
        shape = RoundedCornerShape(14.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(
                    brush = Brush.verticalGradient(
                        colors = listOf(primaryColor.copy(alpha = 0.08f), Color.Transparent)
                    )
                )
        ) {
            Column(
                modifier = Modifier.padding(16.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Icon(
                    icon,
                    contentDescription = null,
                    tint = primaryColor,
                    modifier = Modifier.size(28.dp)
                )
                Text(
                    title,
                    style = MaterialTheme.typography.titleSmall,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    subtitle,
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }
        }
    }
}
