package com.example.watchdna

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun AccessoriesScreen(modifier: Modifier = Modifier) {
    Column(modifier = modifier.verticalScroll(rememberScrollState()).padding(bottom = 16.dp)) {
        NavRow("Benson") {}
        NavRow("Heisse & Söhne") {}
        NavRow("JU Straps") {}
        NavRow("LIC-Leather") {}
        NavRow("Maison Alcée") {}
        NavRow("Wolf 1834") {}
    }
}