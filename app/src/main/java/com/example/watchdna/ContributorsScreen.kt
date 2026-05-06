package com.example.watchdna

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

data class ContributorCategory(
    val title: String,
    val members: List<String>
)

val watchDnaContributors = listOf(
    ContributorCategory("Brand", listOf(
        "Hakim El Kadiri",
        "Thomas Brissiaud"
    )),
    ContributorCategory("Expert", listOf(
        "Grigor Garabedian",
        "Sarah Tahseen",
        "Sevan Khidichian"
    )),
    ContributorCategory("Journalist", listOf(
        "Carol Besler",
        "Jeremy Freed",
        "Roberta Naas",
        "Victoria Townsend"
    )),
    ContributorCategory("Watch Enthusiast", listOf(
        "Brent Robillard", "Cagdas Onen", "Colin Potts", "David Carrington",
        "Elizabeth Ionson", "George Sully", "Gian-Paolo Mazzotta", "Ian Cognito",
        "Jacky Ho", "Mark Fleminger", "Mikhail Gomes", "Nabil Amdan",
        "Phillip Plimmer", "Sanket Patel", "Sean Shapiro", "Smartwatch Dick",
        "Spiro Mandylor", "Thomas J. Sandrin", "Tyler", "Tyler Worden",
        "Victor", "Watchguyglasgow", "Watch You Talkin’ About"
    ))
)

@Composable
fun ContributorsScreen(modifier: Modifier = Modifier) {
    LazyColumn(modifier = modifier.fillMaxSize()) {
        watchDnaContributors.forEach { category ->
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
            items(category.members) { member ->
                Column {
                    ListItem(
                        headlineContent = { Text(member, style = MaterialTheme.typography.bodyLarge) }
                    )
                    HorizontalDivider(modifier = Modifier.padding(horizontal = 16.dp))
                }
            }
        }
        item { Spacer(modifier = Modifier.height(16.dp)) }
    }
}