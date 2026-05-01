package com.example.watchdna

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun WorldOfWatchesScreen(modifier: Modifier = Modifier) {
    LazyColumn(modifier = modifier.fillMaxSize()) {

        item {
            Text(
                text = "Did You Know?".uppercase(),
                style = MaterialTheme.typography.labelMedium,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.primary,
                modifier = Modifier.padding(horizontal = 16.dp).padding(top = 24.dp, bottom = 4.dp)
            )
        }

        item {
            Text("Wearability & Fit", style = MaterialTheme.typography.bodyLarge, fontWeight = FontWeight.SemiBold, modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp))
        }
        item { FactRow("Lug-to-Lug", "More important than case size for how a watch sits.") }
        item { FactRow("Thickness", "Thinner watches slide under cuffs more easily.") }
        item { FactRow("Weight", "Lighter watches generally offer better all-day comfort.") }

        item {
            Text("Mechanics & Movement", style = MaterialTheme.typography.bodyLarge, fontWeight = FontWeight.SemiBold, modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp))
        }
        item { FactRow("Automatic", "Powered by wrist movement; no battery needed.") }
        item { FactRow("Swiss Made", "Regulated standard; at least 60% of value must be Swiss.") }
        item { FactRow("Power Reserve", "How long it runs off-wrist (some 72+ hours).") }
        item { FactRow("Shock Protection", "Systems like Incabloc protect the movement.") }

        item {
            Text("Materials & Care", style = MaterialTheme.typography.bodyLarge, fontWeight = FontWeight.SemiBold, modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp))
        }
        item { FactRow("Sapphire Crystal", "Highly scratch-resistant compared to mineral glass.") }
        item { FactRow("Steel Types", "316L steel is the standard for corrosion resistance.") }
        item { FactRow("Water Resistance", "100M is safe for swimming, but not deep diving.") }
        item { FactRow("Leather Care", "Avoid water and rotate straps to increase longevity.") }

        item {
            Text(
                text = "Beginner vs. Collector".uppercase(),
                style = MaterialTheme.typography.labelMedium,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.primary,
                modifier = Modifier.padding(horizontal = 16.dp).padding(top = 24.dp, bottom = 4.dp)
            )
        }

        item {
            Row(modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp, vertical = 4.dp)) {
                Spacer(modifier = Modifier.weight(1f))
                Text("Beginner", style = MaterialTheme.typography.labelMedium, fontWeight = FontWeight.Bold, modifier = Modifier.weight(2f))
                Text("Collector", style = MaterialTheme.typography.labelMedium, fontWeight = FontWeight.Bold, modifier = Modifier.weight(2f))
            }
            HorizontalDivider(modifier = Modifier.padding(horizontal = 16.dp))
        }

        item { CompareRow("The Goal", "Focuses on owning a single \"nice\" watch.", "Focuses on building a meaningful, cohesive collection.") }
        item { CompareRow("The Movement", "Typically looks for Quartz or standard Automatics.", "Seeks Mechanical, in-house, or rare calibers.") }
        item { CompareRow("Brand Selection", "Sticks to well-known, mainstream brands.", "Explores niche or independent watchmakers.") }
        item { CompareRow("Value & Condition", "Prioritizes \"mint\" or perfect condition.", "Appreciates \"Patina\" as a sign of character and history.") }

        item { Spacer(modifier = Modifier.height(16.dp)) }
    }
}

@Composable
fun FactRow(label: String, detail: String) {
    Column(modifier = Modifier.padding(horizontal = 16.dp, vertical = 6.dp)) {
        Text(label, style = MaterialTheme.typography.bodyMedium, fontWeight = FontWeight.Medium)
        Spacer(modifier = Modifier.height(2.dp))
        Text(detail, style = MaterialTheme.typography.bodySmall, color = MaterialTheme.colorScheme.onSurfaceVariant)
        Spacer(modifier = Modifier.height(6.dp))
        HorizontalDivider()
    }
}

@Composable
fun CompareRow(aspect: String, beginner: String, collector: String) {
    Row(modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp, vertical = 10.dp)) {
        Text(aspect, style = MaterialTheme.typography.bodySmall, fontWeight = FontWeight.SemiBold, color = MaterialTheme.colorScheme.primary, modifier = Modifier.weight(1f))
        Text(beginner, style = MaterialTheme.typography.bodySmall, color = MaterialTheme.colorScheme.onSurfaceVariant, modifier = Modifier.weight(2f))
        Text(collector, style = MaterialTheme.typography.bodySmall, color = MaterialTheme.colorScheme.onSurfaceVariant, modifier = Modifier.weight(2f))
    }
    HorizontalDivider(modifier = Modifier.padding(horizontal = 16.dp))
}