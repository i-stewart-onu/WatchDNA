package com.example.watchdna

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

data class AdCountry(
    val name: String,
    val regions: List<String>
)

val watchDnaAdDirectory = listOf(
    AdCountry("Australia (4)", listOf("New South Wales (3)", "Queensland (1)")),
    AdCountry("Austria (5)", listOf("Lower Austria (1)", "North Rhine–Westphalia (1)", "Salzburg (1)", "Upper Austria (1)", "Vienna (1)")),
    AdCountry("Bulgaria (6)", listOf("Burgas (1)", "Plovdiv (1)", "Sofia (4)")),
    AdCountry("Canada (178)", listOf("Alberta (25)", "British Columbia (34)", "Manitoba (3)", "New Brunswick (1)", "Newfoundland and Labrador (1)", "Nova Scotia (2)", "Ontario (73)", "Quebec (37)", "Saskatchewan (2)")),
    AdCountry("Czech Republic (7)", listOf("Plzeň Region (1)", "Prague 1 (2)", "Prague 10 (1)", "Prague 6 (1)", "Prague 7 (1)", "Vysočina Region (1)")),
    AdCountry("France (4)", listOf("Île-de-France (4)")),
    AdCountry("Germany (39)", listOf("Baden-Württemberg (4)", "Bavaria (5)", "Hamburg (2)", "Hesse (1)", "Lower Saxony (4)", "North Rhine-Westphalia (9)", "Rhineland-Palatinate (2)", "Saxony (3)", "Schleswig-Holstein (3)", "Thuringia (1)")),
    AdCountry("Greece (2)", listOf("Attica (1)", "Crete (1)")),
    AdCountry("Hong Kong (4)", emptyList()),
    AdCountry("Hungary (6)", listOf("Csongrád-Csanád (1)", "District V (2)", "District VIII (2)", "District XI (1)")),
    AdCountry("India (19)", listOf("Dehli (1)", "Gujarat (5)", "Karnataka (3)", "Maharashtra (9)")),
    AdCountry("Italy (2)", listOf("Bolzano (1)", "Siena (1)")),
    AdCountry("Netherlands (3)", listOf("Friesland (1)", "Noord-Holland (1)", "North Brabant (1)")),
    AdCountry("Poland (7)", listOf("Coimbra (1)", "Lisbon (3)", "Lower Silesian (1)", "Masovian Voivodeship (1)", "Porto (1)")),
    AdCountry("Serbia (4)", listOf("Belgrade District (3)", "South Bačka District (1)")),
    AdCountry("Slovakia (1)", listOf("Košice Region (1)")),
    AdCountry("Spain (1)", listOf("Valladolid (1)")),
    AdCountry("Sweden (1)", listOf("Skåne County (1)")),
    AdCountry("Switzerland (16)", listOf("Aargau (1)", "Bern (2)", "Geneva (4)", "Luzern (2)", "Solothurn (2)", "St. Gallen (1)", "Ticino (1)", "Valais (1)", "Vaud (1)", "Zürich (5)")),
    AdCountry("United Kingdom (6)", listOf("Derbyshire (2)", "London (2)", "Warwickshire (2)")),
    AdCountry("USA (586)", listOf(
        "Alabama (1)", "Alaska (2)", "Arizona (15)", "Arkansas (1)",
        "California (87)", "Colorado (12)", "Connecticut (7)",
        "Distric of Columbia (1)", "District of Columbia (1)",
        "Florida (43)", "Georgia (15)", "Guam (1)", "Hawai (2)",
        "Hawaii (1)", "Idaho (2)", "Illinois (22)", "Indiana (4)",
        "Indianapolis (1)", "Iowa (4)", "Kansas (1)", "Louisiana (2)",
        "Maine (1)", "Maryland (5)", "Massachusetts (11)", "Michigan (17)",
        "Minnesota (2)", "Missouri (1)", "Montana (1)", "Nebraska (1)",
        "Nevada (117)", "New England (1)", "New Hampshire (4)",
        "New Jersey (28)", "New Mexico (1)", "New York (47)",
        "North Carolina (12)", "Ohio (10)", "Oklahoma (7)", "Oregon (3)",
        "Pennsylvania (22)", "Rhode Island (3)", "South Carolina (1)",
        "South Dakota (2)", "Tennessee (5)", "Texas (34)", "Utah (3)",
        "Virginia (8)", "Washington (5)", "West Virginia (1)",
        "Wisconsin (5)", "Wyoming (3)"
    ))
)

@Composable
fun ADDirectoryScreen(modifier: Modifier = Modifier) {
    LazyColumn(modifier = modifier.fillMaxSize()) {
        watchDnaAdDirectory.forEach { country ->
            item {
                Text(
                    text = country.name.uppercase(),
                    style = MaterialTheme.typography.labelMedium,
                    color = MaterialTheme.colorScheme.primary,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(horizontal = 16.dp)
                        .padding(top = 24.dp, bottom = 4.dp)
                )
            }

            if (country.regions.isEmpty()) {
                item {
                    Column {
                        ListItem(
                            headlineContent = { Text("All Regions", style = MaterialTheme.typography.bodyLarge) }
                        )
                        HorizontalDivider(modifier = Modifier.padding(horizontal = 16.dp))
                    }
                }
            } else {
                items(country.regions) { region ->
                    Column {
                        ListItem(
                            headlineContent = { Text(region, style = MaterialTheme.typography.bodyLarge) }
                        )
                        HorizontalDivider(modifier = Modifier.padding(horizontal = 16.dp))
                    }
                }
            }
        }
        item { Spacer(modifier = Modifier.height(16.dp)) }
    }
}