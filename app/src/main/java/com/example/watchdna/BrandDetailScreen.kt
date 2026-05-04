package com.example.watchdna

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Watch
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

// Each entry is a list of (section heading, section body) pairs
val brandDatabase: Map<String, List<Pair<String, String>>> = mapOf(

    "Rolex" to listOf(
        "Overview" to "Founded in 1905 by Hans Wilsdorf and Alfred Davis, Rolex is the world's most recognized luxury watch brand. Headquartered in Geneva, Switzerland, Rolex is known for attractive design, reliability, durability, and exceptional resale value.",
        "Heritage" to "In 1910, Rolex received its first Swiss Certificate of Chronometric Precision. The 1926 Oyster case became the world's first waterproof watch, and the 1931 Perpetual rotor introduced self-winding mechanics. Rolex celebrates its 120th anniversary in 2025.",
        "Iconic Collections" to "• Submariner (1953) — the original dive watch\n• GMT-Master (1954) — built for pilots and world travelers\n• Daytona (1963) — inspired by motorsport\n• Datejust — the quintessential dress sports watch\n• Oyster Perpetual — the foundation of the Rolex lineup",
        "Price Range" to "Entry ~$7,000 (Oyster Perpetual) · Mid ~$15,000–$30,000 · Complications & rare models $50,000–$75,000+",
        "Origin" to "Geneva, Switzerland · Founded 1905"
    ),

    "Tudor" to listOf(
        "Overview" to "Tudor was created in 1926 by Hans Wilsdorf — the same founder as Rolex — as a more accessible line of watches that maintained Rolex's quality and reliability. Headquartered in Geneva, Tudor has experienced a major brand resurgence since 2010.",
        "Heritage" to "The 1932 Oyster Prince was Tudor's first waterproof watch. In 1954, Tudor launched its own Submariner for professional divers, later adopted by the French and US Navies. The 2007 Heritage collection reconnected the brand to its roots.",
        "Iconic Collections" to "• Black Bay — heritage-inspired dive watches\n• Pelagos — high-performance titanium divers\n• Ranger — rugged field watches\n• 1926 — classic dress line\n• Fastrider — sporty chronographs",
        "Price Range" to "Entry ~$1,500 · Mid ~$3,000–$5,500 · Complications ~$6,000–$8,000+",
        "Origin" to "Geneva, Switzerland · Founded 1926"
    ),

    "Omega" to listOf(
        "Overview" to "Founded in 1848 by Louis Brandt in La Chaux-de-Fonds, Switzerland, Omega is one of the world's most prestigious watch manufacturers. Headquartered in Biel/Bienne, Omega combines classical style with cutting-edge technology.",
        "Heritage" to "Omega became the official Olympic Games timekeeper in 1932. In 1957, the Speedmaster launched as the first chronograph with a tachymeter scale. In 1969, the Speedmaster became the first watch worn on the Moon during Apollo 11. The Seamaster became James Bond's watch of choice in 1995.",
        "Iconic Collections" to "• Speedmaster — the Moonwatch\n• Seamaster — professional diving and James Bond\n• Constellation — elegant precision since 1952\n• De Ville — refined dress watches\n• Aqua Terra — versatile sport-elegance",
        "Price Range" to "Entry ~$3,000 · Mid ~$7,000–$15,000 · High complications $20,000–$30,000+",
        "Origin" to "Biel/Bienne, Switzerland · Founded 1848"
    ),

    "Patek Philippe" to listOf(
        "Overview" to "Founded in 1839 by Antoine Norbert de Patek and Adrien Philippe in Geneva, Switzerland, Patek Philippe is widely regarded as one of the most prestigious watchmakers in the world. It remains one of the last fully independent Geneva watch manufacturers.",
        "Heritage" to "In 1851, Patek Philippe won a medal at the Great Exhibition in London. The 1925 Calatrava became an iconic design. In 1933, the Graves Supercomplication pocket watch was completed — the most complex watch of its era. The 1976 Nautilus redefined luxury sports watches.",
        "Iconic Collections" to "• Nautilus — the iconic porthole-inspired sports watch\n• Aquanaut — modern sporty interpretation\n• Calatrava — definitive dress watch\n• Complications — perpetual calendars, minute repeaters, tourbillons\n• Grand Complications — the pinnacle of mechanical watchmaking",
        "Price Range" to "Entry ~$20,000 (Calatrava) · Nautilus ~$35,000–$100,000+ · Complications $80,000–$1M+",
        "Origin" to "Geneva, Switzerland · Founded 1839"
    ),

    "Vacheron Constantin" to listOf(
        "Overview" to "Founded in 1755 in Geneva by Jean-Marc Vacheron, Vacheron Constantin is the world's oldest continuously operating watch manufacturer. Francois Constantin joined in 1819, formalizing the brand's enduring partnership.",
        "Heritage" to "Vacheron Constantin is part of the Richemont Group since 1996. In 2016, the Celestia astronomical watch with 23 functions was introduced. In 2025, the brand celebrates its 270th anniversary — an unbroken legacy of haute horlogerie.",
        "Iconic Collections" to "• Overseas — luxury sports watch for world travelers\n• Patrimony — ultra-thin dress timepieces\n• Traditionnelle — classical grande complication\n• Historiques — heritage-inspired recreations\n• Métiers d'Art — artistic craftsmanship",
        "Price Range" to "Entry ~$20,000 · Mid ~$40,000–$80,000 · Grand complications $150,000–$1M+",
        "Origin" to "Geneva, Switzerland · Founded 1755"
    ),

    "Audemars Piguet" to listOf(
        "Overview" to "Founded in 1875 by Jules-Louis Audemars and Edward-Auguste Piguet in Le Brassus, Vallée de Joux, Switzerland, Audemars Piguet is one of the oldest and most revered independent watch manufacturers, renowned for some of the world's finest and most complicated mechanical watches.",
        "Heritage" to "In 1972, Gerald Genta sketched the Royal Oak — the world's first luxury sports watch in stainless steel with an octagonal bezel and hexagonal screws. In 1993, AP introduced the Royal Oak Offshore, pushing boundaries further. The brand remains fully independent and family-controlled.",
        "Iconic Collections" to "• Royal Oak — the icon that redefined luxury sports watches\n• Royal Oak Offshore — bold, high-performance variant\n• Royal Oak Concept — avant-garde complications\n• Code 11.59 — contemporary dress collection\n• Millenary — oval-case creative watchmaking",
        "Price Range" to "Royal Oak entry ~$22,000 · Offshore ~$35,000–$80,000 · Complications $100,000–$500,000+",
        "Origin" to "Le Brassus, Vallée de Joux, Switzerland · Founded 1875"
    ),

    "A. Lange & Söhne" to listOf(
        "Overview" to "Founded in 1845 in Glashütte, Germany, A. Lange & Söhne is the pinnacle of German haute horlogerie. The brand is celebrated for meticulous hand-finishing, innovative complications, and its distinctive Saxon watchmaking heritage.",
        "Heritage" to "Each Lange timepiece reflects the traditions of Glashütte's precision watchmaking culture. Signature design elements — the outsize date, three-quarter plate, and artisanal engraving — are instantly recognizable. Today part of the Richemont Group, the brand creates heirloom-quality watches designed to endure for generations.",
        "Iconic Collections" to "• Lange 1 — the signature outsize date design\n• Datograph — considered one of the finest chronographs ever made\n• Zeitwerk — digital jumping hours with mechanical precision\n• Richard Lange — scientific instrument aesthetic\n• Tourbograph — tourbillon chronograph masterpiece",
        "Price Range" to "Entry ~$15,000 · Mid ~$30,000–$80,000 · Grand complications $150,000–$500,000+",
        "Origin" to "Glashütte, Germany · Founded 1845"
    ),

    "Jaeger-LeCoultre" to listOf(
        "Overview" to "Founded in 1833 by Antoine LeCoultre in Le Sentier, Switzerland, Jaeger-LeCoultre is one of the most prestigious and technically accomplished watchmakers in the world. The manufacture produces its own movements and has served as a supplier to other luxury brands.",
        "Heritage" to "In 1844, LeCoultre developed the Millionometer — a tool for measuring to a thousandth of a millimeter. The 1931 Reverso flip case remains one of watchmaking's most iconic designs. The 1937 Atmos clock, powered by temperature changes, cemented the brand's engineering reputation.",
        "Iconic Collections" to "• Reverso — the Art Deco flip-case masterpiece (1931)\n• Master — precision and elegance\n• Duomètre — dual-regulator innovation\n• Polaris — sporty aquatic collection\n• Hybris Artistica — ultra-complicated creations",
        "Price Range" to "Entry ~$6,000 · Mid ~$15,000–$40,000 · Grande Complications $80,000–$150,000+",
        "Origin" to "Le Sentier, Switzerland · Founded 1833"
    ),

    "IWC Schaffhausen" to listOf(
        "Overview" to "Founded in 1868 by American engineer Florentine Ariosto Jones in Schaffhausen, Switzerland, IWC Schaffhausen blends American-Swiss engineering philosophy with Swiss craftsmanship. The brand joined the Richemont Group in 2000 and celebrated its 155th anniversary in 2023.",
        "Heritage" to "IWC opened its first purpose-built factory on the Rhine in 1875. In 1978, CEO Günter Blümlein initiated a strategic transformation that redefined the brand's identity. IWC watches are built to last for generations, combining modern production methods with traditional horological technique.",
        "Iconic Collections" to "• Pilot's Watches — aviation heritage, most notably the Big Pilot\n• Portugieser — elegant large-format dress watches\n• Aquatimer — professional dive watches\n• Ingenieur — engineering-inspired sports watches\n• Portofino — slim, refined dress collection",
        "Price Range" to "Entry ~$5,000 · Mid ~$10,000–$25,000 · Complications $40,000–$80,000+",
        "Origin" to "Schaffhausen, Switzerland · Founded 1868"
    ),

    "Cartier" to listOf(
        "Overview" to "Founded in 1847 by Louis-François Cartier in Paris, France, Cartier is a legendary French luxury house known for haute jewelry and iconic watches. Part of the Richemont Group, Cartier watches are considered status symbols and are associated with royalty and celebrities worldwide.",
        "Heritage" to "In 1904, Cartier created the Santos wristwatch for Brazilian aviator Alberto Santos-Dumont — widely considered the first men's wristwatch. The 1917 Tank watch remains one of the most iconic watch designs in history, inspired by the geometric lines of WWI tanks.",
        "Iconic Collections" to "• Santos — the original men's wristwatch (1904)\n• Tank — the Art Deco icon (1917)\n• Ballon Bleu — modern round elegance\n• Pasha — bold sporty design (1985)\n• Panthere — the quintessential ladies' Cartier",
        "Price Range" to "Entry ~$3,000 (Santos steel) · Mid ~$8,000–$20,000 · Precious metals & complications $30,000–$100,000+",
        "Origin" to "Paris, France · Founded 1847"
    ),

    "Panerai" to listOf(
        "Overview" to "Founded in 1860 in Florence, Italy, Panerai began as a precision instrument workshop and supplier to the Italian Navy. Today headquartered in Milan and part of the Richemont Group, Panerai is known for bold, large-case watches with a distinctive maritime identity.",
        "Heritage" to "From 1936, Panerai produced watches exclusively for the Italian Navy's special forces — tough, legible, and waterproof. The brand re-launched publicly in 1997 with the Luminor and Radiomir collections. In-house movements (P.2002, P.9100) arrived between 2007–2016.",
        "Iconic Collections" to "• Luminor — crown-protecting device, the signature Panerai\n• Radiomir — cushion-case heritage design\n• Submersible — high-performance diving watches\n• Luminor Due — slim modern interpretation\n• Goldtech — in-house proprietary gold alloy",
        "Price Range" to "Entry ~$5,000 · Mid ~$10,000–$20,000 · Complications & special editions $30,000–$50,000+",
        "Origin" to "Florence, Italy · Founded 1860"
    ),

    "Breitling" to listOf(
        "Overview" to "Founded in 1884 by Léon Breitling in Switzerland, Breitling is renowned for high-quality precision watches designed for pilots, divers, and professionals. Headquartered in Grenchen, Switzerland, Breitling became the NFL's official timepiece partner in 2024.",
        "Heritage" to "In 1923, Breitling introduced the first independent chronograph pushpiece. The 1934 Chronomat was the first wrist chronograph with a circular slide rule. The 1952 Navitimer became a legend among pilots for its aviation calculations. In 1979, Ernest Schneider modernized the company.",
        "Iconic Collections" to "• Navitimer — the aviation chronograph icon (1952)\n• Superocean — professional dive watches\n• Chronomat — sporty versatility\n• Premier — elegant urban collection\n• Endurance Pro — performance sports line",
        "Price Range" to "Entry ~$3,000 · Mid ~$6,000–$12,000 · Complications & limited editions $20,000–$30,000+",
        "Origin" to "Grenchen, Switzerland · Founded 1884"
    ),

    "TAG Heuer" to listOf(
        "Overview" to "Founded in 1860 by Edouard Heuer in St-Imier, Switzerland, TAG Heuer is a leading Swiss luxury sports watch brand now headquartered in La Chaux-de-Fonds and owned by LVMH since 1999. In 2025, the brand returns as Formula 1's official timekeeper.",
        "Heritage" to "In 1869, Heuer patented the first chronograph. The 1911 dashboard chronograph pioneered motorsport timing. The 1964 Carrera was designed for the Carrera Panamericana road race. The 1969 Monaco — worn by Steve McQueen in Le Mans — became one of watchmaking's most iconic pieces.",
        "Iconic Collections" to "• Carrera — racing chronograph icon (1964)\n• Monaco — the square chronograph (1969)\n• Aquaracer — professional dive watches\n• Formula 1 — entry-level sports watches\n• Connected — TAG Heuer's luxury smartwatch",
        "Price Range" to "Entry ~$1,500 (Formula 1) · Mid ~$4,000–$8,000 (Carrera/Monaco) · High ~$15,000–$20,000+",
        "Origin" to "La Chaux-de-Fonds, Switzerland · Founded 1860"
    ),

    "Hublot" to listOf(
        "Overview" to "Founded in 1980 by Carlo Crocco in Nyon, Switzerland, Hublot introduced the radical concept of fusing gold and rubber — an idea dismissed by traditionalists but embraced by collectors. Acquired by LVMH in 2008, Hublot is now one of the world's leading luxury watch brands.",
        "Heritage" to "The 2005 Big Bang collection launched Hublot into the upper tier of Swiss watchmaking. In 2010, Hublot created the first ceramic case watch. In 2012, it became official FIFA World Cup timekeeper. The in-house Unico caliber debuted in 2013.",
        "Iconic Collections" to "• Big Bang — bold, layered case, the signature Hublot\n• Classic Fusion — refined interpretation of the original fusion concept\n• Spirit of Big Bang — barrel-shaped case\n• MP Collection — avant-garde complications\n• Square Bang — angular contemporary design",
        "Price Range" to "Entry ~$6,000 · Mid ~$15,000–$40,000 · High complications $70,000–$100,000+",
        "Origin" to "Nyon, Switzerland · Founded 1980"
    ),

    "Zenith" to listOf(
        "Overview" to "Founded in 1865 by Georges Favre-Jacot in Le Locle, Switzerland, Zenith is celebrated for producing movements entirely in-house and for creating one of watchmaking's most important calibers. Part of LVMH since 1999.",
        "Heritage" to "In 1969, Zenith unveiled the El Primero — considered one of the most accurate and reliable chronograph movements ever made, beating at 36,000 vph. In 2011, the Elite 6150 became the world's thinnest automatic movement. In 2019, the Defy Classic introduced aeronith, an ultra-light composite material.",
        "Iconic Collections" to "• El Primero — the legendary high-frequency chronograph\n• Defy — modern high-performance collection\n• Pilot — aviation heritage watches\n• Elite — refined elegance\n• Chronomaster — chronograph expertise",
        "Price Range" to "Entry ~$4,000 · Mid ~$8,000–$20,000 · Complications $30,000–$50,000+",
        "Origin" to "Le Locle, Switzerland · Founded 1865"
    ),

    "Blancpain" to listOf(
        "Overview" to "Founded in 1735 in Villeret, Switzerland by Jehan-Jacques Blancpain, Blancpain is widely considered the world's oldest surviving watch brand. It is part of the Swatch Group and has never produced a quartz watch.",
        "Heritage" to "Blancpain introduced the Fifty Fathoms in 1953 — the first modern dive watch. The brand pioneered the concept of the Five Grands Complications. After a long hiatus, Blancpain was revived in 1983 and rebuilt as an ultra-premium manufacture.",
        "Iconic Collections" to "• Fifty Fathoms — the original modern dive watch (1953)\n• Villeret — classical complications in the Grande Tradition\n• L-Evolution — avant-garde sports collection\n• Women — high jewelry timepieces\n• Air Command — aviation flyback chronographs",
        "Price Range" to "Entry ~$10,000 · Mid ~$25,000–$60,000 · Grand complications $100,000–$200,000+",
        "Origin" to "Le Brassus, Switzerland · Founded 1735"
    ),

    "Breguet" to listOf(
        "Overview" to "Founded in 1775 in Paris by Abraham-Louis Breguet — one of the greatest horological geniuses in history — Breguet is revered as the inventor of the tourbillon, the self-winding watch, and the shock-protection system. Now based in L'Abbaye, Switzerland, and part of the Swatch Group.",
        "Heritage" to "Breguet's clients included Napoleon Bonaparte, Marie Antoinette, and the Duke of Wellington. In 1801, Breguet patented the tourbillon escapement. The Marine collection has served navies since the 18th century. The brand continues to produce watches of extraordinary horological significance.",
        "Iconic Collections" to "• Classique — refined dress watches with the signature guilloché dial\n• Marine — nautical tradition and precision\n• Tradition — skeleton dial showcasing movement architecture\n• Type XX / Type XXII — aviation chronographs\n• La Musicale — musical complication timepieces",
        "Price Range" to "Entry ~$10,000 · Mid ~$25,000–$60,000 · Tourbillons & rare pieces $100,000–$300,000+",
        "Origin" to "L'Abbaye, Switzerland · Founded 1775"
    ),

    "Girard-Perregaux" to listOf(
        "Overview" to "Founded in 1791 in La Chaux-de-Fonds, Switzerland, Girard-Perregaux is one of the oldest watch manufactures in the world. The brand produces its own movements and is particularly renowned for its tourbillons and tri-axial tourbillons.",
        "Heritage" to "Girard-Perregaux created the first mass-produced wristwatch for the German Imperial Navy in the 1880s. The 1966 Laureato predated the Royal Oak as a luxury steel sports watch. The Tri-Axial Tourbillon — rotating on three axes — is one of watchmaking's great technical achievements.",
        "Iconic Collections" to "• Laureato — the original luxury steel sports watch\n• 1966 — classical elegance\n• Free Bridge Tourbillon — three-bridge architecture\n• Quasar — skeletonized sapphire dial masterpiece\n• Casquette — retro LED digital concept watches",
        "Price Range" to "Entry ~$8,000 · Mid ~$20,000–$50,000 · Tourbillons $80,000–$200,000+",
        "Origin" to "La Chaux-de-Fonds, Switzerland · Founded 1791"
    ),

    "Hamilton" to listOf(
        "Overview" to "Founded in 1892 in Lancaster, Pennsylvania, USA, Hamilton is the bridge between American pioneering spirit and Swiss watchmaking precision. Since 1984, Hamilton has been part of the Swatch Group and is headquartered in Biel/Bienne, Switzerland.",
        "Heritage" to "Hamilton became the official US Army timekeeper in WWI (1914) and official timekeeper for TWA and United Airlines (1932). In 1957, Hamilton created the world's first electric-powered watch — the Ventura, with its iconic triangular case. In 1970, the Pulsar became the world's first digital watch. Hamilton watches have appeared in over 500 films.",
        "Iconic Collections" to "• Khaki — military-inspired field, aviation, and navy watches\n• Ventura — the futuristic triangular icon (1957)\n• Intra-Matic — retro 1960s-inspired automatics\n• American Classic — dress watches with heritage DNA\n• Broadway — bold, contemporary design",
        "Price Range" to "Entry ~$500 · Mid ~$1,000–$2,500 · Premium ~$3,000–$4,000+",
        "Origin" to "Lancaster, USA → Biel/Bienne, Switzerland · Founded 1892"
    ),

    "Longines" to listOf(
        "Overview" to "Founded in 1832 in Saint-Imier, Switzerland by Auguste Agassiz, Longines is one of the world's oldest watch brands. Part of the Swatch Group, Longines is known for over 185 years of precision, innovation, and elegance, with deep roots in sports timekeeping and aviation.",
        "Heritage" to "Longines began producing chronographs in 1867. In 1927, it became the official timekeeper for the International Aviation Federation. The Conquest sports collection launched in 1954. Longines has been the official timekeeper of numerous world championships across alpine skiing, gymnastics, and equestrian sports.",
        "Iconic Collections" to "• HydroConquest — professional dive watches\n• Master Collection — elegant Swiss precision\n• Conquest — sporty heritage\n• Dolce Vita — rectangular dress watches\n• Spirit — pilot watches with aviation heritage",
        "Price Range" to "Entry ~$1,000 · Mid ~$2,500–$5,000 · Premium ~$6,000–$10,000+",
        "Origin" to "Saint-Imier, Switzerland · Founded 1832"
    ),

    "Tissot" to listOf(
        "Overview" to "Founded in 1853 in Le Locle, Switzerland by Charles-Félicien Tissot and his son Charles-Émile, Tissot is a pioneer of innovative watchmaking. Part of the Swatch Group, Tissot emphasizes quality craftsmanship at accessible prices and is the official timekeeper of the NBA, FIBA, and MotoGP.",
        "Heritage" to "In 1930, Tissot introduced the first anti-magnetic watch. In 1971, it released the world's first plastic mechanical watch. In 1990, the T-Touch pioneered touch-sensitive crystal technology. Tissot has been the official timekeeper of numerous major international sports for decades.",
        "Iconic Collections" to "• T-Touch — the original touch-screen Swiss watch\n• PRX — 1970s-inspired integrated bracelet design\n• Seastar — dive watches\n• Gentleman — entry-level Swiss elegance\n• PR516 — heritage sports revival",
        "Price Range" to "Entry ~$300 · Mid ~$600–$1,500 · Premium ~$2,000–$3,000",
        "Origin" to "Le Locle, Switzerland · Founded 1853"
    ),

    "Mido" to listOf(
        "Overview" to "Founded in 1918 in Le Locle, Switzerland, Mido is a Swiss watch brand celebrated for over 100 years of watchmaking heritage. Part of the Swatch Group, Mido draws architectural inspiration for its watch designs — from New York's Chrysler Building to the Swiss city of Multifort.",
        "Heritage" to "In 1938, the Multifort collection introduced shock and water resistance. In 1945, Mido launched the Powerwind — their first self-winding movement. In 1959, the Ocean Star debuted for diving enthusiasts. Mido's design language consistently celebrates the precision and beauty of architecture.",
        "Iconic Collections" to "• Commander — the architectural icon since 1959\n• Multifort — robust field and sport watches\n• Ocean Star — dive collection\n• Baroncelli — elegant slim dress watches\n• Belluna — feminine design collection",
        "Price Range" to "Entry ~$500 · Mid ~$1,000–$2,000 · Premium ~$2,500–$3,000+",
        "Origin" to "Le Locle, Switzerland · Founded 1918"
    ),

    "Rado" to listOf(
        "Overview" to "Founded in 1917 in Lengnau, Switzerland, Rado is a pioneer in high-tech ceramic watchmaking. Part of the Swatch Group, Rado holds a Guinness World Record for the world's hardest watch and has been at the forefront of materials innovation for over a century.",
        "Heritage" to "In 1962, Rado introduced the first scratch-resistant watch using tungsten carbide. In 1986, the Integral became the world's first high-tech ceramic watch. In 1990, the Ceramica was the first entirely ceramic watch. In 2004, the V10K earned the Guinness record for hardest watch.",
        "Iconic Collections" to "• Captain Cook — heritage diver inspired by the 1962 original\n• True — ultra-slim high-tech ceramic\n• Centrix — smooth elegance in ceramic\n• DiaStar — the original scratch-resistant watch (1962)\n• Anatom — ergonomic luxury in ceramic",
        "Price Range" to "Entry ~$700 · Mid ~$1,500–$3,000 · Premium ~$4,000–$5,000+",
        "Origin" to "Lengnau, Switzerland · Founded 1917"
    ),

    "Swatch" to listOf(
        "Overview" to "Founded in 1983 in Biel/Bienne, Switzerland, Swatch revolutionized the watch industry by creating affordable, colourful plastic Swiss watches at a time when Swiss horology was in crisis. Today the Swatch Group is the world's largest watch conglomerate.",
        "Heritage" to "Swatch launched in 1983 with just 51 components — radically simpler than conventional watches. The brand saved Swiss watchmaking from Japanese competition by making Swiss Made accessible to everyone. Limited editions and artist collaborations have made Swatch watches collectibles worldwide.",
        "Iconic Collections" to "• Original Gent / Lady — the classic Swatch formula\n• Big Bold — oversized expressive designs\n• MoonSwatch — collaboration with Omega, ceramic bioceramic\n• Irony — metal case Swatch\n• Skin — ultra-thin minimalist Swatch",
        "Price Range" to "Entry ~$60 · Mid ~$100–$200 · Limited & MoonSwatch ~$250+",
        "Origin" to "Biel/Bienne, Switzerland · Founded 1983"
    ),

    "Seiko" to listOf(
        "Overview" to "Founded in 1881 in Tokyo, Japan by Kintaro Hattori, Seiko is one of the oldest and most respected watch manufacturers in the world. Seiko manufactures everything in-house and is responsible for some of watchmaking's most important technical innovations.",
        "Heritage" to "In 1913, Seiko produced Japan's first wristwatch. In 1969, the Seiko Quartz Astron became the world's first quartz watch, triggering the Quartz Revolution. In 1986, Kinetic technology debuted. In 2005, the Spring Drive movement — a unique fusion of mechanical and electronic precision — launched.",
        "Iconic Collections" to "• Presage — Japanese craftsmanship and enamel dials\n• Prospex — professional sports watches (land, sea, sky)\n• Astron — solar GPS smartwatch\n• 5 Sports — everyday versatile automatics\n• Seiko SPB — high-end sports pieces",
        "Price Range" to "Entry ~$100 (Seiko 5) · Mid ~$500–$2,000 (Presage/Prospex) · Premium ~$3,000–$5,000+",
        "Origin" to "Tokyo, Japan · Founded 1881"
    ),

    "Grand Seiko" to listOf(
        "Overview" to "Established in 1960 as Seiko's flagship line and now an independent brand headquartered in Shizukuishi, Japan, Grand Seiko represents the pinnacle of Japanese precision watchmaking. It is celebrated for the Spring Drive movement — a unique mechanical-electronic hybrid — and exceptional finishing.",
        "Heritage" to "The 1967 44GS introduced the 'Grammar of Design' — a set of rigorous aesthetic principles still followed today. In 1998, Spring Drive technology launched, achieving quartz-level accuracy with mechanical beauty. In 2010, Grand Seiko became fully independent from the Seiko brand.",
        "Iconic Collections" to "• Snowflake — iconic textured dial inspired by Japan's Shinshu region\n• Spring Drive — the mechanical-electronic masterpiece\n• Hi-Beat 36000 — high-frequency automatic\n• Seasons — nature-inspired limited editions\n• Elegance — slim dress watches",
        "Price Range" to "Entry ~$2,000 · Mid ~$5,000–$12,000 · Spring Drive & complications $15,000–$30,000+",
        "Origin" to "Shizukuishi, Japan · Founded 1960"
    ),

    "Casio" to listOf(
        "Overview" to "Founded in 1946 in Tokyo, Japan by Tadao Kashio, Casio Computer Co., Ltd. is a Japanese electronics giant best known for durable, affordable, and technologically advanced watches. Casio entered the watch market in 1974 and now offers one of the widest ranges of timepieces globally.",
        "Heritage" to "In 1974, the Casiotron became the world's first digital watch with an automatic calendar. In 1983, G-Shock launched with shock resistance as its central philosophy. By 2016, G-Shock had shipped 100 million units globally. Today Casio encompasses G-Shock, Baby-G, Pro Trek, and Edifice.",
        "Iconic Collections" to "• G-Shock — the indestructible icon since 1983\n• Baby-G — feminine rugged design\n• Pro Trek — outdoor triple-sensor watches\n• Edifice — solar-powered sports chronographs\n• Vintage A-series — retro digital watches",
        "Price Range" to "Entry ~$20 (A-series) · G-Shock ~$50–$500 · Premium G-Shock (MR-G, MT-G) ~$600–$1,200+",
        "Origin" to "Tokyo, Japan · Founded 1946"
    ),

    "G-Shock" to listOf(
        "Overview" to "G-Shock is Casio's flagship shock-resistant watch line, launched in 1983 by engineer Kikuo Ibe. It was designed around one ambition: to create a watch that could survive a 10-metre drop, 10-bar water resistance, and 10 years of battery life — the Triple 10. G-Shock became a global cultural icon.",
        "Heritage" to "The DW-5000C was the first G-Shock in 1983. By the early 1990s, G-Shock had been adopted by US Navy SEALs and special forces worldwide. Collaborations with brands including Supreme, A Bathing Ape, and Eric Haze made G-Shock a streetwear icon. By 2016, 100 million units had been shipped.",
        "Iconic Collections" to "• Original / DW5600 — the square icon\n• GA-2100 ('CasiOak') — slim, octagonal design\n• Frogman — professional dive series\n• Rangeman — triple-sensor field watch\n• MR-G — premium titanium flagship",
        "Price Range" to "Entry ~$50 · Mid ~$150–$300 · Premium MR-G/MT-G ~$600–$1,200+",
        "Origin" to "Tokyo, Japan · G-Shock launched 1983 (Casio)"
    ),

    "Citizen" to listOf(
        "Overview" to "Founded in 1918 in Tokyo, Japan, Citizen is one of the world's largest watch manufacturers, present in over 150 countries. The brand is particularly known for its Eco-Drive technology, which powers watches from any light source — eliminating the need for battery replacement.",
        "Heritage" to "In 1975, Citizen launched the first Eco-Drive light-powered watch. In 1993, it introduced the first radio-controlled watch synchronized with atomic clock signals. Citizen acquired Bulova in 1995. The brand is strongly committed to environmentally friendly watchmaking practices.",
        "Iconic Collections" to "• Eco-Drive — the light-powered flagship technology\n• Promaster — professional sports (land, sea, sky)\n• Chandler — elegant Eco-Drive dress watches\n• Nighthawk — aviation-inspired pilots\n• Tsuyosa — retro-inspired Citizen design",
        "Price Range" to "Entry ~$100 · Mid ~$300–$700 · Premium ~$1,000–$3,000+",
        "Origin" to "Tokyo, Japan · Founded 1918"
    ),

    "Montblanc" to listOf(
        "Overview" to "Founded in 1906 in Hamburg, Germany, Montblanc began as a maker of luxury writing instruments and leather goods before expanding into watchmaking. Part of the Richemont Group since 2011, Montblanc produces classic timepieces, sport watches, and limited editions.",
        "Heritage" to "Montblanc introduced its first watch collection — Villeret 1858 — in 1997. The first in-house movement, Calibre MB R100, arrived in 2007. A first tourbillon was presented in 2016, and the first in-house chronograph in 2017. The brand's Maison is steeped in the legacy of fine craftsmanship.",
        "Iconic Collections" to "• 1858 — mountain exploration and vintage aviation heritage\n• Heritage — classical watchmaking tradition\n• TimeWalker — urban sports watches\n• Bohème — elegant ladies' collection\n• Star Legacy — Nicholas Rieussec chronograph",
        "Price Range" to "Entry ~$600 · Mid ~$2,000–$6,000 · Complications $10,000–$20,000+",
        "Origin" to "Hamburg, Germany · Founded 1906"
    ),

    "Luminox" to listOf(
        "Overview" to "Founded in 1989 in the United States by Barry Cohen and Richard Timbo, Luminox is headquartered in Pfaeffikon, Switzerland and specializes in durable military-grade watches. The brand's proprietary Luminox Light Technology (LLT) provides self-powered luminosity for up to 25 years.",
        "Heritage" to "In 1993, Luminox partnered with the US Navy SEALs — leading to the iconic 1994 Navy SEAL watch. The brand later partnered with XCOR Space Expeditions (2002), aviators (Air Series, 2006), and Iceland Search and Rescue (2018). Bear Grylls became a brand ambassador in 2022.",
        "Iconic Collections" to "• Navy SEAL — the original military-grade Luminox\n• Pacific Diver — professional water sports\n• Air Series — aviation-focused chronographs\n• Bear Grylls Survival — extreme outdoor series\n• Sea Turtle — eco-conscious ocean collection",
        "Price Range" to "Entry ~$200 · Mid ~$400–$800 · Premium ~$1,000–$1,500+",
        "Origin" to "USA founded 1989 · Headquartered in Pfaeffikon, Switzerland"
    ),

    "Ice-Watch" to listOf(
        "Overview" to "Founded in 2006 (launched 2007) by Jean-Pierre Lutgen in Bastogne, Belgium, Ice-Watch disrupted the fashion watch market with bold, colourful, and affordable timepieces. Endorsed by David Guetta, Katy Perry, and Eden Hazard, Ice-Watch has expanded into solar-powered and smartwatch segments.",
        "Heritage" to "Ice-Watch debuted at Baselworld 2007 and rapidly expanded globally. By 2012, the brand opened its first Swiss flagship in Geneva. In 2017, the founder was named Manager of the Year in Belgium. In 2020, the ICE solar power collection reinforced its sustainability commitment.",
        "Iconic Collections" to "• ICE glam — colourful fashion staple\n• ICE solar power — eco-conscious quartz\n• ICE smart one — connected smartwatch\n• ICE digit — retro digital design\n• ICE-Watch x Pantone — colour-matched limited editions",
        "Price Range" to "Entry ~$60 · Mid ~$100–$200 · Limited editions ~$250–$300",
        "Origin" to "Bastogne, Belgium · Founded 2006"
    ),

    "Norqain" to listOf(
        "Overview" to "Founded in 2018 in Nidau (Biel/Bienne), Switzerland by Ben Küffer, Norqain is a young, independent Swiss luxury sports watch brand. The brand is designed for outdoor adventure and is the Official Luxury Sports Watch of the NHL.",
        "Heritage" to "In 2019, Norqain launched its Adventure, Freedom, and Independence collections. In 2020, the brand partnered with the NHLPA. In 2021, Norqain introduced its Manufacture Calibre NN20/1 developed with Kenissi. Limited editions with Sidney Crosby and the NHL celebrate Canadian passion for hockey and watches.",
        "Iconic Collections" to "• Adventure — rugged sports watches\n• Freedom — versatile everyday automatics\n• Independence — heritage-inspired designs\n• Adventure Sport — Golden Hour limited edition\n• Wild One — extreme sports purpose-built watches",
        "Price Range" to "Entry ~$3,000 · Mid ~$5,000–$9,000 · Special editions ~$12,000–$15,000+",
        "Origin" to "Nidau, Switzerland · Founded 2018"
    ),

    "Bell & Ross" to listOf(
        "Overview" to "Founded in 1992 in Paris, France with manufacture in La Chaux-de-Fonds, Switzerland, Bell & Ross designs professional timepieces around four principles: legibility, functionality, reliability, and precision. The brand's philosophy is that everything on a watch must serve a specific function.",
        "Heritage" to "From 1992, Bell & Ross supplied pilot watches to the French air force. In 1998, the Hydromax set a world record with 11,100 metres of water resistance. In 2016, the brand began a collaboration with Renault Sport Formula 1 Team. The square BR01 case, inspired by cockpit instruments, became the brand's icon.",
        "Iconic Collections" to "• BR 01 — square cockpit-inspired instrument watch\n• BR 03 — refined smaller version of the BR01\n• BR 05 — sporty integrated bracelet design\n• BR X — high-complication experimental line\n• Vintage BR — heritage-inspired interpretations",
        "Price Range" to "Entry ~$2,500 · Mid ~$5,000–$12,000 · Complications $20,000–$30,000+",
        "Origin" to "Paris, France · Founded 1992"
    ),

    "Bulova" to listOf(
        "Overview" to "Founded in 1875 in New York City by Joseph Bulova, Bulova is one of the oldest American watch brands. Now owned by Citizen, Bulova is known for its Accutron tuning fork technology and a strong presence in pop culture and entertainment.",
        "Heritage" to "Bulova placed the first watch advertisement on American radio in 1926 and the first live TV ad in 1941. In 1960, the Accutron became the first fully electronic watch using a tuning fork vibrating at 360 Hz. Bulova's first precision watch was certified on the US Space Shuttle (1979). The brand celebrated 150 years in 2025.",
        "Iconic Collections" to "• Accutron — tuning fork and electrostatic precision technology\n• Precisionist — ultra-high-frequency quartz (262 kHz)\n• Lunar Pilot — space heritage chronograph\n• Sutton — Art Deco inspired dress watches\n• Marine Star — sporty dive-inspired design",
        "Price Range" to "Entry ~$100 · Mid ~$300–$700 · Accutron ~$600–$1,500+",
        "Origin" to "New York, USA · Founded 1875"
    ),

    "Movado" to listOf(
        "Overview" to "Founded in 1881 in La Chaux-de-Fonds, Switzerland by Achille Ditesheim, Movado is known for minimalist design — most famously the Museum Watch, with its single dot at 12 o'clock representing the sun at high noon. Part of the Movado Group.",
        "Heritage" to "In 1947, the Museum Watch was designed by artist Nathan George Horwitt and selected by the Museum of Modern Art (MoMA) for its permanent collection. Movado has been worn by artists, architects, and cultural figures for its distinctive design philosophy.",
        "Iconic Collections" to "• Museum Watch — the definitive Movado design (single dot dial)\n• Bold — enlarged contemporary interpretation\n• SE — sporty evolution of the Museum watch\n• Heritage — vintage-inspired designs\n• Connect — smartwatch with Museum Watch aesthetic",
        "Price Range" to "Entry ~$300 · Mid ~$600–$1,500 · Premium ~$2,000–$3,000+",
        "Origin" to "La Chaux-de-Fonds, Switzerland · Founded 1881"
    ),

    "MB&F" to listOf(
        "Overview" to "Founded in 2005 in Geneva, Switzerland by Maximilian Büsser, MB&F (Maximilian Büsser & Friends) is one of the most creative independent watch brands in the world. Each watch is called a 'Horological Machine' or 'Legacy Machine' and is created in collaboration with master watchmakers and artisans.",
        "Heritage" to "MB&F launched the HM1 (Horological Machine No. 1) in 2007, establishing its concept of three-dimensional mechanical art. Every piece is a collaboration — Büsser gathers the best watchmakers, designers, and craftspeople to bring radical concepts to life. The brand deliberately defies convention.",
        "Iconic Collections" to "• Horological Machines (HM) — avant-garde mechanical sculptures\n• Legacy Machines (LM) — traditional movements in radical cases\n• Perpétuel — perpetual calendar interpretations\n• MB&F Performance Art — mechanical clocks as art objects\n• HM10 Bulldog — playful animal-inspired form",
        "Price Range" to "Entry ~$40,000 · Mid ~$80,000–$150,000 · Ultra-rare pieces $200,000–$300,000+",
        "Origin" to "Geneva, Switzerland · Founded 2005"
    ),

    "Christopher Ward" to listOf(
        "Overview" to "Founded in 2004 in Maidenhead, England by Chris Ward, Mike France, and Peter Ellis, Christopher Ward is a British direct-to-consumer watch brand that produces Swiss Made watches at honest prices. The brand became fully independent when it established its own Synergies Horlogères manufacture.",
        "Heritage" to "Christopher Ward disrupted the traditional watch retail model by selling online, eliminating the middleman, and passing the savings to customers. The C60 Trident diver became the brand's hero piece. The C1 Bel Canto introduced a resonating bell struck by the movement — a first for this price tier.",
        "Iconic Collections" to "• C60 Trident — the flagship diver\n• C63 Sealander — versatile water-resistant everyday\n• C65 Trident Diver — heritage 1960s dive style\n• C1 — Swiss manufacture in-house complications\n• C12 Loco — locomotive-inspired micro-rotor",
        "Price Range" to "Entry ~$400 · Mid ~$800–$2,000 · In-house complications ~$2,500–$3,000+",
        "Origin" to "Maidenhead, England · Founded 2004"
    ),

    "Frederique Constant" to listOf(
        "Overview" to "Founded in 1988 in Plan-les-Ouates, Geneva, Switzerland by Peter and Aletta Stas, Frederique Constant produces Swiss Made watches with in-house movements at accessible prices. The brand became part of the Citizen Group in 2016.",
        "Heritage" to "Frederique Constant's motto — 'Live your passion' — reflects its dedication to bringing Swiss manufacture watchmaking to enthusiasts at honest prices. The brand introduced the Heart Beat Manufacture in 2004 — the first in-house movement at this price point — then followed with perpetual calendars and tourbillons.",
        "Iconic Collections" to "• Classics — timeless Swiss elegance\n• Slimline — ultra-thin dress watches\n• Highlife — luxury sports with integrated bracelet\n• Runabout — nautical-inspired limited editions\n• Vintage Rally — motorsport heritage",
        "Price Range" to "Entry ~$700 · Mid ~$1,500–$3,500 · In-house complications ~$5,000–$8,000+",
        "Origin" to "Geneva, Switzerland · Founded 1988"
    ),

    "Alpina" to listOf(
        "Overview" to "Founded in 1883 in Geneva, Switzerland, Alpina is one of Switzerland's oldest sports watch brands with a long heritage in mountain sports, aviation, and professional environments. Now part of the same group as Frederique Constant and owned by Citizen.",
        "Heritage" to "Alpina pioneered the concept of rugged Swiss sport watches long before the term existed. The brand's history spans military watches, horological standards, and alpine adventure. The AL-525 Manufacture movement — produced in-house — powers the Alpiner collection.",
        "Iconic Collections" to "• Alpiner 4 — the signature Swiss alpine watch\n• Seastrong — professional dive collection\n• Startimer Pilot — aviation heritage watches\n• Comtesse — elegant ladies' sport watches\n• AL-525 — in-house automatic manufacture",
        "Price Range" to "Entry ~$700 · Mid ~$1,500–$3,000 · Manufacture complications ~$4,000–$6,000+",
        "Origin" to "Geneva, Switzerland · Founded 1883"
    ),

    "Apple" to listOf(
        "Overview" to "Apple Inc., founded in 1976 in Cupertino, California, launched the Apple Watch in April 2015 — the best-selling smartwatch in the world. Apple Watch runs watchOS, integrates deeply with iPhone, and has become a leading health and fitness monitoring device.",
        "Heritage" to "The Apple Watch debuted in three collections: Sport, standard, and Edition (18k gold). By 2016, Apple Watch had captured a significant share of the Swiss watch industry's annual sales volume. Each new generation adds health features — ECG (2018), blood oxygen (2020), crash detection, temperature sensing.",
        "Iconic Collections" to "• Apple Watch Series — the main lineup, refreshed annually\n• Apple Watch SE — affordable entry\n• Apple Watch Ultra — extreme sports and adventure\n• Apple Watch Hermès — fashion collaboration\n• Apple Watch Nike — fitness-focused edition",
        "Price Range" to "SE from ~$250 · Series from ~$400 · Ultra ~$800–$1,000",
        "Origin" to "Cupertino, California, USA · Apple Watch launched 2015"
    ),

    "Garmin" to listOf(
        "Overview" to "Founded in 1989 in Lenexa, Kansas, USA (now headquartered in Olathe, Kansas and Schaffhausen, Switzerland), Garmin is the world's leading GPS technology company and produces premium sports smartwatches for fitness, aviation, marine, and outdoor activities.",
        "Heritage" to "Garmin entered the wearables market with the fēnix in 2012 — a GPS watch for outdoor adventurers. The brand subsequently developed dedicated platforms for running (Forerunner), multisport (fēnix), golf (Approach), aviation (MARQ Aviator), and tactical (Instinct). Garmin watches are known for exceptional battery life and GPS accuracy.",
        "Iconic Collections" to "• fēnix — flagship multisport GPS smartwatch\n• Forerunner — running-focused GPS watches\n• Instinct — rugged solar outdoor series\n• MARQ — premium titanium designer smartwatch\n• Venu — lifestyle health smartwatch",
        "Price Range" to "Entry ~$200 (Forerunner 55) · Mid ~$400–$700 (fēnix 7) · Premium MARQ ~$1,000–$2,000+",
        "Origin" to "Olathe, Kansas, USA · Founded 1989"
    ),

    "Samsung" to listOf(
        "Overview" to "Samsung Electronics, founded in 1969 in Suwon, South Korea, launched the Galaxy Watch platform to compete in the premium Android smartwatch market. Galaxy Watch runs Wear OS with Samsung's One UI Watch interface and offers deep integration with Samsung and Android smartphones.",
        "Heritage" to "Samsung released the Galaxy Gear in 2013 as its first smartwatch, followed by the Gear S series. The Galaxy Watch brand launched in 2018. In 2021, Samsung partnered with Google and Qualcomm to create a unified Wear OS platform. The Galaxy Watch Ultra debuted in 2024 as a rugged premium competitor to Apple Watch Ultra.",
        "Iconic Collections" to "• Galaxy Watch — the main rotating bezel lineup\n• Galaxy Watch FE — budget-friendly option\n• Galaxy Watch Ultra — rugged premium titanium\n• Galaxy Watch Classic — physical rotating bezel",
        "Price Range" to "Galaxy Watch FE ~$200 · Galaxy Watch ~$250–$350 · Ultra ~$600–$650",
        "Origin" to "Suwon, South Korea · Founded 1969"
    ),

    "Withings" to listOf(
        "Overview" to "Founded in 2008 in Issy-les-Moulineaux, France, Withings specializes in health-focused connected devices including smartwatches, smart scales, and blood pressure monitors. Withings watches prioritize extended battery life and discreet health monitoring in traditional analog watch designs.",
        "Heritage" to "Withings pioneered the health smartwatch with the Activité in 2014 — a Swiss Made watch that tracked activity and sleep while lasting months on a single battery. The brand was acquired by Nokia in 2016 and re-acquired by its founder Eric Carreel in 2018. ScanWatch added ECG and blood oxygen in 2020.",
        "Iconic Collections" to "• ScanWatch — ECG and SpO2 health monitoring\n• Move — entry-level activity tracker\n• ScanWatch 2 — advanced health metrics\n• ScanWatch Horizon — diver-style design\n• Body Scan — advanced body composition scale",
        "Price Range" to "Entry ~$80 (Move) · Mid ~$250–$400 (ScanWatch) · Premium ~$500+",
        "Origin" to "Issy-les-Moulineaux, France · Founded 2008"
    ),

    "Fossil" to listOf(
        "Overview" to "Founded in 1984 in Richardson, Texas, USA by Tom Kartsotis, Fossil Group is an American watch company and lifestyle brand known for accessible, trend-driven fashion watches. Fossil also manages watch licenses for brands including Michael Kors, Emporio Armani, DKNY, Kate Spade, and Skagen.",
        "Heritage" to "Fossil started as a novelty watch company inspired by American vintage design. The brand built a successful fashion watch business and expanded into smartwatches with Fossil Gen series running Wear OS. Fossil Group manages over a dozen licensed fashion watch brands globally.",
        "Iconic Collections" to "• Heritage — retro American design\n• Gen 6 — Wear OS smartwatch\n• Machine — bold sport-inspired design\n• Minimalist — slim clean-dial design\n• Neutra — vintage chronograph aesthetic",
        "Price Range" to "Entry ~$80 · Mid ~$150–$300 · Smart ~$200–$300",
        "Origin" to "Richardson, Texas, USA · Founded 1984"
    ),

    "Chopard" to listOf(
        "Overview" to "Founded in 1860 in Sonvilier, Switzerland by Louis-Ulysse Chopard, Chopard is an independent Swiss luxury watch and jewelry house. The brand is now co-presided by Karl-Friedrich Scheufele and his sister Caroline Scheufele and is headquartered in Geneva.",
        "Heritage" to "Chopard acquired the Manufacture Frédéric Piguet in 1996, gaining in-house movement capabilities. The brand has been the Official Partner of the Cannes Film Festival since 1998 and produces the Palme d'Or trophies. Chopard committed to using only ethical gold by 2024.",
        "Iconic Collections" to "• L.U.C — in-house high-watchmaking for men\n• Happy Diamonds — floating diamond dials\n• Alpine Eagle — sustainability-focused steel sports watch\n• Mille Miglia — motorsport chronograph legacy\n• Imperiale — feminine luxury",
        "Price Range" to "Entry ~$3,000 (Mille Miglia) · Mid ~$8,000–$25,000 · L.U.C complications $30,000–$100,000+",
        "Origin" to "Geneva, Switzerland · Founded 1860"
    ),

    "Bulgari" to listOf(
        "Overview" to "Founded in 1884 in Rome, Italy by Sotirio Bulgari, Bulgari (BVLGARI) is one of the world's leading luxury jewelry and watch brands. Now part of LVMH, Bulgari's watch division is based in Neuchâtel, Switzerland and holds multiple world records for ultra-thin movements.",
        "Heritage" to "Bulgari entered watchmaking seriously in 1975 with the iconic Bulgari Bulgari — a watch featuring the brand name engraved twice around the bezel. In 2014, the Octo Finissimo began its record-breaking run as the world's thinnest tourbillon. By 2022, Bulgari held eight world records for ultra-thin watchmaking.",
        "Iconic Collections" to "• Octo Finissimo — record-breaking ultra-thin collection\n• Bulgari Bulgari — the Roman heritage icon\n• Serpenti — snake-inspired jewelry watches\n• Aluminium — lightweight sports collection\n• Diagono — professional sport watches",
        "Price Range" to "Entry ~$3,000 (Aluminium) · Mid ~$8,000–$20,000 · Octo Finissimo $25,000–$80,000+",
        "Origin" to "Rome, Italy / Neuchâtel, Switzerland · Founded 1884"
    )
)

@Composable
fun BrandDetailScreen(brandName: String, modifier: Modifier = Modifier) {
    val sections = brandDatabase[brandName]
    if (sections != null) {
        Column(
            modifier = modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .padding(bottom = 24.dp)
        ) {
            sections.forEach { (heading, body) ->
                BrandSectionHeader(heading)
                Text(
                    text = body,
                    style = MaterialTheme.typography.bodyLarge,
                    modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
                )
            }
        }
    } else {
        Box(modifier = modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                Icon(
                    Icons.Default.Watch,
                    contentDescription = null,
                    tint = MaterialTheme.colorScheme.primary,
                    modifier = Modifier.size(56.dp)
                )
                Text(brandName, style = MaterialTheme.typography.headlineSmall, fontWeight = FontWeight.SemiBold)
                Text("Content coming soon", color = MaterialTheme.colorScheme.onSurfaceVariant)
            }
        }
    }
}
