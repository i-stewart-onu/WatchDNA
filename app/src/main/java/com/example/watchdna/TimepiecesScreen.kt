package com.example.watchdna

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

data class Timepiece(
    val title: String,
    val brand: String,
    val price: String,
    val url: String
)

val watchDnaTimepieces = listOf(
    Timepiece("RESERVOIR Longbridge Palladium RSV01.LB/730-366", "RESERVOIR", "$25,347.00 USD", "https://watchdna.com/products/reservoir-longbridge-palladium-rsv01-lb-730-366-new"),
    Timepiece("NORQAIN Wild ONE Skeleton Chrono Red Gold Limited Edition N3002.40G01.B01", "NORQAIN", "$24,690.00 USD", "https://watchdna.com/products/norqain-wild-one-skeleton-chrono-red-gold-limited-edition-n3002-40g01-b01"),
    Timepiece("RESERVOIR Longbridge Club Rose Gold RSV01.LB/630-177", "RESERVOIR", "$19,456.00 USD", "https://watchdna.com/products/reservoir-longbridge-club-rose-gold-rsv01-lb-630-177-new"),
    Timepiece("ARILUS Grand Arc édition Chamonix Métiers d'Art", "ARILUS", "$18,423.00 USD", "https://watchdna.com/products/arilus-grand-arc-edition-chamonix-metiers-dart-new"),
    Timepiece("CORLEONE EVOLUZIONE SUPERLEGGERA P0559HACF", "CORLEONE", "$16,526.00 USD", "https://watchdna.com/products/corleone-evoluzione-superleggera-p0559hacf-new"),
    Timepiece("CORLEONE EVOLUZIONE SUPERLEGGERA P0558HACF", "CORLEONE", "$16,526.00 USD", "https://watchdna.com/products/corleone-evoluzione-superleggera-p0558hacf-new"),
    Timepiece("PEQUIGNET Attitude Tiger's Eye gold, 39mm 9061268", "PEQUIGNET", "$12,556.25 USD", "https://watchdna.com/products/pequignat-attitude-tiger-s-eye-gold-39mm-9061268-new"),
    Timepiece("PEQUIGNET Royale Saphir 42mm 9010892", "PEQUIGNET", "$12,426.91 USD", "https://watchdna.com/products/pequignat-royale-saphir-42mm-9010892-new"),
    Timepiece("PEQUIGNET Royale Saphir 42mm 9010882", "PEQUIGNET", "$12,426.91 USD", "https://watchdna.com/products/pequignat-royale-saphir-42mm-9010882-new"),
    Timepiece("PEQUIGNET Royale Saphir 42mm 9010872", "PEQUIGNET", "$12,426.91 USD", "https://watchdna.com/products/pequignat-royale-saphir-42mm-9010872-new"),
    Timepiece("PEQUIGNET Royale Saphir 42mm 9010862", "PEQUIGNET", "$12,426.91 USD", "https://watchdna.com/products/pequignat-royale-saphir-42mm-9010862-new"),
    Timepiece("PEQUIGNET Royale Saphir 42mm 9010822", "PEQUIGNET", "$12,426.91 USD", "https://watchdna.com/products/pequignat-royale-saphir-42mm-9010822-new"),
    Timepiece("NORQAIN Wild ONE Skeleton X-Lite Limited Edition N3003.26X01.B01", "NORQAIN", "$13,900.00 USD", "https://watchdna.com/products/norqain-wild-one-skeleton-x-lite-limited-edition-n3003-26x01-b01"),
    Timepiece("PEQUIGNET Royale Paris 39,5 mm 9100633", "PEQUIGNET", "$9,812.48 USD", "https://watchdna.com/products/pequignat-royale-paris-39-5-mm-9100633-new"),
    Timepiece("NORQAIN Wild ONE Skeleton Chrono Limited Edition N3002.40Q02.B01", "NORQAIN", "$9,490.00 USD", "https://watchdna.com/products/norqain-wild-one-skeleton-chrono-limited-edition-n3002-40q02-b01"),
    Timepiece("NORQAIN Wild ONE Skeleton Chrono N3002.40Q01.B07", "NORQAIN", "$9,390.00 USD", "https://watchdna.com/products/norqain-wild-one-skeleton-chrono-n3002-40q01-b07"),
    Timepiece("PEQUIGNET Royale Paris 39,5 mm 9100693", "PEQUIGNET", "$9,233.28 USD", "https://watchdna.com/products/pequignat-royale-paris-39-5-mm-9100693-new"),
    Timepiece("PEQUIGNET Royale Paris Icy Blue 39,5 mm 9100613", "PEQUIGNET", "$9,233.28 USD", "https://watchdna.com/products/pequignat-royale-paris-icy-blue-39-5-mm-9100613-new"),
    Timepiece("PIECES D'EXCEPTION P0612HAB", "PILO & CO GENEVE", "$8,883.00 USD", "https://watchdna.com/products/pilo-co-geneve-pieces-dexception-p0612hab-grey-silicon-strap"),
    Timepiece("PIECES D'EXCEPTION P0611HABI", "PILO & CO GENEVE", "$8,702.00 USD", "https://watchdna.com/products/pilo-co-geneve-pieces-dexception-p0611habi-grey-silicon-strap"),
    Timepiece("PIECES D'EXCEPTION P0609HAB", "PILO & CO GENEVE", "$8,599.00 USD", "https://watchdna.com/products/pilo-co-geneve-pieces-dexception-p0609hab-grey-silicon-strap"),
    Timepiece("PIECES D'EXCEPTION P0608HAGR", "PILO & CO GENEVE", "$8,599.00 USD", "https://watchdna.com/products/pilo-co-geneve-pieces-dexception-p0608hagr-grey-silicon-strap"),
    Timepiece("PIECES D'EXCEPTION P0607HAGR", "PILO & CO GENEVE", "$8,599.00 USD", "https://watchdna.com/products/pilo-co-geneve-pieces-dexception-p0607hagr-grey-silicon-strap"),
    Timepiece("PIECES D'EXCEPTION P0610HAS", "PILO & CO GENEVE", "$8,573.00 USD", "https://watchdna.com/products/pilo-co-geneve-pieces-dexception-p0610has-grey-silicon-strap"),
    Timepiece("PIECES D'EXCEPTION P0606HAS", "PILO & CO GENEVE", "$8,289.00 USD", "https://watchdna.com/products/pilo-co-geneve-pieces-dexception-p0606has-blue-silicon-strap"),
    Timepiece("PIECES D'EXCEPTION P0605HAS", "PILO & CO GENEVE", "$8,289.00 USD", "https://watchdna.com/products/pilo-co-geneve-pieces-dexception-p0605has-chocolate-silicon-strap"),
    Timepiece("PIECES D'EXCEPTION P0604HAS", "PILO & CO GENEVE", "$8,289.00 USD", "https://watchdna.com/products/pilo-co-geneve-pieces-dexception-p0604has-silver-silicon-strap"),
    Timepiece("PIECES D'EXCEPTION P0603HAS", "PILO & CO GENEVE", "$8,289.00 USD", "https://watchdna.com/products/pilo-co-geneve-pieces-dexception-p0603has-grey-silicon-strap"),
    Timepiece("innerG", "COMPASS", "$7,500.00 USD", "https://watchdna.com/products/innerg"),
    Timepiece("RESERVOIR GT Tour Carbon RSV11.GT/530-11", "RESERVOIR", "$7,227.00 USD", "https://watchdna.com/products/reservoir-gt-tour-carbon-rsv11-gt-530-11-new"),
    Timepiece("Titan 2 (White)", "COMPASS", "$7,100.00 USD", "https://watchdna.com/products/titan-2-white"),
    Timepiece("Titan 2 (Navy Blue)", "COMPASS", "$7,100.00 USD", "https://watchdna.com/products/titan-2-navy-blue"),
    Timepiece("Titan 2 (Black)", "COMPASS", "$7,100.00 USD", "https://watchdna.com/products/titan-2-black"),
    Timepiece("PEQUIGNET Royale Paris Corail 39,5mm 9100123", "PEQUIGNET", "$6,697.72 USD", "https://watchdna.com/products/pequignat-royale-paris-corail-39-5mm-9100123"),
    Timepiece("Voyager (Silver)", "COMPASS", "$6,600.00 USD", "https://watchdna.com/products/voyager-silver"),
    Timepiece("Voyager (Black/Gold)", "COMPASS", "$6,600.00 USD", "https://watchdna.com/products/voyager-black-gold"),
    Timepiece("RESERVOIR Sonomaster Chronograph Modern RSV04.SN/136.SI.BA", "RESERVOIR", "$6,450.00 USD", "https://watchdna.com/products/reservoir-sonomaster-chronograph-modern-rsv04-sn-136-si-ba"),
    Timepiece("RESERVOIR Sonomaster Chronograph Vintage RSV04.SN/136.BL.BA", "RESERVOIR", "$6,450.00 USD", "https://watchdna.com/products/reservoir-sonomaster-chronograph-vintage-rsv04-sn-136-bl-ba"),
    Timepiece("NORQAIN Freedom Chrono Enjoy Life \"Sprinkles\" N2201.19S04.K01", "NORQAIN", "$6,290.00 USD", "https://watchdna.com/products/norqain-freedom-chrono-enjoy-life-sprinkles-n2201-19s04-k01"),
    Timepiece("NORQAIN Freedom Chrono Enjoy Life \"Sprinkles\" N2201.19S04.A01", "NORQAIN", "$6,290.00 USD", "https://watchdna.com/products/norqain-freedom-chrono-enjoy-life-sprinkles-n2201-19s04-a01"),
    Timepiece("RESERVOIR Airfight Chronograph RSV02.AF/136.BL", "RESERVOIR", "$6,231.00 USD", "https://watchdna.com/products/reservoir-airfight-chronograph-rsv02-af-136-bl-new"),
    Timepiece("RESERVOIR Airfight Chronograph RSV02.AF/136", "RESERVOIR", "$6,231.00 USD", "https://watchdna.com/products/reservoir-airfight-chronograph-rsv02-af-136-new"),
    Timepiece("RESERVOIR Sonomaster Chronograph Black Thunder RSV04.SN/136.BT", "RESERVOIR", "$6,145.00 USD", "https://watchdna.com/products/reservoir-sonomaster-chronograph-black-thunder-rsv04-sn-136-bt"),
    Timepiece("RESERVOIR Sonomaster Chronograph Modern RSV04.SN/136.SI", "RESERVOIR", "$6,145.00 USD", "https://watchdna.com/products/reservoir-sonomaster-chronograph-modern-rsv04-sn-136-si-new"),
    Timepiece("RESERVOIR Sonomaster Chronograph Vintage RSV04.SN/136.BL", "RESERVOIR", "$6,145.00 USD", "https://watchdna.com/products/reservoir-sonomaster-chronograph-vintage-rsv04-sn-136-bl-new"),
    Timepiece("NORQAIN Independence Skeleton Chrono 42mm N3200.40S02.B01.R01", "NORQAIN", "$6,140.00 USD", "https://watchdna.com/products/norqain-independence-skeleton-chrono-42mm-n3200-40s02-b01-r01"),
    Timepiece("RESERVOIR MONZA Design 315W RSV01.MD/138.WH", "RESERVOIR", "$5,907.00 USD", "https://watchdna.com/products/reservoir-monza-design-315w-rsv01-md-138-wh"),
    Timepiece("RESERVOIR MONZA Design 325Y RSV01.MD/138.YL", "RESERVOIR", "$5,907.00 USD", "https://watchdna.com/products/reservoir-monza-design-325y-rsv01-md-138-yl"),
    Timepiece("RESERVOIR MONZA Design 315B RSV01.MD/138.BK", "RESERVOIR", "$5,907.00 USD", "https://watchdna.com/products/reservoir-monza-design-315b-rsv01-md-138-bk"),
    Timepiece("RESERVOIR GT Tour Racing RSV01.GT/130.CA_BA", "RESERVOIR", "$5,781.00 USD", "https://watchdna.com/products/reservoir-gt-tour-racing-rsv01-gt-130-ca-ba-new"),
    Timepiece("PEQUIGNET Royale Paris, bezel with diamonds, 36mm 9106369/1", "PEQUIGNET", "$5,758.26 USD", "https://watchdna.com/products/pequignat-royale-paris-bezel-with-diamonds-36mm-9106369-1"),
    Timepiece("PEQUIGNET Concorde Damas 36 mm 9046233", "PEQUIGNET", "$5,657.59 USD", "https://watchdna.com/products/pequignat-concorde-damas-36-mm-9046233"),
    Timepiece("NORQAIN Wild ONE 42mm Skeleton Coral N3000.O7Q31.B13.R01", "NORQAIN", "$5,598.00 USD", "https://watchdna.com/products/norqain-wild-one-42mm-skeleton-coral-n3000-o7q31-b13-r01"),
    Timepiece("NORQAIN Wild ONE 39mm Skeleton Purple Hyperpink N3001.O7Q04.B03.R01", "NORQAIN", "$5,598.00 USD", "https://watchdna.com/products/norqain-wild-one-39mm-skeleton-purple-hyperpink-n3001-o7q04-b03-r01"),
    Timepiece("NORQAIN Wild ONE 42mm Skeleton Grey N3000.O7Q42.B18", "NORQAIN", "$5,598.00 USD", "https://watchdna.com/products/norqain-wild-one-42mm-skeleton-grey-n3000-o7q42-b18"),
    Timepiece("PEQUIGNET Concorde Titane 36mm 9045336", "PEQUIGNET", "$5,540.02 USD", "https://watchdna.com/products/pequignat-concorde-titane-36mm-9045336"),
    Timepiece("NORQAIN Adventure Chrono 41mm NHL Limited Edition N1500.17S05.W01", "NORQAIN", "$5,490.00 USD", "https://watchdna.com/products/norqain-adventure-chrono-41mm-nhl-limited-edition-n1500-17s05-w01"),
    Timepiece("RESERVOIR Longbridge British Racing (First Gen) RSV01.LB/130-62sFG", "RESERVOIR", "$5,355.00 USD", "https://watchdna.com/products/reservoir-longbridge-british-racing-first-gen-rsv01-lb-130-62sfg-new"),
    Timepiece("RESERVOIR GT Tour Racing RSV01.GT/130.CA", "RESERVOIR", "$5,336.00 USD", "https://watchdna.com/products/reservoir-gt-tour-racing-rsv01-gt-130-ca-new"),
    Timepiece("RESERVOIR Kanister RSV01.KN/433-BK4", "RESERVOIR", "$5,225.00 USD", "https://watchdna.com/products/reservoir-kanister-rsv01-kn-433-bk4-new"),
    Timepiece("RESERVOIR GT Tour RSV01.GT/131-12_BA", "RESERVOIR", "$5,114.00 USD", "https://watchdna.com/products/reservoir-gt-tour-rsv01-gt-131-12-ba-new"),
    Timepiece("Corleone P0547HAGR", "PILO & CO GENEVE", "$5,049.00 USD", "https://watchdna.com/products/pilo-co-geneve-corleone-p0547hagr-grey-silicone"),
    Timepiece("RESERVOIR Airfight Titane RSV02.AF/430-122", "RESERVOIR", "$5,020.00 USD", "https://watchdna.com/products/reservoir-airfight-titane-rsv02-af-430-122-new"),
    Timepiece("RESERVOIR Kanister 316 Silver RSV01.KN/133.SI.BA", "RESERVOIR", "$5,003.00 USD", "https://watchdna.com/products/reservoir-kanister-316-silver-rsv01-kn-133-si-ba-new"),
    Timepiece("RESERVOIR Kanister RSV01.KN/433-BK1", "RESERVOIR", "$5,003.00 USD", "https://watchdna.com/products/reservoir-kanister-rsv01-kn-433-bk1-new"),
    Timepiece("RESERVOIR Kanister 316 RSV01.KN/133/BA", "RESERVOIR", "$5,003.00 USD", "https://watchdna.com/products/reservoir-kanister-316-rsv01-kn-133-ba-new"),
    Timepiece("RESERVOIR Longbridge Club 415 RSV01.LB/133-12s", "RESERVOIR", "$5,003.00 USD", "https://watchdna.com/products/reservoir-longbridge-club-415-rsv01-lb-133-12s-new"),
    Timepiece("RESERVOIR Battlefield D-day RSV01.BF/230-62", "RESERVOIR", "$4,909.00 USD", "https://watchdna.com/products/reservoir-battlefield-d-day-rsv01-bf-230-62-new"),
    Timepiece("RESERVOIR Airfight Titane (First Gen) RSV02.AF/430-122FG", "RESERVOIR", "$4,909.00 USD", "https://watchdna.com/products/reservoir-airfight-titane-first-gen-rsv02-af-430-122fg-new"),
    Timepiece("RESERVOIR Longbridge Blue RSV01.LB/132.BL", "RESERVOIR", "$4,892.00 USD", "https://watchdna.com/products/reservoir-longbridge-blue-rsv01-lb-132-bl-new"),
    Timepiece("RESERVOIR GT Tour Spring Lap RSV01.GT/130.SL_BA", "RESERVOIR", "$4,892.00 USD", "https://watchdna.com/products/reservoir-gt-tour-spring-lap-rsv01-gt-130-sl-ba-new"),
    Timepiece("RESERVOIR Longbridge British Racing 415 RSV01.LB/133.BR.BA", "RESERVOIR", "$4,892.00 USD", "https://watchdna.com/products/reservoir-longbridge-british-racing-415-rsv01-lb-133-br-ba-new"),
    Timepiece("RESERVOIR Supercharged Classic Red Zone RSV01.SC/130-21r25", "RESERVOIR", "$4,892.00 USD", "https://watchdna.com/products/reservoir-supercharged-classic-red-zone-rsv01-sc-130-21r25-new"),
    Timepiece("RESERVOIR GT Tour Blue Edition RSV01.GT/130-32", "RESERVOIR", "$4,892.00 USD", "https://watchdna.com/products/reservoir-gt-tour-blue-edition-rsv01-gt-130-32-new"),
    Timepiece("RESERVOIR Supercharged Classic RSV01.SC/130-21", "RESERVOIR", "$4,892.00 USD", "https://watchdna.com/products/reservoir-supercharged-classic-rsv01-sc-130-21-new"),
    Timepiece("RESERVOIR GT Tour 371 SE RSV11.GT/130-12", "RESERVOIR", "$4,892.00 USD", "https://watchdna.com/products/reservoir-gt-tour-371-se-rsv11-gt-130-12-new"),
    Timepiece("RESERVOIR Longbridge British Racing RSV01.LB/130-62s", "RESERVOIR", "$4,892.00 USD", "https://watchdna.com/products/reservoir-longbridge-british-racing-rsv01-lb-130-62s-new"),
    Timepiece("RESERVOIR Longbridge Club RSV01.LB/130-12s", "RESERVOIR", "$4,892.00 USD", "https://watchdna.com/products/reservoir-longbridge-club-rsv01-lb-130-12s-new"),
    Timepiece("RESERVOIR GT Tour RSV01.GT/131-12", "RESERVOIR", "$4,892.00 USD", "https://watchdna.com/products/reservoir-gt-tour-rsv01-gt-131-12-new"),
    Timepiece("RESERVOIR Longbridge Club 415 RSV01.LB/133.CL.BA", "RESERVOIR", "$4,892.00 USD", "https://watchdna.com/products/reservoir-longbridge-club-415-rsv01-lb-133-cl-ba-new"),
    Timepiece("RESERVOIR Airfight Jet RSV02.AF/130-15", "RESERVOIR", "$4,892.00 USD", "https://watchdna.com/products/reservoir-airfight-jet-rsv02-af-130-15-new"),
    Timepiece("RESERVOIR Hydrosphere Blue Hole RSV03.HY/130-21.BH", "RESERVOIR", "$4,875.00 USD", "https://watchdna.com/products/reservoir-hydrosphere-blue-hole-rsv03-hy-130-21-bh-new"),
    Timepiece("RESERVOIR Hydrosphere Blackfin RSV03.HY/130-21.BF", "RESERVOIR", "$4,875.00 USD", "https://watchdna.com/products/reservoir-hydrosphere-blackfin-rsv03-hy-130-21-bf-new"),
    Timepiece("RESERVOIR Hydrosphere Air Gauge RSV03.HY/130-21.AG", "RESERVOIR", "$4,875.00 USD", "https://watchdna.com/products/reservoir-hydrosphere-air-gauge-rsv03-hy-130-21-ag-new"),
    Timepiece("RESERVOIR Hydrosphere Cenote RSV03.HY/334.GR", "RESERVOIR", "$4,875.00 USD", "https://watchdna.com/products/reservoir-hydrosphere-cenote-rsv03-hy-334-gr-new"),
    Timepiece("RESERVOIR Kanister Silver RSV01.KN/433.SI", "RESERVOIR", "$4,875.00 USD", "https://watchdna.com/products/reservoir-kanister-silver-rsv01-kn-433-si-new"),
    Timepiece("RESERVOIR Tiefenmesser RSV03.TF/130-23_BA", "RESERVOIR", "$4,863.00 USD", "https://watchdna.com/products/reservoir-tiefenmesser-rsv03-tf-130-23-ba-new"),
    Timepiece("RESERVOIR Tiefenmesser Bronze RSV03.TF/330-233", "RESERVOIR", "$4,863.00 USD", "https://watchdna.com/products/reservoir-tiefenmesser-bronze-rsv03-tf-330-233-new"),
    Timepiece("RESERVOIR Hydrosphere Bronze Blue RSV03.HY/334.BL", "RESERVOIR", "$4,831.00 USD", "https://watchdna.com/products/reservoir-hydrosphere-bronze-blue-rsv03-hy-334-bl-new"),
    Timepiece("RESERVOIR Kanister Silver Guilloché RSV01.KN/433.GU", "RESERVOIR", "$4,831.00 USD", "https://watchdna.com/products/reservoir-kanister-silver-guilloche-rsv01-kn-433-gu-new"),
    Timepiece("RESERVOIR Tiefenmesser Bronze (First Gen) RSV03.TF/330-233FG", "RESERVOIR", "$4,831.00 USD", "https://watchdna.com/products/reservoir-tiefenmesser-bronze-first-gen-rsv03-tf-330-233fg-new"),
    Timepiece("PEQUIGNET Concorde Blue Navy 40 mm 9040473", "PEQUIGNET", "$4,789.39 USD", "https://watchdna.com/products/pequignat-concorde-blue-navy-40-mm-9040473"),
    Timepiece("PEQUIGNET Royale Paris Manual 39,5mm 9100033", "PEQUIGNET", "$4,504.85 USD", "https://watchdna.com/products/pequignet-royale-paris-manual-39-5mm-9100033"),
    Timepiece("NORQAIN Adventure Sport Chrono 44mm \"Golden Hour\"", "NORQAIN", "$5,590.00 USD", "https://watchdna.com/products/norqain-adventure-sport-chrono-44mm-golden-hour"),
    Timepiece("RESERVOIR Longbridge British Racing 415 RSV01.LB/133-62s", "RESERVOIR", "$4,392.00 USD", "https://watchdna.com/products/reservoir-longbridge-british-racing-415-rsv01-lb-133-62s-new"),
    Timepiece("RESERVOIR 390 Fastback x HEROES RSV01.3F/133.HR", "RESERVOIR", "$4,392.00 USD", "https://watchdna.com/products/reservoir-390-fastback-x-heroes-rsv01-3f-133-hr-new"),
    Timepiece("RESERVOIR Airfight Propeller (First Gen) RSV02.AF/230-122FG", "RESERVOIR", "$4,392.00 USD", "https://watchdna.com/products/reservoir-airfight-propeller-first-gen-rsv02-af-230-122fg-new"),
    Timepiece("PEQUIGNET Concorde Silver 36 mm 9046433", "PEQUIGNET", "$4,212.65 USD", "https://watchdna.com/products/pequignet-concorde-siver-36-mm-9046433"),
    Timepiece("Corleone P0552HAGR", "PILO & CO GENEVE", "$4,333.00 USD", "https://watchdna.com/products/pilo-co-geneve-corleone-p0552hagr-white-silicone"),
    Timepiece("Marinemaster M-44 Black Resin Gold F8120015", "FORTIS", "$4,100.00 USD", "https://watchdna.com/products/marinemaster-m-44-black-resin-gold"),
    Timepiece("RESERVOIR 390 Fastback RSV01.3F/133.BL", "RESERVOIR", "$3,995.00 USD", "https://watchdna.com/products/reservoir-390-fastback-rsv01-3f-133-bl-new"),
    Timepiece("RESERVOIR 390 Fastback RSV01.3F/133.GR", "RESERVOIR", "$3,995.00 USD", "https://watchdna.com/products/reservoir-390-fastback-rsv01-3f-133-gr-new"),
    Timepiece("RESERVOIR Black Sparrow RSV02.PL/135.WH", "RESERVOIR", "$3,995.00 USD", "https://watchdna.com/products/reservoir-black-sparrow-rsv02-pl-135-wh-new"),
    Timepiece("NORQAIN Freedom 60 Chrono 43mm N2200.18S01.C01", "NORQAIN", "$3,990.00 USD", "https://watchdna.com/products/norqain-freedom-60-chrono-43mm-n2200-18s01-c01"),
    Timepiece("RESERVOIR Black Sparrow RSV02.PL/135.BL", "RESERVOIR", "$3,878.00 USD", "https://watchdna.com/products/reservoir-black-sparrow-rsv02-pl-135-bl-new"),
    Timepiece("RESERVOIR Black Sparrow RSV02.PL/135.SB", "RESERVOIR", "$3,878.00 USD", "https://watchdna.com/products/reservoir-black-sparrow-rsv02-pl-135-sb-new"),
    Timepiece("RESERVOIR 390 Fastback RSV01.3F/133.BK", "RESERVOIR", "$3,878.00 USD", "https://watchdna.com/products/reservoir-390-fastback-rsv01-3f-133-bk-new"),
    Timepiece("PEQUIGNET Royale Paris 36mm 9106363", "PEQUIGNET", "$3,636.33 USD", "https://watchdna.com/products/pequignat-royale-paris-36mm-9106363"),
    Timepiece("RESERVOIR Blake et Mortimer \"By Jove !!!\" RSV04.BM/133.BA", "RESERVOIR", "$3,595.00 USD", "https://watchdna.com/products/reservoir-blake-et-mortimer-by-jove-rsv04-bm-133-ba-new"),
    Timepiece("PEQUIGNET Attitude Elysée 39 mm 9060313/RF", "PEQUIGNET", "$3,212.00 USD", "https://watchdna.com/products/pequignet-attitude-elysee-39-mm-9060313-rf"),
    Timepiece("Vagabond V-40 Urban Shadow F6660004", "VAGABOND", "$3,000.00 USD", "https://watchdna.com/products/vagabond-v-40-urban-shadow"),
    Timepiece("Vagabond V-40 Stormy Gray F6660000", "VAGABOND", "$3,000.00 USD", "https://watchdna.com/products/vagabond-v-40-stormy-gray"),
    Timepiece("PEQUIGNET Attitude Tiger's Eye steel, 39mm 9060263", "PEQUIGNET", "$2,999.00 USD", "https://watchdna.com/products/pequignet-attitude-tigers-eye-steel-39mm-9060263")
)

@Composable
fun TimepiecesScreen(modifier: Modifier = Modifier) {
    val uriHandler = LocalUriHandler.current

    LazyColumn(modifier = modifier.fillMaxSize()) {
        items(watchDnaTimepieces) { timepiece ->
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable { uriHandler.openUri(timepiece.url) }
                    .padding(horizontal = 16.dp, vertical = 12.dp)
            ) {
                Text(
                    text = timepiece.title,
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