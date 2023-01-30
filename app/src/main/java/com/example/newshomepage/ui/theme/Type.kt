package com.example.newshomepage.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.ExperimentalTextApi
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.googlefonts.Font
import androidx.compose.ui.text.googlefonts.GoogleFont
import androidx.compose.ui.unit.sp
import com.example.newshomepage.R

// Set of Material typography styles to start with
val Typography = Typography(
    body1 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    )
)
    /* Other default text styles to override
    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
    */

val MyFontFamily = FontFamily(
    androidx.compose.ui.text.font.Font(R.font.inter_bold, FontWeight.Bold),
    androidx.compose.ui.text.font.Font(R.font.inter_extra_bold, FontWeight.ExtraBold),
    androidx.compose.ui.text.font.Font(R.font.inter_regular, FontWeight.Normal)
)

val MyTypography = Typography(
    h1 = TextStyle(
        fontFamily = MyFontFamily,
        fontWeight = FontWeight.ExtraBold,
        fontSize = 46.sp
    ),
    h2 = TextStyle(
        fontFamily = MyFontFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 32.sp
    ),
    body1 = TextStyle(
        fontFamily = MyFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 17.sp,
        lineHeight = 30.sp,
        color = Color(93, 95, 121)
    ),
    // similarly, override other parameters like h2, subtitle, etc...
)

//@OptIn(ExperimentalTextApi::class)
//val AppFontTypography = Typography(
//    defaultFontFamily = getGoogleFontFamily(
//        name = "Inter",
//        weights = listOf(
//            FontWeight(400),
//            FontWeight(600),
//            FontWeight(800)
//        )
//    )
//)
//@OptIn(ExperimentalTextApi::class)
//private fun getGoogleFontFamily(
//    name: String,
//    provider: GoogleFont.Provider = googleFontProvider,
//    weights: List<FontWeight>
//): FontFamily {
//    return FontFamily(
//        weights.map {
//            Font(GoogleFont(name), provider, it)
//        }
//    )
//}
//
//@OptIn(ExperimentalTextApi::class)
//private val googleFontProvider: GoogleFont.Provider by lazy {
//    GoogleFont.Provider(
//        providerAuthority = "com.google.android.gms.fonts",
//        providerPackage = "com.google.android.gms",
//        certificates = R.array.com_google_android_gms_fonts_certs
//    )
//}