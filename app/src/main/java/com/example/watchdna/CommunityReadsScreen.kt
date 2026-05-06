package com.example.watchdna

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

val watchDnaCommunityReads = listOf(
    "NOTRE SELECTION DES SALONS HORLOGERS GENEVOIS - AVRIL 2026 -",
    "Reflecting On the sale of Baume & Mercier By Richemont To Damiani.",
    "Finding Joy",
    "Audemars Piguet Actually Made The Royal Oak Selfwinding Flying Tourbillon Openworked in White Ceramic, And A Few Lucky People Already Have One",
    "THE BEST WATCHES OF 2025",
    "BLUE WATCHES: ELEGANCE, FRESHNESS AND CREATIVITY ON THE WRIST – FRANCÉCLAT",
    "FRENCH BRANDS IN THE SPOTLIGHT AT THE WIND-UP NEW YORK SHOW - FRANCECLAT INTERNATIONAL",
    "SUBLIMER L'HÉRITAGE SANS LE FIGER",
    "BREAKING NEWS: SOTHEBY'S SALE OF THE AUDEMARS PIGUET 'GROSSE PIÈCE' SHATTERS RECORDS, BECOMES BY FAR MOST EXPENSIVE AUDEMARS PIGUET AT $7,736,000",
    "IFL WATCHES BULOVA SUPER SEVILLE STARRY NIGHT: AN ELEGANT HAND-PAINTED HOMAGE TO VAN GOGH",
    "SO MUCH LIFE JUST HAPPENS...",
    "OMEGA JUST UNVEILED ITS NEXT-GEN SEAMASTER PLANET OCEAN WITH GLEN POWELL",
    "SINZIANA IORDACHE REVELS IN THE ART OF TIME",
    "READING TIME AT HSNY: YOU DON’T NEED A WEATHERMAN",
    "16 best birthday watches, chosen by watch collectors"
)

@Composable
fun CommunityReadsScreen(modifier: Modifier = Modifier) {
    LazyColumn(modifier = modifier.fillMaxSize()) {
        items(watchDnaCommunityReads) { read ->
            Column {
                ListItem(
                    headlineContent = {
                        Text(
                            text = read,
                            style = MaterialTheme.typography.titleMedium,
                            fontWeight = FontWeight.SemiBold
                        )
                    }
                )
                HorizontalDivider(modifier = Modifier.padding(horizontal = 16.dp))
            }
        }
        item { Spacer(modifier = Modifier.height(16.dp)) }
    }
}