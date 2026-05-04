package com.example.watchdna

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun WatchBrandsScreen(onNavigate: (String) -> Unit, modifier: Modifier = Modifier) {
    var selectedTab by remember { mutableStateOf(0) }
    var searchQuery by remember { mutableStateOf("") }
    val tabs = listOf("Groups", "Countries", "Connected", "Alphabetical")

    Column(modifier = modifier) {
        OutlinedTextField(
            value = searchQuery,
            onValueChange = { searchQuery = it },
            placeholder = { Text("Search brands…") },
            leadingIcon = { Icon(Icons.Default.Search, contentDescription = null) },
            singleLine = true,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 8.dp)
        )

        if (searchQuery.isBlank()) {
            ScrollableTabRow(selectedTabIndex = selectedTab) {
                tabs.forEachIndexed { index, title ->
                    Tab(
                        selected = selectedTab == index,
                        onClick = { selectedTab = index },
                        text = { Text(title) }
                    )
                }
            }
            when (selectedTab) {
                0 -> GroupsTab(onNavigate)
                1 -> CountriesTab(onNavigate)
                2 -> ConnectedTab(onNavigate)
                3 -> AlphabeticalTab(onNavigate)
            }
        } else {
            val results = allBrands.filter {
                it.contains(searchQuery.trim(), ignoreCase = true)
            }
            LazyColumn(modifier = Modifier.fillMaxSize()) {
                if (results.isEmpty()) {
                    item {
                        Text(
                            text = "No brands found",
                            style = MaterialTheme.typography.bodyMedium,
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                            modifier = Modifier.padding(16.dp)
                        )
                    }
                } else {
                    items(results) { name -> BrandItem(name) { onNavigate(name) } }
                }
                item { Spacer(modifier = Modifier.height(16.dp)) }
            }
        }
    }
}

@Composable
fun BrandSectionHeader(title: String) {
    Text(
        text = title,
        style = MaterialTheme.typography.labelMedium,
        fontWeight = FontWeight.Bold,
        color = MaterialTheme.colorScheme.primary,
        modifier = Modifier
            .padding(horizontal = 16.dp)
            .padding(top = 20.dp, bottom = 4.dp)
    )
}

@Composable
fun BrandItem(name: String, onClick: () -> Unit = {}) {
    Text(
        text = name,
        style = MaterialTheme.typography.bodyLarge,
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onClick() }
            .padding(horizontal = 16.dp, vertical = 10.dp)
    )
    HorizontalDivider()
}

@Composable
fun GroupsTab(onNavigate: (String) -> Unit) {
    LazyColumn(modifier = Modifier.fillMaxSize()) {
        item { BrandSectionHeader("Brandmark Group") }
        items(listOf("Allure", "Oasis")) { name -> BrandItem(name) { onNavigate(name) } }

        item { BrandSectionHeader("Casio Computer Co. Ltd") }
        items(listOf("Casio", "G-Shock", "Oceanus")) { name -> BrandItem(name) { onNavigate(name) } }

        item { BrandSectionHeader("Citizen Watch Co. Ltd") }
        items(listOf("Alpina", "Arnold & Son", "Ateliers deMonaco", "Bulova", "Campanola", "Citizen", "Frederique Constant", "La Joux-Perret")) { name -> BrandItem(name) { onNavigate(name) } }

        item { BrandSectionHeader("Compagnie Financière Richemont") }
        items(listOf("A. Lange & Söhne", "Baume & Mercier", "Cartier", "IWC Schaffhausen", "Jaeger-LeCoultre", "Montblanc", "Panerai", "Piaget", "Purdey", "Roger Dubuis", "Vacheron Constantin")) { name -> BrandItem(name) { onNavigate(name) } }

        item { BrandSectionHeader("Festina Group") }
        items(listOf("Calypso", "Candino", "Festina", "Jaguar", "Khronos", "L.Leroy", "Lotus", "Perrelet")) { name -> BrandItem(name) { onNavigate(name) } }

        item { BrandSectionHeader("Fossil Group Inc") }
        items(listOf("Armani Exchange", "Diesel", "DKNY", "Emporio Armani", "Fossil", "Kate Spade New York", "Michael Kors", "Michele", "Relic", "Skagen", "Zodiac")) { name -> BrandItem(name) { onNavigate(name) } }

        item { BrandSectionHeader("Franck Muller Group") }
        items(listOf("Backes & Strauss", "European Company Watch", "Franck Muller")) { name -> BrandItem(name) { onNavigate(name) } }

        item { BrandSectionHeader("Ice Holding Group") }
        items(listOf("Ice-Watch", "Watchpeople")) { name -> BrandItem(name) { onNavigate(name) } }

        item { BrandSectionHeader("Invicta Watch Group") }
        items(listOf("Glycine", "Invicta", "S. Coifman", "TechnoMarine")) { name -> BrandItem(name) { onNavigate(name) } }

        item { BrandSectionHeader("KDDL Group") }
        items(listOf("Favre-Leuba")) { name -> BrandItem(name) { onNavigate(name) } }

        item { BrandSectionHeader("LVMH") }
        items(listOf("Bulgari", "Chaumet", "Gerald Genta", "Hublot", "L'Epée 1839", "TAG Heuer", "Tiffany & Co.", "Zenith")) { name -> BrandItem(name) { onNavigate(name) } }

        item { BrandSectionHeader("Mondaine Group") }
        items(listOf("Luminox", "M-Watch", "Mondaine", "Pierre Cardin")) { name -> BrandItem(name) { onNavigate(name) } }

        item { BrandSectionHeader("Movado Group") }
        items(listOf("Coach", "Concord", "Ebel", "HUGO BOSS", "Lacoste", "MVMT", "Movado", "Olivia Burton", "Rebecca Minkoff", "Tommy Hilfiger")) { name -> BrandItem(name) { onNavigate(name) } }

        item { BrandSectionHeader("Partners Group") }
        items(listOf("Breitling", "Universal Genève")) { name -> BrandItem(name) { onNavigate(name) } }

        item { BrandSectionHeader("Pierre Lannier Group") }
        items(listOf("1977", "Pierre Lannier")) { name -> BrandItem(name) { onNavigate(name) } }

        item { BrandSectionHeader("Point Tec") }
        items(listOf("Bauhaus", "Iron Annie", "Junkers", "Zeppelin")) { name -> BrandItem(name) { onNavigate(name) } }

        item { BrandSectionHeader("Riba Watch Group") }
        items(listOf("GEOVANI", "Murex", "Optima")) { name -> BrandItem(name) { onNavigate(name) } }

        item { BrandSectionHeader("Rolex SA") }
        items(listOf("Rolex", "Tudor")) { name -> BrandItem(name) { onNavigate(name) } }

        item { BrandSectionHeader("Seiko Group Corporation") }
        items(listOf("Credor", "Grand Seiko", "Seiko")) { name -> BrandItem(name) { onNavigate(name) } }

        item { BrandSectionHeader("Swatch Group Ltd") }
        items(listOf("Balmain", "Blancpain", "Breguet", "Calvin Klein", "Certina", "Flik Flak", "Glashütte Original", "Hamilton", "Harry Winston", "Longines", "Mido", "Omega", "Rado", "Swatch", "Tissot", "Union Glashütte")) { name -> BrandItem(name) { onNavigate(name) } }

        item { BrandSectionHeader("Timex Group") }
        items(listOf("Adidas", "Furla", "Gc", "Guess", "Missoni", "Nautica", "Philipp Plein", "Plein Sport", "Salvatore Ferragamo", "Ted Baker", "Timex", "Versace")) { name -> BrandItem(name) { onNavigate(name) } }

        item { BrandSectionHeader("Timeway Group") }
        items(listOf("Clyda", "Maison Montignac", "Orlam")) { name -> BrandItem(name) { onNavigate(name) } }

        item { BrandSectionHeader("Independent Watch Companies") }
        items(listOf("22Studio", "ABP Concept", "Adriatica", "Agelocer", "Airain", "Alexandra Schmitz Art de l'Anglage", "Alto Watches", "Anne Klein", "anOrdain", "Appella", "Arcanaut", "Atlantic", "Auricoste", "Awake", "BA111od", "Beauregard", "Behrens", "Berney", "Bianchet", "Blackout Concept", "B.R.M Chronographes", "Charlie Paris", "CIGA Design", "Claude Meylan", "Cronus Art", "Daniel Wellington", "David Van Heim", "Depancel", "De Rijke & Co", "Dominique Renaud", "Dwiss", "Electra", "Elgé", "Emera", "Eska", "Favre-Bullé", "Felipe Pikullik", "Flux Watches", "Furlan Marri", "Gambrell & Renard", "GoS", "Graham", "Gruppo Gamma", "Haute-Rive", "ID Genève", "Jowissa", "Kelton", "Kerbedanz", "Krayon", "Le Forban Sécurité Mer", "Lobner", "Lorige", "Louis Erard", "Magellan", "Maison Boanton", "Marvin", "Maserati", "Mathey-Tissot", "MB&F", "MHP Horlogerie", "Milus", "Montres Etoile", "Nepro", "Nomadic", "Oisa 1937", "Ollech Wajs", "Pilo & Co Genève", "Poiray Paris", "Porsche Design", "Qian Guobiao", "Raidillon", "Ralf Tech", "Redwood", "Richelieu", "RMS Zeitmeister", "Rodania", "Romago", "RSW", "Saint-Honoré Paris", "Sandoz", "Sinclair Harding", "Squale", "Swiss Military Hanowa", "Titoni", "Utinam", "Von Doren", "Vostok Europe", "Wenger", "White Star Watch", "Wise", "Zannetti")) { name -> BrandItem(name) { onNavigate(name) } }

        item { BrandSectionHeader("Microbrands") }
        items(listOf("5280 Watch Co", "Abordage", "Áigi", "Akrone", "Alanti", "AL-Time", "Aposé", "Ares", "Arilus", "Arken", "Atelier Jalaper", "Atelier Nossedh", "Atelier Wen", "Avi-8", "Baltic", "Beaubleu", "Beaucroft", "Bohen", "Bouveret", "Brew Watch Co.", "Bruno Söhnle", "Buci", "Bvor", "Carlingue", "Champs-Élysées", "Clemence", "Compass", "D1 Milano", "Danubius", "Direnzo", "DONE", "Dufrane", "Echo Neutra", "Epos", "Escudo", "Fathers", "Gavox", "Geylang Watch Co", "Grandval", "Gustave & Cie", "H992", "Halchimy", "HZ Watches", "KNIS", "La Cité Watches", "Laps", "Maison Alcée", "Max Twelve", "McGonigle", "Meridiano", "Mezei Watch Company", "Nalla Neram", "Northern Star Watch", "Ocean Crawler", "OVD", "Paul Hewitt", "Roamer", "Sartory-Billard", "Schaefer & Companions", "Semper Adhuc", "Shelby", "SOVRYGN", "Springer Fersen", "Stil Timepieces", "Thacker & Merali", "Trauffer", "Unison", "Version", "Wancher", "XRby")) { name -> BrandItem(name) { onNavigate(name) } }

        item { Spacer(modifier = Modifier.height(16.dp)) }
    }
}

@Composable
fun CountriesTab(onNavigate: (String) -> Unit) {
    LazyColumn(modifier = Modifier.fillMaxSize()) {
        item { BrandSectionHeader("Australia") }
        items(listOf("HZ Watches")) { name -> BrandItem(name) { onNavigate(name) } }

        item { BrandSectionHeader("Belgium") }
        items(listOf("Gavox", "Ice-Watch", "Raidillon")) { name -> BrandItem(name) { onNavigate(name) } }

        item { BrandSectionHeader("Canada") }
        items(listOf("Alanti", "Beauregard", "La Cité Watches", "Redwood", "Shelby", "SOVRYGN", "Thacker & Merali", "Unison")) { name -> BrandItem(name) { onNavigate(name) } }

        item { BrandSectionHeader("China") }
        items(listOf("Agelocer", "Behrens", "CIGA Design", "Cronus Art", "Qian Guobiao")) { name -> BrandItem(name) { onNavigate(name) } }

        item { BrandSectionHeader("Denmark") }
        items(listOf("Arcanaut")) { name -> BrandItem(name) { onNavigate(name) } }

        item { BrandSectionHeader("England") }
        items(listOf("Bvor", "Sinclair Harding")) { name -> BrandItem(name) { onNavigate(name) } }

        item { BrandSectionHeader("France") }
        items(listOf("1977", "Airain", "Akrone", "Alto Watches", "Aposé", "Auricoste", "Awake", "Bohen", "Bouveret", "B.R.M Chronographes", "Buci", "Carlingue", "Charlie Paris", "Clyda", "Depancel", "Elgé", "Eska", "Grandval", "Gustave & Cie", "Halchimy", "Kelton", "Laps", "L.Leroy", "Le Forban Sécurité Mer", "Lorige", "Maison Alcée", "Maison Boanton", "Maison Montignac", "Meridiano", "MHP Horlogerie", "Poiray Paris", "Ralf Tech", "Saint-Honoré Paris", "Sartory-Billard", "Semper Adhuc", "Springer Fersen", "Utinam", "Version", "XRby")) { name -> BrandItem(name) { onNavigate(name) } }

        item { BrandSectionHeader("Germany") }
        items(listOf("Felipe Pikullik", "Lobner", "Paul Hewitt", "Porsche Design", "RMS Zeitmeister", "Union Glashütte")) { name -> BrandItem(name) { onNavigate(name) } }

        item { BrandSectionHeader("Greece") }
        items(listOf("Stil Timepieces")) { name -> BrandItem(name) { onNavigate(name) } }

        item { BrandSectionHeader("Hong Kong") }
        items(listOf("Electra", "Link2Care", "OVD")) { name -> BrandItem(name) { onNavigate(name) } }

        item { BrandSectionHeader("Ireland") }
        items(listOf("McGonigle", "Nomadic")) { name -> BrandItem(name) { onNavigate(name) } }

        item { BrandSectionHeader("Italy") }
        items(listOf("D1 Milano", "Echo Neutra", "Fathers", "Maserati", "Oisa 1937", "Zannetti")) { name -> BrandItem(name) { onNavigate(name) } }

        item { BrandSectionHeader("Japan") }
        items(listOf("Credor", "KNIS", "Wancher")) { name -> BrandItem(name) { onNavigate(name) } }

        item { BrandSectionHeader("Lithuania") }
        items(listOf("Vostok Europe")) { name -> BrandItem(name) { onNavigate(name) } }

        item { BrandSectionHeader("Netherlands") }
        items(listOf("De Rijke & Co")) { name -> BrandItem(name) { onNavigate(name) } }

        item { BrandSectionHeader("Norway") }
        items(listOf("Von Doren")) { name -> BrandItem(name) { onNavigate(name) } }

        item { BrandSectionHeader("Romania") }
        items(listOf("Danubius")) { name -> BrandItem(name) { onNavigate(name) } }

        item { BrandSectionHeader("Singapore") }
        items(listOf("Geylang Watch Co", "Gruppo Gamma")) { name -> BrandItem(name) { onNavigate(name) } }

        item { BrandSectionHeader("Sweden") }
        items(listOf("Atelier Nossedh", "Daniel Wellington", "GoS")) { name -> BrandItem(name) { onNavigate(name) } }

        item { BrandSectionHeader("Switzerland") }
        items(listOf("Adriatica", "Alexandra Schmitz Art de l'Anglage", "Appella", "Atlantic", "BA111od", "Berney", "Bianchet", "Blackout Concept", "Champs-Élysées", "Claude Meylan", "David Van Heim", "Direnzo", "Dominique Renaud", "DONE", "Dwiss", "Emera", "Epos", "Favre-Bullé", "Favre-Leuba", "Furlan Marri", "GEOVANI", "Gerald Genta", "Glycine", "Graham", "Haute-Rive", "ID Genève", "Jowissa", "Kerbedanz", "Krayon", "L'Epée 1839", "Louis Erard", "Magellan", "Marvin", "Max Twelve", "Mathey-Tissot", "MB&F", "Milus", "Montres Etoile", "Murex", "Nalla Neram", "Nepro", "Ollech Wajs", "Optima", "Orlam", "Perrelet", "Pilo & Co Genève", "Richelieu", "Roamer", "Rodania", "Romago", "RSW", "Sandoz", "Schaefer & Companions", "Squale", "Swiss Military Hanowa", "Titoni", "Trauffer", "Watchpeople", "Wenger", "White Star Watch")) { name -> BrandItem(name) { onNavigate(name) } }

        item { BrandSectionHeader("Taiwan") }
        items(listOf("22Studio")) { name -> BrandItem(name) { onNavigate(name) } }

        item { BrandSectionHeader("Thailand") }
        items(listOf("Wise")) { name -> BrandItem(name) { onNavigate(name) } }

        item { BrandSectionHeader("United Kingdom") }
        items(listOf("anOrdain", "Clemence", "Escudo", "Mezei Watch Company")) { name -> BrandItem(name) { onNavigate(name) } }

        item { BrandSectionHeader("United States of America") }
        items(listOf("Anne Klein", "Compass", "Dufrane", "Flux Watches", "Gambrell & Renard", "Garmin", "Invicta", "Northern Star Watch", "Ocean Crawler", "S. Coifman", "TechnoMarine")) { name -> BrandItem(name) { onNavigate(name) } }

        item { Spacer(modifier = Modifier.height(16.dp)) }
    }
}

@Composable
fun ConnectedTab(onNavigate: (String) -> Unit) {
    LazyColumn(modifier = Modifier.fillMaxSize()) {
        item { BrandSectionHeader("Traditional Brands") }
        items(listOf("Breitling", "Girard-Perregaux", "Hublot", "Ice-Watch", "Louis Vuitton", "Montblanc", "Omega", "Seiko", "TAG Heuer", "Tissot")) { name -> BrandItem(name) { onNavigate(name) } }

        item { BrandSectionHeader("Tech Brands") }
        items(listOf("Apple", "Garmin", "Google", "Link2Care", "Porsche Design", "Samsung", "Withings")) { name -> BrandItem(name) { onNavigate(name) } }

        item { Spacer(modifier = Modifier.height(16.dp)) }
    }
}

val allBrands = listOf(
        "(A)LT|SYM", "A. Lange & Söhne", "Abordage Horlogerie", "Abingdon Co.", "Accutron",
        "Adidas", "Adriatica", "Aerowatch", "Agelocer", "Alto Watches", "Apple", "Áigi",
        "Airain", "Akrone", "Alanti", "AL-Time", "Alpina", "Alexander Shorokhoff",
        "Alexandra Schmitz Art de l'Anglage", "Angelus", "Anne Klein", "Anonimo", "anOrdain",
        "Aposé", "Appella", "AquaStar", "Arcanaut", "Ares", "Arilus", "Arken", "Arnold & Son",
        "Armani Exchange", "Armin Strom", "Artya Geneve", "Ateliers deMonaco", "Atelier Jalaper",
        "Atelier Nossedh", "Atelier Wen", "Atlantic", "Audemars Piguet", "Auricoste", "AV86",
        "AVI-8", "Awake", "BA111od", "Backes & Strauss", "Ball", "Balmain", "Baltic", "Bauhaus",
        "Baume & Mercier", "BeauBleu", "Beaucroft", "Beauregard", "Behrens", "Bell & Ross",
        "Benrus", "Bering", "Berney", "Bianchet", "Blackout Concept", "Blancpain", "Bohen",
        "Bomberg", "HUGO BOSS", "Bouveret", "Breguet", "Breitling", "Bremont", "Brew Watch Co.",
        "Briston", "B.R.M Chronographes", "Bruno Söhnle", "Buci", "Bulgari", "Bvor", "Bulova",
        "Calvin Klein", "Calypso", "Campanola", "Candino", "Carl F. Bucherer", "Carlingue",
        "Cartier", "Casio", "Certina", "Champs-Élysées", "Chanel", "Charlie Paris", "Charriol",
        "Chaumet", "Chopard", "Christiaan Van Der Klaauw", "Christopher Ward", "Chronoswiss",
        "CIGA Design", "Citizen", "Claude Meylan", "Clemence", "Cluse", "Clyda", "Coach",
        "Compass", "Concord", "Corum", "Credor", "Cronus Art", "Cyrus Genève", "Czapek & Cie",
        "D1 Milano", "Daniel Wellington", "Danubius", "David Van Heim", "Delma", "Depancel",
        "De Rijke & Co", "Diesel", "Dior", "Direnzo", "DKNY", "Dominique Renaud", "DONE",
        "Doxa", "Dufrane", "Dwiss", "Ebel", "Eberhard & Co.", "Echo Neutra", "Edox", "Electra",
        "Elgé", "Emera", "Emporio Armani", "Epos", "Escudo", "Eska", "Eterna", "Fathers",
        "Favre-Bullé", "Favre-Leuba", "Felipe Pikullik", "Ferdinand Berthoud", "Ferragamo",
        "Festina", "Flik Flak", "Flux Watches", "Fossil", "Franck Muller", "Frédérique Constant",
        "Furla", "Furlan Marri", "G-Shock", "Gambrell & Renard", "Garmin", "Gavox", "Gc",
        "GEOVANI", "Gerald Genta", "Geylang Watch Co", "Girard-Perregaux", "Glashütte Original",
        "Glycine", "GoS", "Google", "Graham", "Grand Seiko", "Grandval", "Grönefeld",
        "Gruppo Gamma", "Gucci", "Guess", "Gustave & Cie", "H. Moser & Cie.", "Halchimy",
        "Hamilton", "Harry Winston", "Haute-Rive", "Hautlence", "H992", "Hublot", "HZ Watches",
        "ID Genève", "Ice-Watch", "Invicta", "Iron Annie", "IWC Schaffhausen", "Jacob & Co.",
        "Jaeger-LeCoultre", "Jaguar", "Jaquet Droz", "Jowissa", "Junghans", "Junkers",
        "Kate Spade New York", "Kelton", "Kerbedanz", "KNIS", "Krayon", "La Cité Watches",
        "Lacoste", "Laps", "Laurent Ferrier", "Le Forban Sécurité Mer", "L'Epée 1839",
        "L.Leroy", "Link2Care", "Lobner", "Longines", "Lorige", "Lotus", "Louis Erard",
        "Louis Moinet", "Luminox", "Maison Alcée", "Maison Boanton", "Maison Montignac",
        "Magellan", "Marvin", "Maserati", "Mathey-Tissot", "Maurice Lacroix", "Max Twelve",
        "MB&F", "McGonigle", "MeisterSinger", "Meridiano", "MHP Horlogerie", "Mezei Watch Company",
        "Michael Kors", "Michele", "Mido", "Milus", "Missoni", "Mondaine", "Montblanc",
        "Montres Etoile", "Movado", "Mühle Glashütte", "Murex", "MVMT", "Nalla Neram",
        "Nautica", "Nepro", "Nivada Grenchen", "Nomadic", "Nomos Glashütte", "Northern Star Watch",
        "Norqain", "Ocean Crawler", "Oceanus", "Oisa 1937", "Olivia Burton", "Ollech Wajs",
        "Omega", "Optima", "Oris", "Orlam", "OVD", "Panerai", "Parmigiani Fleurier",
        "Patek Philippe", "Paul Hewitt", "Perrelet", "Philipp Plein", "Piaget", "Pierre Cardin",
        "Pierre Lannier", "Pilo & Co Genève", "Plein Sport", "Poiray Paris", "Porsche Design",
        "Qian Guobiao", "Rado", "Raidillon", "Ralf Tech", "Raymond Weil", "Redwood", "Richelieu",
        "RMS Zeitmeister", "Roamer", "Rodania", "Roger Dubuis", "Rolex", "Romago", "RSW",
        "Saint-Honoré Paris", "Samsung", "Sandoz", "Sartory-Billard", "Schaefer & Companions",
        "Seiko", "Semper Adhuc", "Shelby", "Sinclair Harding", "Skagen", "SOVRYGN",
        "Springer Fersen", "Squale", "Stil Timepieces", "Swiss Military Hanowa", "S. Coifman",
        "TAG Heuer", "TechnoMarine", "Ted Baker", "Thacker & Merali", "Tiffany & Co.", "Timex",
        "Tissot", "Titoni", "Tommy Hilfiger", "Trauffer", "Tudor", "22Studio", "Union Glashütte",
        "Unison", "Utinam", "Vacheron Constantin", "Versace", "Version", "Victorinox",
        "Von Doren", "Vostok Europe", "Vulcain", "Wancher", "Watchpeople", "Wenger",
        "White Star Watch", "Wise", "Withings", "XRby", "Yema", "Zannetti", "Zenith",
        "Zeppelin", "Zodiac", "5280 Watch Co."
)

@Composable
fun AlphabeticalTab(onNavigate: (String) -> Unit) {
    LazyColumn(modifier = Modifier.fillMaxSize()) {
        items(allBrands) { name -> BrandItem(name) { onNavigate(name) } }
        item { Spacer(modifier = Modifier.height(16.dp)) }
    }
}