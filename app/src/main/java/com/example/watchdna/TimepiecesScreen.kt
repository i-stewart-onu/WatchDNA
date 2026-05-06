package com.example.watchdna

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

data class Timepiece(
    val name: String,
    val brand: String,
    val price: String
)

val watchDnaTimepieces = listOf(
    Timepiece("RESERVOIR Longbridge Palladium RSV01.LB/730-366", "RESERVOIR", "$25,497.00 USD"),
    Timepiece("NORQAIN Wild ONE Skeleton Chrono Red Gold Limited Edition N3002.40G01.B01", "NORQAIN", "$24,690.00 USD"),
    Timepiece("RESERVOIR Longbridge Club Rose Gold RSV01.LB/630-177", "RESERVOIR", "$19,570.00 USD"),
    Timepiece("ARILUS Grand Arc Édition Chamonix Métiers d'Art", "ARILUS", "$18,532.00 USD"),
    Timepiece("CORLEONE EVOLUZIONE SUPERLEGGERA P0559HACF", "PILO & CO GENEVE", "$16,624.00 USD"),
    Timepiece("CORLEONE EVOLUZIONE SUPERLEGGERA P0558HACF", "PILO & CO GENEVE", "$16,624.00 USD"),
    Timepiece("PEQUIGNET Attitude Tiger's Eye gold, 39mm 9061268", "PEQUIGNET", "$12,556.25 USD"),
    Timepiece("PEQUIGNET Royale Saphir 42mm 9010892", "PEQUIGNET", "$12,426.91 USD"),
    Timepiece("NORQAIN Wild ONE Skeleton X-Lite Limited Edition N3003.26X01.B01", "NORQAIN", "$13,900.00 USD"),
    Timepiece("PIECES D'EXCEPTION P0606HAS", "PILO & CO GENEVE", "$8,333.00 USD"),
    Timepiece("innerG", "Unknown", "$7,500.00 USD"),
    Timepiece("RESERVOIR GT Tour Carbon RSV01.GT/530-11", "RESERVOIR", "$7,465.00 USD"),
    Timepiece("PEQUIGNET Royale Paris Corail 39,5mm 9100123", "PEQUIGNET", "$6,697.72 USD"),
    Timepiece("RESERVOIR Sonomaster Chronograph Modern RSV04.SN/136.SI.BA", "RESERVOIR", "$6,873.00 USD"),
    Timepiece("NORQAIN Independence Skeleton Chrono 42mm N3200.40S02.B01.R01", "NORQAIN", "$6,152.00 USD"),
    Timepiece("PEQUIGNET Concorde Damas 36 mm 9046233", "PEQUIGNET", "$5,657.59 USD"),
    Timepiece("RESERVOIR GT Tour Racing RSV01.GT/130.CA_BA", "RESERVOIR", "$5,811.00 USD"),
    Timepiece("NORQAIN Wild ONE 42mm Skeleton Coral N3000.07Q31.B13.R01", "NORQAIN", "$5,627.00 USD"),
    Timepiece("RESERVOIR Hydrosphere Blue Hole RSV03.HY/130-21.BH", "RESERVOIR", "$5,364.00 USD"),
    Timepiece("Extraneō P0573HAS", "PILO & CO GENEVE", "$2,259.00 USD"),
    Timepiece("ELKA ARINIS AF02W-0901", "ELKA", "$2,239.00 USD"),
    Timepiece("Marinemaster M-40 Rockstone Gray F8120006", "FORTIS", "$2,199.00 USD"),
    Timepiece("Flieger F-43 Bicompax Original F4240005", "FORTIS", "$2,191.00 USD"),
    Timepiece("DWISS M3S yellow rubber", "DWISS", "$2,094.00 USD")
)

@Composable
fun TimepiecesScreen(modifier: Modifier = Modifier) {
    LazyColumn(modifier = modifier.fillMaxSize()) {
        items(watchDnaTimepieces) { timepiece ->
            Column(modifier = Modifier.padding(horizontal = 16.dp, vertical = 12.dp)) {
                Text(
                    text = timepiece.name,
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.SemiBold,
                    color = MaterialTheme.colorScheme.primary
                )
                Spacer(modifier = Modifier.height(4.dp))
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(
                        text = timepiece.brand,
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.secondary
                    )
                    Text(
                        text = timepiece.price,
                        style = MaterialTheme.typography.bodyMedium,
                        fontWeight = FontWeight.Medium
                    )
                }
                Spacer(modifier = Modifier.height(8.dp))
                HorizontalDivider()
            }
        }
        item { Spacer(modifier = Modifier.height(16.dp)) }
    }
}