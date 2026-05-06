package com.example.watchdna

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ContactUsScreen(modifier: Modifier = Modifier) {

    var name by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var content by remember { mutableStateOf("") }
    var submittedMessage by remember { mutableStateOf("") }

    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(bottom = 24.dp)
    ) {

        BrandSectionHeader("Contact Us")

        Text(
            "We’d love to hear from you. Whether you have a question, feedback, or partnership inquiry, feel free to reach out.",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(16.dp)
        )

        BrandSectionHeader("General Inquiries")
        Text(
            "For general questions about WatchDNA, platform features, or support, contact our team through official channels.",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(16.dp)
        )

        BrandSectionHeader("Partnerships")
        Text(
            "Interested in working with WatchDNA? Reach out to explore collaboration opportunities with our platform.",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(16.dp)
        )

        BrandSectionHeader("Send a Message")

        OutlinedTextField(
            value = name,
            onValueChange = { name = it },
            label = { Text("Name") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 8.dp)
        )

        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            label = { Text("Email") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 8.dp)
        )

        OutlinedTextField(
            value = content,
            onValueChange = { content = it },
            label = { Text("Message") },
            modifier = Modifier
                .fillMaxWidth()
                .height(150.dp)
                .padding(horizontal = 16.dp, vertical = 8.dp)
        )

        Button(
            onClick = {
                submittedMessage = "Submitted: $name ($email)\n$content"

                // Clear fields after submission
                name = ""
                email = ""
                content = ""
            },
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
        ) {
            Text("Submit")
        }

        if (submittedMessage.isNotEmpty()) {
            Text(
                text = submittedMessage,
                style = MaterialTheme.typography.bodyMedium,
                modifier = Modifier.padding(16.dp)
            )
        }
    }

}