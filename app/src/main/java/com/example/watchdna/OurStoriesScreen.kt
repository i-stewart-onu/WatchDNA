package com.example.watchdna

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

val allStories = listOf(
    "Harmonie Butterfly Poetry in Motion por Aerowatch",
    "Pequignet: The Emblem of the Authentic French Watch Manufacture",
    "Watches and Wonders Wows Us with 65 Brands, 60,000 Visitors, Celebrity Cameos and Unbeatable Camaraderie",
    "Rado Captain Cook High-Tech Ceramic Chronograph: Absolute Versatility in Deep Blue",
    "Vancouver Timepiece Show Returns This Weekend",
    "Analog Illiteracy and the Future of Luxury",
    "Finding Purpose in Time: Building Luxury Timepieces with Intention",
    "Flieger Pro Green Dial: The Pilot's Classic Reimagined with Depth and Character",
    "The New Era of Norqain: Extreme Watches Where Lightness Meets Performance",
    "A Dive Watch Made of Crystallized Titanium: Danubius Black Sea",
    "Breitling Navitimer B02 Chronograph 41 Cosmonaute Artemis II: A Watch Born for Space",
    "Accutron: The Revolution of Time from the Space Race to Today",
    "From Baselines to Bezels: The Long Relationship Between Tennis and Timepieces",
    "Silent Power Revealed: Rado Anatom Automatic Skeleton",
    "Oris Star Edition: The Return of an Icon in Swiss Watchmaking",
    "French Excellence on Display at Geneva Watch Events 2026",
    "Watches and Wonders Geneva 2026: A Turning Point for the Global Watch Industry",
    "The Watch & Jewellery Industry: Resilience, Evolution, and the Rise of Discovery Platforms",
    "Wolf 1834 Brogue: British Tradition Reimagined in Fine Watchmaking",
    "Rado Integral: 40 Years of High-Tech Ceramic",
    "Edox Grand Ocean: Maritime Spirit with a New Contemporary Expression",
    "From Passion to Platform: My Conversation with the Watch You Talking About Podcast",
    "Oris Presents a New Management Structure",
    "Time & Shine 2026 Jewelry Fair: Elevating Excellence",
    "Mido Commander Datoday: Elegance and Technology in a Contemporary Classic",
    "Sartory-Billard SB10 Jumping Hour Disco Ball: The Light of Time",
    "Discovering the Story Behind Ares Watches",
    "BR-X3 Micro-Rotor: Haute Horlogerie in a Square Frame",
    "An Evening of Precision and Passion: Micromilspec Preview with CEO & Co-Founder Henrik Rye",
    "Engineering the Impossible: Navitimer B01 Chronograph 43 Tribute to Concorde",
    "The Most Influential Watch Designers You've Never Heard Of",
    "From Skeptic to Superfan: My Journey into Smartwatches",
    "Pequignet x Matthias Marc: When Haute Horology Meets Haute Cuisine",
    "Hockey Meets Horology: Norqain x NHL at the Maple Leafs Game",
    "Fortis Marinemaster M-44 DLC: The Ultimate Diver with 500 Meters of Water Resistance",
    "Discovering the Story Behind Wolf",
    "When Brands Collide: Watch Collaborations That Actually Meant Something",
    "Rado True Round x Le Corbusier Collection: Architecture Turned into Time",
    "Wei Koh Appointed President of the Grand Prix d'Horlogerie de Genève Jury for 2026",
    "When Watch Brands Got It Wrong: Famous Design & Marketing Failures",
    "Studio Underd0g Brings Its 'Avocado' Energy to Vancouver",
    "From Rennes to TAG Heuer: A Small World in Watchmaking",
    "An Evening with Hamilton: A Brand Close to My Heart",
    "Aerowatch 1942 Calendrier Complet: Double Moon Phase and Timeless Elegance",
    "Borrowed Time: The Vintage Watch Design That Quietly Returned to the Oscars",
    "Celebrating Women Through Time: International Women's Day with Rado",
    "Discover the Stil Timepieces Megara Titanium Limited Edition!",
    "The Power of Panerai",
    "Maison Boanton Héritage: The Elegance of Speed Reinterpreted",
    "The Poetry of the Moon on Your Wrist: Rado Centrix Moonphase",
    "Pilots, Sailors, Surveyors: Professions That Quietly Dictated Watch Design",
    "Watch Collecting",
    "Berney Panda: The Perfect Union of Watchmaking and Jewelry",
    "JCK and Luxury Strengthen the Timepieces Destination with Strategic Partnerships for 2026",
    "Breitling Navitimer B01 Chronograph 43 North American Limited Edition",
    "Sovrygn Watches: A Journey of Passion and Perseverance",
    "Beautiful Mistakes: How Watchmaking's Missteps Became Its Greatest Stories",
    "How Tiffany Harnessed Its Heritage to Redefine Its Watchmaking Brand",
    "BR-03 Diver Black Bronze: The Power of the Sea in Its Purest Form",
    "Worden Watch Studio; Where Watches Have Meaning",
    "Aston Martin Aramco Formula One Team and Precision Pushed to the Limit: The New Navitimer B01 by Breitling",
    "Aerowatch: Swiss Watchmaking Tradition at the Hong Kong Watch & Clock Fair",
    "Posing with Peril: The Top 10 Cities Where Wearing an Expensive Watch Can Be Dangerous",
    "France Horlogerie: An Institution Serving French Watchmaking",
    "LVMH Watch Week: Bold Gold, Black Ceramic, Plenty of Color and a Fun Tribute to the Goat",
    "Breitling x NFL Collection Hosted by King & Bay",
    "The Super Bowl Watch Hall of Fame",
    "Long Live Baume & Mercier!",
    "Everyday Japanese Chronograph Under \$400: Wancher Tenji Chronograph",
    "Modern Heritage: Charriol's Elegant Take on Sport Watches at Couture Show",
    "Norqain Celebrates Its Historic Partnership with the NHL with the Adventure Chrono 41MM NHL Limited Edition",
    "Rado Anatom Automatic Skeleton: The Art of Innovation and Comfort",
    "Encounter with Artistic Essence: Schaefer & Companions at the Hong Kong Watch Fair",
    "George Sully: From Canadian Design Icon to Advocate and Storyteller",
    "Built for the Mission: Luminox Pacific Diver 44MM",
    "Baume & Mercier Begins a New Chapter: Richemont Transfers the Maison to the Damiani Group",
    "Kelton Celebrates 70 Years of History with a Héritage That Looks to the Future",
    "The Top 10 Unbelievable Watch Finds of All Time",
    "Ice-Watch and WatchDNA: Color, Innovation, and Watches for the Whole Family",
    "Watch Myths, Busted: The Stories We Tell Ourselves About Time",
    "Why You Should Check Your Watch's Water Resistance Every Two Years",
    "A Golden Debut: Introducing the Adventure Sport 'Golden Hour' Limited Edition for North America",
    "A Watch That Has True Swiss DNA in Every Element",
    "Worden Watch Studio: Watches as Small Creative Universes",
    "Hong Kong Watch & Clock Fair: A Global View of the Watch Industry",
    "Oris Year of the Horse: The Gallop of Swiss Mechanics Dressed in Crimson",
    "Casio Oceanus: When Technology Meets the Takumi Spirit",
    "Handmade Artistry: Inside Worden Watches with Founder Tyler Worden",
    "The 2025 Men's Watch Christmas Gift Guide",
    "Movado: A Tour of Its Iconic Watches, from Vintage to Cutting-Edge",
    "Swiss Watch Exports Bounce Up and Down to the Tune of Tariffs",
    "Knar Jewellery: Where Legacy, Craft, and Time Converge",
    "EPHJ: The Global Epicenter of High Precision and Industrial Innovation",
    "The Long Con: A Field Guide to Fake Luxury Watches",
    "Uniting Passions: Inside the Canadian Watches & Jewelry Show",
    "Rado Celebrates the Magic of the Season with Three Exceptional Timepieces",
    "A Neo-Vintage Revival Blending History with Modern Craftsmanship",
    "Norqain: The Official Luxury Sport Watch of the NHL and the Exclusive Canada Edition with Sidney Crosby",
    "Discovering Luxury Gems: A Tour of the Exclusive Pieces at Gem Bijou",
    "Top Trends of 2025",
    "MB&F: The Mad Science Lab That Gave Swiss Watchmaking a Jetpack",
    "Day Two: The Great Convergence of Fine Watchmaking, Art, and the Culture of Time",
    "Learning from Justin Mastine-Frost: Finding Passion, Perspective, and Purpose in the World of Watches",
    "Norqain Becomes the Official Luxury Sport Watch of the NHL",
    "The Abingdon Co. Opens in Las Vegas; A Brand Built for Women Who Break Limits",
    "GPHG 2025: Discover the 90 Competing Timepieces and the World Tour Stages",
    "A New Era for Haute Horlogerie in the U.S.: Couture & Time to Watches Join Forces",
    "The Heartbeat of Toronto: When Forever Lasted Eighteen Innings",
    "The Top 10 Wristwatch Campaigns of All Time",
    "Expert Guide to Buy a Diving Watch",
    "The Toronto Timepiece Show 2025: A Celebration of Passion, People & Timepieces",
    "Celebrating 270 Years of the Quest for Excellence: When Vacheron Constantin Surpasses… Vacheron Constantin",
    "Building Time: Tessé Unveils the Architect — A Bold New Chapter in Swiss Watchmaking",
    "JCK and Luxury Announce New Watch Destination to Debut in Las Vegas in 2026",
    "Timepiece World Awards 2025: Celebrating 13 Winners, Canadian Passion & Horological Excellence",
    "World Watch Day — Why Celebrate Timepieces?",
    "World Watch Day Launches: A Global Celebration on 10/10",
    "Carol Besler GPHG Picks, and a Look at the New Eco Category for the 2025 Academy Awards of Watchmaking",
    "(A)LT | SYM: Redefining Horological Design with Modularity and Asymmetric Brilliance",
    "Discovering March La.B in Paris: French Elegance with a Rebel Soul",
    "Shaping the Future of Watchmaking: A Conversation with Grigor Garabedian of Birks Group",
    "Leadership Transition: Sophia Chong Appointed Executive Director of HKTDC",
    "Watches in Disaster: Timepieces That Survived the Impossible",
    "The Thrill of the Ride: My 2018 Triumph T100 and the Roads of Mono",
    "Tessé Watches Unveils the Crimson Drive: A Bold New Addition to the Michel GMT Line",
    "Vulcain at Windup Chicago: The Watch for Presidents",
    "New Oris Summer Watches | Interview with VJ Geronimo",
    "Breitling Becomes the NFL's Official Timepiece Partner — and Launches Two Team-Edition Collections",
    "The Hong Kong Watch & Clock Fair 2025: A Story of Time, Community, and Discovery",
    "Long Island Watch at Windup Watchfair in Chicago: A Conversation with Marc Frankel",
    "The Smartwatch: From Sci-Fi Fantasy to Everyday Necessity?",
    "A Parisian Encounter: WatchDNA Visits Bell & Ross Headquarters",
    "Fresh and Playful Dials | Interview with Studio Underd0g",
    "Christopher Ward at Windup Watch Fair in Chicago: A Conversation on Innovation, Identity & What's Next",
    "Inside Watch Gang: An Interview with CEO Chad Tsagris at Windup Watch Fair Chicago 2025",
    "'This Luxury You Can Really Use': Meeting Fortis at Couture Las Vegas",
    "Watch Hype vs Heritage: Is the Instagram Craze Good for Collectors?",
    "The Michel Case: Where Design Meets Precision",
    "Tuscan Boldness on the Wrist: U-Boat at the Couture Show",
    "Avi-8 at Windup Watch Fair Chicago: Nostalgia, Innovation, and a Conversation",
    "Timepiece World Awards 2025: Celebrating Global Excellence in Horology",
    "Bell & Ross | Beyond the Dial: A Conversation with CEO Carlos Rosillo",
    "Rado's Captain Cook x Tennis Limited Edition Marks 40-Year Legacy of Aces",
    "Orkos: Revolutionizing Luxury Watch Security with Patented Clasp Technology",
    "Naga 39 Cosmic Purple: Myth, Design, and Italian Elegance Intertwined",
    "From Paris to the World: How Francéclat Is Shaping the Future of French Craftsmanship",
    "Inside the Windup Watch Fair: America's Most Vibrant Celebration of Watch Culture",
    "Connect. Share. Inspire. A Global Conversation on Watch Trends at HKTDC",
    "Why It's Important to Service a Mechanical Watch Every 3 to 5 Years",
    "L'Oro Showcases IWC's 'F1' Special Edition Models over an Exclusive Collector's Soirée",
    "Ace Precision: Rado Serves Up 40th Anniversary Tennis Limited Edition at Mubadala Citi DC Open",
    "Harnessing Light with Style: The New Tissot PRC 100 Solar Collection",
    "Timing Is Everything: Richard Mille, Ferrari, and the Art of Athlete Endorsements",
    "Tessé Watches: A Story of Passion, Time, and Legacy",
    "Mark Wahlberg's Watch of the Summer? It's Norqain, and It's Ice Cream-Inspired",
    "WatchDNA to Attend the 2025 HKTDC Hong Kong Watch & Clock Fair",
    "Timeless Design, Thoughtful Craftsmanship: A Visit to the American Watchmaker Shinola at the Couture Show in Vegas",
    "Bell & Ross BR-03 Diver Lum Outline: The Evolution of an Illuminated Legend",
    "The Bold Returns: Rado Anatom and the Summer Explosion",
    "Global Watch Company: Vancouver's Premier Destination for Luxury Timepieces",
    "Rado True Square Automatic Skeleton: Where Minimalism Meets Mechanical Art",
    "A Week on the Wrist: Rado Captain Cook Overpole",
    "Time in the Sun: Summer 2025's Hottest Watch Trends",
    "Rado x Alysha Newman: Where Vision Meets Precision",
    "Christopher Ward | Discovering the New C12 Loco",
    "Rado Diastar Original x Tej Chauhan Special Edition: A Bold Re-Creation of a 1962 Icon",
    "Sarin Bachmann; JCK + Luxury: Defining Excellence in the Jewelry Industry",
    "The Art of Precision: How Luxury Experiences and Timepieces Shape the Future of High-End Markets",
    "When Time Connects: The Story of Jason Hutton, Zenea, and the Timepiece Show",
    "The Journey of a Watch Collector: Serdar Oal's Path to Horobox",
    "Proud Media Partner of the Timepieces Show Vancouver | April 25–27, 2025",
    "A Timeline of Infamy and Luxury: Notorious Criminals and the Watches They Wore",
    "How Christopher Ward Is Redefining Luxury Watches – A Conversation with Mike Pearson",
    "Some of the Most Iconic Watches in Movie History – The Timepieces That Stole the Show",
    "Celebrating Leadership and Passion in Horology",
    "The Power of Customer Experience in a Post-Covid World",
    "Canada's Top 10 Watch Import: A Look at the Numbers",
    "Why You Should Trust a Certified Watchmaker for Your Timepiece Repairs",
    "Toronto Breitling Boutique: A Hidden Gem?",
    "Timeless Tunes & Luxury Timepieces: 10 Iconic Songs About Time Paired with Exquisite Swiss Chronographs",
    "The Smartest Investment for Your Valuables: Why a Jewellery Safe Is Essential for Security and Savings",
    "Tag Heuer Takes Over as the Official Timekeeper for F1",
    "Exploring Timepieces with the Canadian Distributor of U-Boat, Solar Aqua, and Exaequo",
    "Navigating the Entrepreneurial Journey: Balancing Family, Business, and Friendships",
    "Timeless Bonds: Gifting Watches to Groomsmen as a New Wedding Trend",
    "How to Choose the Perfect Watch for Your Future Husband: A Bride-to-Be's Guide",
    "Responsible Luxury: Saving the Planet Has Become Mainstream for Luxury Watches",
    "The Magic of the Holidays: Celebrating Time, Family, and Togetherness",
    "Exploring the Journey and Vision of Gannon Brousseau, Director of the Couture Show",
    "A Week on the Wrist with the 'Vero Workhorse'",
    "The Gift of Time: A Guide to Choosing the Perfect Holiday Watch for Your Loved One",
    "Bulova Proudly Celebrates Its 150th Anniversary",
    "2024 CJA Industry Summit: Strengthening Canada's Jewellery Sector",
    "A Week on the Wrist with the Second Hour 'Giant Stride'",
    "Honoring Service: A Remembrance Day Tribute Through Military Watches",
    "Supporting Men's Health Through Movember: The Watch Industry's Role",
    "La Maison Monaco: Your Premier Destination for Exquisite Jewellery and Swiss Watches in Quebec and Ottawa",
    "Recap and Highlights from Toronto's Inaugural Timepiece Show",
    "Farr + Swit: A Deep Dive into Watch Innovation and Passion",
    "Raffi Jewellers: A Legacy of Elegance and Service in Cambridge/Waterloo",
    "The Canadian Jewellers Association (CJA): A Pillar of Trust and Excellence in Canada's Jewellery Industry",
    "A Week on the Wrist with the Jack Mason Stratotimer GMT",
    "Exploring the Legacy and Passion Behind Richardson's Jewellery",
    "Atelier Jalaper: Exploring the Unique Intersection of Heritage and Innovation",
    "Sitting Down with Redbar Founder Adam Craniotes",
    "Exploring March La.B: A Journey into Timeless Elegance and Modernity",
    "A Night at a Redbar Event & Insights on the Current State of British Watchmaking",
    "Christopher Ward, Fears Watches, and Studio Underd0g: Discover the Passion Behind the Brands",
    "Vieren: A Celebration of Craftsmanship in Toronto",
    "Elka Watch Co.: Crafting Time, an Interview with Hakim El Kadiri",
    "Mido Watches: A Legacy of Precision Meets the Thrill of Red Bull Cliff Diving",
    "Experiencing Breitling: A Visit to the Toronto Boutique Hosted by Redbar",
    "Gem Bijou: A Legacy of Excellence in the Heart of Toronto",
    "Sharing the Love with the Redbar Community at the Toronto Chapter",
    "Experiencing the Rado 2024 Novelties Collection at the Dorset",
    "Celebrating Canada: Understanding Its Impact on the Watch Industry",
    "The Couture Show 2024: A Celebration of Innovation, Craftsmanship, and Connection in the World of Luxury Watches and Jewelry",
    "Redbar: Where Horology Meets Camaraderie",
    "From Cartoons to Chronographs: The Artistic Journey of Fredi Brodmann in Watch Design",
    "A Day of Elegance: The Hamilton 2024 Premiere at the Ritz Carlton",
    "Discover Some Essential Watch Servicing Tips",
    "Elegance and Time: How Luxury Watches Embody the Spirit of Mother's Day",
    "Unveiling the Visionary Behind Right Time Inc.: A Journey of Precision and Passion",
    "Adapting Tradition: The Evolving Role of Independent Jewellers in the Digital Era of Luxury Watches",
    "The Daily Routine of a Watch Designer",
    "What I Learned from the Watch Hobby",
    "How to Shop for a Pre-Owned & Vintage Watch",
    "The Advantages of Buying Watches from an Authorized Retailer",
    "How to Be an Ethical Watch Consumer?",
    "Understand the Concept of Web3",
    "Watch Movements 101 | Can't Tell a Quartz from an Automatic? Here's What You Need to Know",
    "Five Essential Things to Know About Watches",
    "How to Safely Use the Quick Set Date Function on Your Watch",
    "A Large Part of the Design Lies in the Shape of the Sapphire Crystal",
    "Tudor Watches and Cucina Buca: A Fusion of Culinary and Horological Experiences"
)

data class Contributor(
    val name: String,
    val articles: List<String>
)

val contributors = listOf(
    Contributor("Carol Besler", listOf(
        "Pequignet: The Emblem of the Authentic French Watch Manufacture",
        "Watches and Wonders Wows Us with 65 Brands, 60,000 Visitors, Celebrity Cameos and Unbeatable Camaraderie",
        "Rado Captain Cook High-Tech Ceramic Chronograph: Absolute Versatility in Deep Blue",
        "The New Era of Norqain: Extreme Watches Where Lightness Meets Performance",
        "French Excellence on Display at Geneva Watch Events 2026",
        "Watches and Wonders Geneva 2026: A Turning Point for the Global Watch Industry",
        "The Watch & Jewellery Industry: Resilience, Evolution, and the Rise of Discovery Platforms",
        "Sartory-Billard SB10 Jumping Hour Disco Ball: The Light of Time",
        "Pequignet x Matthias Marc: When Haute Horology Meets Haute Cuisine",
        "Wei Koh Appointed President of the Grand Prix d'Horlogerie de Genève Jury for 2026",
        "JCK and Luxury Strengthen the Timepieces Destination with Strategic Partnerships for 2026",
        "France Horlogerie: An Institution Serving French Watchmaking",
        "Baume & Mercier Begins a New Chapter: Richemont Transfers the Maison to the Damiani Group",
        "Kelton Celebrates 70 Years of History with a Héritage That Looks to the Future",
        "Movado: A Tour of Its Iconic Watches, from Vintage to Cutting-Edge",
        "MB&F: The Mad Science Lab That Gave Swiss Watchmaking a Jetpack",
        "Celebrating 270 Years of the Quest for Excellence: When Vacheron Constantin Surpasses… Vacheron Constantin",
        "JCK and Luxury Announce New Watch Destination to Debut in Las Vegas in 2026",
        "Carol Besler GPHG Picks, and a Look at the New Eco Category for the 2025 Academy Awards of Watchmaking",
        "Leadership Transition: Sophia Chong Appointed Executive Director of HKTDC",
        "Bell & Ross | Beyond the Dial: A Conversation with CEO Carlos Rosillo",
        "From Paris to the World: How Francéclat Is Shaping the Future of French Craftsmanship",
        "Sarin Bachmann; JCK + Luxury: Defining Excellence in the Jewelry Industry",
        "Bulova Proudly Celebrates Its 150th Anniversary",
        "2024 CJA Industry Summit: Strengthening Canada's Jewellery Sector",
        "The Canadian Jewellers Association (CJA): A Pillar of Trust and Excellence in Canada's Jewellery Industry",
        "The Couture Show 2024: A Celebration of Innovation, Craftsmanship, and Connection in the World of Luxury Watches and Jewelry",
        "Adapting Tradition: The Evolving Role of Independent Jewellers in the Digital Era of Luxury Watches"
    )),
    Contributor("Danilo Del Gaudio", listOf(
        "Harmonie Butterfly Poetry in Motion por Aerowatch",
        "Aerowatch 1942 Calendrier Complet: Double Moon Phase and Timeless Elegance",
        "Berney Panda: The Perfect Union of Watchmaking and Jewelry",
        "Aerowatch: Swiss Watchmaking Tradition at the Hong Kong Watch & Clock Fair",
        "Encounter with Artistic Essence: Schaefer & Companions at the Hong Kong Watch Fair",
        "Naga 39 Cosmic Purple: Myth, Design, and Italian Elegance Intertwined"
    )),
    Contributor("Brigitte Cohen", listOf(
        "Analog Illiteracy and the Future of Luxury"
    )),
    Contributor("Mike Pearson", listOf(
        "Finding Purpose in Time: Building Luxury Timepieces with Intention",
        "Rado Integral: 40 Years of High-Tech Ceramic",
        "How Tiffany Harnessed Its Heritage to Redefine Its Watchmaking Brand",
        "Breitling x NFL Collection Hosted by King & Bay",
        "The 2025 Men's Watch Christmas Gift Guide",
        "Christopher Ward at Windup Watch Fair in Chicago: A Conversation on Innovation, Identity & What's Next",
        "Rado's Captain Cook x Tennis Limited Edition Marks 40-Year Legacy of Aces"
    )),
    Contributor("Marco Piva", listOf(
        "Flieger Pro Green Dial: The Pilot's Classic Reimagined with Depth and Character",
        "Mido Commander Datoday: Elegance and Technology in a Contemporary Classic",
        "BR-03 Diver Black Bronze: The Power of the Sea in Its Purest Form",
        "Modern Heritage: Charriol's Elegant Take on Sport Watches at Couture Show",
        "Maison Boanton Héritage: The Elegance of Speed Reinterpreted",
        "Bell & Ross BR-03 Diver Lum Outline: The Evolution of an Illuminated Legend"
    )),
    Contributor("Luciano Di Genova", listOf(
        "A Dive Watch Made of Crystallized Titanium: Danubius Black Sea",
        "Breitling Navitimer B02 Chronograph 41 Cosmonaute Artemis II: A Watch Born for Space",
        "Silent Power Revealed: Rado Anatom Automatic Skeleton",
        "Oris Star Edition: The Return of an Icon in Swiss Watchmaking",
        "Wolf 1834 Brogue: British Tradition Reimagined in Fine Watchmaking",
        "Edox Grand Ocean: Maritime Spirit with a New Contemporary Expression",
        "BR-X3 Micro-Rotor: Haute Horlogerie in a Square Frame",
        "Engineering the Impossible: Navitimer B01 Chronograph 43 Tribute to Concorde",
        "Breitling Navitimer B01 Chronograph 43 North American Limited Edition",
        "Aston Martin Aramco Formula One Team and Precision Pushed to the Limit: The New Navitimer B01 by Breitling",
        "Rado Anatom Automatic Skeleton: The Art of Innovation and Comfort",
        "Built for the Mission: Luminox Pacific Diver 44MM",
        "Oris Year of the Horse: The Gallop of Swiss Mechanics Dressed in Crimson",
        "Casio Oceanus: When Technology Meets the Takumi Spirit",
        "A Neo-Vintage Revival Blending History with Modern Craftsmanship",
        "Building Time: Tessé Unveils the Architect — A Bold New Chapter in Swiss Watchmaking",
        "Tessé Watches Unveils the Crimson Drive: A Bold New Addition to the Michel GMT Line",
        "Tessé Watches: A Story of Passion, Time, and Legacy",
        "Rado True Square Automatic Skeleton: Where Minimalism Meets Mechanical Art",
        "Rado Diastar Original x Tej Chauhan Special Edition: A Bold Re-Creation of a 1962 Icon"
    )),
    Contributor("Adrian Smith", listOf(
        "Accutron: The Revolution of Time from the Space Race to Today",
        "From Baselines to Bezels: The Long Relationship Between Tennis and Timepieces",
        "From Skeptic to Superfan: My Journey into Smartwatches",
        "Hockey Meets Horology: Norqain x NHL at the Maple Leafs Game",
        "When Brands Collide: Watch Collaborations That Actually Meant Something",
        "From Rennes to TAG Heuer: A Small World in Watchmaking",
        "Celebrating Women Through Time: International Women's Day with Rado",
        "Sovrygn Watches: A Journey of Passion and Perseverance",
        "LVMH Watch Week: Bold Gold, Black Ceramic, Plenty of Color and a Fun Tribute to the Goat",
        "The Super Bowl Watch Hall of Fame",
        "Norqain Celebrates Its Historic Partnership with the NHL with the Adventure Chrono 41MM NHL Limited Edition",
        "Norqain: The Official Luxury Sport Watch of the NHL and the Exclusive Canada Edition with Sidney Crosby",
        "Norqain Becomes the Official Luxury Sport Watch of the NHL",
        "Breitling Becomes the NFL's Official Timepiece Partner — and Launches Two Team-Edition Collections",
        "Rado's Captain Cook x Tennis Limited Edition Marks 40-Year Legacy of Aces",
        "Ace Precision: Rado Serves Up 40th Anniversary Tennis Limited Edition at Mubadala Citi DC Open",
        "Mark Wahlberg's Watch of the Summer? It's Norqain, and It's Ice Cream-Inspired",
        "Rado x Alysha Newman: Where Vision Meets Precision",
        "Tag Heuer Takes Over as the Official Timekeeper for F1",
        "Supporting Men's Health Through Movember: The Watch Industry's Role"
    )),
    Contributor("Serdar Oal", listOf(
        "The Journey of a Watch Collector: Serdar Oal's Path to Horobox"
    )),
    Contributor("Adam Craniotes", listOf(
        "Sitting Down with Redbar Founder Adam Craniotes"
    )),
    Contributor("Hakim El Kadiri", listOf(
        "Elka Watch Co.: Crafting Time, an Interview with Hakim El Kadiri"
    )),
    Contributor("Tyler Worden", listOf(
        "Handmade Artistry: Inside Worden Watches with Founder Tyler Worden"
    )),
    Contributor("Gannon Brousseau", listOf(
        "Exploring the Journey and Vision of Gannon Brousseau, Director of the Couture Show"
    )),
    Contributor("Adam Ross", listOf(
        "A Week on the Wrist with the 'Vero Workhorse'",
        "A Week on the Wrist with the Second Hour 'Giant Stride'",
        "A Week on the Wrist with the Jack Mason Stratotimer GMT"
    )),
    Contributor("Fredi Brodmann", listOf(
        "From Cartoons to Chronographs: The Artistic Journey of Fredi Brodmann in Watch Design"
    ))
)

@Composable
fun OurStoriesScreen(modifier: Modifier = Modifier) {
    var selectedTab by remember { mutableStateOf(0) }
    val tabs = listOf("All", "Contributors", "Watch Enthusiasts")

    Column(modifier = modifier) {
        TabRow(selectedTabIndex = selectedTab) {
            tabs.forEachIndexed { index, title ->
                Tab(
                    selected = selectedTab == index,
                    onClick = { selectedTab = index },
                    text = { Text(title) }
                )
            }
        }
        when (selectedTab) {
            0 -> AllStoriesTab()
            1 -> ContributorsTab()
            2 -> WatchEnthusiastsTab()
        }
    }
}

@Composable
fun StoryItem(title: String) {
    Text(
        text = title,
        style = MaterialTheme.typography.bodyMedium,
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 12.dp)
    )
    HorizontalDivider()
}

@Composable
fun AllStoriesTab() {
    LazyColumn(modifier = Modifier.fillMaxSize()) {
        items(allStories) { StoryItem(it) }
        item { Spacer(modifier = Modifier.height(16.dp)) }
    }
}

@Composable
fun ContributorsTab() {
    LazyColumn(modifier = Modifier.fillMaxSize()) {
        contributors.forEach { contributor ->
            item {
                Text(
                    text = contributor.name,
                    style = MaterialTheme.typography.labelMedium,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.primary,
                    modifier = Modifier
                        .padding(horizontal = 16.dp)
                        .padding(top = 24.dp, bottom = 4.dp)
                )
            }
            items(contributor.articles) { StoryItem(it) }
        }
        item { Spacer(modifier = Modifier.height(16.dp)) }
    }
}

@Composable
fun WatchEnthusiastsTab() {
    val enthusiastStories = listOf(
        "From Passion to Platform: My Conversation with the Watch You Talking About Podcast",
        "Discovering the Story Behind Ares Watches",
        "An Evening of Precision and Passion: Micromilspec Preview with CEO & Co-Founder Henrik Rye",
        "The Most Influential Watch Designers You've Never Heard Of",
        "Fortis Marinemaster M-44 DLC: The Ultimate Diver with 500 Meters of Water Resistance",
        "Discovering the Story Behind Wolf",
        "Rado True Round x Le Corbusier Collection: Architecture Turned into Time",
        "When Watch Brands Got It Wrong: Famous Design & Marketing Failures",
        "Studio Underd0g Brings Its 'Avocado' Energy to Vancouver",
        "An Evening with Hamilton: A Brand Close to My Heart",
        "Borrowed Time: The Vintage Watch Design That Quietly Returned to the Oscars",
        "Discover the Stil Timepieces Megara Titanium Limited Edition!",
        "The Power of Panerai",
        "The Poetry of the Moon on Your Wrist: Rado Centrix Moonphase",
        "Pilots, Sailors, Surveyors: Professions That Quietly Dictated Watch Design",
        "Watch Collecting",
        "Beautiful Mistakes: How Watchmaking's Missteps Became Its Greatest Stories",
        "Worden Watch Studio; Where Watches Have Meaning",
        "Posing with Peril: The Top 10 Cities Where Wearing an Expensive Watch Can Be Dangerous",
        "Long Live Baume & Mercier!",
        "Everyday Japanese Chronograph Under \$400: Wancher Tenji Chronograph",
        "George Sully: From Canadian Design Icon to Advocate and Storyteller",
        "The Top 10 Unbelievable Watch Finds of All Time",
        "Ice-Watch and WatchDNA: Color, Innovation, and Watches for the Whole Family",
        "Watch Myths, Busted: The Stories We Tell Ourselves About Time",
        "Why You Should Check Your Watch's Water Resistance Every Two Years",
        "A Golden Debut: Introducing the Adventure Sport 'Golden Hour' Limited Edition for North America",
        "A Watch That Has True Swiss DNA in Every Element",
        "Worden Watch Studio: Watches as Small Creative Universes",
        "Knar Jewellery: Where Legacy, Craft, and Time Converge",
        "The Long Con: A Field Guide to Fake Luxury Watches",
        "Uniting Passions: Inside the Canadian Watches & Jewelry Show",
        "Rado Celebrates the Magic of the Season with Three Exceptional Timepieces",
        "Discovering Luxury Gems: A Tour of the Exclusive Pieces at Gem Bijou",
        "Day Two: The Great Convergence of Fine Watchmaking, Art, and the Culture of Time",
        "Learning from Justin Mastine-Frost: Finding Passion, Perspective, and Purpose in the World of Watches",
        "The Abingdon Co. Opens in Las Vegas; A Brand Built for Women Who Break Limits",
        "GPHG 2025: Discover the 90 Competing Timepieces and the World Tour Stages",
        "A New Era for Haute Horlogerie in the U.S.: Couture & Time to Watches Join Forces",
        "The Heartbeat of Toronto: When Forever Lasted Eighteen Innings",
        "The Top 10 Wristwatch Campaigns of All Time",
        "Expert Guide to Buy a Diving Watch",
        "The Toronto Timepiece Show 2025: A Celebration of Passion, People & Timepieces",
        "Timepiece World Awards 2025: Celebrating 13 Winners, Canadian Passion & Horological Excellence",
        "World Watch Day — Why Celebrate Timepieces?",
        "World Watch Day Launches: A Global Celebration on 10/10",
        "(A)LT | SYM: Redefining Horological Design with Modularity and Asymmetric Brilliance",
        "Discovering March La.B in Paris: French Elegance with a Rebel Soul",
        "Shaping the Future of Watchmaking: A Conversation with Grigor Garabedian of Birks Group",
        "Watches in Disaster: Timepieces That Survived the Impossible",
        "The Thrill of the Ride: My 2018 Triumph T100 and the Roads of Mono",
        "Vulcain at Windup Chicago: The Watch for Presidents",
        "New Oris Summer Watches | Interview with VJ Geronimo",
        "The Hong Kong Watch & Clock Fair 2025: A Story of Time, Community, and Discovery",
        "Long Island Watch at Windup Watchfair in Chicago: A Conversation with Marc Frankel",
        "The Smartwatch: From Sci-Fi Fantasy to Everyday Necessity?",
        "A Parisian Encounter: WatchDNA Visits Bell & Ross Headquarters",
        "Fresh and Playful Dials | Interview with Studio Underd0g",
        "Inside Watch Gang: An Interview with CEO Chad Tsagris at Windup Watch Fair Chicago 2025",
        "'This Luxury You Can Really Use': Meeting Fortis at Couture Las Vegas",
        "Watch Hype vs Heritage: Is the Instagram Craze Good for Collectors?",
        "The Michel Case: Where Design Meets Precision",
        "Tuscan Boldness on the Wrist: U-Boat at the Couture Show",
        "Avi-8 at Windup Watch Fair Chicago: Nostalgia, Innovation, and a Conversation",
        "Timepiece World Awards 2025: Celebrating Global Excellence in Horology",
        "Orkos: Revolutionizing Luxury Watch Security with Patented Clasp Technology",
        "Inside the Windup Watch Fair: America's Most Vibrant Celebration of Watch Culture",
        "Connect. Share. Inspire. A Global Conversation on Watch Trends at HKTDC",
        "Why It's Important to Service a Mechanical Watch Every 3 to 5 Years",
        "L'Oro Showcases IWC's 'F1' Special Edition Models over an Exclusive Collector's Soirée",
        "Harnessing Light with Style: The New Tissot PRC 100 Solar Collection",
        "Timing Is Everything: Richard Mille, Ferrari, and the Art of Athlete Endorsements",
        "WatchDNA to Attend the 2025 HKTDC Hong Kong Watch & Clock Fair",
        "Timeless Design, Thoughtful Craftsmanship: A Visit to Shinola at the Couture Show in Vegas",
        "The Bold Returns: Rado Anatom and the Summer Explosion",
        "Global Watch Company: Vancouver's Premier Destination for Luxury Timepieces",
        "A Week on the Wrist: Rado Captain Cook Overpole",
        "Time in the Sun: Summer 2025's Hottest Watch Trends",
        "Christopher Ward | Discovering the New C12 Loco",
        "The Art of Precision: How Luxury Experiences and Timepieces Shape the Future of High-End Markets",
        "When Time Connects: The Story of Jason Hutton, Zenea, and the Timepiece Show",
        "Proud Media Partner of the Timepieces Show Vancouver | April 25–27, 2025",
        "A Timeline of Infamy and Luxury: Notorious Criminals and the Watches They Wore",
        "How Christopher Ward Is Redefining Luxury Watches – A Conversation with Mike Pearson",
        "Some of the Most Iconic Watches in Movie History – The Timepieces That Stole the Show",
        "Celebrating Leadership and Passion in Horology",
        "The Power of Customer Experience in a Post-Covid World",
        "Canada's Top 10 Watch Import: A Look at the Numbers",
        "Why You Should Trust a Certified Watchmaker for Your Timepiece Repairs",
        "Toronto Breitling Boutique: A Hidden Gem?",
        "Timeless Tunes & Luxury Timepieces: 10 Iconic Songs About Time Paired with Exquisite Swiss Chronographs",
        "The Smartest Investment for Your Valuables: Why a Jewellery Safe Is Essential",
        "Exploring Timepieces with the Canadian Distributor of U-Boat, Solar Aqua, and Exaequo",
        "Navigating the Entrepreneurial Journey: Balancing Family, Business, and Friendships",
        "Timeless Bonds: Gifting Watches to Groomsmen as a New Wedding Trend",
        "How to Choose the Perfect Watch for Your Future Husband: A Bride-to-Be's Guide",
        "Responsible Luxury: Saving the Planet Has Become Mainstream for Luxury Watches",
        "The Magic of the Holidays: Celebrating Time, Family, and Togetherness",
        "The Gift of Time: A Guide to Choosing the Perfect Holiday Watch for Your Loved One",
        "Honoring Service: A Remembrance Day Tribute Through Military Watches",
        "La Maison Monaco: Your Premier Destination for Exquisite Jewellery and Swiss Watches",
        "Recap and Highlights from Toronto's Inaugural Timepiece Show",
        "Farr + Swit: A Deep Dive into Watch Innovation and Passion",
        "Raffi Jewellers: A Legacy of Elegance and Service in Cambridge/Waterloo",
        "Exploring the Legacy and Passion Behind Richardson's Jewellery",
        "Atelier Jalaper: Exploring the Unique Intersection of Heritage and Innovation",
        "Exploring March La.B: A Journey into Timeless Elegance and Modernity",
        "A Night at a Redbar Event & Insights on the Current State of British Watchmaking",
        "Christopher Ward, Fears Watches, and Studio Underd0g: Discover the Passion Behind the Brands",
        "Vieren: A Celebration of Craftsmanship in Toronto",
        "Mido Watches: A Legacy of Precision Meets the Thrill of Red Bull Cliff Diving",
        "Experiencing Breitling: A Visit to the Toronto Boutique Hosted by Redbar",
        "Gem Bijou: A Legacy of Excellence in the Heart of Toronto",
        "Sharing the Love with the Redbar Community at the Toronto Chapter",
        "Experiencing the Rado 2024 Novelties Collection at the Dorset",
        "Celebrating Canada: Understanding Its Impact on the Watch Industry",
        "Redbar: Where Horology Meets Camaraderie",
        "A Day of Elegance: The Hamilton 2024 Premiere at the Ritz Carlton",
        "Discover Some Essential Watch Servicing Tips",
        "Elegance and Time: How Luxury Watches Embody the Spirit of Mother's Day",
        "Unveiling the Visionary Behind Right Time Inc.: A Journey of Precision and Passion",
        "The Daily Routine of a Watch Designer",
        "What I Learned from the Watch Hobby",
        "How to Shop for a Pre-Owned & Vintage Watch",
        "The Advantages of Buying Watches from an Authorized Retailer",
        "How to Be an Ethical Watch Consumer?",
        "Understand the Concept of Web3",
        "Watch Movements 101 | Can't Tell a Quartz from an Automatic? Here's What You Need to Know",
        "Five Essential Things to Know About Watches",
        "How to Safely Use the Quick Set Date Function on Your Watch",
        "A Large Part of the Design Lies in the Shape of the Sapphire Crystal",
        "Tudor Watches and Cucina Buca: A Fusion of Culinary and Horological Experiences"
    )

    LazyColumn(modifier = Modifier.fillMaxSize()) {
        items(enthusiastStories) { StoryItem(it) }
        item { Spacer(modifier = Modifier.height(16.dp)) }
    }
}