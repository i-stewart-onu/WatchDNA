package com.example.watchdna

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowForwardIos
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

data class AdRegion(
    val name: String,
    val url: String
)

data class AdCountry(
    val name: String,
    val url: String,
    val regions: List<AdRegion>
)

val watchDnaAdDirectory = listOf(
    AdCountry("Australia (4)", "https://watchdna.com/tools/storelocator/countries/australia", listOf(
        AdRegion("New South Wales (3)", "https://watchdna.com/tools/storelocator/regions/new-south-wales"),
        AdRegion("Queensland (1)", "https://watchdna.com/tools/storelocator/regions/queensland")
    )),
    AdCountry("Austria (5)", "https://watchdna.com/tools/storelocator/countries/austria", listOf(
        AdRegion("Lower Austria (1)", "https://watchdna.com/tools/storelocator/regions/lowe-austria"),
        AdRegion("North Rhine–Westphalia (1)", "https://watchdna.com/tools/storelocator/regions/north-rhine-nil-westphalia-4"),
        AdRegion("Salzburg (1)", "https://watchdna.com/tools/storelocator/regions/salzburg"),
        AdRegion("Upper Austria (1)", "https://watchdna.com/tools/storelocator/regions/upper-austria"),
        AdRegion("Vienna (1)", "https://watchdna.com/tools/storelocator/regions/vienna")
    )),
    AdCountry("Bulgaria (6)", "https://watchdna.com/tools/storelocator/countries/bulgaria", listOf(
        AdRegion("Burgas (1)", "https://watchdna.com/tools/storelocator/regions/burgas"),
        AdRegion("Plovdiv (1)", "https://watchdna.com/tools/storelocator/regions/plovdiv"),
        AdRegion("Sofia (4)", "https://watchdna.com/tools/storelocator/regions/sofia")
    )),
    AdCountry("Canada (178)", "https://watchdna.com/tools/storelocator/countries/canada", listOf(
        AdRegion("Alberta (25)", "https://watchdna.com/tools/storelocator/regions/alberta"),
        AdRegion("British Columbia (34)", "https://watchdna.com/tools/storelocator/regions/british-columbia"),
        AdRegion("Manitoba (3)", "https://watchdna.com/tools/storelocator/regions/manitoba"),
        AdRegion("New Brunswick (1)", "https://watchdna.com/tools/storelocator/regions/new-brunswick"),
        AdRegion("Newfoundland and Labrador (1)", "https://watchdna.com/tools/storelocator/regions/newfoundlands-and-labrador"),
        AdRegion("Nova Scotia (2)", "https://watchdna.com/tools/storelocator/regions/nova-scotia"),
        AdRegion("Ontario (73)", "https://watchdna.com/tools/storelocator/regions/ontario"),
        AdRegion("Quebec (37)", "https://watchdna.com/tools/storelocator/regions/quebec"),
        AdRegion("Saskatchewan (2)", "https://watchdna.com/tools/storelocator/regions/saskatchewan")
    )),
    AdCountry("Czech Republic (7)", "https://watchdna.com/tools/storelocator/countries/czech-republic", listOf(
        AdRegion("Plzeň Region (1)", "https://watchdna.com/tools/storelocator/regions/plzen-region"),
        AdRegion("Prague 1 (2)", "https://watchdna.com/tools/storelocator/regions/prague-1-2"),
        AdRegion("Prague 10 (1)", "https://watchdna.com/tools/storelocator/regions/prague-10"),
        AdRegion("Prague 6 (1)", "https://watchdna.com/tools/storelocator/regions/prague-6"),
        AdRegion("Prague 7 (1)", "https://watchdna.com/tools/storelocator/regions/prague-7"),
        AdRegion("Vysočina Region (1)", "https://watchdna.com/tools/storelocator/regions/vysocina-region")
    )),
    AdCountry("France (4)", "https://watchdna.com/tools/storelocator/countries/france", listOf(
        AdRegion("Île-de-France (4)", "https://watchdna.com/tools/storelocator/regions/le-de-france")
    )),
    AdCountry("Germany (39)", "https://watchdna.com/tools/storelocator/countries/germany", listOf(
        AdRegion("Baden-Württemberg (4)", "https://watchdna.com/tools/storelocator/regions/baden-w-rttemberg"),
        AdRegion("Bavaria (5)", "https://watchdna.com/tools/storelocator/regions/bavaria"),
        AdRegion("Hamburg (2)", "https://watchdna.com/tools/storelocator/regions/hamburg"),
        AdRegion("Hesse (1)", "https://watchdna.com/tools/storelocator/regions/hesse"),
        AdRegion("Lower Saxony (4)", "https://watchdna.com/tools/storelocator/regions/lower-saxony"),
        AdRegion("North Rhine-Westphalia (9)", "https://watchdna.com/tools/storelocator/regions/north-rhine-westphalia"),
        AdRegion("Rhineland-Palatinate (2)", "https://watchdna.com/tools/storelocator/regions/rhineland-palatinate"),
        AdRegion("Saxony (3)", "https://watchdna.com/tools/storelocator/regions/saxony"),
        AdRegion("Schleswig-Holstein (3)", "https://watchdna.com/tools/storelocator/regions/schleswig-holstein"),
        AdRegion("Thuringia (1)", "https://watchdna.com/tools/storelocator/regions/thuringia")
    )),
    AdCountry("Greece (2)", "https://watchdna.com/tools/storelocator/countries/greece", listOf(
        AdRegion("Attica (1)", "https://watchdna.com/tools/storelocator/regions/attica"),
        AdRegion("Crete (1)", "https://watchdna.com/tools/storelocator/regions/crete")
    )),
    AdCountry("Hong Kong (4)", "https://watchdna.com/tools/storelocator/countries/hong-kong", emptyList()),
    AdCountry("Hungary (6)", "https://watchdna.com/tools/storelocator/countries/hungary", listOf(
        AdRegion("Csongrád-Csanád (1)", "https://watchdna.com/tools/storelocator/regions/csongr-d-csan-d"),
        AdRegion("District V (2)", "https://watchdna.com/tools/storelocator/regions/district-v-2"),
        AdRegion("District VIII (2)", "https://watchdna.com/tools/storelocator/regions/district-viii"),
        AdRegion("District XI (1)", "https://watchdna.com/tools/storelocator/regions/district-xi")
    )),
    AdCountry("India (19)", "https://watchdna.com/tools/storelocator/countries/india", listOf(
        AdRegion("Delhi (1)", "https://watchdna.com/tools/storelocator/regions/delhi"),
        AdRegion("Gujarat (5)", "https://watchdna.com/tools/storelocator/regions/gujarat"),
        AdRegion("Karnataka (3)", "https://watchdna.com/tools/storelocator/regions/karnataka"),
        AdRegion("Maharashtra (9)", "https://watchdna.com/tools/storelocator/regions/maharashtra")
    )),
    AdCountry("Italy (2)", "https://watchdna.com/tools/storelocator/countries/italy", listOf(
        AdRegion("Bolzano (1)", "https://watchdna.com/tools/storelocator/regions/bolzano"),
        AdRegion("Siena (1)", "https://watchdna.com/tools/storelocator/regions/siena")
    )),
    AdCountry("Netherlands (3)", "https://watchdna.com/tools/storelocator/countries/netherlands", listOf(
        AdRegion("Friesland (1)", "https://watchdna.com/tools/storelocator/regions/friesland"),
        AdRegion("Noord-Holland (1)", "https://watchdna.com/tools/storelocator/regions/noord-holland"),
        AdRegion("North Brabant (1)", "https://watchdna.com/tools/storelocator/regions/north-brabant")
    )),
    AdCountry("Poland (7)", "https://watchdna.com/tools/storelocator/countries/pollan", listOf(
        AdRegion("Coimbra (1)", "https://watchdna.com/tools/storelocator/regions/coimbra"),
        AdRegion("Lisbon (3)", "https://watchdna.com/tools/storelocator/regions/lisbon"),
        AdRegion("Lower Silesian (1)", "https://watchdna.com/tools/storelocator/regions/lowe-silesian"),
        AdRegion("Masovian Voivodeship (1)", "https://watchdna.com/tools/storelocator/regions/masovian-voivodeship"),
        AdRegion("Porto (1)", "https://watchdna.com/tools/storelocator/regions/porto")
    )),
    AdCountry("Serbia (4)", "https://watchdna.com/tools/storelocator/countries/serbia", listOf(
        AdRegion("Belgrade District (3)", "https://watchdna.com/tools/storelocator/regions/belgrade-district"),
        AdRegion("South Bačka District (1)", "https://watchdna.com/tools/storelocator/regions/south-backa-district")
    )),
    AdCountry("Slovakia (1)", "https://watchdna.com/tools/storelocator/countries/slovakia", listOf(
        AdRegion("Košice Region (1)", "https://watchdna.com/tools/storelocator/regions/kosice-region")
    )),
    AdCountry("Spain (1)", "https://watchdna.com/tools/storelocator/countries/spain", listOf(
        AdRegion("Valladolid (1)", "https://watchdna.com/tools/storelocator/regions/valladolid")
    )),
    AdCountry("Sweden (1)", "https://watchdna.com/tools/storelocator/countries/sweden", listOf(
        AdRegion("Skåne County (1)", "https://watchdna.com/tools/storelocator/regions/sk-ne-county")
    )),
    AdCountry("Switzerland (16)", "https://watchdna.com/tools/storelocator/countries/switzerland", listOf(
        AdRegion("Aargau (1)", "https://watchdna.com/tools/storelocator/regions/aargau"),
        AdRegion("Bern (2)", "https://watchdna.com/tools/storelocator/regions/bern"),
        AdRegion("Geneva (4)", "https://watchdna.com/tools/storelocator/regions/geneva"),
        AdRegion("Luzern (2)", "https://watchdna.com/tools/storelocator/regions/luzern"),
        AdRegion("Solothurn (2)", "https://watchdna.com/tools/storelocator/regions/solothurn"),
        AdRegion("St. Gallen (1)", "https://watchdna.com/tools/storelocator/regions/st-gallen"),
        AdRegion("Ticino (1)", "https://watchdna.com/tools/storelocator/regions/ticino"),
        AdRegion("Valais (1)", "https://watchdna.com/tools/storelocator/regions/valais"),
        AdRegion("Vaud (1)", "https://watchdna.com/tools/storelocator/regions/vaud"),
        AdRegion("Zürich (5)", "https://watchdna.com/tools/storelocator/regions/z-rich")
    )),
    AdCountry("United Kingdom (6)", "https://watchdna.com/tools/storelocator/countries/united-kingdom", listOf(
        AdRegion("Derbyshire (2)", "https://watchdna.com/tools/storelocator/regions/derbyshire"),
        AdRegion("London (2)", "https://watchdna.com/tools/storelocator/regions/london-kensington-high-street"),
        AdRegion("Warwickshire (2)", "https://watchdna.com/tools/storelocator/regions/warwickshire")
    )),
    AdCountry("USA (586)", "https://watchdna.com/tools/storelocator/countries/usa", listOf(
        AdRegion("Alabama (1)", "https://watchdna.com/tools/storelocator/regions/alabama"),
        AdRegion("Alaska (2)", "https://watchdna.com/tools/storelocator/regions/alaska"),
        AdRegion("Arizona (15)", "https://watchdna.com/tools/storelocator/regions/arizona"),
        AdRegion("Arkansas (1)", "https://watchdna.com/tools/storelocator/regions/arkansas"),
        AdRegion("California (87)", "https://watchdna.com/tools/storelocator/regions/california"),
        AdRegion("Colorado (12)", "https://watchdna.com/tools/storelocator/regions/colorado"),
        AdRegion("Connecticut (7)", "https://watchdna.com/tools/storelocator/regions/connecticut"),
        AdRegion("Distric of Columbia (1)", "https://watchdna.com/tools/storelocator/regions/distric-of-columbia"),
        AdRegion("District of Columbia (1)", "https://watchdna.com/tools/storelocator/regions/district-of-columbia"),
        AdRegion("Florida (43)", "https://watchdna.com/tools/storelocator/regions/florida"),
        AdRegion("Georgia (15)", "https://watchdna.com/tools/storelocator/regions/georgia"),
        AdRegion("Guam (1)", "https://watchdna.com/tools/storelocator/regions/guam"),
        AdRegion("Hawai (2)", "https://watchdna.com/tools/storelocator/regions/hawai"),
        AdRegion("Hawaii (1)", "https://watchdna.com/tools/storelocator/regions/hawaii"),
        AdRegion("Idaho (2)", "https://watchdna.com/tools/storelocator/regions/idaho"),
        AdRegion("Illinois (22)", "https://watchdna.com/tools/storelocator/regions/illinois"),
        AdRegion("Indiana (4)", "https://watchdna.com/tools/storelocator/regions/indiana-2"),
        AdRegion("Indianapolis (1)", "https://watchdna.com/tools/storelocator/regions/indianapolis"),
        AdRegion("Iowa (4)", "https://watchdna.com/tools/storelocator/regions/iowas"),
        AdRegion("Kansas (1)", "https://watchdna.com/tools/storelocator/regions/kansas"),
        AdRegion("Louisiana (2)", "https://watchdna.com/tools/storelocator/regions/louisiana"),
        AdRegion("Maine (1)", "https://watchdna.com/tools/storelocator/regions/maine"),
        AdRegion("Maryland (5)", "https://watchdna.com/tools/storelocator/regions/maryland"),
        AdRegion("Massachusetts (11)", "https://watchdna.com/tools/storelocator/regions/massachusetts"),
        AdRegion("Michigan (17)", "https://watchdna.com/tools/storelocator/regions/michigan"),
        AdRegion("Minnesota (2)", "https://watchdna.com/tools/storelocator/regions/minnesota"),
        AdRegion("Missouri (1)", "https://watchdna.com/tools/storelocator/regions/missouri"),
        AdRegion("Montana (1)", "https://watchdna.com/tools/storelocator/regions/montana"),
        AdRegion("Nebraska (1)", "https://watchdna.com/tools/storelocator/regions/nebraska"),
        AdRegion("Nevada (117)", "https://watchdna.com/tools/storelocator/regions/nevada"),
        AdRegion("New England (1)", "https://watchdna.com/tools/storelocator/regions/new-england"),
        AdRegion("New Hampshire (4)", "https://watchdna.com/tools/storelocator/regions/new-hampshire"),
        AdRegion("New Jersey (28)", "https://watchdna.com/tools/storelocator/regions/new-jersey"),
        AdRegion("New Mexico (1)", "https://watchdna.com/tools/storelocator/regions/new-mexico"),
        AdRegion("New York (47)", "https://watchdna.com/tools/storelocator/regions/new-york"),
        AdRegion("North Carolina (12)", "https://watchdna.com/tools/storelocator/regions/north-carolina"),
        AdRegion("Ohio (10)", "https://watchdna.com/tools/storelocator/regions/ohio"),
        AdRegion("Oklahoma (7)", "https://watchdna.com/tools/storelocator/regions/oklahoma"),
        AdRegion("Oregon (3)", "https://watchdna.com/tools/storelocator/regions/oregon"),
        AdRegion("Pennsylvania (22)", "https://watchdna.com/tools/storelocator/regions/pennsylvania"),
        AdRegion("Rhode Island (3)", "https://watchdna.com/tools/storelocator/regions/rhode-island"),
        AdRegion("South Carolina (1)", "https://watchdna.com/tools/storelocator/regions/south-carolina"),
        AdRegion("South Dakota (2)", "https://watchdna.com/tools/storelocator/regions/south-dakota"),
        AdRegion("Tennessee (5)", "https://watchdna.com/tools/storelocator/regions/tennessee"),
        AdRegion("Texas (34)", "https://watchdna.com/tools/storelocator/regions/texas"),
        AdRegion("Utah (3)", "https://watchdna.com/tools/storelocator/regions/utah"),
        AdRegion("Virginia (8)", "https://watchdna.com/tools/storelocator/regions/virginia"),
        AdRegion("Washington (5)", "https://watchdna.com/tools/storelocator/regions/washington"),
        AdRegion("West Virginia (1)", "https://watchdna.com/tools/storelocator/regions/west-virginia"),
        AdRegion("Wisconsin (5)", "https://watchdna.com/tools/storelocator/regions/wisconsin"),
        AdRegion("Wyoming (3)", "https://watchdna.com/tools/storelocator/regions/wyoming")
    ))
)

@Composable
fun ADDirectoryScreen(modifier: Modifier = Modifier) {
    val uriHandler = LocalUriHandler.current

    LazyColumn(modifier = modifier.fillMaxSize()) {
        watchDnaAdDirectory.forEach { country ->
            item {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable { uriHandler.openUri(country.url) }
                        .padding(horizontal = 16.dp)
                        .padding(top = 24.dp, bottom = 4.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = country.name.uppercase(),
                        style = MaterialTheme.typography.labelMedium,
                        color = MaterialTheme.colorScheme.primary,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.weight(1f)
                    )
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.ArrowForwardIos,
                        contentDescription = "View Country",
                        modifier = Modifier.size(12.dp),
                        tint = MaterialTheme.colorScheme.primary
                    )
                }
            }

            if (country.regions.isEmpty()) {
                item {
                    Column {
                        ListItem(
                            headlineContent = { Text("All Regions", style = MaterialTheme.typography.bodyLarge) },
                            trailingContent = {
                                Icon(
                                    Icons.AutoMirrored.Filled.ArrowForwardIos,
                                    contentDescription = null,
                                    modifier = Modifier.size(14.dp),
                                    tint = MaterialTheme.colorScheme.primary
                                )
                            },
                            modifier = Modifier.clickable { uriHandler.openUri(country.url) }
                        )
                        HorizontalDivider(modifier = Modifier.padding(horizontal = 16.dp))
                    }
                }
            } else {
                items(country.regions) { region ->
                    Column {
                        ListItem(
                            headlineContent = { Text(region.name, style = MaterialTheme.typography.bodyLarge) },
                            trailingContent = {
                                Icon(
                                    Icons.AutoMirrored.Filled.ArrowForwardIos,
                                    contentDescription = null,
                                    modifier = Modifier.size(14.dp),
                                    tint = MaterialTheme.colorScheme.primary
                                )
                            },
                            modifier = Modifier.clickable { uriHandler.openUri(region.url) }
                        )
                        HorizontalDivider(modifier = Modifier.padding(horizontal = 16.dp))
                    }
                }
            }
        }
        item { Spacer(modifier = Modifier.height(16.dp)) }
    }
}