package com.acv.mycv.data.cache

import com.acv.mycv.R
import com.acv.mycv.ui.others.referent.Referent

class ReferentCache {
    private val ANDROID = "1"
    private val CRAFTER = "2"
    private val AGILE = "3"

    fun getAndroiders() =
            listOf(
                    Referent(
                            "1",
                            R.drawable.android_barroso,
                            "Jorge Barroso",
                            "Karumi"),
                    Referent(
                            "2",
                            R.drawable.android_pedro_gomez,
                            "Predro Gomez",
                            "Karumi"),
                    Referent(
                            "3",
                            R.drawable.kotlin,
                            "Raul Raja",
                            "47degree"),
                    Referent(
                            "4",
                            R.drawable.android_pablo_guardiola,
                            "Pablo Guardiola",
                            "MapBox"),
                    Referent(
                            "5",
                            R.drawable.android_antonio_leiva,
                            "Antonio Leiva",
                            "Plex"),
                    Referent(
                            "6",
                            R.drawable.android_saul_diaz,
                            "Saul Díaz",
                            "Chicisimo")
            )

    fun getCrafters() =
            listOf(
                    Referent(
                            "1",
                            R.drawable.crafter_uncle_bob,
                            "Uncle Bob",
                            "Uncle Bob"),
                    Referent(
                            "2",
                            R.drawable.crafter_sandro_mancuso,
                            "Sandro Mancuso",
                            "Codurance"),
                    Referent(
                            "3",
                            R.drawable.crafter_carlos_ble,
                            "Carlos Blé",
                            "Codesai"),
                    Referent(
                            "4",
                            R.drawable.crafter_modesto,
                            "Modesto San Juan",
                            "Plain Concepts"),
                    Referent(
                            "5",
                            R.drawable.crafter_eric_evans,
                            "Eric Evans",
                            "Domain Languaje"),
                    Referent(
                            "6",
                            R.drawable.crafter_xavi_gost,
                            "Xavi Gost",
                            "Devscola"),
                    Referent(
                            "6",
                            R.drawable.crafter_xavi_gost,
                            "Carlos Buenosvinos",
                            "Devscola")

            )
    fun getSoftSkills() =
            listOf(
                    Referent(
                            "1",
                            R.drawable.soft_euge,
                            "Euge Oller",
                            "Emprendedor"),
                    Referent(
                            "2",
                            R.drawable.soft_javier_muniz,
                            "Javier Muñiz",
                            "Emprendedor"),
                    Referent(
                            "3",
                            R.drawable.soft_power_explosive,
                            "David Marchante",
                            "PowerExplosive"),
                    Referent(
                            "4",
                            R.drawable.soft_vanesa_tejada,
                            "Vanesa Tejada",
                            "lastminute.com"),
                    Referent(
                            "5",
                            R.drawable.sofft_cantone,
                            "David Cantone",
                            "David Cantone"),
                    Referent(
                            "6",
                            R.drawable.soft_alex_arroyo,
                            "Alex Arroyo",
                            "Alex Arroyo")
            )

}

