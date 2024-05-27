package com.example.androidassesment.features.productList.data.remote.models

data class BookResponse(
    val products: Products
)
data class Products(
    val BP: BP,
    val CP: CP,
    val DT: DT,
    val ED: ED,
    val GM: GM,
    val LI: LI,
    val MP: MP,
    val MR: MR,
    val PCOL: PCOL,
    val PPOL: PPOL,
    val WL: WL,
    val YG: YG
)
data class YG(
    val appDiscount: Int,
    val authentic: String,
    val availableLanguages: List<String>,
    val avg: Double,
    val couponDiscount: Int,
    val description: String,
    val discount: Int,
    val imagePath: ImagePath,
    val name: String,
    val pages: Int,
    val pagesintext: String,
    val price: Int,
    val remedies: String,
    val report_type: String,
    val sampleReports: SampleReports,
    val soldcount: String,
    val vedic: String
)

data class WL(
    val appDiscount: Int,
    val authentic: String,
    val availableLanguages: List<String>,
    val avg: Double,
    val couponDiscount: Int,
    val description: String,
    val discount: Int,
    val imagePath: ImagePath,
    val name: String,
    val pages: Int,
    val pagesintext: String,
    val price: Int,
    val remedies: String,
    val report_type: String,
    val sampleReports: SampleReports,
    val soldcount: String,
    val vedic: String
)
data class DT(
    val appDiscount: Int,
    val authentic: String,
    val availableLanguages: List<String>,
    val avg: Double,
    val couponDiscount: Int,
    val description: String,
    val discount: Int,
    val imagePath: ImagePath,
    val name: String,
    val pages: Int,
    val pagesintext: String,
    val price: Int,
    val remedies: String,
    val report_type: String,
    val sampleReports: SampleReports,
    val soldcount: String,
    val vedic: String
)
data class PPOL(
    val appDiscount: Int,
    val authentic: String,
    val availableLanguages: List<String>,
    val avg: Double,
    val couponDiscount: Int,
    val description: String,
    val discount: Int,
    val imagePath: ImagePath,
    val name: String,
    val pages: Int,
    val pagesintext: String,
    val price: Int,
    val remedies: String,
    val report_type: String,
    val sampleReports: SampleReports,
    val soldcount: String,
    val vedic: String
)

data class PCOL(
    val appDiscount: Int,
    val authentic: String,
    val availableLanguages: List<String>,
    val avg: Double,
    val couponDiscount: Int,
    val description: String,
    val discount: Int,
    val imagePath: ImagePath,
    val name: String,
    val pages: Int,
    val pagesintext: String,
    val price: Int,
    val remedies: String,
    val report_type: String,
    val sampleReports: SampleReports,
    val soldcount: String,
    val vedic: String
)

data class BP(
    val appDiscount: Int,
    val authentic: String,
    val availableLanguages: List<String>,
    val avg: Double,
    val couponDiscount: Int,
    val description: String,
    val discount: Int,
    val imagePath: ImagePath,
    val name: String,
    val pages: Int,
    val pagesintext: String,
    val price: Int,
    val remedies: String,
    val report_type: String,
    val sampleReports: SampleReports,
    val soldcount: String,
    val vedic: String
)




data class ED(
    val appDiscount: Int,
    val authentic: String,
    val availableLanguages: List<String>,
    val avg: Double,
    val couponDiscount: Int,
    val description: String,
    val discount: Int,
    val imagePath: ImagePath,
    val name: String,
    val pages: Int,
    val pagesintext: String,
    val price: Int,
    val remedies: String,
    val report_type: String,
    val sampleReports: SampleReports,
    val soldcount: String,
    val vedic: String
)

data class GM(
    val appDiscount: Int,
    val authentic: String,
    val availableLanguages: List<String>,
    val avg: Double,
    val couponDiscount: Int,
    val description: String,
    val discount: Int,
    val imagePath: ImagePath,
    val name: String,
    val pages: Int,
    val pagesintext: String,
    val price: Int,
    val remedies: String,
    val report_type: String,
    val sampleReports: SampleReports,
    val soldcount: String,
    val vedic: String
)

data class LI(
    val appDiscount: Int,
    val authentic: String,
    val availableLanguages: List<String>,
    val avg: Double,
    val couponDiscount: Int,
    val description: String,
    val discount: Int,
    val imagePath: ImagePath,
    val name: String,
    val pages: Int,
    val pagesintext: String,
    val price: Int,
    val remedies: String,
    val report_type: String,
    val sampleReports: SampleReports,
    val soldcount: String,
    val vedic: String
)

data class MP(
    val appDiscount: Int,
    val authentic: String,
    val availableLanguages: List<String>,
    val avg: Double,
    val couponDiscount: Int,
    val description: String,
    val discount: Int,
    val imagePath: ImagePath,
    val name: String,
    val pages: Int,
    val pagesintext: String,
    val price: Int,
    val remedies: String,
    val report_type: String,
    val sampleReports: SampleReports,
    val soldcount: String,
    val vedic: String
)
data class CP(
    val appDiscount: Int,
    val authentic: String,
    val availableLanguages: List<String>,
    val avg: Double,
    val couponDiscount: Int,
    val description: String,
    val discount: Int,
    val imagePath: ImagePath,
    val name: String,
    val pages: Int,
    val pagesintext: String,
    val price: Int,
    val remedies: String,
    val report_type: String,
    val sampleReports: SampleReports,
    val soldcount: String,
    val vedic: String
)
data class MR(
    val appDiscount: Int,
    val authentic: String,
    val availableLanguages: List<String>,
    val avg: Double,
    val couponDiscount: Int,
    val description: String,
    val discount: Int,
    val imagePath: ImagePath,
    val name: String,
    val pages: Int,
    val pagesintext: String,
    val price: Int,
    val remedies: String,
    val report_type: String,
    val sampleReports: SampleReports,
    val soldcount: String,
    val vedic: String
)

data class SampleReports(
    val BEN: String,
    val ENG: String,
    val GUJ: String,
    val HIN: String,
    val KAN: String,
    val MAL: String,
    val MAR: String,
    val ORI: String,
    val TAM: String,
    val TEL: String
)

data class ImagePath(
    val square: String,
    val wide: String
)