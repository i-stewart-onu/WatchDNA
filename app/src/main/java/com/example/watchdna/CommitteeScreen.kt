package com.example.watchdna

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

data class Committee(
    val name: String,
    val description: String
)

data class CommitteeCountry(
    val country: String,
    val committees: List<Committee>
)

val committeesByCountry = listOf(
    CommitteeCountry(
        country = "Canada",
        committees = listOf(
            Committee(
                name = "Canadian Jewellers Association (CJA)",
                description = "The national trade association representing the Canadian jewellery and watch industry, focused on education, advocacy, and ethical business standards since 1918."
            ),
            Committee(
                name = "Canadian Jewellery Group (CJG)",
                description = "Canada's largest jewellery buying cooperative, providing independent jewellers with collective purchasing power and shared resources since 1977."
            )
        )
    ),
    CommitteeCountry(
        country = "France",
        committees = listOf(
            Committee(
                name = "Francéclat",
                description = "The professional committee dedicated to supporting and promoting France's watchmaking, jewelry, and tableware industries through research and innovation."
            ),
            Committee(
                name = "France Horlogerie",
                description = "The professional association representing French watchmaking manufacturers, providing strategic support and protecting industry interests."
            ),
            Committee(
                name = "Union de la Bijouterie-Horlogerie (UBH)",
                description = "The main professional union for jewellers and watchmakers in France, defending the interests of around 2,700 professionals."
            )
        )
    ),
    CommitteeCountry(
        country = "Switzerland",
        committees = listOf(
            Committee(
                name = "Swiss Independent Watchmakers Pavilion (SIWP)",
                description = "An organization dedicated to showcasing independent Swiss brands, providing a platform for craftsmanship outside of large corporate conglomerates."
            ),
            Committee(
                name = "Fondation Haute Horlogerie (FHH)",
                description = "A public interest foundation established in 2005 to promote the culture and excellence of fine watchmaking through training and international events."
            )
        )
    )
)

@Composable
fun CommitteeScreen(modifier: Modifier = Modifier) {
    LazyColumn(modifier = modifier.fillMaxSize()) {
        committeesByCountry.forEach { country ->
            item {
                Text(
                    text = country.country.uppercase(),
                    style = MaterialTheme.typography.labelMedium,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.primary,
                    modifier = Modifier
                        .padding(horizontal = 16.dp)
                        .padding(top = 24.dp, bottom = 4.dp)
                )
            }
            country.committees.forEachIndexed { index, committee ->
                item {
                    Column(modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)) {
                        Text(
                            text = committee.name,
                            style = MaterialTheme.typography.bodyLarge,
                            fontWeight = FontWeight.SemiBold
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(
                            text = committee.description,
                            style = MaterialTheme.typography.bodyMedium,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                        Spacer(modifier = Modifier.height(8.dp))
                        if (index < country.committees.lastIndex) {
                            HorizontalDivider()
                        }
                    }
                }
            }
        }
        item { Spacer(modifier = Modifier.height(16.dp)) }
    }
}