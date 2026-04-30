package com.example.watchdna

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

data class Tradeshow(
    val name: String,
    val description: String
)

data class TradeshowCountry(
    val country: String,
    val shows: List<Tradeshow>
)

val tradeshowsByCountry = listOf(
    TradeshowCountry(
        country = "Canada",
        shows = listOf(
            Tradeshow(
                name = "CJA - Expo Prestige",
                description = "Canada's longest-running and most prestigious jewellery trade show, organized by the Canadian Jewellers Association for retailers, suppliers, and manufacturers."
            ),
            Tradeshow(
                name = "The Canadian Watches & Jewelry Show",
                description = "A one-day industry and enthusiast event held in Laval, near Montreal, highlighting craftsmanship and innovation for collectors and newcomers."
            ),
            Tradeshow(
                name = "Time & Shine",
                description = "A trade-only jewellery marketplace for verified jewellers to source products and build supplier relationships across major Canadian cities."
            ),
            Tradeshow(
                name = "Timepiece Show",
                description = "An event bringing together luxury and vintage watch enthusiasts, collectors, and dealers in Canada to celebrate horological craftsmanship."
            )
        )
    ),
    TradeshowCountry(
        country = "China",
        shows = listOf(
            Tradeshow(
                name = "Hong Kong Watch & Clock Fair",
                description = "One of the world's largest horological events, acting as a premier sourcing platform for innovations in timepieces, smartwatches, and components."
            )
        )
    ),
    TradeshowCountry(
        country = "France",
        shows = listOf(
            Tradeshow(
                name = "We Love Watches",
                description = "A vibrant showcase of contemporary watchmaking in Paris, featuring iconic brands and innovative microbrands under the motto \"Iconic. Independent. On-trend.\""
            )
        )
    ),
    TradeshowCountry(
        country = "Switzerland",
        shows = listOf(
            Tradeshow(
                name = "Chronopolis Watch Fair",
                description = "An independent fair conceived as a \"city within the city\" in Geneva, emphasizing close interaction between independent watchmakers and the public."
            ),
            Tradeshow(
                name = "EPHJ – The International Trade Show for High Precision",
                description = "The world's leading trade show dedicated to high-precision industries, connecting watchmaking, jewellery, microtechnology, and medtech."
            ),
            Tradeshow(
                name = "Time to Watches Geneva Edition",
                description = "A dynamic event uniting luxury brands, independent watchmakers, and microbrands during Geneva Watch Week."
            ),
            Tradeshow(
                name = "Watches & Wonders",
                description = "Formerly known as SIHH, this is one of the most prestigious events in the world, serving as the primary global stage for the finest watchmaking maisons."
            )
        )
    ),
    TradeshowCountry(
        country = "United Arab Emirates",
        shows = listOf(
            Tradeshow(
                name = "Dubai Watch Week",
                description = "A leading cultural celebration of horology featuring masterclasses, expert forums, and exhibitions from over 90 global watch brands."
            )
        )
    ),
    TradeshowCountry(
        country = "United States of America",
        shows = listOf(
            Tradeshow(
                name = "JCK & Luxury",
                description = "The largest and most influential jewelry trade show in North America, held in Las Vegas, showcasing top brands and cutting-edge technology."
            ),
            Tradeshow(
                name = "The Couture Show",
                description = "An exclusive, upscale trade event in Las Vegas curated for the world's finest jewelry designers and luxury timepiece brands."
            ),
            Tradeshow(
                name = "Time to Watches Las Vegas Edition",
                description = "The North American edition of the Swiss event, focusing on product launches and brand storytelling for the US market."
            ),
            Tradeshow(
                name = "Windup Watch Fair",
                description = "An accessible, free-to-attend fair organized by Worn & Wound that connects independent brands directly with seasoned collectors and newcomers."
            )
        )
    )
)

@Composable
fun TradeshowsScreen(modifier: Modifier = Modifier) {
    LazyColumn(modifier = modifier.fillMaxSize()) {
        tradeshowsByCountry.forEach { country ->
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
            country.shows.forEachIndexed { index, show ->
                item {
                    Column(modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)) {
                        Text(
                            text = show.name,
                            style = MaterialTheme.typography.bodyLarge,
                            fontWeight = FontWeight.SemiBold
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(
                            text = show.description,
                            style = MaterialTheme.typography.bodyMedium,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                        Spacer(modifier = Modifier.height(8.dp))
                        if (index < country.shows.lastIndex) {
                            HorizontalDivider()
                        }
                    }
                }
            }
        }
        item { Spacer(modifier = Modifier.height(16.dp)) }
    }
}