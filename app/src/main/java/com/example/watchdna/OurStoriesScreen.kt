package com.example.watchdna

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowForwardIos
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

data class StoryArticle(
    val title: String,
    val articleUrl: String
)

val allStoriesList = listOf(
    StoryArticle("MEETING MARK STREIT: FROM STANLEY CUP CHAMPION TO BUILDING NORQAIN", "https://watchdna.com/blogs/opendial/norqain-the-official-luxury-sport-watch-of-the-nhl"),
    StoryArticle("FROM BOARDROOM TO PIT LANE: ILIAS STROUSIDIS AND THE FOUNDER-LED PHILOSOPHY BEHIND STIL TIMEPIECES", "https://watchdna.com/blogs/industry-voices/from-boardroom-to-pit-lane-ilias-strousidis-and-the-founder-led-philosophy-behind-stil-timepieces"),
    StoryArticle("S1 WANDERING HOURS: A NEW WAY TO READ TIME", "https://watchdna.com/blogs/press/s1-wandering-hours-a-new-way-to-read-time"),
    StoryArticle("THE LIFE AND LEGACY OF KEN KESSLER - A VOICE OF AUTHORITY IN WATCHES, HI-FI, AND LUXURY CULTURE", "https://watchdna.com/blogs/industry-voices/the-life-and-legacy-of-ken-kessler-a-voice-of-authority-in-watches-hi-fi-and-luxury-culture"),
    StoryArticle("OMEGA CONSTELLATION OBSERVATORY: THE FIRST TWO-HAND MASTER CHRONOMETER REDEFINING PRECISION", "https://watchdna.com/blogs/press/omega-constellation-observatory-the-first-two-hand-master-chronometer-redefining-precision"),
    StoryArticle("MIDO OCEAN STAR GMT: SWISS PRECISION, MARINE SPIRIT, AND DUAL FUNCTIONALITY FOR THE CONTEMPORARY TRAVELER", "https://watchdna.com/blogs/press/mido-ocean-star-gmt-swiss-precision-marine-spirit-and-dual-functionality-for-the-contemporary-traveler"),
    StoryArticle("PANERAI SUBMERSIBLE GMT PAM01495: EXTREME ENGINEERING WITH A TOOL WATCH SPIRIT", "https://watchdna.com/blogs/press/panerai-submersible-gmt-pam01495-extreme-engineering-with-a-tool-watch-spirit"),
    StoryArticle("HARMONIE BUTTERFLY POETRY IN MOTION POR AEROWATCH", "https://watchdna.com/blogs/press/harmonie-butterfly-poetry-in-motion-por-aerowatch"),
    StoryArticle("PEQUIGNET: THE EMBLEM OF THE AUTHENTIC FRENCH WATCH MANUFACTURE", "https://watchdna.com/blogs/opendial/pequignet-the-emblem-of-the-authentic-french-watch-manufacture"),
    StoryArticle("WATCHES AND WONDERS WOWS US WITH 65 BRANDS, 60,000 VISITORS, CELEBRITY CAMEOS AND UNBEATABLE CAMARADERIE", "https://watchdna.com/blogs/ecosystem/watches-and-wonders-wows-us-with-65-brands-60-000-visitors-celebrity-cameos-and-unbeatable-camaraderie"),
    StoryArticle("RADO CAPTAIN COOK HIGH-TECH CERAMIC CHRONOGRAPH: ABSOLUTE VERSATILITY IN DEEP BLUE", "https://watchdna.com/blogs/press/rado-captain-cook-high-tech-ceramic-chronograph-absolute-versatility-in-deep-blue"),
    StoryArticle("VANCOUVER TIMEPIECE SHOW RETURNS THIS WEEKEND", "https://watchdna.com/blogs/community/vancouver-time-fee-show-return-this-weekend"),
    StoryArticle("ANALOG ILLITERACY AND THE FUTURE OF LUXURY", "https://watchdna.com/blogs/experts_story/analog-illiteracy-and-the-future-of-luxury"),
    StoryArticle("FINDING PURPOSE IN TIME: BUILDING LUXURY TIMEPIECES WITH INTENTION", "https://watchdna.com/blogs/brand_experiences/finding-purpose-in-time-building-luxury-timepieces-with-intention"),
    StoryArticle("FLIEGER PRO GREEN DIAL: THE PILOT’S CLASSIC REIMAGINED WITH DEPTH AND CHARACTER", "https://watchdna.com/blogs/press/flieger-pro-green-dial-the-pilot-s-classic-reimagined-with-depth-and-character"),
    StoryArticle("THE NEW ERA OF NORQAIN: EXTREME WATCHES WHERE LIGHTNESS MEETS PERFORMANCE", "https://watchdna.com/blogs/press/norqain-and-the-new-generation-of-extreme-sports-watches-innovation-lightness-and-uncompromising-design"),
    StoryArticle("A DIVE WATCH MADE OF CRYSTALLIZED TITANIUM : DANUBIUS BLACK SEA", "https://watchdna.com/blogs/experts_story/a-dive-watch-made-of-crystallized-titanium-danubius-black-sea"),
    StoryArticle("BREITLING NAVITIMER B02 CHRONOGRAPH 41 COSMONAUTE ARTEMIS II: A WATCH BORN FOR SPACE", "https://watchdna.com/blogs/press/breitling-navitimer-b02-chronograph-41-cosmonaute-artemis-ii-a-watch-born-for-space"),
    StoryArticle("ACCUTRON: THE REVOLUTION OF TIME FROM THE SPACE RACE TO TODAY", "https://watchdna.com/blogs/opendial/accutron-the-revolution-of-time-from-the-space-race-to-today"),
    StoryArticle("FROM BASELINES TO BEZELS: THE LONG RELATIONSHIP BETWEEN TENNIS AND TIMEPIECES", "https://watchdna.com/blogs/experts_story/from-baselines-to-bezels-the-long-relationship-between-tennis-and-timepieces"),
    StoryArticle("SILENT POWER REVEALED: RADO ANATOM AUTOMATIC SKELETON", "https://watchdna.com/blogs/experts_story/silent-power-revealed-rado-anatom-automatic-skeleton"),
    StoryArticle("ORIS STAR EDITION: THE RETURN OF AN ICON IN SWISS WATCHMAKING", "https://watchdna.com/blogs/press/oris-star-edition-the-return-of-an-icon-in-swiss-watchmaking"),
    StoryArticle("FRENCH EXCELLENCE ON DISPLAY AT GENEVA WATCH EVENTS 2026", "https://watchdna.com/blogs/ecosystem/french-excellence-on-display-at-geneva-watch-events-2026"),
    StoryArticle("WATCHES AND WONDERS GENEVA 2026: A TURNING POINT FOR THE GLOBAL WATCH INDUSTRY", "https://watchdna.com/blogs/experts_story/watches-and-wonders-geneva-2026-a-turning-point-for-the-global-watch-industry"),
    StoryArticle("THE WATCH & JEWELLERY INDUSTRY: RESILIENCE, EVOLUTION, AND THE RISE OF DISCOVERY PLATFORMS", "https://watchdna.com/blogs/ecosystem/the-state-of-watchmaking-amp-jewellery-in-2025-and-why-platforms-like-watchdna-matter-more-than-ever"),
    StoryArticle("WOLF 1834 BROGUE: BRITISH TRADITION REIMAGINED IN FINE WATCHMAKING", "https://watchdna.com/blogs/press/wolf-1834-brogue-british-tradition-reimagined-in-fine-watchmaking"),
    StoryArticle("RADO INTEGRAL: 40 YEARS OF HIGH-TECH CERAMIC", "https://watchdna.com/blogs/press/rado-integral-40-years-of-high-tech-ceramic"),
    StoryArticle("EDOX GRAND OCEAN: MARITIME SPIRIT WITH A NEW CONTEMPORARY EXPRESSION", "https://watchdna.com/blogs/press/edox-grand-ocean-maritime-spirit-with-a-new-contemporary-expression"),
    StoryArticle("FROM PASSION TO PLATFORM: MY CONVERSATION WITH THE WATCH YOU TALKING ABOUT PODCAST", "https://watchdna.com/blogs/experts_story/from-passion-to-platform-my-conversation-with-the-watch-you-talking-about-podcast"),
    StoryArticle("ORIS PRESENTS A NEW MANAGEMENT STRUCTURE", "https://watchdna.com/blogs/press/oris-presents-a-new-management-structure"),
    StoryArticle("TIME & SHINE 2026 JEWELRY FAIR: ELEVATING EXCELLENCE", "https://watchdna.com/blogs/ecosystem/time-shine-2026-jewelry-fair-elevating-excellence"),
    StoryArticle("MIDO COMMANDER DATODAY: ELEGANCE AND TECHNOLOGY IN A CONTEMPORARY CLASSIC", "https://watchdna.com/blogs/press/mido-commander-datoday-elegance-and-technology-in-a-contemporary-classic"),
    StoryArticle("SARTORY-BILLARD SB10 JUMPING HOUR DISCO BALL: THE LIGHT OF TIME", "https://watchdna.com/blogs/press/artory-billard-sb10-jumping-hour-disco-ball-the-light-of-time"),
    StoryArticle("DISCOVERING THE STORY BEHIND ARES WATCHES", "https://watchdna.com/blogs/opendial/discovering-the-story-behind-ares-watches"),
    StoryArticle("BR-X3 MICRO-ROTOR: HAUTE HORLOGERIE IN A SQUARE FRAME", "https://watchdna.com/blogs/press/br-x3-micro-rotor-haute-horlogerie-in-a-square-frame"),
    StoryArticle("AN EVENING OF PRECISION AND PASSION: MICROMILSPEC PREVIEW WITH CEO & CO-FOUNDER HENRIK RYE", "https://watchdna.com/blogs/opendial/an-evening-of-precision-and-passion-micromilspec-preview-with-ceo-co-founder-henrik-rye"),
    StoryArticle("ENGINEERING THE IMPOSSIBLE: NAVITIMER B01 CHRONOGRAPH 43 TRIBUTE TO CONCORDE", "https://watchdna.com/blogs/press/engineering-the-impossible-navitimer-b01-chronograph-43-tribute-to-concorde"),
    StoryArticle("THE MOST INFLUENTIAL WATCH DESIGNERS YOU’VE NEVER HEARD OF", "https://watchdna.com/blogs/experts_story/the-most-influential-watch-designers-you-ve-never-heard-of"),
    StoryArticle("FROM SKEPTIC TO SUPERFAN: MY JOURNEY INTO SMARTWATCHES", "https://watchdna.com/blogs/watch-enthusiast/from-skeptic-to-superfan-my-journey-into-smartwatches"),
    StoryArticle("PEQUIGNET X MATTHIAS MARC: WHEN HAUTE HOROLOGY MEETS HAUTE CUISINE", "https://watchdna.com/blogs/press/pequignet-x-matthias-marc"),
    StoryArticle("HOCKEY MEETS HOROLOGY: NORQAIN X NHL AT THE MAPLE LEAFS GAME", "https://watchdna.com/blogs/experts_story/hockey-meets-horology-norqain-x-nhl-at-the-maple-leafs-game"),
    StoryArticle("FORTIS MARINEMASTER M-44 DLC THE ULTIMATE DIVER WITH 500 METERS OF WATER RESISTANCE AND MANUFACTURE CALIBRE WERK 11", "https://watchdna.com/blogs/press/fortis-marinemaster-m-44-dlc-the-ultimate-diver-with-500-meters-of-water-resistance-and-manufacture-calibre-werk-11"),
    StoryArticle("DISCOVERING THE STORY BEHIND WOLF", "https://watchdna.com/blogs/opendial/discovering-the-story-behind-wolf"),
    StoryArticle("WHEN BRANDS COLLIDE: WATCH COLLABORATIONS THAT ACTUALLY MEANT SOMETHING", "https://watchdna.com/blogs/experts_story/when-brands-collide-watch-collaborations-that-actually-meant-something"),
    StoryArticle("RADO TRUE ROUND X LE CORBUSIER COLLECTION: ARCHITECTURE TURNED INTO TIME", "https://watchdna.com/blogs/press/rado-true-round-x-le-corbusier-collection-architecture-turned-into-time"),
    StoryArticle("WEI KOH APPOINTED PRESIDENT OF THE GRAND PRIX D’HORLOGERIE DE GENÈVE JURY FOR 2026", "https://watchdna.com/blogs/ecosystem/wei-koh-appointed-president-of-the-grand-prix-d-horlogerie-de-geneve-jury-for-2026"),
    StoryArticle("WHEN WATCH BRANDS GOT IT WRONG: FAMOUS DESIGN & MARKETING FAILURES", "https://watchdna.com/blogs/experts_story/when-watch-brands-got-it-wrong-famous-design-marketing-failures"),
    StoryArticle("STUDIO UNDERD0G BRINGS ITS “AVOCADO” ENERGY TO VANCOUVER", "https://watchdna.com/blogs/opendial/avocado"),
    StoryArticle("FROM RENNES TO TAG HEUER: A SMALL WORLD IN WATCHMAKING", "https://watchdna.com/blogs/press/from-rennes-to-tag-heuer-a-small-world-in-watchmaking"),
    StoryArticle("AN EVENING WITH HAMILTON: A BRAND CLOSE TO MY HEART", "https://watchdna.com/blogs/brand_experiences/an-evening-with-hamilton-a-brand-close-to-my-heart"),
    StoryArticle("AEROWATCH 1942 CALENDRIER COMPLET: DOUBLE MOON PHASE AND TIMELESS ELEGANCE", "https://watchdna.com/blogs/press/aerowatch-1942-calendrier-complet-double-moon-phase-and-timeless-elegance"),
    StoryArticle("BORROWED TIME: THE VINTAGE WATCH DESIGN THAT QUIETLY RETURNED TO THE OSCARS", "https://watchdna.com/blogs/experts_story/borrowed-time-the-vintage-watch-design-that-quietly-returned-to-the-oscars"),
    StoryArticle("CELEBRATING WOMEN THROUGH TIME: INTERNATIONAL WOMEN’S DAY WITH RADO", "https://watchdna.com/blogs/press/celebrating-women-through-time-international-women-s-day-with-rado"),
    StoryArticle("DISCOVER THE STIL TIMEPIECES MEGARA TITANIUM LIMITED EDITION!", "https://watchdna.com/blogs/watch-enthusiast/discover-the-stil-timepieces-megara-titanium-limited-edition"),
    StoryArticle("THE POWER OF PANERAI", "https://watchdna.com/blogs/experts_story/the-power-of-panerai"),
    StoryArticle("MAISON BOANTON HÉRITAGE: THE ELEGANCE OF SPEED REINTERPRETED", "https://watchdna.com/blogs/press/maison-boanton-heritage-the-elegance-of-speed-reinterpreted"),
    StoryArticle("THE POETRY OF THE MOON ON YOUR WRIST: RADO CENTRIX MOONPHASE", "https://watchdna.com/blogs/press/the-poetry-of-the-moon-on-your-wrist-rado-centrix-moonphase"),
    StoryArticle("PILOTS, SAILORS, SURVEYORS: PROFESSIONS THAT QUIETLY DICTATED WATCH DESIGN", "https://watchdna.com/blogs/brand_experiences/pilots-sailors-surveyors-professions-that-quietly-dictated-watch-design"),
    StoryArticle("WATCH COLLECTING", "https://watchdna.com/blogs/experts_story/watch-collecting"),
    StoryArticle("BERNEY PANDA: THE PERFECT UNION OF WATCHMAKING AND JEWELRY", "https://watchdna.com/blogs/press/berney-panda-the-perfect-union-of-watchmaking-and-jewelry"),
    StoryArticle("JCK AND LUXURY STRENGTHEN THE TIMEPIECES DESTINATION WITH STRATEGIC PARTNERSHIPS FOR 2026", "https://watchdna.com/blogs/press/jck-and-luxury-2026"),
    StoryArticle("BREITLING NAVITIMER B01 CHRONOGRAPH 43 NORTH AMERICAN LIMITED EDITION", "https://watchdna.com/blogs/press/breitling-navitimer-b01"),
    StoryArticle("SOVRYGN WATCHES: A JOURNEY OF PASSION AND PERSEVERANCE", "https://watchdna.com/blogs/media/sovrygn-watches-a-journey-of-passion-and-perseverance"),
    StoryArticle("BEAUTIFUL MISTAKES: HOW WATCHMAKING’S MISSTEPS BECAME ITS GREATEST STORIES", "https://watchdna.com/blogs/experts_story/beautiful-mistakes-how-watchmaking-s-missteps-became-its-greatest-stories"),
    StoryArticle("HOW TIFFANY HARNESSSED ITS HERITAGE TO REDEFINE ITS WATCHMAKING BRAND", "https://watchdna.com/blogs/experts_story/the-archival-edge"),
    StoryArticle("BR-03 DIVER BLACK BRONZE: THE POWER OF THE SEA IN ITS PUREST FORM", "https://watchdna.com/blogs/press/br-03-diver-black-bronze-the-power-of-the-sea-in-its-purest-form"),
    StoryArticle("WORDEN WATCH STUDIO; WHERE WATCHES HAVE MEANING", "https://watchdna.com/blogs/industry-voices/worden-watch-studio-where-watches-have-meaning"),
    StoryArticle("ASTON MARTIN ARAMCO FORMULA ONE TEAM AND PRECISION PUSHED TO THE LIMIT: THE NEW NAVITIMER B01 BY BREITLING", "https://watchdna.com/blogs/press/aston-martin-aramco-formula-one-team-and-precision-pushed-to-the-limit-the-new-navitimer-b01-by-breitling"),
    StoryArticle("AEROWATCH: SWISS WATCHMAKING TRADITION AT THE HONG KONG WATCH & CLOCK FAIR", "https://watchdna.com/blogs/opendial/aerowatch-swiss-watchmaking-tradition-at-the-hong-kong-watch-clock-fair"),
    StoryArticle("POSING WITH PERIL: THE TOP 10 CITIES WHERE WEARING AN EXPENSIVE WATCH CAN BE DANGEROUS", "https://watchdna.com/blogs/experts_story/posing-with-peril-the-top-10-cities-where-wearing-an-expensive-watch-can-be-dangerous"),
    StoryArticle("FRANCE HORLOGERIE: AN INSTITUTION SERVING FRENCH WATCHMAKING", "https://watchdna.com/blogs/industry-voices/france-horlogerie-une-institution-au-service-de-l-horlogerie-francaise"),
    StoryArticle("LVMH WATCH WEEK:BOLD GOLD, BLACK CERAMIC, PLENTY OF COLOR AND A FUN TRIBUTE TO THE GOAT", "https://watchdna.com/blogs/experts_story/lvmh-watch-week-bold-gold-black-ceramic-plenty-of-color-and-a-fun-tribute-to-the-goat"),
    StoryArticle("BREITLING X NFL COLLECTION HOSTED BY KING & BAY", "https://watchdna.com/blogs/brand_experiences/breitling-x-nfl-collection-showcase-presented-by-king-bay"),
    StoryArticle("THE SUPER BOWL WATCH HALL OF FAME", "https://watchdna.com/blogs/experts_story/the-super-bowl-watch-hall-of-fame"),
    StoryArticle("LONG LIVE BAUME & MERCIER!", "https://watchdna.com/blogs/experts_story/baumeetmercier"),
    StoryArticle("EVERYDAY JAPANESE CHRONOGRAPH UNDER \$400 WANCHER TENJI CHRONOGRAPH", "https://watchdna.com/blogs/experts_story/everyday-japanese-chronograph-under-400-wancher-tenji-chronograph"),
    StoryArticle("MODERN HERITAGE: CHARRIOL’S ELEGANT TAKE ON SPORT WATCHES AT COUTURE SHOW", "https://watchdna.com/blogs/opendial/modern-heritage-charriol-s-elegant-take-on-sport-watches-at-couture-show"),
    StoryArticle("NORQAIN CELEBRATES ITS HISTORIC PARTNERSHIP WITH THE NHL WITH THE ADVENTURE CHRONO 41MM NHL LIMITED EDITION", "https://watchdna.com/blogs/press/norqain-celebrates-its-historic-partnership-with-the-nhl-with-the-adventure-chrono-41mm-nhl-limited-edition"),
    StoryArticle("RADO ANATOM AUTOMATIC SKELETON: THE ART OF INNOVATION AND COMFORT", "https://watchdna.com/blogs/press/rado-anatom-automatic-skeleton-the-art-of-innovation-and-comfort"),
    StoryArticle("ENCOUNTER WITH ARTISTIC ESSENCE: SCHAEFER & COMPANIONS AT THE HONG KONG WATCH FAIR", "https://watchdna.com/blogs/opendial/encounter-with-artistic-essence-schaefer-companions-at-the-hong-kong-watch-fair"),
    StoryArticle("GEORGE SULLY: FROM CANADIAN DESIGN ICON TO ADVOCATE AND STORYTELLER", "https://watchdna.com/blogs/media/george-sully-from-canadian-design-icon-to-advocate-and-storyteller"),
    StoryArticle("BUILT FOR THE MISSION: LUMINOX PACIFIC DIVER 44MM", "https://watchdna.com/blogs/watch-enthusiast/built-for-the-mission-luminox-pacific-diver-44mm"),
    StoryArticle("BAUME & MERCIER BEGINS A NEW CHAPTER: RICHEMONT TRANSFERS THE MAISON TO THE DAMIANI GROUP", "https://watchdna.com/blogs/press/baume-mercier-begins-a-new-chapter-richemont-transfers-the-maison-to-the-damiani-group"),
    StoryArticle("KELTON CELEBRATES 70 YEARS OF HISTORY WITH A HÉRITAGE THAT LOOKS TO THE FUTURE", "https://watchdna.com/blogs/press/kelton"),
    StoryArticle("THE TOP 10 UNBELIEVABLE WATCH FINDS OF ALL TIME", "https://watchdna.com/blogs/experts_story/top10-unbelievable"),
    StoryArticle("ICE-WATCH AND WATCHDNA: COLOR, INNOVATION, AND WATCHES FOR THE WHOLE FAMILY", "https://watchdna.com/blogs/opendial/color-innovation"),
    StoryArticle("WATCH MYTHS, BUSTED: THE STORIES WE TELL OURSELVES ABOUT TIME", "https://watchdna.com/blogs/education/dismantling-the-legend-the-false-myths"),
    StoryArticle("WHY YOU SHOULD CHECK YOUR WATCH’S WATER RESISTANCE EVERY TWO YEARS", "https://watchdna.com/blogs/watchmaking/whywatertestingmatters"),
    StoryArticle("A GOLDEN DEBUT: INTRODUCING THE ADVENTURE SPORT 'GOLDEN HOUR' LIMITED EDITION FOR NORTH AMERICA", "https://watchdna.com/blogs/press/a-golden-debut-introducing-the-adventure-sport-golden-hour-limited-edition-for-north-america"),
    StoryArticle("A WATCH THAT HAS TRUE SWISS DNA IN EVERY ELEMENT", "https://watchdna.com/blogs/watch-enthusiast/a-watch-that-has-true-swiss-dna-in-every-element"),
    StoryArticle("WORDEN WATCH STUDIO: WATCHES AS SMALL CREATIVE UNIVERSES", "https://watchdna.com/blogs/experts_story/worden-watch-studio-watches-as-small-creative-universes"),
    StoryArticle("HONG KONG WATCH & CLOCK FAIR: A GLOBAL VIEW OF THE WATCH INDUSTRY", "https://watchdna.com/blogs/ecosystem/hong-kong-watch-clock-fair-a-global-view-of-the-watch-industry"),
    StoryArticle("ORIS YEAR OF THE HORSE: THE GALLOP OF SWISS MECHANICS DRESSED IN CRIMSON", "https://watchdna.com/blogs/press/oris-year-of-the-fire-horse"),
    StoryArticle("CASIO OCEANUS: WHEN TECHNOLOGY MEETS THE TAKUMI SPIRIT", "https://watchdna.com/blogs/watch-enthusiast/casio-oceanus"),
    StoryArticle("HANDMADE ARTISTRY: INSIDE WORDEN WATCHES WITH FOUNDER TYLER WORDEN", "https://watchdna.com/blogs/brand_experiences/handmade-artistry-inside-worden-watches-with-founder-tyler-worden"),
    StoryArticle("THE 2025 MEN’S WATCH CHRISTMAS GIFT GUIDE", "https://watchdna.com/blogs/experts_story/the-2025-men-s-watch-christmas-gift-guide"),
    StoryArticle("MOVADO: A TOUR OF ITS ICONIC WATCHES, FROM VINTAGE TO CUTTING-EDGE", "https://watchdna.com/blogs/opendial/movado-a-tour-of-its-iconic-watches-from-vintage-to-cutting-edge"),
    StoryArticle("SWISS WATCH EXPORTS BOUNCE UP AND DOWN TO THE TUNE OF TARIFFS", "https://watchdna.com/blogs/ecosystem/swiss-watch-exports-bounce-up-and-down-to-the-tune-of-tariffs-1"),
    StoryArticle("KNAR JEWELLERY: WHERE LEGACY, CRAFT, AND TIME CONVERGE", "https://watchdna.com/blogs/jewellers_story/knar-jewellery-where-legacy-craft-and-time-converge"),
    StoryArticle("EPHJ: THE GLOBAL EPICENTER OF HIGH PRECISION AND INDUSTRIAL INNOVATION", "https://watchdna.com/blogs/press/ephj-the-global-epicenter-of-high-precision-and-industrial-innovation"),
    StoryArticle("TIMEPIECE WORLD AWARDS 2025: CELEBRATING GLOBAL EXCELLENCE IN HOROLOGY", "https://watchdna.com/blogs/press/timepiece-world-awards-2025"),
    StoryArticle("BELL & ROSS | BEYOND THE DIAL: A CONVERSATION WITH CEO CARLOS ROSILLO", "https://watchdna.com/blogs/opendial/a-flight-through-form-bell-amp-ross-at-the-couture-show"),
    StoryArticle("RADO’S CAPTAIN COOK X TENNIS LIMITED EDITION MARKS 40-YEAR LEGACY OF ACES", "https://watchdna.com/blogs/brand_experiences/rado-s-captain-cook-x-tennis-limited-edition-marks-40-year-legacy-of-aces"),
    StoryArticle("ORKOS: REVOLUTIONIZING LUXURY WATCH SECURITY WITH PATENTED CLASP TECHNOLOGY", "https://watchdna.com/blogs/press/orkos-revolutionizing-luxury-watch"),
    StoryArticle("NAGA 39 COSMIC PURPLE: MYTH, DESIGN, AND ITALIAN ELEGANCE INTERTWINED", "https://watchdna.com/blogs/watch-enthusiast/naga-39-cosmic-purple-myth-design-and-italian-elegance-intertwined"),
    StoryArticle("FROM PARIS TO THE WORLD: HOW FRANCÉCLAT IS SHAPING THE FUTURE OF FRENCH CRAFTSMANSHIP", "https://watchdna.com/blogs/industry-voices/from-paris-to-the-world-how-franceclat-is-shaping-the-future-of-french-craftsmanship"),
    StoryArticle("WHEN TIME CONNECTS: THE STORY OF JASON HUTTON, ZENEA, AND THE TIMEPIECE SHOW", "https://watchdna.com/blogs/industry-voices/meet-jason-hutton"),
    StoryArticle("THE JOURNEY OF A WATCH COLLECTOR: SERDAR OAL’S PATH TO HOROBOX", "https://watchdna.com/blogs/watch-enthusiast/thejourneyofawatchcollector"),
    StoryArticle("PROUD MEDIA PARTNER OF THE TIMEPIECES SHOW VANCOUVER | APRIL 25–27, 2025", "https://watchdna.com/blogs/ecosystem/proud-media-partner-of-the-timepieces-show-vancouver-april-25-27-2025"),
    StoryArticle("A TIMELINE OF INFAMY AND LUXURY: NOTORIOUS CRIMINALS AND THE WATCHES THEY WORE", "https://watchdna.com/blogs/experts_story/crimeandwatches"),
    StoryArticle("HOW CHRISTOPHER WARD IS REDEFINING LUXURY WATCHES – A CONVERSATION WITH MIKE PEARSON", "https://watchdna.com/blogs/opendial/how-christopher-ward-is-redefining-luxury-watches-a-conversation-with-mike-pearson"),
    StoryArticle("SOME OF THE MOST ICONIC WATCHES IN MOVIE HISTORY – THE TIMEPIECES THAT STOLE THE SHOW", "https://watchdna.com/blogs/experts_story/some-of-the-most-iconic-watches-in-movie-history-the-timepieces-that-stole-the-show"),
    StoryArticle("A WEEK ON THE WRIST WITH THE \"VERO WORKHORSE\"", "https://watchdna.com/blogs/watch-enthusiast/a-week-on-the-wrist-with-the-vero-workhorse"),
    StoryArticle("THE GIFT OF TIME: A GUIDE TO CHOOSING THE PERFECT HOLIDAY WATCH FOR YOUR LOVED ONE", "https://watchdna.com/blogs/education/thegiftoftime"),
    StoryArticle("BULOVA PROUDLY CELEBRATES ITS 150TH ANNIVERSARY", "https://watchdna.com/blogs/brand_experiences/bulova150"),
    StoryArticle("2024 CJA INDUSTRY SUMMIT: STRENGTHENING CANADA’S JEWELLERY SECTOR", "https://watchdna.com/blogs/ecosystem/2024-cja-industry-summit-strengthening-canada-s-jewellery-s-sector"),
    StoryArticle("A WEEK ON THE WRIST WITH THE SECOND HOUR \"GIANT STRIDE\"", "https://watchdna.com/blogs/watch-enthusiast/a-week-on-the-wrist-with-the-second-hour-giant-stride"),
    StoryArticle("HONORING SERVICE: A REMEMBRANCE DAY TRIBUTE THROUGH MILITARY WATCHES", "https://watchdna.com/blogs/watch-enthusiast/honoring-service-a-remembrance-day-tribute-through-military-watches"),
    StoryArticle("SUPPORTING MEN’S HEALTH THROUGH MOVEMBER: THE WATCH INDUSTRY’S ROLE", "https://watchdna.com/blogs/community/movember"),
    StoryArticle("LA MAISON MONACO: YOUR PREMIER DESTINATION FOR EXQUISITE JEWELLERY AND SWISS WATCHES IN QUEBEC AND OTTAWA", "https://watchdna.com/blogs/jewellers_story/lamaisonmonaco"),
    StoryArticle("RECAP AND HIGHLIGHTS FROM TORONTO'S INAUGURAL TIMEPIECE SHOW", "https://watchdna.com/blogs/watch-enthusiast/recap-torontotimepieceshow"),
    StoryArticle("FARR + SWIT: A DEEP DIVE INTO WATCH INNOVATION AND PASSION", "https://watchdna.com/blogs/opendial/farr-swit-a-deep-dive-into-watch-innovation-and-passion"),
    StoryArticle("RAFFI JEWELLERS: A LEGACY OF ELEGANCE AND SERVICE IN CAMBRIDGE/WATERLOO", "https://watchdna.com/blogs/jewellers_story/raffi-cambridge-waterloo"),
    StoryArticle("THE CANADIAN JEWELLERS ASSOCIATION (CJA): A PILLAR OF TRUST AND EXCELLENCE IN CANADA’S JEWELLERY INDUSTRY", "https://watchdna.com/blogs/ecosystem/cja"),
    StoryArticle("A WEEK ON THE WRIST WITH THE JACK MASON STRATOTIMER GMT", "https://watchdna.com/blogs/watch-enthusiast/jack-mason"),
    StoryArticle("EXPLORING THE LEGACY AND PASSION BEHIND RICHARDSON’S JEWELLERY", "https://watchdna.com/blogs/jewellers_story/exploring-richardsons-jewellery"),
    StoryArticle("ATELIER JALAPER: EXPLORING THE UNIQUE INTERSECTION OF HERITAGE AND INNOVATION", "https://watchdna.com/blogs/opendial/atelier-jalaper-exploring-the-unique-intersection-of-heritage-and-innovation"),
    StoryArticle("SITTING DOWN WITH REDBAR FOUNDER ADAM CRANIOTES", "https://watchdna.com/blogs/opendial/redbar-founder-adam-craniotes"),
    StoryArticle("EXPLORING MARCH LA.B: A JOURNEY INTO TIMELESS ELEGANCE AND MODERNITY", "https://watchdna.com/blogs/opendial/exploring-march-la-b-a-journey-into-timeless-elegance-and-modernity"),
    StoryArticle("A NIGHT AT A REDBAR EVENT & INSIGHTS ON THE CURRENT STATE OF BRITISH WATCHMAKING", "https://watchdna.com/blogs/watch-enthusiast/redbar-state-of-british-watchmaking"),
    StoryArticle("CHRISTOPHER WARD, FEARS WATCHES, AND STUDIO UNDERD0G, DISCOVER THE PASSION BEHIND THE BRANDS", "https://watchdna.com/blogs/opendial/british-brands"),
    StoryArticle("VIEREN: A CELEBRATION OF CRAFTSMANSHIP IN TORONTO", "https://watchdna.com/blogs/opendial/vieren"),
    StoryArticle("ELKA WATCH CO.: CRAFTING TIME, AN INTERVIEW WITH HAKIM EL KADIRI", "https://watchdna.com/blogs/opendial/hakim-elkadiri"),
    StoryArticle("MIDO WATCHES: A LEGACY OF PRECISION MEETS THE THRILL OF RED BULL CLIFF DIVING", "https://watchdna.com/blogs/brand_experiences/mido-watches-a-legacy-of-precision-meets-the-thrill-of-red-bull-cliff-diving"),
    StoryArticle("EXPERIENCING BREITLING: A VISIT TO THE TORONTO BOUTIQUE HOSTED BY REDBAR", "https://watchdna.com/blogs/brand_experiences/breitling-toronto-boutique"),
    StoryArticle("GEM BIJOU: A LEGACY OF EXCELLENCE IN THE HEART OF TORONTO", "https://watchdna.com/blogs/jewellers_story/gembijou"),
    StoryArticle("SHARING THE ❤️ WITH THE REDBAR COMMUNITY AT THE TORONTO CHAPTER", "https://watchdna.com/blogs/community/redbar-toronto"),
    StoryArticle("EXPERIENCING THE RADO 2024 NOVELTIES COLLECTION AT THE DORSET", "https://watchdna.com/blogs/brand_experiences/rado-2024"),
    StoryArticle("CELEBRATING CANADA: UNDERSTANDING ITS IMPACT ON THE WATCH INDUSTRY", "https://watchdna.com/blogs/education/celebrating-canada"),
    StoryArticle("THE COUTURE SHOW 2024: A CELEBRATION OF INNOVATION, CRAFTSMANSHIP, AND CONNECTION IN THE WORLD OF LUXURY WATCHES AND JEWELRY", "https://watchdna.com/blogs/ecosystem/coutureshow-2024"),
    StoryArticle("REDBAR: WHERE HOROLOGY MEETS CAMARADERIE", "https://watchdna.com/blogs/community/redbar"),
    StoryArticle("FROM CARTOONS TO CHRONOGRAPHS: THE ARTISTIC JOURNEY OF FREDI BRODMANN IN WATCH DESIGN", "https://watchdna.com/blogs/industry-voices/fredi-brodmann"),
    StoryArticle("A DAY OF ELEGANCE: THE HAMILTON 2024 PREMIERE AT THE RITZ CARLTON", "https://watchdna.com/blogs/brand_experiences/a-day-of-elegance-the-hamilton-2024-premiere-at-the-ritz-carlton"),
    StoryArticle("DISCOVER SOME ESSENTIAL WATCH SERVICING TIPS", "https://watchdna.com/blogs/watchmaking/watch-servicing-tips"),
    StoryArticle("ELEGANCE AND TIME: HOW LUXURY WATCHES EMBODY THE SPIRIT OF MOTHER'S DAY", "https://watchdna.com/blogs/education/mothers-day"),
    StoryArticle("THE DAILY ROUTINE OF A WATCH DESIGNER", "https://watchdna.com/blogs/industry-voices/the-daily-routine-of-a-watch-designer"),
    StoryArticle("UNVEILING THE VISIONARY BEHIND RIGHT TIME INC.: A JOURNEY OF PRECISION AND PASSION", "https://watchdna.com/blogs/jewellers_story/righttime"),
    StoryArticle("ADAPTING TRADITION: THE EVOLVING ROLE OF INDEPENDENT JEWELLERS IN THE DIGITAL ERA OF LUXURY WATCHES", "https://watchdna.com/blogs/ecosystem/adapting-tradition-the-evolving-role-of-independent-jewellers-in-the-digital-era-of-luxury-watches"),
    StoryArticle("WHAT I LEARNED FROM THE WATCH HOBBY", "https://watchdna.com/blogs/watch-enthusiast/what-i-learned-from-the-watch-hobby"),
    StoryArticle("HOW TO SHOP FOR A PRE-OWNED & VINTAGE WATCH. ESSENTIAL ADVICE FOR AVOIDING THE HYPE AND FINDING SOMETHING YOU LOVE", "https://watchdna.com/blogs/education/how-to-shop-for-a-vintage-watch-essential-advice-for-avoiding-the-hype-and-finding-something-you-love"),
    StoryArticle("THE ADVANTAGES OF BUYING WATCHES FROM AN AUTHORIZED RETAILER", "https://watchdna.com/blogs/jewellers_story/whybuyfromauthorizedretailer"),
    StoryArticle("UNDERSTAND THE CONCEPT OF WEB3", "https://watchdna.com/blogs/connected/understand-the-concept-of-web3"),
    StoryArticle("HOW TO BE AN ETHICAL WATCH CONSUMER? WHEN IT COMES TO SUSTAINABILITY, THE WATCH WORLD IS TAKING ACTION", "https://watchdna.com/blogs/ecosystem/how-to-be-an-ethical-watch-consumer-when-it-comes-to-sustainability-the-watch-world-is-taking-action"),
    StoryArticle("WATCH MOVEMENTS 101 | CAN’T TELL A QUARTZ FROM AN AUTOMATIC? HERE’S WHAT YOU NEED TO KNOW", "https://watchdna.com/blogs/watchmaking/watch-movements-101-can-t-tell-a-quartz-from-an-automatic-here-s-what-you-need-to-know"),
    StoryArticle("FIVE ESSENTIAL THINGS TO KNOW ABOUT WATCHES", "https://watchdna.com/blogs/watchmaking/five-things-essential-things-to-know-about-watches"),
    StoryArticle("HOW TO SAFELY USE THE QUICK SET DATE FUNCTION ON YOUR WATCH", "https://watchdna.com/blogs/watchmaking/how-to-safely-use-the-quick-set-date-function-on-your-watch"),
    StoryArticle("A LARGE PART OF THE DESIGN LIES IN THE SHAPE OF THE SAPPHIRE CRYSTAL", "https://watchdna.com/blogs/watchmaking/discover-the-sapphire-crystal"),
    StoryArticle("TUDOR WATCHES AND CUCINA BUCA: A FUSION OF CULINARY AND HOROLOGICAL EXPERIENCES.", "https://watchdna.com/blogs/brand_experiences/tudor-watches-and-cucina-buca-a-fusion-of-culinary-and-horological-experiences")
)

@Composable
fun OurStoriesScreen(modifier: Modifier = Modifier) {
    LazyColumn(
        modifier = modifier.fillMaxSize(),
        contentPadding = PaddingValues(vertical = 8.dp)
    ) {
        items(allStoriesList) { story ->
            StoryCard(story)
        }
        item { Spacer(modifier = Modifier.height(16.dp)) }
    }
}

@Composable
fun StoryCard(story: StoryArticle) {
    val uriHandler = LocalUriHandler.current

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp)
            .clickable {
                uriHandler.openUri(story.articleUrl)
            },
        shape = RoundedCornerShape(12.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = story.title,
                style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.SemiBold,
                color = MaterialTheme.colorScheme.onSurface,
                modifier = Modifier.weight(1f)
            )
            Spacer(modifier = Modifier.width(16.dp))
            Icon(
                imageVector = Icons.AutoMirrored.Filled.ArrowForwardIos,
                contentDescription = "Read Article",
                tint = MaterialTheme.colorScheme.primary,
                modifier = Modifier.size(16.dp)
            )
        }
    }
}