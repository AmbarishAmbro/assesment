package com.example.androidassesment.features.productList.data.remote.model.Response

import com.example.androidassesment.features.productList.data.remote.models.BP
import com.example.androidassesment.features.productList.data.remote.models.CP
import com.example.androidassesment.features.productList.data.remote.models.ED
import com.example.androidassesment.features.productList.data.remote.models.GM
import com.example.androidassesment.features.productList.data.remote.models.ImagePath
import com.example.androidassesment.features.productList.data.remote.models.LI
import com.example.androidassesment.features.productList.data.remote.models.MP
import com.example.androidassesment.features.productList.data.remote.models.MR
import com.example.androidassesment.features.productList.data.remote.models.PCOL
import com.example.androidassesment.features.productList.data.remote.models.PPOL
import com.example.androidassesment.features.productList.data.remote.models.SampleReports
import com.example.androidassesment.features.productList.data.remote.models.WL
import com.example.androidassesment.features.productList.data.remote.models.YG


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
        fun fromGm(gm: GM): Product {
            return Product(
                appDiscount = gm.appDiscount,
                authentic = gm.authentic,
                availableLanguages = gm.availableLanguages,
                avg = gm.avg,
                couponDiscount = gm.couponDiscount,
                description = gm.description,
                discount = gm.discount,
                imagePath = gm.imagePath,
                name = gm.name,
                pages = gm.pages,
                pagesintext = gm.pagesintext,
                price = gm.price,
                remedies = gm.remedies,
                report_type = gm.report_type,
                sampleReports = gm.sampleReports,
                soldcount = gm.soldcount,
                vedic = gm.vedic
            )
        }

        fun fromLi(li: LI): Product {
            return Product(
                appDiscount = li.appDiscount,
                authentic = li.authentic,
                availableLanguages = li.availableLanguages,
                avg = li.avg,
                couponDiscount = li.couponDiscount,
                description = li.description,
                discount = li.discount,
                imagePath = li.imagePath,
                name = li.name,
                pages = li.pages,
                pagesintext = li.pagesintext,
                price = li.price,
                remedies = li.remedies,
                report_type = li.report_type,
                sampleReports = li.sampleReports,
                soldcount = li.soldcount,
                vedic = li.vedic
            )
        }
        fun fromMp(mp: MP): Product {
            return Product(
                appDiscount = mp.appDiscount,
                authentic = mp.authentic,
                availableLanguages = mp.availableLanguages,
                avg = mp.avg,
                couponDiscount = mp.couponDiscount,
                description = mp.description,
                discount = mp.discount,
                imagePath = mp.imagePath,
                name = mp.name,
                pages = mp.pages,
                pagesintext = mp.pagesintext,
                price = mp.price,
                remedies = mp.remedies,
                report_type = mp.report_type,
                sampleReports = mp.sampleReports,
                soldcount = mp.soldcount,
                vedic = mp.vedic
            )
        }
        fun fromMr(mr: MR): Product {
            return Product(
                appDiscount = mr.appDiscount,
                authentic = mr.authentic,
                availableLanguages = mr.availableLanguages,
                avg = mr.avg,
                couponDiscount = mr.couponDiscount,
                description = mr.description,
                discount = mr.discount,
                imagePath = mr.imagePath,
                name = mr.name,
                pages = mr.pages,
                pagesintext = mr.pagesintext,
                price = mr.price,
                remedies = mr.remedies,
                report_type = mr.report_type,
                sampleReports = mr.sampleReports,
                soldcount = mr.soldcount,
                vedic = mr.vedic
            )
        }
        fun fromPcol(pcol: PCOL): Product {
            return Product(
                appDiscount = pcol.appDiscount,
                authentic = pcol.authentic,
                availableLanguages = pcol.availableLanguages,
                avg = pcol.avg,
                couponDiscount = pcol.couponDiscount,
                description = pcol.description,
                discount = pcol.discount,
                imagePath = pcol.imagePath,
                name = pcol.name,
                pages = pcol.pages,
                pagesintext = pcol.pagesintext,
                price = pcol.price,
                remedies = pcol.remedies,
                report_type = pcol.report_type,
                sampleReports = pcol.sampleReports,
                soldcount = pcol.soldcount,
                vedic = pcol.vedic
            )
        }
        fun fromPpol(ppol: PPOL): Product {
            return Product(
                appDiscount = ppol.appDiscount,
                authentic = ppol.authentic,
                availableLanguages = ppol.availableLanguages,
                avg = ppol.avg,
                couponDiscount = ppol.couponDiscount,
                description = ppol.description,
                discount = ppol.discount,
                imagePath = ppol.imagePath,
                name = ppol.name,
                pages = ppol.pages,
                pagesintext = ppol.pagesintext,
                price = ppol.price,
                remedies = ppol.remedies,
                report_type = ppol.report_type,
                sampleReports = ppol.sampleReports,
                soldcount = ppol.soldcount,
                vedic = ppol.vedic
            )
        }
        fun fromWl(wl: WL): Product {
            return Product(
                appDiscount = wl.appDiscount,
                authentic = wl.authentic,
                availableLanguages = wl.availableLanguages,
                avg = wl.avg,
                couponDiscount = wl.couponDiscount,
                description = wl.description,
                discount = wl.discount,
                imagePath = wl.imagePath,
                name = wl.name,
                pages = wl.pages,
                pagesintext = wl.pagesintext,
                price = wl.price,
                remedies = wl.remedies,
                report_type = wl.report_type,
                sampleReports = wl.sampleReports,
                soldcount = wl.soldcount,
                vedic = wl.vedic
            )
        }
        fun fromYg(yg: YG): Product {
            return Product(
                appDiscount = yg.appDiscount,
                authentic = yg.authentic,
                availableLanguages = yg.availableLanguages,
                avg = yg.avg,
                couponDiscount = yg.couponDiscount,
                description = yg.description,
                discount = yg.discount,
                imagePath = yg.imagePath,
                name = yg.name,
                pages = yg.pages,
                pagesintext = yg.pagesintext,
                price = yg.price,
                remedies = yg.remedies,
                report_type = yg.report_type,
                sampleReports = yg.sampleReports,
                soldcount = yg.soldcount,
                vedic = yg.vedic
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