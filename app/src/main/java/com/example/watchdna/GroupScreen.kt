package com.example.watchdna

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

data class WatchGroup(
    val name: String,
    val description: String,
    val brands: List<String>
)

val groups = listOf(
    WatchGroup("Casio Computer Co. Ltd", "Casio, founded in 1946, became a digital watch pioneer with the 1974 CASIOTRON and cemented its legacy through iconic innovations like G-Shock, Pro Trek, Edifice, and the luxury-focused Oceanus.", listOf("Casio", "G-Shock", "Oceanus")),
    WatchGroup("Citizen Watch Co. Ltd", "Citizen Watch Co. Ltd., founded in 1918, has grown into a global horological powerhouse known for Eco-Drive technology and innovation, with a diverse portfolio that includes Citizen, Bulova, Accutron, Frederique Constant, Alpina, Campanola, and Arnold & Son.", listOf("Alpina", "Arnold & Son", "Ateliers deMonaco", "Bulova", "Campanola", "Citizen", "Frederique Constant", "La Joux-Perret")),
    WatchGroup("Compagnie Financière Richemont SA", "Compagnie Financière Richemont SA, founded in 1988 by Johann Rupert, is a global luxury powerhouse that owns a diverse portfolio of historic watch and jewelry Maisons, including Cartier, Vacheron Constantin, and IWC, and is renowned for preserving craftsmanship while embracing innovation.", listOf("A. Lange & Söhne", "Baume & Mercier", "Cartier", "IWC Schaffhausen", "Jaeger-LeCoultre", "Montblanc", "Panerai", "Piaget", "Purdey", "Roger Dubuis", "Vacheron Constantin")),
    WatchGroup("Festina Group", "The Festina Group, a Spanish watch conglomerate founded in 1984, owns and operates several global watch brands—including Festina, Jaguar, Candino, Lotus, and Calypso—offering a range of Swiss-made and fashion-forward timepieces across various price points, with a strong heritage in sports marketing and cycling.", listOf("Calypso", "Candino", "Festina", "Jaguar", "Khronos", "L.Leroy", "Lotus", "Perrelet")),
    WatchGroup("Fossil Group Inc", "The Fossil Group, founded in 1984, has grown into one of the world's largest watch manufacturers, producing both in-house and licensed timepieces for brands like Armani Exchange, Diesel, DKNY, Kate Spade, Michele, Zodiac, and Skagen, each representing a unique design identity and market segment.", listOf("Armani Exchange", "Diesel", "DKNY", "Emporio Armani", "Fossil", "Kate Spade New York", "Michael Kors", "Michele", "Relic", "Skagen", "Zodiac")),
    WatchGroup("Franck Muller Group", "The Franck Muller Group, though small in size, is a respected Swiss watchmaking powerhouse that includes Franck Muller, Pierre Kunz, and Backes & Strauss, each known for bold designs, technical mastery, and distinctive identities.", listOf("Backes & Strauss", "European Company Watch", "Franck Muller")),
    WatchGroup("Invicta Watch Group", "Invicta Watch Group traces its origins to 1837, when Raphael Picard founded the company in La Chaux-de-Fonds, Switzerland. Originally dedicated to crafting high-quality mechanical watches at accessible prices, the brand's name—Invicta, meaning \"invincible\" in Latin—has long represented resilience and innovation in watchmaking.", listOf("Glycine", "Invicta", "S. Coifman", "TechnoMarine")),
    WatchGroup("LVMH", "LVMH, while best known for fashion, champagne, and spirits, has become a major force in watchmaking through its ownership of innovative and iconic brands like TAG Heuer, Tiffany & Co, Hublot, Zenith, Bulgari, Chaumet, and Daniel Roth.", listOf("Bulgari", "Chaumet", "Gerald Genta", "Hublot", "L'Epée 1839", "TAG Heuer", "Tiffany & Co.", "Zenith")),
    WatchGroup("Mondaine Group", "The Mondaine Group is a family-owned Swiss watchmaker that oversees four distinctive brands—Mondaine, Luminox, Pierre Cardin, and M-Watch—each tailored to different audiences, from iconic rail-inspired designs to rugged tactical gear and affordable fashion watches.", listOf("Luminox", "M-Watch", "Mondaine", "Pierre Cardin")),
    WatchGroup("Movado Group Inc.", "The Movado Group Inc. is a leading global watch company that strategically combines heritage and fashion through its owned brands like Movado, MVMT, Olivia Burton, Concord, and Ebel, as well as licensed fashion labels such as Coach, Tommy Hilfiger, Hugo Boss, and Lacoste.", listOf("Coach", "Concord", "Ebel", "HUGO BOSS", "Lacoste", "MVMT", "Movado", "Olivia Burton", "Rebecca Minkoff", "Tommy Hilfiger")),
    WatchGroup("Partners Group", "Partners Group, a Swiss private equity firm with over \$100 billion in assets under management, has expanded into the watch industry by acquiring a majority stake in Breitling, followed by the acquisitions of Universal Genève in 2023 and Gallet in 2025.", listOf("Breitling", "Universal Genève")),
    WatchGroup("Point Tec", "Point Tec is a German watch company that revives historic brands like Zeppelin, Iron Annie, Bauhaus, and Ruhla, blending traditional craftsmanship with modern design at accessible prices.", listOf("Bauhaus", "Iron Annie", "Junkers", "Zeppelin")),
    WatchGroup("Riba Watch Group", "Riba Watch Group, founded in 1995 by Lebanese-born entrepreneur Wasfi Taher, is a multi-brand Swiss watch group headquartered in La Chaux-de-Fonds, Switzerland. The group is recognized for its expertise in the design, manufacturing, and distribution of Swiss-Made watches, jewellery, and horological components.", listOf("GEOVANI", "Murex", "Optima")),
    WatchGroup("Rolex SA", "Rolex SA, the privately held company behind Rolex and Tudor, is one of the world's most successful and secretive luxury watchmakers, operating under the Hans Wilsdorf Foundation to ensure long-term independence and excellence.", listOf("Rolex", "Tudor")),
    WatchGroup("Seiko Group Corporation", "Seiko Corporation, founded in 1881, is a leading Japanese watchmaking conglomerate renowned for its technological innovation, vertical integration, and two flagship brands: Seiko and Grand Seiko, which together span the spectrum from accessible craftsmanship to high-end luxury horology.", listOf("Credor", "Grand Seiko", "Seiko")),
    WatchGroup("Swatch Group Ltd", "The Swatch Group, founded in 1983 to save the Swiss watch industry, now operates one of the most diversified portfolios in watchmaking, spanning from accessible fashion watches to some of the world's most prestigious luxury timepieces.", listOf("Balmain", "Blancpain", "Breguet", "Calvin Klein", "Certina", "Flik Flak", "Glashütte Original", "Hamilton", "Harry Winston", "Longines", "Mido", "Omega", "Rado", "Swatch", "Tissot", "Union Glashütte")),
    WatchGroup("Timex Group", "Timex Group is a historic American watchmaker known for its accessible, durable timepieces and global brand portfolio that includes Timex, Nautica, Guess, Versace, Versus Versace, and Ferragamo watches, spanning from entry-level to premium segments.", listOf("Adidas", "Furla", "Gc", "Guess", "Missoni", "Nautica", "Philipp Plein", "Plein Sport", "Salvatore Ferragamo", "Ted Baker", "Timex", "Versace"))
)

@Composable
fun GroupsScreen(modifier: Modifier = Modifier) {
    LazyColumn(modifier = modifier.fillMaxSize()) {
        items(groups) { group ->
            GroupCard(group)
        }
        item { Spacer(modifier = Modifier.height(16.dp)) }
    }
}

@Composable
fun GroupCard(group: WatchGroup) {
    Column(modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)) {
        Text(group.name, style = MaterialTheme.typography.titleMedium, fontWeight = FontWeight.Bold, color = MaterialTheme.colorScheme.primary)
        Spacer(modifier = Modifier.height(4.dp))
        Text(group.description, style = MaterialTheme.typography.bodyMedium, color = MaterialTheme.colorScheme.onSurfaceVariant)
        Spacer(modifier = Modifier.height(6.dp))
        Text(group.brands.joinToString(" · "), style = MaterialTheme.typography.bodySmall)
        Spacer(modifier = Modifier.height(8.dp))
        HorizontalDivider()
    }
}