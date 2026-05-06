package com.example.watchdna

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import coil.request.ImageRequest

data class Aficionado(
    val name: String,
    val role: String,
    val bio: String,
    val photoUrl: String,
    val routeKey: String
)

val aficionados = listOf(
    Aficionado(
        name = "Adam Craniotes",
        role = "Founder, RedBar Group",
        bio = "Adam Craniotes founded RedBar, one of the world's most recognized grassroots watch communities. What began as informal gatherings of passionate collectors in New York City grew into a global network uniting enthusiasts from Tokyo to Toronto. Adam is a champion of accessible horology and community-first watch culture.",
        photoUrl = "https://quillandpad.com/wp-content/uploads/2018/11/Redbar_1-interview-Adam-Craniotes.jpg",
        routeKey = "aficionado_adam_craniotes"
    ),
    Aficionado(
        name = "Serdar Oal",
        role = "Founder, Horobox",
        bio = "Serdar Oal is a dedicated watch collector whose journey into horology led him to create Horobox, a platform for curating and sharing exceptional timepieces. His story reflects the broader collector experience — discovering the depth of watchmaking culture and becoming compelled to share it with others.",
        photoUrl = "https://watchdna.com/cdn/shop/articles/Serdar_Oal.png?v=1744808013&width=1100",
        routeKey = "aficionado_serdar_oal"
    ),
    Aficionado(
        name = "Justin Mastine-Frost",
        role = "Watch Journalist & Enthusiast",
        bio = "Justin Mastine-Frost brings passion, perspective, and purpose to the world of watches. A respected voice in horological media, Justin has dedicated his career to exploring what makes watchmaking meaningful — not just as an industry, but as a lens through which to understand craftsmanship, culture, and time itself.",
        photoUrl = "https://media.muckrack.com/profile/images/13885624/justin-mastine-frost.jpeg.256x256_q100_crop-smart.jpg",
        routeKey = "aficionado_justin_mastine_frost"
    ),
    Aficionado(
        name = "George Sully",
        role = "Canadian Design Icon & Advocate",
        bio = "George Sully is a celebrated Canadian designer who has applied his creative lens to the watch world, becoming an advocate and storyteller for horological culture in Canada. His work bridges the gap between design thinking and the luxury timepiece community.",
        photoUrl = "https://cdn.shopify.com/s/files/1/0755/6235/2943/files/George_Sully.webp?v=1717094131",
        routeKey = "aficionado_george_sully"
    ),
    Aficionado(
        name = "Tyler Worden",
        role = "Founder, Worden Watch Studio",
        bio = "Tyler Worden is the founder of Worden Watch Studio, where watches are conceived as small creative universes — objects with meaning, soul, and story. His approach to independent watchmaking is deeply personal, treating each timepiece as a canvas for artistry and handmade craftsmanship.",
        photoUrl = "https://cdn.prod.website-files.com/68ff0ef040cd3ca2ec8851f1/69dbdcef1623eea8ba32f550_78B814C3-1C77-4D74-816D-02925069E430_1_201_a.jpg",
        routeKey = "aficionado_tyler_worden"
    ),
    Aficionado(
        name = "Hakim El Kadiri",
        role = "Founder, Elka Watch Co.",
        bio = "Hakim El Kadiri founded Elka Watch Co. with a vision of crafting time on his own terms. His journey from enthusiast to independent watch brand founder represents the entrepreneurial spirit at the heart of the aficionado community — a passion for the craft that ultimately demanded its own expression.",
        photoUrl = "https://cdn.shopify.com/s/files/1/0625/9566/1975/files/hakim-el-kadiri-1688559540692.jpg?v=1704542668",
        routeKey = "aficionado_hakim_el_kadiri"
    ),
    Aficionado(
        name = "Gannon Brousseau",
        role = "Director, Couture Show",
        bio = "Gannon Brousseau oversees the Couture Show, one of the premier luxury watch and jewelry events in North America. His insider perspective on the intersection of retail, design, and consumer experience makes him a key connector between the industry and the enthusiast community.",
        photoUrl = "https://somariq.com/wp-content/uploads/2025/11/gannon-brousseau.jpg",
        routeKey = "aficionado_gannon_brousseau"
    ),
    Aficionado(
        name = "Jason Hutton",
        role = "Co-Founder, Zenea & The Timepiece Show",
        bio = "Jason Hutton co-founded Zenea and helped bring The Timepiece Show to life — a community-driven event that celebrates the connection between people and their watches. His story is one of using shared passion to build lasting relationships across the watch world.",
        photoUrl = "https://i0.wp.com/thecalibratedwrist.com/wp-content/uploads/2025/03/Jason-Hutton.jpg?resize=720%2C899&ssl=1",
        routeKey = "aficionado_jason_hutton"
    )
)

@Composable
fun AficionadosScreen(onNavigate: (String) -> Unit, modifier: Modifier = Modifier) {
    LazyColumn(
        modifier = modifier.fillMaxSize(),
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(20.dp)
    ) {
        item {
            Text(
                "WATCH AFICIONADOS",
                style = MaterialTheme.typography.labelMedium,
                color = MaterialTheme.colorScheme.primary,
                fontWeight = FontWeight.Bold,
                letterSpacing = 1.sp
            )
            Spacer(Modifier.height(4.dp))
            Text(
                "Passionate voices shaping the global watch community.",
                style = MaterialTheme.typography.bodyMedium,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
            Spacer(Modifier.height(4.dp))
        }

        items(aficionados) { aficionado ->
            AficionadoCard(
                aficionado = aficionado,
                onClick = { onNavigate(aficionado.routeKey) }
            )
        }

        item { Spacer(Modifier.height(8.dp)) }
    }
}

@Composable
fun AficionadoCard(aficionado: Aficionado, onClick: () -> Unit) {
    val context = LocalContext.current
    val initials = aficionado.name
        .split(" ")
        .take(2)
        .mapNotNull { it.firstOrNull()?.uppercaseChar() }
        .joinToString("")

    ElevatedCard(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onClick() },
        shape = RoundedCornerShape(16.dp),
        elevation = CardDefaults.elevatedCardElevation(defaultElevation = 3.dp)
    ) {
        // Photo header
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(230.dp)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(MaterialTheme.colorScheme.surfaceVariant),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = initials,
                    style = MaterialTheme.typography.displaySmall,
                    color = MaterialTheme.colorScheme.onSurfaceVariant.copy(alpha = 0.35f),
                    fontWeight = FontWeight.Bold
                )
            }

            AsyncImage(
                model = ImageRequest.Builder(context)
                    .data(aficionado.photoUrl)
                    .crossfade(400)
                    .build(),
                contentDescription = aficionado.name,
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize()
            )

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.6f)
                    .align(Alignment.BottomStart)
                    .background(
                        brush = Brush.verticalGradient(
                            colors = listOf(Color.Transparent, Color(0xE0000000))
                        )
                    )
            )

            Column(
                modifier = Modifier
                    .align(Alignment.BottomStart)
                    .padding(horizontal = 16.dp, vertical = 14.dp)
            ) {
                Text(
                    aficionado.name,
                    color = Color.White,
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Bold
                )
                Spacer(Modifier.height(2.dp))
                Text(
                    aficionado.role,
                    color = MaterialTheme.colorScheme.primary,
                    style = MaterialTheme.typography.labelSmall,
                    fontWeight = FontWeight.Medium,
                    letterSpacing = 0.3.sp
                )
            }
        }

        Text(
            aficionado.bio,
            style = MaterialTheme.typography.bodyMedium,
            color = MaterialTheme.colorScheme.onSurfaceVariant,
            lineHeight = 22.sp,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 14.dp)
        )
    }
}
