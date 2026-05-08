package com.example.watchdna

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

private data class RoutineMoment(
    val time: String,
    val label: String,
    val detail: String
)

private data class DailyRoutineProfile(
    val name: String,
    val role: String,
    val watch: String,
    val quote: String,
    val moments: List<RoutineMoment>
)

private val routineProfiles = listOf(

    DailyRoutineProfile(
        name = "Adam Craniotes",
        role = "Founder, RedBar Group",
        watch = "Vintage Rolex Submariner ref. 5513",
        quote = "The watch you choose sets the tone for the entire day.",
        moments = listOf(
            RoutineMoment("6:30 AM", "The Morning Choose", "Before coffee, before email — the watch is the first decision of the day. Today it's the Sub. The dial is faded just right. It anchors everything else."),
            RoutineMoment("9:00 AM", "Community Check-In", "RedBar chapters span time zones, so mornings mean messages from Tokyo and London. Nothing beats a quick DM about a fresh find over your first cup."),
            RoutineMoment("12:30 PM", "Lunch, On the Wrist", "A grab-and-go lunch with whoever happens to be nearby. Inevitably, someone notices the watch. That's the whole point — they always do, eventually."),
            RoutineMoment("7:00 PM", "The Hangs", "A RedBar gathering, a brand event, or just a few collectors meeting at a bar downtown. The Sub is equally at home here. It always has been.")
        )
    ),

    DailyRoutineProfile(
        name = "Justin Mastine-Frost",
        role = "Watch Journalist & Enthusiast",
        watch = "IWC Portugieser Chronograph",
        quote = "Putting on a watch is a ritual. It's the first sentence of the day's story.",
        moments = listOf(
            RoutineMoment("7:00 AM", "Ritual", "A watch journalist's morning starts with intention. The Portugieser goes on before anything else. Large, confident, with a clean white dial — it demands clarity from the hours ahead."),
            RoutineMoment("10:00 AM", "Writing Window", "The best writing hours. Research tabs open, press releases filed, draft forming. The watch stays face-up on the desk — a reminder that the deadline is alive."),
            RoutineMoment("2:00 PM", "Brand Meeting", "A call or in-person session with a brand team. Wearing the piece they make is respect. But wearing something else says just as much. Today, the Portugieser speaks for itself."),
            RoutineMoment("9:00 PM", "Wind-Down", "Placing the watch on the nightstand — or back on the winder — is the real end of the day. A small moment that closes a loop.")
        )
    ),

    DailyRoutineProfile(
        name = "George Sully",
        role = "Canadian Design Icon & Advocate",
        watch = "Audemars Piguet Royal Oak ref. 15202",
        quote = "Design is in every detail — the watch reminds me of that every time I glance down.",
        moments = listOf(
            RoutineMoment("8:00 AM", "Design Eye First", "A designer wakes up seeing shapes. The Royal Oak is integrated — case, bracelet, dial, unified. It sets a high bar for everything the day asks me to create."),
            RoutineMoment("11:00 AM", "Studio Time", "Sketching, refining, reviewing. The Royal Oak sits at the wrist and demands the same standard from the work. Integrated. No compromises."),
            RoutineMoment("4:00 PM", "Community Call", "An interview, a panel, a workshop. Wherever the watch community intersects with design culture, that's where the afternoon goes."),
            RoutineMoment("8:00 PM", "Dinner & Discovery", "The watch world is social. Dinner is another opportunity to connect — with collectors, with emerging designers, with people who see time the way you do.")
        )
    ),

    DailyRoutineProfile(
        name = "Jessica Chow",
        role = "Founder & CEO, Vieren Watches",
        watch = "Vieren Étang, stainless steel",
        quote = "I build watches that fit every part of a woman's day — because that's my day too.",
        moments = listOf(
            RoutineMoment("6:45 AM", "Founder's Morning", "Running a watch brand means mornings start before the team does. The Étang goes on immediately — it was designed for the full day, and the full day starts now."),
            RoutineMoment("9:30 AM", "Operations", "Supplier emails, inventory checks, content planning. The Étang moves with the work — it doesn't stand out, it belongs."),
            RoutineMoment("1:00 PM", "Brand Work", "Photography, retail partnerships, community outreach. Every photo taken is a reminder that visibility matters — for the brand, and for who gets to be in the frame."),
            RoutineMoment("6:00 PM", "Still On", "The Étang is on through dinner, through the commute, through the evening. Gender-neutral design wasn't a statement — it was just honest. The watch proved it.")
        )
    ),

    DailyRoutineProfile(
        name = "Tyler Worden",
        role = "Founder, Worden Watch Studio",
        watch = "Worden Studio prototype (current build)",
        quote = "I wear whatever I'm working on. The watch on my wrist is the world I'm living in at the bench.",
        moments = listOf(
            RoutineMoment("7:30 AM", "Bench Ready", "The prototype comes on first. Not for aesthetics — for function. Every hour of wearing it is data. Does the clasp sit right? Does the lug width work at a real wrist?"),
            RoutineMoment("10:00 AM", "The Work", "Watchmaking is slow, intentional craft. The bench is quiet. The prototype is both the subject and the tool — wearing it is research, the same way reading is writing."),
            RoutineMoment("3:00 PM", "Notes & Iteration", "An afternoon review of what the wrist told the morning. Notes in the margin of the case sketch. Small changes, big consequences. The prototype earns its keep by being worn."),
            RoutineMoment("7:00 PM", "Off the Wrist, Into the Log", "The prototype comes off with notes attached. Tomorrow's build starts from what today's wear revealed. The watch is never finished — it's only further along.")
        )
    ),

    DailyRoutineProfile(
        name = "Serdar Oal",
        role = "Founder, Horobox",
        watch = "Patek Philippe Nautilus ref. 5711",
        quote = "Curation starts at the wrist. What you choose to wear is what you're saying about what matters.",
        moments = listOf(
            RoutineMoment("8:00 AM", "Collector's Eye", "Morning begins with a scroll — auctions, forums, new arrivals. The Nautilus is on already. It doesn't get old. Integration at this level doesn't."),
            RoutineMoment("11:00 AM", "Horobox Work", "Platform curation: what's worth sharing, what's worth explaining, what's worth archiving. The Nautilus is a curatorial statement. It doesn't need words."),
            RoutineMoment("2:00 PM", "The Find", "Every collector has a daily routine interrupted by the find — the piece you didn't know you were looking for. When it appears, the routine stops. Everything adjusts."),
            RoutineMoment("10:00 PM", "The Last Look", "Before sleep: the watch comes off. You look at it one more time. Always. It's not vanity — it's gratitude.")
        )
    )
)

@Composable
fun YourDailyRoutineScreen(modifier: Modifier = Modifier) {
    LazyColumn(modifier = modifier.fillMaxSize()) {

        item {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.4f))
                    .padding(horizontal = 20.dp, vertical = 24.dp)
            ) {
                Text(
                    text = "YOUR DAILY ROUTINE",
                    style = MaterialTheme.typography.labelMedium,
                    color = MaterialTheme.colorScheme.primary,
                    fontWeight = FontWeight.Bold,
                    letterSpacing = 1.5.sp
                )
                Spacer(Modifier.height(6.dp))
                Text(
                    text = "A day in the life — told through the watches we wear.",
                    style = MaterialTheme.typography.bodyLarge,
                    fontStyle = FontStyle.Italic,
                    color = MaterialTheme.colorScheme.onSurface
                )
                Spacer(Modifier.height(6.dp))
                Text(
                    text = "We asked members of the WatchDNA community to walk us through their daily routines — and the timepieces that anchor them. From bench to boardroom, from morning ritual to late-night wind-down, every routine tells a different story about the relationship between people and their watches.",
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }
        }

        items(routineProfiles) { profile ->
            DailyRoutineCard(profile)
        }

        item { Spacer(Modifier.height(24.dp)) }
    }
}

@Composable
private fun DailyRoutineCard(profile: DailyRoutineProfile) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 12.dp)
    ) {
        // Profile header
        ElevatedCard(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(16.dp),
            elevation = CardDefaults.elevatedCardElevation(defaultElevation = 2.dp)
        ) {
            Column(modifier = Modifier.padding(16.dp)) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Box(
                        modifier = Modifier
                            .size(44.dp)
                            .background(
                                color = MaterialTheme.colorScheme.primary.copy(alpha = 0.15f),
                                shape = CircleShape
                            ),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = profile.name.split(" ").take(2)
                                .mapNotNull { it.firstOrNull()?.uppercaseChar() }
                                .joinToString(""),
                            style = MaterialTheme.typography.labelLarge,
                            color = MaterialTheme.colorScheme.primary,
                            fontWeight = FontWeight.Bold
                        )
                    }
                    Spacer(Modifier.width(12.dp))
                    Column {
                        Text(
                            text = profile.name,
                            style = MaterialTheme.typography.titleMedium,
                            fontWeight = FontWeight.SemiBold
                        )
                        Text(
                            text = profile.role,
                            style = MaterialTheme.typography.labelSmall,
                            color = MaterialTheme.colorScheme.primary,
                            fontWeight = FontWeight.Medium
                        )
                    }
                }

                Spacer(Modifier.height(12.dp))
                HorizontalDivider(color = MaterialTheme.colorScheme.outlineVariant.copy(alpha = 0.5f))
                Spacer(Modifier.height(10.dp))

                Row(verticalAlignment = Alignment.CenterVertically) {
                    Surface(
                        shape = RoundedCornerShape(4.dp),
                        color = MaterialTheme.colorScheme.primary.copy(alpha = 0.12f)
                    ) {
                        Text(
                            text = "ON THE WRIST",
                            style = MaterialTheme.typography.labelSmall,
                            color = MaterialTheme.colorScheme.primary,
                            fontWeight = FontWeight.Bold,
                            letterSpacing = 0.8.sp,
                            modifier = Modifier.padding(horizontal = 8.dp, vertical = 3.dp)
                        )
                    }
                    Spacer(Modifier.width(8.dp))
                    Text(
                        text = profile.watch,
                        style = MaterialTheme.typography.bodyMedium,
                        fontWeight = FontWeight.Medium
                    )
                }

                Spacer(Modifier.height(10.dp))
                Text(
                    text = "\"${profile.quote}\"",
                    style = MaterialTheme.typography.bodyMedium,
                    fontStyle = FontStyle.Italic,
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                    lineHeight = 20.sp
                )
            }
        }

        Spacer(Modifier.height(8.dp))

        // Timeline of moments
        profile.moments.forEachIndexed { index, moment ->
            RoutineTimelineItem(
                moment = moment,
                isLast = index == profile.moments.lastIndex
            )
        }
    }
}

@Composable
private fun RoutineTimelineItem(moment: RoutineMoment, isLast: Boolean) {
    Row(modifier = Modifier.fillMaxWidth()) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.width(56.dp)
        ) {
            Box(
                modifier = Modifier
                    .size(10.dp)
                    .background(
                        color = MaterialTheme.colorScheme.primary,
                        shape = CircleShape
                    )
            )
            if (!isLast) {
                Box(
                    modifier = Modifier
                        .width(2.dp)
                        .height(72.dp)
                        .background(MaterialTheme.colorScheme.primary.copy(alpha = 0.25f))
                )
            }
        }

        Column(
            modifier = Modifier
                .weight(1f)
                .padding(start = 4.dp)
                .padding(bottom = if (isLast) 0.dp else 12.dp)
        ) {
            Text(
                text = moment.time,
                style = MaterialTheme.typography.labelMedium,
                color = MaterialTheme.colorScheme.primary,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = moment.label,
                style = MaterialTheme.typography.bodyMedium,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier.padding(top = 1.dp)
            )
            Text(
                text = moment.detail,
                style = MaterialTheme.typography.bodySmall,
                color = MaterialTheme.colorScheme.onSurfaceVariant,
                lineHeight = 18.sp,
                modifier = Modifier.padding(top = 3.dp, bottom = 4.dp)
            )
        }
    }
}
