package com.example.watchdna

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun AwardScreen(title: String, body: String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .verticalScroll(rememberScrollState())
            .padding(16.dp)
            .padding(bottom = 16.dp)
    ) {
        Text(title, style = MaterialTheme.typography.titleLarge, fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(12.dp))
        Text(body, style = MaterialTheme.typography.bodyMedium, color = MaterialTheme.colorScheme.onSurfaceVariant)
    }
}

@Composable
fun AlexanderAwardsScreen(modifier: Modifier = Modifier) {
    AwardScreen(
        title = "The Alexander Awards",
        body = "The Alexander Awards is an annual recognition program celebrating creative excellence in the watch industry. Created by Poseidon & Co., the awards honor the most remarkable campaigns, content, and initiatives in watch communication — recognizing outstanding work across 8 categories including Brand Experience & Retail, Campaign, Content Series, CSR Initiative, Film & Animation, Partnership & Influence, Photography, and Technological & AI Innovation in Communication.\n\nSpecial recognition awards include Young Talent, THE GREAT! grand prize, and the Public Choice Award. The 2026 awards ceremony will take place on December 2, 2026 in Geneva, Switzerland.",
        modifier = modifier
    )
}

@Composable
fun TimepieceWorldAwardsScreen(modifier: Modifier = Modifier) {
    AwardScreen(
        title = "Timepiece World Awards",
        body = "The 2025 Timepiece World Awards were created to recognize exceptional achievement globally in timepiece design and innovation in the Horology Industry. The awards recognize timepiece design achievement in 11 different categories and an additional people's choice category for the finalists of all the categories.\n\nThe finalist grouping of each category and winning selection of each finalist group are determined by a confidential vote of the selected Timepiece World award 2025 committee members and jurors. The 2025 list of award-winners will be announced at the 1st annual Timepiece World awards ceremony that will take place on Saturday, September 20, 2025 in Toronto, Canada.",
        modifier = modifier
    )
}

@Composable
fun TemporisAwardsScreen(modifier: Modifier = Modifier) {
    AwardScreen(
        title = "Temporis International Awards",
        body = "The Temporis International Awards 2025, founded by Dan Vardie, are a global celebration of innovation, craftsmanship, and storytelling in contemporary watchmaking. Now in its 12th edition, the awards honor excellence across 12 diverse categories, including sustainable, connected, complication, and everyday watches.\n\nWhat sets TIA apart is its unique hybrid model: a panel of international experts selects the finalists, while the global public casts votes online to determine the winners. The 2025 edition will take place in Zurich on October 2, with voting already open for the \"Masterpiece\" category, which highlights standout pieces from Watches & Wonders Geneva.",
        modifier = modifier
    )
}

@Composable
fun GPHGScreen(modifier: Modifier = Modifier) {
    AwardScreen(
        title = "Grand Prix d'Horlogerie de Genève",
        body = "Founded in 2001, the Grand Prix d'Horlogerie de Genève (GPHG) is often called \"the Oscars of watchmaking,\" celebrating the year's most exceptional creations and promoting watchmaking art worldwide.\n\nHeld every November in Geneva, it features around 20 awards across categories such as Ladies', Men's, Chronograph, Tourbillon, Sports, Jewellery, Artistic Crafts, and Iconic, plus special prizes like Petite Aiguille, Eco-Innovation, and Horological Revelation. Finalists are shortlisted by the GPHG Academy and judged by a 30-member international jury of experts.\n\nThe 2024 edition, hosted at Geneva's Théâtre du Léman, saw IWC's Portugieser Eternal Calendar win the Aiguille d'Or, Van Cleef & Arpels sweep the women's categories, and independents like Rémy Cools and Ming take top honors. Chopard also earned the inaugural Eco-Innovation prize, reflecting the GPHG's growing focus on sustainability.",
        modifier = modifier
    )
}

@Composable
fun HongKongDesignCompetitionScreen(modifier: Modifier = Modifier) {
    AwardScreen(
        title = "Hong Kong Watch & Clock Design Competition",
        body = "The 42nd Hong Kong Watch & Clock Design Competition, organized by the HKTDC alongside the Hong Kong Watch Manufacturers Association and the Federation of Hong Kong Watch Trades & Industries, runs concurrently with the 2025 Hong Kong Watch & Clock Fair.\n\nThe competition invites talent to shine in two categories — an Open Group (for individual designers or Hong Kong-registered companies) and a Student Group — each inspired by distinct themes (\"Memorable\" for Open and \"Believe In Yourself\" for Student).\n\nWinners receive up to HK\$15,000, trophies, certificates, watch courses, media exposure, and opportunities to launch their designs to market. With applications closing on 30 April 2025, the evaluation process includes initial judging in mid-May, mock-up production through June–July, final judging in mid-July, culminating in an award presentation in early September.",
        modifier = modifier
    )
}