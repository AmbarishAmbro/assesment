package com.example.androidassesment.features.productList.data.remote.model.Response

import com.example.androidassesment.features.productList.data.remote.models.BP
import com.example.androidassesment.features.productList.data.remote.models.CP
import com.example.androidassesment.features.productList.data.remote.models.ED
import com.example.androidassesment.features.productList.data.remote.models.ImagePath
import com.example.androidassesment.features.productList.data.remote.models.SampleReports


data class BookExpectedResponce(
    var products: List<Product>
)

data class Product(
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

{
    companion object {
        fun fromBP(bp: BP): Product {
            return Product(
                appDiscount = bp.appDiscount,
                authentic = bp.authentic,
                availableLanguages = bp.availableLanguages,
                avg = bp.avg,
                couponDiscount = bp.couponDiscount,
                description = bp.description,
                discount = bp.discount,
                imagePath = bp.imagePath,
                name = bp.name,
                pages = bp.pages,
                pagesintext = bp.pagesintext,
                price = bp.price,
                remedies = bp.remedies,
                report_type = bp.report_type,
                sampleReports = bp.sampleReports,
                soldcount = bp.soldcount,
                vedic = bp.vedic
            )
        }

        fun fromED(ed: ED): Product {
            return Product(
                appDiscount = ed.appDiscount,
                authentic = ed.authentic,
                availableLanguages = ed.availableLanguages,
                avg = ed.avg,
                couponDiscount = ed.couponDiscount,
                description = ed.description,
                discount = ed.discount,
                imagePath = ed.imagePath,
                name = ed.name,
                pages = ed.pages,
                pagesintext = ed.pagesintext,
                price = ed.price,
                remedies = ed.remedies,
                report_type = ed.report_type,
                sampleReports = ed.sampleReports,
                soldcount = ed.soldcount,
                vedic = ed.vedic
            )
        }

        fun fromCp(cp: CP): Product {
            return Product(
                appDiscount = cp.appDiscount,
                authentic = cp.authentic,
                availableLanguages = cp.availableLanguages,
                avg = cp.avg,
                couponDiscount = cp.couponDiscount,
                description = cp.description,
                discount = cp.discount,
                imagePath = cp.imagePath,
                name = cp.name,
                pages = cp.pages,
                pagesintext = cp.pagesintext,
                price = cp.price,
                remedies = cp.remedies,
                report_type = cp.report_type,
                sampleReports = cp.sampleReports,
                soldcount = cp.soldcount,
                vedic = cp.vedic
            )
        }
    }
}

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