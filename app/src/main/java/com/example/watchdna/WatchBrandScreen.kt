package com.example.watchdna

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun WatchBrandsScreen(modifier: Modifier = Modifier) {
    var selectedTab by remember { mutableStateOf(0) }
    val tabs = listOf("Groups", "Countries", "Connected", "Alphabetical")

    Column(modifier = modifier) {
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
            0 -> GroupsTab()
            1 -> CountriesTab()
            2 -> ConnectedTab()
            3 -> AlphabeticalTab()
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
fun BrandItem(name: String) {
    Text(
        text = name,
        style = MaterialTheme.typography.bodyLarge,
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 10.dp)
    )
    HorizontalDivider()
}

@Composable
fun GroupsTab() {
    LazyColumn(modifier = Modifier.fillMaxSize()) {
        item { BrandSectionHeader("Brandmark Group") }
        items(listOf("Allure", "Oasis")) { BrandItem(it) }

        item { BrandSectionHeader("Casio Computer Co. Ltd") }
        items(listOf("Casio", "G-Shock", "Oceanus")) { BrandItem(it) }

        item { BrandSectionHeader("Citizen Watch Co. Ltd") }
        items(listOf("Alpina", "Arnold & Son", "Ateliers deMonaco", "Bulova", "Campanola", "Citizen", "Frederique Constant", "La Joux-Perret")) { BrandItem(it) }

        item { BrandSectionHeader("Compagnie Financière Richemont") }
        items(listOf("A. Lange & Söhne", "Baume & Mercier", "Cartier", "IWC Schaffhausen", "Jaeger-LeCoultre", "Montblanc", "Panerai", "Piaget", "Purdey", "Roger Dubuis", "Vacheron Constantin")) { BrandItem(it) }

        item { BrandSectionHeader("Festina Group") }
        items(listOf("Calypso", "Candino", "Festina", "Jaguar", "Khronos", "L.Leroy", "Lotus", "Perrelet")) { BrandItem(it) }

        item { BrandSectionHeader("Fossil Group Inc") }
        items(listOf("Armani Exchange", "Diesel", "DKNY", "Emporio Armani", "Fossil", "Kate Spade New York", "Michael Kors", "Michele", "Relic", "Skagen", "Zodiac")) { BrandItem(it) }

        item { BrandSectionHeader("Franck Muller Group") }
        items(listOf("Backes & Strauss", "European Company Watch", "Franck Muller")) { BrandItem(it) }

        item { BrandSectionHeader("Ice Holding Group") }
        items(listOf("Ice-Watch", "Watchpeople")) { BrandItem(it) }

        item { BrandSectionHeader("Invicta Watch Group") }
        items(listOf("Glycine", "Invicta", "S. Coifman", "TechnoMarine")) { BrandItem(it) }

        item { BrandSectionHeader("KDDL Group") }
        items(listOf("Favre-Leuba")) { BrandItem(it) }

        item { BrandSectionHeader("LVMH") }
        items(listOf("Bulgari", "Chaumet", "Gerald Genta", "Hublot", "L'Epée 1839", "TAG Heuer", "Tiffany & Co.", "Zenith")) { BrandItem(it) }

        item { BrandSectionHeader("Mondaine Group") }
        items(listOf("Luminox", "M-Watch", "Mondaine", "Pierre Cardin")) { BrandItem(it) }

        item { BrandSectionHeader("Movado Group") }
        items(listOf("Coach", "Concord", "Ebel", "HUGO BOSS", "Lacoste", "MVMT", "Movado", "Olivia Burton", "Rebecca Minkoff", "Tommy Hilfiger")) { BrandItem(it) }

        item { BrandSectionHeader("Partners Group") }
        items(listOf("Breitling", "Universal Genève")) { BrandItem(it) }

        item { BrandSectionHeader("Pierre Lannier Group") }
        items(listOf("1977", "Pierre Lannier")) { BrandItem(it) }

        item { BrandSectionHeader("Point Tec") }
        items(listOf("Bauhaus", "Iron Annie", "Junkers", "Zeppelin")) { BrandItem(it) }

        item { BrandSectionHeader("Riba Watch Group") }
        items(listOf("GEOVANI", "Murex", "Optima")) { BrandItem(it) }

        item { BrandSectionHeader("Rolex SA") }
        items(listOf("Rolex", "Tudor")) { BrandItem(it) }

        item { BrandSectionHeader("Seiko Group Corporation") }
        items(listOf("Credor", "Grand Seiko", "Seiko")) { BrandItem(it) }

        item { BrandSectionHeader("Swatch Group Ltd") }
        items(listOf("Balmain", "Blancpain", "Breguet", "Calvin Klein", "Certina", "Flik Flak", "Glashütte Original", "Hamilton", "Harry Winston", "Longines", "Mido", "Omega", "Rado", "Swatch", "Tissot", "Union Glashütte")) { BrandItem(it) }

        item { BrandSectionHeader("Timex Group") }
        items(listOf("Adidas", "Furla", "Gc", "Guess", "Missoni", "Nautica", "Philipp Plein", "Plein Sport", "Salvatore Ferragamo", "Ted Baker", "Timex", "Versace")) { BrandItem(it) }

        item { BrandSectionHeader("Timeway Group") }
        items(listOf("Clyda", "Maison Montignac", "Orlam")) { BrandItem(it) }

        item { BrandSectionHeader("Independent Watch Companies") }
        items(listOf("22Studio", "ABP Concept", "Adriatica", "Agelocer", "Airain", "Alexandra Schmitz Art de l'Anglage", "Alto Watches", "Anne Klein", "anOrdain", "Appella", "Arcanaut", "Atlantic", "Auricoste", "Awake", "BA111od", "Beauregard", "Behrens", "Berney", "Bianchet", "Blackout Concept", "B.R.M Chronographes", "Charlie Paris", "CIGA Design", "Claude Meylan", "Cronus Art", "Daniel Wellington", "David Van Heim", "Depancel", "De Rijke & Co", "Dominique Renaud", "Dwiss", "Electra", "Elgé", "Emera", "Eska", "Favre-Bullé", "Felipe Pikullik", "Flux Watches", "Furlan Marri", "Gambrell & Renard", "GoS", "Graham", "Gruppo Gamma", "Haute-Rive", "ID Genève", "Jowissa", "Kelton", "Kerbedanz", "Krayon", "Le Forban Sécurité Mer", "Lobner", "Lorige", "Louis Erard", "Magellan", "Maison Boanton", "Marvin", "Maserati", "Mathey-Tissot", "MB&F", "MHP Horlogerie", "Milus", "Montres Etoile", "Nepro", "Nomadic", "Oisa 1937", "Ollech Wajs", "Pilo & Co Genève", "Poiray Paris", "Porsche Design", "Qian Guobiao", "Raidillon", "Ralf Tech", "Redwood", "Richelieu", "RMS Zeitmeister", "Rodania", "Romago", "RSW", "Saint-Honoré Paris", "Sandoz", "Sinclair Harding", "Squale", "Swiss Military Hanowa", "Titoni", "Utinam", "Von Doren", "Vostok Europe", "Wenger", "White Star Watch", "Wise", "Zannetti")) { BrandItem(it) }

        item { BrandSectionHeader("Microbrands") }
        items(listOf("5280 Watch Co", "Abordage", "Áigi", "Akrone", "Alanti", "AL-Time", "Aposé", "Ares", "Arilus", "Arken", "Atelier Jalaper", "Atelier Nossedh", "Atelier Wen", "Avi-8", "Baltic", "Beaubleu", "Beaucroft", "Bohen", "Bouveret", "Brew Watch Co.", "Bruno Söhnle", "Buci", "Bvor", "Carlingue", "Champs-Élysées", "Clemence", "Compass", "D1 Milano", "Danubius", "Direnzo", "DONE", "Dufrane", "Echo Neutra", "Epos", "Escudo", "Fathers", "Gavox", "Geylang Watch Co", "Grandval", "Gustave & Cie", "H992", "Halchimy", "HZ Watches", "KNIS", "La Cité Watches", "Laps", "Maison Alcée", "Max Twelve", "McGonigle", "Meridiano", "Mezei Watch Company", "Nalla Neram", "Northern Star Watch", "Ocean Crawler", "OVD", "Paul Hewitt", "Roamer", "Sartory-Billard", "Schaefer & Companions", "Semper Adhuc", "Shelby", "SOVRYGN", "Springer Fersen", "Stil Timepieces", "Thacker & Merali", "Trauffer", "Unison", "Version", "Wancher", "XRby")) { BrandItem(it) }

        item { Spacer(modifier = Modifier.height(16.dp)) }
    }
}

@Composable
fun CountriesTab() {
    LazyColumn(modifier = Modifier.fillMaxSize()) {
        item { BrandSectionHeader("Australia") }
        items(listOf("HZ Watches")) { BrandItem(it) }

        item { BrandSectionHeader("Belgium") }
        items(listOf("Gavox", "Ice-Watch", "Raidillon")) { BrandItem(it) }

        item { BrandSectionHeader("Canada") }
        items(listOf("Alanti", "Beauregard", "La Cité Watches", "Redwood", "Shelby", "SOVRYGN", "Thacker & Merali", "Unison")) { BrandItem(it) }

        item { BrandSectionHeader("China") }
        items(listOf("Agelocer", "Behrens", "CIGA Design", "Cronus Art", "Qian Guobiao")) { BrandItem(it) }

        item { BrandSectionHeader("Denmark") }
        items(listOf("Arcanaut")) { BrandItem(it) }

        item { BrandSectionHeader("England") }
        items(listOf("Bvor", "Sinclair Harding")) { BrandItem(it) }

        item { BrandSectionHeader("France") }
        items(listOf("1977", "Airain", "Akrone", "Alto Watches", "Aposé", "Auricoste", "Awake", "Bohen", "Bouveret", "B.R.M Chronographes", "Buci", "Carlingue", "Charlie Paris", "Clyda", "Depancel", "Elgé", "Eska", "Grandval", "Gustave & Cie", "Halchimy", "Kelton", "Laps", "L.Leroy", "Le Forban Sécurité Mer", "Lorige", "Maison Alcée", "Maison Boanton", "Maison Montignac", "Meridiano", "MHP Horlogerie", "Poiray Paris", "Ralf Tech", "Saint-Honoré Paris", "Sartory-Billard", "Semper Adhuc", "Springer Fersen", "Utinam", "Version", "XRby")) { BrandItem(it) }

        item { BrandSectionHeader("Germany") }
        items(listOf("Felipe Pikullik", "Lobner", "Paul Hewitt", "Porsche Design", "RMS Zeitmeister", "Union Glashütte")) { BrandItem(it) }

        item { BrandSectionHeader("Greece") }
        items(listOf("Stil Timepieces")) { BrandItem(it) }

        item { BrandSectionHeader("Hong Kong") }
        items(listOf("Electra", "Link2Care", "OVD")) { BrandItem(it) }

        item { BrandSectionHeader("Ireland") }
        items(listOf("McGonigle", "Nomadic")) { BrandItem(it) }

        item { BrandSectionHeader("Italy") }
        items(listOf("D1 Milano", "Echo Neutra", "Fathers", "Maserati", "Oisa 1937", "Zannetti")) { BrandItem(it) }

        item { BrandSectionHeader("Japan") }
        items(listOf("Credor", "KNIS", "Wancher")) { BrandItem(it) }

        item { BrandSectionHeader("Lithuania") }
        items(listOf("Vostok Europe")) { BrandItem(it) }

        item { BrandSectionHeader("Netherlands") }
        items(listOf("De Rijke & Co")) { BrandItem(it) }

        item { BrandSectionHeader("Norway") }
        items(listOf("Von Doren")) { BrandItem(it) }

        item { BrandSectionHeader("Romania") }
        items(listOf("Danubius")) { BrandItem(it) }

        item { BrandSectionHeader("Singapore") }
        items(listOf("Geylang Watch Co", "Gruppo Gamma")) { BrandItem(it) }

        item { BrandSectionHeader("Sweden") }
        items(listOf("Atelier Nossedh", "Daniel Wellington", "GoS")) { BrandItem(it) }

        item { BrandSectionHeader("Switzerland") }
        items(listOf("Adriatica", "Alexandra Schmitz Art de l'Anglage", "Appella", "Atlantic", "BA111od", "Berney", "Bianchet", "Blackout Concept", "Champs-Élysées", "Claude Meylan", "David Van Heim", "Direnzo", "Dominique Renaud", "DONE", "Dwiss", "Emera", "Epos", "Favre-Bullé", "Favre-Leuba", "Furlan Marri", "GEOVANI", "Gerald Genta", "Glycine", "Graham", "Haute-Rive", "ID Genève", "Jowissa", "Kerbedanz", "Krayon", "L'Epée 1839", "Louis Erard", "Magellan", "Marvin", "Max Twelve", "Mathey-Tissot", "MB&F", "Milus", "Montres Etoile", "Murex", "Nalla Neram", "Nepro", "Ollech Wajs", "Optima", "Orlam", "Perrelet", "Pilo & Co Genève", "Richelieu", "Roamer", "Rodania", "Romago", "RSW", "Sandoz", "Schaefer & Companions", "Squale", "Swiss Military Hanowa", "Titoni", "Trauffer", "Watchpeople", "Wenger", "White Star Watch")) { BrandItem(it) }

        item { BrandSectionHeader("Taiwan") }
        items(listOf("22Studio")) { BrandItem(it) }

        item { BrandSectionHeader("Thailand") }
        items(listOf("Wise")) { BrandItem(it) }

        item { BrandSectionHeader("United Kingdom") }
        items(listOf("anOrdain", "Clemence", "Escudo", "Mezei Watch Company")) { BrandItem(it) }

        item { BrandSectionHeader("United States of America") }
        items(listOf("Anne Klein", "Compass", "Dufrane", "Flux Watches", "Gambrell & Renard", "Garmin", "Invicta", "Northern Star Watch", "Ocean Crawler", "S. Coifman", "TechnoMarine")) { BrandItem(it) }

        item { Spacer(modifier = Modifier.height(16.dp)) }
    }
}

@Composable
fun ConnectedTab() {
    LazyColumn(modifier = Modifier.fillMaxSize()) {
        item { BrandSectionHeader("Traditional Brands") }
        items(listOf("Breitling", "Girard-Perregaux", "Hublot", "Ice-Watch", "Louis Vuitton", "Montblanc", "Omega", "Seiko", "TAG Heuer", "Tissot")) { BrandItem(it) }

        item { BrandSectionHeader("Tech Brands") }
        items(listOf("Apple", "Garmin", "Google", "Link2Care", "Porsche Design", "Samsung", "Withings")) { BrandItem(it) }

        item { Spacer(modifier = Modifier.height(16.dp)) }
    }
}

@Composable
fun AlphabeticalTab() {
    val brands = listOf(
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

    LazyColumn(modifier = Modifier.fillMaxSize()) {
        items(brands) { BrandItem(it) }
        item { Spacer(modifier = Modifier.height(16.dp)) }
    }
}