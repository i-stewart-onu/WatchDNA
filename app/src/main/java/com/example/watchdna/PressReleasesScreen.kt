package com.example.watchdna

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

data class PressRelease(
    val title: String,
    val date: String
)

val pressReleasesList = listOf(
    PressRelease("MIDO OCEAN STAR GMT: SWISS PRECISION, MARINE SPIRIT...", "MAY 02, 2026"),
    PressRelease("PANERAI SUBMERSIBLE GMT PAM01495: EXTREME ENGINEERING...", "MAY 01, 2026"),
    PressRelease("HARMONIE BUTTERFLY POETRY IN MOTION POR AEROWATCH", "APRIL 30, 2026"),
    PressRelease("RADO CAPTAIN COOK HIGH-TECH CERAMIC CHRONOGRAPH...", "APRIL 27, 2026"),
    PressRelease("FLIEGER PRO GREEN DIAL: THE PILOT’S CLASSIC REI...", "APRIL 22, 2026"),
    PressRelease("THE NEW ERA OF NORQAIN: EXTREME WATCHES WHERE L...", "APRIL 21, 2026"),
    PressRelease("BREITLING NAVITIMER B02 CHRONOGRAPH 41 COSMONAU...", "APRIL 16, 2026"),
    PressRelease("ORIS STAR EDITION: THE RETURN OF AN ICON IN SWI...", "APRIL 14, 2026"),
    PressRelease("WOLF 1834 BROGUE: BRITISH TRADITION REIMAGINED ...", "APRIL 11, 2026"),
    PressRelease("RADO INTEGRAL: 40 YEARS OF HIGH-TECH CERAMIC", "APRIL 09, 2026"),
    PressRelease("EDOX GRAND OCEAN: MARITIME SPIRIT WITH A NEW CO...", "APRIL 8, 2026"),
    PressRelease("ORIS PRESENTS A NEW MANAGEMENT STRUCTURE", "APRIL 8, 2026"),
    PressRelease("MIDO COMMANDER DATODAY: ELEGANCE AND TECHNOLOGY...", "APRIL 6, 2026"),
    PressRelease("SARTORY-BILLARD SB10 JUMPING HOUR DISCO BALL: T...", "APRIL 6, 2026"),
    PressRelease("BR-X3 MICRO-ROTOR: HAUTE HORLOGERIE IN A SQUARE...", "APRIL 2, 2026"),
    PressRelease("ENGINEERING THE IMPOSSIBLE: NAVITIMER B01 CHRON...", "MARCH 30, 2026"),
    PressRelease("PEQUIGNET X MATTHIAS MARC: WHEN HAUTE HOROLOGY ...", "MARCH 29, 2026"),
    PressRelease("FORTIS MARINEMASTER M-44 DLC THE ULTIMATE DIVER...", "MARCH 28, 2026"),
    PressRelease("RADO TRUE ROUND X LE CORBUSIER COLLECTION: ARCH...", "MARCH 19, 2026"),
    PressRelease("FROM RENNES TO TAG HEUER: A SMALL WORLD IN WATC...", "MARCH 19, 2026"),
    PressRelease("AEROWATCH 1942 CALENDRIER COMPLET: DOUBLE MOON ...", "MARCH 11, 2026"),
    PressRelease("CELEBRATING WOMEN THROUGH TIME: INTERNATIONAL W...", "MARCH 8, 2026"),
    PressRelease("MAISON BOANTON HÉRITAGE: THE ELEGANCE OF SPEED ...", "MARCH 4, 2026"),
    PressRelease("THE POETRY OF THE MOON ON YOUR WRIST: RADO CENT...", "MARCH 3, 2026"),
    PressRelease("BERNEY PANDA: THE PERFECT UNION OF WATCHMAKING...", "FEBRUARY 27, 2026"),
    PressRelease("JCK AND LUXURY STRENGTHEN THE TIMEPIECES DESTIN...", "FEBRUARY 16, 2026"),
    PressRelease("BREITLING NAVITIMER B01 CHRONOGRAPH 43 NORTH AM...", "FEBRUARY 25, 2026"),
    PressRelease("BR-03 DIVER BLACK BRONZE: THE POWER OF THE SEA ...", "FEBRUARY 19, 2026"),
    PressRelease("ASTON MARTIN ARAMCO FORMULA ONE TEAM AND PRECIS...", "FEBRUARY 18, 2026"),
    PressRelease("NORQAIN CELEBRATES ITS HISTORIC PARTNERSHIP WIT...", "JANUARY 31, 2026"),
    PressRelease("RADO ANATOM AUTOMATIC SKELETON: THE ART OF INNO...", "JANUARY 30, 2026"),
    PressRelease("BAUME & MERCIER BEGINS A NEW CHAPTER: RICHEMONT...", "JANUARY 19, 2026"),
    PressRelease("KELTON CELEBRATES 70 YEARS OF HISTORY WITH A HÉ...", "JANUARY 19, 2026"),
    PressRelease("A GOLDEN DEBUT: INTRODUCING THE ADVENTURE SPORT...", "JANUARY 19, 2026"),
    PressRelease("ORIS YEAR OF THE HORSE: THE GALLOP OF SWISS MEC...", "JANUARY 4, 2026"),
    PressRelease("EPHJ: THE GLOBAL EPICENTER OF HIGH PRECISION AN...", "DECEMBER 14, 2025"),
    PressRelease("RADO CELEBRATES THE MAGIC OF THE SEASON WITH TH...", "DECEMBER 12, 2025"),
    PressRelease("NORQAIN: THE OFFICIAL LUXURY SPORT WATCH OF THE...", "DECEMBER 10, 2025"),
    PressRelease("DAY TWO: THE GREAT CONVERGENCE OF FINE WATCHMAK...", "NOVEMBER 21, 2025"),
    PressRelease("NORQAIN BECOMES THE OFFICIAL LUXURY SPORT WATCH...", "NOVEMBER 15, 2025"),
    PressRelease("GPHG 2025: DISCOVER THE 90 COMPETING TIMEPIECES...", "NOVEMBER 3, 2025"),
    PressRelease("A NEW ERA FOR HAUTE HORLOGERIE IN THE U.S.: COU...", "NOVEMBER 1, 2025"),
    PressRelease("JCK AND LUXURY ANNOUNCE NEW WATCH DESTINATION T...", "OCTOBER 14, 2025"),
    PressRelease("(A)LT | SYM: REDEFINING HOROLOGICAL DESIGN WITH...", "OCTOBER 2, 2025"),
    PressRelease("BREITLING BECOMES THE NFL’S OFFICIAL TIMEPIECE ...", "AUGUST 27, 2025"),
    PressRelease("TIMEPIECE WORLD AWARDS 2025: CELEBRATING GLOBAL...", "JULY 20, 2025"),
    PressRelease("ORKOS: REVOLUTIONIZING LUXURY WATCH SECURITY WI...", "JULY 17, 2025"),
    PressRelease("ACE PRECISION: RADO SERVES UP 40TH ANNIVERSARY ...", "JULY 15, 2025"),
    PressRelease("TESSÉ WATCHES: A STORY OF PASSION, TIME, AND LE...", "JUNE 28, 2025"),
    PressRelease("MARK WAHLBERG’S WATCH OF THE SUMMER? IT’S NORQA...", "JUNE 26, 2025"),
    PressRelease("BELL & ROSS BR-03 DIVER LUM OUTLINE: THE EVOLUT...", "JUNE 25, 2025"),
    PressRelease("THE BOLD RETURNS: RADO ANATOM AND THE SUMMER EX...", "JUNE 25, 2025"),
    PressRelease("SUPEROCEAN HERITAGE: WHERE AQUATIC ELEGANCE MEE...", "JUNE 21, 2025"),
    PressRelease("DISCOVER THE NEW BAUME & MERCIER RIVIERA COLLEC...", "MAY 28, 2025"),
    PressRelease("NORMALZEIT: THE RETURN OF VIENNA’S MOST ICONIC ...", "MAY 8, 2025"),
    PressRelease("SIDNEY CROSBY & NORQAIN: A SYMPHONY OF PRECISIO...", "APRIL 16, 2025"),
    PressRelease("U-BOAT CELEBRATES 25 YEARS OF BOLD HOROLOGY AT ...", "APRIL 04, 2025"),
    PressRelease("RADO 2025: THE ICON RETURNS AND NEW LEGENDS ARE...", "APRIL 02, 2025"),
    PressRelease("WATCHES & WONDERS 2025: THE ULTIMATE FAN'S GUID...", "APRIL 03, 2025"),
    PressRelease("VACHERON CONSTANTIN REDEFINES HOROLOGICAL EXCEL...", "APRIL 4, 2025"),
    PressRelease("WATCHES & WONDERS GENEVA DAY 1: 10 HOT NEW RELE...", "APRIL 3, 2025"),
    PressRelease("WATCHES AND WONDERS GENEVA 2025: A CELEBRATION ...", "APRIL 1, 2025"),
    PressRelease("BARRY KEOGHAN EXPLORES OMEGA’S WATCHMAKING EXCE...", "MARCH 11, 2025"),
    PressRelease("RADO’S ANATOM COLLECTION 2025: WHERE HERITAGE M...", "MARCH 11, 2025"),
    PressRelease("BREITLING ACQUIRES GALLET: REVIVING A LEGACY OF...", "MARCH 18, 2025"),
    PressRelease("UNBOXING THE LACO EDITION 99", "MARCH 18, 2025"),
    PressRelease("A LIFELONG PASSION FOR BASKETBALL AND TIMEPIECE...", "FEBRUARY 4, 2025")
)

@Composable
fun PressReleasesScreen(modifier: Modifier = Modifier) {
    LazyColumn(modifier = modifier.fillMaxSize()) {
        items(pressReleasesList) { release ->
            PressReleaseCard(release)
        }
        item { Spacer(modifier = Modifier.height(16.dp)) }
    }
}

@Composable
fun PressReleaseCard(release: PressRelease) {
    Column(modifier = Modifier.padding(horizontal = 16.dp, vertical = 12.dp)) {
        Text(
            text = release.title,
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.SemiBold,
            color = MaterialTheme.colorScheme.primary
        )
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = release.date,
            style = MaterialTheme.typography.labelMedium,
            color = MaterialTheme.colorScheme.secondary
        )
        Spacer(modifier = Modifier.height(8.dp))
        HorizontalDivider()
    }
}