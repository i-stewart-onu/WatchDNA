package com.example.watchdna

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun MaisonAlceeScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(bottom = 24.dp)
    ) {
        BrandSectionHeader("Overview")
        Text(
            text = "Maison Alcée was founded in 2021 in Reims, France by Alcée Montfort. The brand reimagines the luxury watchmaking experience by offering customers the opportunity to assemble their own mechanical watch at home, combining horological tradition with hands-on engagement.",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        )

        BrandSectionHeader("The Experience")
        Text(
            text = "Rather than purchasing a finished timepiece, clients receive a complete watchmaking kit containing 233 precision components and 17 professional watchmaking tools. Guided step-by-step, they build their own mechanical watch — making mastery and craftsmanship the true luxury.",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        )

        BrandSectionHeader("The Persée Collection")
        Text(
            text = "The Persée is Maison Alcée's signature offering, available in four aesthetic variants:\n\n• Or — gold\n• Nuit — midnight blue\n• Azur — blue\n• Douce — soft",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        )

        BrandSectionHeader("Technical Excellence")
        Text(
            text = "Movements are manufactured in the Arc Jurassien — a UNESCO-recognized watchmaking heritage region on the France-Switzerland border. The kits were developed in collaboration with Thierry Ducret, a Meilleur Ouvrier de France (MOF), France's highest artisanal distinction.",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        )

        BrandSectionHeader("Awards & Recognition")
        Text(
            text = "• 2023 — Prix de l'Audace, Grand Prix d'Horlogerie de Genève (GPHG) — considered the Oscars of watchmaking\n• 2024 — Featured in The New York Times, Financial Times, and Le Point",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        )

        BrandSectionHeader("Headquarters")
        Text(
            text = "Reims, France",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        )
    }
}
