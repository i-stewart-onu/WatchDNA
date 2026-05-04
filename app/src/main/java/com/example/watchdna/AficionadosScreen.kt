package com.example.watchdna

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

data class Aficionado(val name: String, val role: String, val bio: String)

val aficionados = listOf(
    Aficionado(
        name = "Adam Craniotes",
        role = "Founder, RedBar Group",
        bio = "Adam Craniotes founded RedBar, one of the world's most recognized grassroots watch communities. What began as informal gatherings of passionate collectors in New York City grew into a global network uniting enthusiasts from Tokyo to Toronto. Adam is a champion of accessible horology and community-first watch culture."
    ),
    Aficionado(
        name = "Serdar Oal",
        role = "Founder, Horobox",
        bio = "Serdar Oal is a dedicated watch collector whose journey into horology led him to create Horobox, a platform for curating and sharing exceptional timepieces. His story reflects the broader collector experience — discovering the depth of watchmaking culture and becoming compelled to share it with others."
    ),
    Aficionado(
        name = "Justin Mastine-Frost",
        role = "Watch Journalist & Enthusiast",
        bio = "Justin Mastine-Frost brings passion, perspective, and purpose to the world of watches. A respected voice in horological media, Justin has dedicated his career to exploring what makes watchmaking meaningful — not just as an industry, but as a lens through which to understand craftsmanship, culture, and time itself."
    ),
    Aficionado(
        name = "George Sully",
        role = "Canadian Design Icon & Advocate",
        bio = "George Sully is a celebrated Canadian designer who has applied his creative lens to the watch world, becoming an advocate and storyteller for horological culture in Canada. His work bridges the gap between design thinking and the luxury timepiece community."
    ),
    Aficionado(
        name = "Tyler Worden",
        role = "Founder, Worden Watch Studio",
        bio = "Tyler Worden is the founder of Worden Watch Studio, where watches are conceived as small creative universes — objects with meaning, soul, and story. His approach to independent watchmaking is deeply personal, treating each timepiece as a canvas for artistry and handmade craftsmanship."
    ),
    Aficionado(
        name = "Hakim El Kadiri",
        role = "Founder, Elka Watch Co.",
        bio = "Hakim El Kadiri founded Elka Watch Co. with a vision of crafting time on his own terms. His journey from enthusiast to independent watch brand founder represents the entrepreneurial spirit at the heart of the aficionado community — a passion for the craft that ultimately demanded its own expression."
    ),
    Aficionado(
        name = "Gannon Brousseau",
        role = "Director, Couture Show",
        bio = "Gannon Brousseau oversees the Couture Show, one of the premier luxury watch and jewelry events in North America. His insider perspective on the intersection of retail, design, and consumer experience makes him a key connector between the industry and the enthusiast community."
    ),
    Aficionado(
        name = "Jason Hutton",
        role = "Co-Founder, Zenea & The Timepiece Show",
        bio = "Jason Hutton co-founded Zenea and helped bring The Timepiece Show to life — a community-driven event that celebrates the connection between people and their watches. His story is one of using shared passion to build lasting relationships across the watch world."
    )
)

@Composable
fun AficionadosScreen(modifier: Modifier = Modifier) {
    LazyColumn(modifier = modifier.fillMaxSize()) {
        items(aficionados) { aficionado ->
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 12.dp)
            ) {
                Text(
                    text = aficionado.name,
                    style = MaterialTheme.typography.bodyLarge,
                    fontWeight = FontWeight.SemiBold
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = aficionado.role,
                    style = MaterialTheme.typography.labelMedium,
                    color = MaterialTheme.colorScheme.primary
                )
                Spacer(modifier = Modifier.height(6.dp))
                Text(
                    text = aficionado.bio,
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }
            HorizontalDivider()
        }
        item { Spacer(modifier = Modifier.height(16.dp)) }
    }
}
