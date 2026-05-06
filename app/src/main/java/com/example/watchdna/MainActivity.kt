package com.example.watchdna

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.BackHandler
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.filled.ArrowForwardIos
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.watchdna.ui.theme.WatchDNATheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            WatchDNATheme {
                WatchDNAApp()
            }
        }
    }
}

enum class Screen {
    EDUCATE, ENTERTAIN, EXPLORE, COMMUNITY, DNA
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun WatchDNAApp() {
    var currentScreen by rememberSaveable { mutableStateOf(Screen.EDUCATE) }
    var currentDetail by rememberSaveable { mutableStateOf<String?>(null) }

    BackHandler(enabled = currentDetail != null) {
        currentDetail = null
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(currentDetail ?: "WatchDNA", fontWeight = FontWeight.Bold)
                },
                navigationIcon = {
                    if (currentDetail != null) {
                        IconButton(onClick = { currentDetail = null }) {
                            Icon(
                                Icons.AutoMirrored.Filled.ArrowBack,
                                contentDescription = "Back",
                                tint = MaterialTheme.colorScheme.onPrimary
                            )
                        }
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                    titleContentColor = MaterialTheme.colorScheme.onPrimary
                )
            )
        },
        bottomBar = {
            val itemColors = NavigationBarItemDefaults.colors(
                indicatorColor = MaterialTheme.colorScheme.primary,
                selectedIconColor = MaterialTheme.colorScheme.onPrimary,
                selectedTextColor = MaterialTheme.colorScheme.primary
            )
            NavigationBar {
                NavigationBarItem(
                    selected = currentScreen == Screen.EDUCATE,
                    onClick = { currentScreen = Screen.EDUCATE; currentDetail = null },
                    icon = { Icon(Icons.Default.Home, contentDescription = null) },
                    label = { Text("Educate") },
                    colors = itemColors
                )
                NavigationBarItem(
                    selected = currentScreen == Screen.ENTERTAIN,
                    onClick = { currentScreen = Screen.ENTERTAIN; currentDetail = null },
                    icon = { Icon(Icons.Default.Star, contentDescription = null) },
                    label = { Text("Entertain") },
                    colors = itemColors
                )
                NavigationBarItem(
                    selected = currentScreen == Screen.EXPLORE,
                    onClick = { currentScreen = Screen.EXPLORE; currentDetail = null },
                    icon = { Icon(Icons.Default.Search, contentDescription = null) },
                    label = { Text("Explore") },
                    colors = itemColors
                )
                NavigationBarItem(
                    selected = currentScreen == Screen.COMMUNITY,
                    onClick = { currentScreen = Screen.COMMUNITY; currentDetail = null },
                    icon = { Icon(Icons.Default.AccountBox, contentDescription = null) },
                    label = { Text("Community") },
                    colors = itemColors
                )
                NavigationBarItem(
                    selected = currentScreen == Screen.DNA,
                    onClick = { currentScreen = Screen.DNA; currentDetail = null },
                    icon = { Icon(Icons.Default.Info, contentDescription = null) },
                    label = { Text("Our DNA") },
                    colors = itemColors
                )
            }
        }
    ) { padding ->
        if (currentDetail != null) {
            when (currentDetail) {
                "Watch Brands" -> WatchBrandsScreen({ currentDetail = it }, Modifier.padding(padding))
                "Groups" -> GroupsScreen(Modifier.padding(padding))
                "Accessories" -> AccessoriesScreen({ currentDetail = it }, Modifier.padding(padding))
                "Benson" -> BensonScreen(Modifier.padding(padding))
                "Heisse & Söhne" -> HeisseSohneScreen(Modifier.padding(padding))
                "Wolf 1834" -> Wolf1834Screen(Modifier.padding(padding))
                "Legion Safes" -> LegionSafesScreen(Modifier.padding(padding))
                "JU Straps" -> JUStrapsScreen(Modifier.padding(padding))
                "LIC-Leather" -> LICLeatherScreen(Modifier.padding(padding))
                "Maison Alcée" -> MaisonAlceeScreen(Modifier.padding(padding))
                "Compass" -> CompassScreen(Modifier.padding(padding))
                "Watch Certificate" -> WatchCertificateScreen(Modifier.padding(padding))
                "Tradeshows" -> TradeshowsScreen(Modifier.padding(padding))
                "Committee" -> CommitteeScreen(Modifier.padding(padding))
                "Platforms" -> PlatformsScreen(Modifier.padding(padding))
                "Alexander Awards" -> AlexanderAwardsScreen(Modifier.padding(padding))
                "Timepiece World Awards" -> TimepieceWorldAwardsScreen(Modifier.padding(padding))
                "Temporis International Awards" -> TemporisAwardsScreen(Modifier.padding(padding))
                "Grand Prix D'Horlogerie de Genève" -> GPHGScreen(Modifier.padding(padding))
                "Hong Kong Watch & Clock Design Competition" -> HongKongDesignCompetitionScreen(Modifier.padding(padding))
                "Watchmaking 101" -> Watchmaking101Screen(Modifier.padding(padding))
                "World of Watches" -> WorldOfWatchesScreen(Modifier.padding(padding))
                "Our Stories" -> OurStoriesScreen(Modifier.padding(padding))
                "Articles" -> CommunityArticlesScreen({ currentDetail = it }, Modifier.padding(padding))
                "article_vancouver" -> CommunityArticleDetailScreen("article_vancouver", Modifier.padding(padding))
                "article_wwday_why" -> CommunityArticleDetailScreen("article_wwday_why", Modifier.padding(padding))
                "article_wwday_launch" -> CommunityArticleDetailScreen("article_wwday_launch", Modifier.padding(padding))
                "article_leadership" -> CommunityArticleDetailScreen("article_leadership", Modifier.padding(padding))
                "article_holidays" -> CommunityArticleDetailScreen("article_holidays", Modifier.padding(padding))
                "article_movember" -> CommunityArticleDetailScreen("article_movember", Modifier.padding(padding))
                "Aficionados" -> AficionadosScreen(Modifier.padding(padding))
                "Our Vision" -> OurVisionScreen(Modifier.padding(padding))
                "1% for the Planet" -> OnePercentPlanetScreen(Modifier.padding(padding))
                "B1G1 | Business for Good" -> B1G1Screen(Modifier.padding(padding))
                else -> BrandDetailScreen(currentDetail!!, Modifier.padding(padding))
            }
        } else {
            when (currentScreen) {
                Screen.EDUCATE -> EducateScreen({ currentDetail = it }, Modifier.padding(padding))
                Screen.ENTERTAIN -> EntertainScreen({ currentDetail = it }, Modifier.padding(padding))
                Screen.EXPLORE -> ExploreScreen({ currentDetail = it }, Modifier.padding(padding))
                Screen.COMMUNITY -> CommunityScreen({ currentDetail = it }, Modifier.padding(padding))
                Screen.DNA -> DNAScreen({ currentDetail = it }, Modifier.padding(padding))
            }
        }
    }
}

@Composable
fun NavRow(label: String, onClick: () -> Unit) {
    ListItem(
        headlineContent = { Text(label) },
        trailingContent = {
            Icon(
                Icons.AutoMirrored.Filled.ArrowForwardIos,
                contentDescription = null,
                modifier = Modifier.size(14.dp)
            )
        },
        modifier = Modifier.clickable { onClick() }
    )
    HorizontalDivider()
}

@Composable
fun SectionLabel(title: String) {
    Text(
        text = title.uppercase(),
        style = MaterialTheme.typography.labelMedium,
        color = MaterialTheme.colorScheme.primary,
        fontWeight = FontWeight.Bold,
        modifier = Modifier
            .padding(horizontal = 16.dp)
            .padding(top = 24.dp, bottom = 4.dp)
    )
}

@Composable
fun DetailScreen(title: String, modifier: Modifier = Modifier) {
    Box(modifier = modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            Icon(
                Icons.Default.Watch,
                contentDescription = null,
                tint = MaterialTheme.colorScheme.primary,
                modifier = Modifier.size(56.dp)
            )
            Text(title, style = MaterialTheme.typography.headlineSmall, fontWeight = FontWeight.SemiBold)
            Text("Content coming soon", color = MaterialTheme.colorScheme.onSurfaceVariant)
        }
    }
}


@Composable
fun EntertainScreen(onNavigate: (String) -> Unit, modifier: Modifier = Modifier) {
    Column(modifier = modifier.verticalScroll(rememberScrollState()).padding(bottom = 16.dp)) {
        SectionLabel("Articles")
        NavRow("Our Stories") { onNavigate("Our Stories") }
        NavRow("Press Releases") { onNavigate("Press Releases") }
        NavRow("Meet Our Contributors") { onNavigate("Meet Our Contributors") }

        SectionLabel("Media")
        NavRow("Directory") { onNavigate("Directory") }
        NavRow("Favourite RSS Feed") { onNavigate("Favourite RSS Feed") }
        NavRow("Community Reads") { onNavigate("Community Reads") }
    }
}

@Composable
fun ExploreScreen(onNavigate: (String) -> Unit, modifier: Modifier = Modifier) {
    Column(modifier = modifier.verticalScroll(rememberScrollState()).padding(bottom = 16.dp)) {
        SectionLabel("Buyer's Guide")
        NavRow("Timepieces") { onNavigate("Timepieces") }
        NavRow("Accessories") { onNavigate("Accessories") }

        SectionLabel("Authorized Dealers")
        NavRow("AD Directory") { onNavigate("AD Directory") }
        NavRow("Store Locator") { onNavigate("Store Locator") }
    }
}

@Composable
fun CommunityScreen(onNavigate: (String) -> Unit, modifier: Modifier = Modifier) {
    Column(modifier = modifier.verticalScroll(rememberScrollState()).padding(bottom = 16.dp)) {
        SectionLabel("Community")
        NavRow("Articles") { onNavigate("Articles") }
        NavRow("Aficionados") { onNavigate("Aficionados") }
        NavRow("Your Daily Routine") { onNavigate("Your Daily Routine") }
        NavRow("RedBar") { onNavigate("RedBar") }
        NavRow("World Watch Day") { onNavigate("World Watch Day") }
    }
}

@Composable
fun DNAScreen(onNavigate: (String) -> Unit, modifier: Modifier = Modifier) {
    Column(modifier = modifier.verticalScroll(rememberScrollState()).padding(bottom = 16.dp)) {
        SectionLabel("Our DNA")
        NavRow("Our Vision") { onNavigate("Our Vision") }
        NavRow("1% for the Planet") { onNavigate("1% for the Planet") }
        NavRow("B1G1 | Business for Good") { onNavigate("B1G1 | Business for Good") }

        SectionLabel("Support & Legal")
        NavRow("FAQ's") { onNavigate("FAQ's") }
        NavRow("Useful Links") { onNavigate("Useful Links") }
        NavRow("Newsletter") { onNavigate("Newsletter") }
        NavRow("Contact Us") { onNavigate("Contact Us") }
        NavRow("Local Community") { onNavigate("Local Community") }
        NavRow("Terms & Conditions") { onNavigate("Terms & Conditions") }
        NavRow("Return & Refund") { onNavigate("Return & Refund") }
    }
}