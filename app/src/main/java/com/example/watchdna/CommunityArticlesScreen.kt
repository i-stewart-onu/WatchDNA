package com.example.watchdna

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

data class CommunityArticle(
    val title: String,
    val date: String,
    val description: String,
    val routeKey: String
)

val communityArticles = listOf(
    CommunityArticle(
        title = "Vancouver Timepiece Show Returns This Weekend",
        date = "April 25, 2026",
        description = "The Vancouver Timepiece Show returns for its second edition, bringing collectors, enthusiasts, and watch brands together at The Pipe Shop at The Shipyards in North Vancouver.",
        routeKey = "article_vancouver"
    ),
    CommunityArticle(
        title = "World Watch Day — Why Celebrate Timepieces?",
        date = "October 10, 2025",
        description = "An exploration of the significance of timepieces and why the watch community comes together every year on 10/10 to celebrate the art and craft of horology.",
        routeKey = "article_wwday_why"
    ),
    CommunityArticle(
        title = "World Watch Day Launches: A Global Celebration on 10/10",
        date = "October 6, 2025",
        description = "The inaugural World Watch Day streams worldwide on October 10, 2025, officially unveiled at Watches & Wonders Geneva — a milestone for the global watch community.",
        routeKey = "article_wwday_launch"
    ),
    CommunityArticle(
        title = "Celebrating Leadership and Passion in Horology",
        date = "March 5, 2025",
        description = "A feature connecting with influential figures in watchmaking who share their expertise, vision, and passion for the craft with the broader community.",
        routeKey = "article_leadership"
    ),
    CommunityArticle(
        title = "The Magic of the Holidays: Celebrating Time, Family, and Togetherness",
        date = "December 23, 2024",
        description = "A reflection on the holiday season's connection to time, tradition, and the meaningful role timepieces play in marking life's most important moments.",
        routeKey = "article_holidays"
    ),
    CommunityArticle(
        title = "Supporting Men's Health Through Movember: The Watch Industry's Role",
        date = "October 28, 2024",
        description = "An examination of how the watch industry participates in Movember's men's health awareness initiatives, raising funds and sparking important conversations.",
        routeKey = "article_movember"
    )
)

@Composable
fun CommunityArticlesScreen(onNavigate: (String) -> Unit, modifier: Modifier = Modifier) {
    LazyColumn(modifier = modifier.fillMaxSize()) {
        items(communityArticles) { article ->
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable { onNavigate(article.routeKey) }
                    .padding(horizontal = 16.dp, vertical = 12.dp)
            ) {
                Text(
                    text = article.title,
                    style = MaterialTheme.typography.bodyLarge,
                    fontWeight = FontWeight.SemiBold
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = article.date,
                    style = MaterialTheme.typography.labelMedium,
                    color = MaterialTheme.colorScheme.primary
                )
                Spacer(modifier = Modifier.height(6.dp))
                Text(
                    text = article.description,
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }
            HorizontalDivider()
        }
        item { Spacer(modifier = Modifier.height(16.dp)) }
    }
}
