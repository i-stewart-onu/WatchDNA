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
fun CommunityArticleDetailScreen(routeKey: String, modifier: Modifier = Modifier) {
    when (routeKey) {
        "article_vancouver" -> ArticleVancouver(modifier)
        "article_wwday_why" -> ArticleWorldWatchDayWhy(modifier)
        "article_wwday_launch" -> ArticleWorldWatchDayLaunch(modifier)
        "article_leadership" -> ArticleLeadership(modifier)
        "article_holidays" -> ArticleHolidays(modifier)
        "article_movember" -> ArticleMovember(modifier)
    }
}

@Composable
private fun ArticleVancouver(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(bottom = 24.dp)
    ) {
        ArticleMeta("April 25, 2026", "WatchDNA Community")

        BrandSectionHeader("The Show Returns")
        Text(
            text = "The Vancouver Timepiece Show is back for its second edition, once again bringing together watch collectors, passionate enthusiasts, and established brands under one roof at The Pipe Shop at The Shipyards in North Vancouver.",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        )

        BrandSectionHeader("What to Expect")
        Text(
            text = "The event runs April 25–27, 2026 and features a curated selection of independent and established watch brands, alongside opportunities to meet fellow collectors and discover new timepieces in an intimate, community-driven atmosphere. Whether you're a seasoned aficionado or simply curious about the world of horology, the Vancouver Timepiece Show is designed to welcome everyone.",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        )

        BrandSectionHeader("A Community Milestone")
        Text(
            text = "WatchDNA is proud to be a media partner of the Vancouver Timepiece Show. The event is a testament to the thriving watch community on Canada's West Coast — and a reminder that a shared passion for time is one of the most powerful things that brings people together.",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        )

        BrandSectionHeader("Venue")
        Text(
            text = "The Pipe Shop at The Shipyards\nNorth Vancouver, British Columbia, Canada",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        )
    }
}

@Composable
private fun ArticleWorldWatchDayWhy(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(bottom = 24.dp)
    ) {
        ArticleMeta("October 10, 2025", "Grigor Garabedian")

        BrandSectionHeader("Why 10/10?")
        Text(
            text = "Twice a day, a watch offers us a quiet smile — once in the morning, once at night. October 10th was chosen as World Watch Day because 10:10 is the time when a watch's hands frame its dial in perfect symmetry, a position that shows off the watch's logo and face in its finest form.",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        )

        BrandSectionHeader("A History Written in Time")
        Text(
            text = "Watches have been integral to modern human history since the 16th century, evolving from purely functional tools into deeply personal companions. They have become reflections of identity and silent witnesses to life's most important milestones — from first days to final goodbyes.",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        )

        BrandSectionHeader("More Than a Tool")
        Text(
            text = "We don't merely own watches — we wear them through life's varied moments, from the wilderness to the boardroom, from celebrations to quiet mornings. Watches have celebrated us by carrying our memories and marking our accomplishments. They are quiet witnesses to the lives we lead.",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        )

        BrandSectionHeader("The Anatomy of a Timepiece")
        Text(
            text = "Each watch is a union of engineering and emotion:\n\n• Case & Bracelet — Materials and finishes create visual and tactile presence\n• Movement — The heartbeat, the mechanism that defines all else\n• Dial — The watch's character and identity\n• Hands — The voice that guides us through time\n• Crystal — The lens that preserves the mystery within",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        )
    }
}

@Composable
private fun ArticleWorldWatchDayLaunch(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(bottom = 24.dp)
    ) {
        ArticleMeta("October 6, 2025", "WatchDNA Community")

        BrandSectionHeader("An Industry First")
        Text(
            text = "At Watches & Wonders Geneva, the watch industry officially introduced World Watch Day — an annual global celebration scheduled for October 10th each year, echoing the emblematic 10:10 position of a watch's hands.",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        )

        BrandSectionHeader("The Inaugural Event")
        Text(
            text = "The first edition of World Watch Day was broadcast across multiple time zones, featuring contributions from media outlets, professional associations, collectors, and creative professionals from around the world.",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        )

        BrandSectionHeader("Founding Organizations")
        Text(
            text = "The nonprofit organization coordinating World Watch Day brings together some of the industry's most prominent institutions:\n\n• FHH (Fondation de la Haute Horlogerie)\n• GPHG (Grand Prix d'Horlogerie de Genève)\n• Watch Library Foundation\n• Horopedia\n• And additional leading organizations",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        )

        BrandSectionHeader("Join the Community")
        Text(
            text = "At WatchDNA, we believe in building a community where everyone is welcome. World Watch Day is an invitation to share your passion for timepieces with the world — and a reminder that the love of watches is one of the most universal languages there is.",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        )
    }
}

@Composable
private fun ArticleLeadership(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(bottom = 24.dp)
    ) {
        ArticleMeta("March 5, 2025", "WatchDNA Community")

        BrandSectionHeader("Passion Transcends Background")
        Text(
            text = "This feature celebrates everyone shaping the watch industry today — brand representatives, collectors, journalists, and experts regardless of background. True leadership in horology is driven by passion, expertise, and a commitment to growth.",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        )

        BrandSectionHeader("Voices from the Industry")
        Text(
            text = "Nine influential figures share their watch journeys and perspectives on the future of the craft:",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        )

        BrandSectionHeader("Kathleen McGivney — RedBar CEO")
        Text(
            text = "Discovered watches through community engagement. A champion of amplifying diverse voices within the watch industry and making horology more inclusive.",
            style = MaterialTheme.typography.bodyMedium,
            color = MaterialTheme.colorScheme.onSurfaceVariant,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 4.dp)
        )

        BrandSectionHeader("Caroline Zirakzadeh — Former Swatch Group US/Canada CEO")
        Text(
            text = "Chose watches over finance and never looked back. Emphasizes choosing timepieces for personal resonance over trend-chasing.",
            style = MaterialTheme.typography.bodyMedium,
            color = MaterialTheme.colorScheme.onSurfaceVariant,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 4.dp)
        )

        BrandSectionHeader("Jessica Chow — Founder & CEO, Vieren Watches")
        Text(
            text = "Canada's first female luxury watch brand founder. Champions gender-neutral design and diversity as forces for positive change in the industry.",
            style = MaterialTheme.typography.bodyMedium,
            color = MaterialTheme.colorScheme.onSurfaceVariant,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 4.dp)
        )

        BrandSectionHeader("Rhonda Riche — Watchonista Editor-at-Large")
        Text(
            text = "Inspired by her grandfather's mechanical passion. Warns against the commodification of watches and advocates for the artistry behind every timepiece.",
            style = MaterialTheme.typography.bodyMedium,
            color = MaterialTheme.colorScheme.onSurfaceVariant,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 4.dp)
        )

        BrandSectionHeader("A Unified Message")
        Text(
            text = "All contributors stress selecting timepieces that resonate personally, exploring communities for education, and recognizing watches as meaningful keepsakes worthy of passing down through generations.",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        )
    }
}

@Composable
private fun ArticleHolidays(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(bottom = 24.dp)
    ) {
        ArticleMeta("December 23, 2024", "WatchDNA Community")

        BrandSectionHeader("A Season of Reflection")
        Text(
            text = "As the year concludes, the holiday season arrives with a sense of magic, reflection, and joy. While not everyone observes the same traditions, this period offers a shared opportunity to pause, reconnect, and value the people who enrich our lives.",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        )

        BrandSectionHeader("Time as the Greatest Gift")
        Text(
            text = "The holidays transcend calendar dates — they represent an invitation to step back from daily routines and appreciate the moments that matter. Whether through large family gatherings, intimate meals, or quiet moments of gratitude, this season celebrates the bonds we share and the memories we've created together.",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        )

        BrandSectionHeader("Timepieces as Memory Keepers")
        Text(
            text = "A watch given or worn during the holidays becomes more than an accessory — it becomes a carrier of stories, milestones, and emotion. Presenting a timepiece as a gift honors someone's significance in your life while symbolizing the shared time you've had and the future experiences still to come.",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        )

        BrandSectionHeader("Embracing Connection")
        Text(
            text = "Regardless of specific traditions — whether lighting menorahs, decorating trees, or gathering for meals — the season's essence centers on love, kindness, and connection. A watch metaphorically reminds us to savor the present, honor the past, and look forward to the future.\n\nThe most precious gifts aren't wrapped in paper. They're found in the time we spend with the people we hold dear.",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        )
    }
}

@Composable
private fun ArticleMovember(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(bottom = 24.dp)
    ) {
        ArticleMeta("October 28, 2024", "WatchDNA Community")

        BrandSectionHeader("Movember and the Watch World")
        Text(
            text = "Every November, the global Movember movement draws attention to men's health — prostate cancer, testicular cancer, mental health, and suicide prevention. The watch industry, with its deep culture of passion and community, has become an increasingly active participant in this effort.",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        )

        BrandSectionHeader("How Brands Get Involved")
        Text(
            text = "Watch brands and retailers have embraced Movember in a variety of ways: limited-edition releases with proceeds donated to men's health charities, in-store awareness campaigns, social media fundraising, and events that bring collectors together around a shared cause. The watch community's existing bonds make it a natural fit for this kind of grassroots advocacy.",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        )

        BrandSectionHeader("Community as a Force for Good")
        Text(
            text = "At its core, the watch community is built on shared enthusiasm and mutual support. Channeling that energy toward men's health awareness is a natural extension — a reminder that the passion we have for timepieces can also drive meaningful change in the world beyond the hobby.",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        )

        BrandSectionHeader("Get Involved")
        Text(
            text = "Whether you grow a moustache, donate, or simply start a conversation with the men in your life about their health, Movember is an opportunity to make a difference. The watch community is watching — and acting.",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        )
    }
}

@Composable
private fun ArticleMeta(date: String, author: String) {
    Column(modifier = Modifier.padding(horizontal = 16.dp, vertical = 12.dp)) {
        Text(
            text = date,
            style = MaterialTheme.typography.labelMedium,
            color = MaterialTheme.colorScheme.primary,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(2.dp))
        Text(
            text = "By $author",
            style = MaterialTheme.typography.labelMedium,
            color = MaterialTheme.colorScheme.onSurfaceVariant
        )
    }
    HorizontalDivider()
}
