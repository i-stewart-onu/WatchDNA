package com.example.watchdna

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun AccessoriesScreen(onNavigate: (String) -> Unit, modifier: Modifier = Modifier) {
    Column(modifier = modifier.verticalScroll(rememberScrollState()).padding(bottom = 16.dp)) {
        SectionLabel("Watch Winders & Boxes")
        NavRow("Benson") { onNavigate("Benson") }
        NavRow("Heisse & Söhne") { onNavigate("Heisse & Söhne") }
        NavRow("Wolf 1834") { onNavigate("Wolf 1834") }

        SectionLabel("Watch Safes")
        NavRow("Legion Safes") { onNavigate("Legion Safes") }

        SectionLabel("Straps & Leather")
        NavRow("JU Straps") { onNavigate("JU Straps") }
        NavRow("LIC-Leather") { onNavigate("LIC-Leather") }
        NavRow("Maison Alcée") { onNavigate("Maison Alcée") }

        SectionLabel("Cases & Storage")
        NavRow("Compass") { onNavigate("Compass") }

        SectionLabel("Services")
        NavRow("Watch Certificate") { onNavigate("Watch Certificate") }
    }
}