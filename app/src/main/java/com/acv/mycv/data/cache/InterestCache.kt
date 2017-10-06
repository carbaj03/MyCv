package com.acv.mycv.data.cache

import com.acv.mycv.R
import com.acv.mycv.ui.others.interest.Interest

class InterestCache {
    private val ANDROID = "1"
    private val CRAFTER = "2"
    private val AGILE = "3"

    fun getMeetups() =
            listOf(
                    Interest(
                            "1",
                            R.drawable.meetup_crafter,
                            "Software Crafters Madrid",
                            "Karumi"),
                    Interest(
                            "2",
                            R.drawable.meetup_scala,
                            "ScalaMAD",
                            "Karumi"),
                    Interest(
                            "3",
                            R.drawable.meetup_gdg,
                            "GDG Madrid",
                            "47degree"),
                    Interest(
                            "4",
                            R.drawable.meetup_kotlin,
                            "KotlinMAD",
                            "MapBox"),
                    Interest(
                            "5",
                            R.drawable.meetup_ddd,
                            "Domain-Driven Design Madrid",
                            "Plex"),
                    Interest(
                            "6",
                            R.drawable.meetup_android,
                            "Madrid Android Developer Group",
                            "Chicisimo"),
                    Interest(
                            "6",
                            R.drawable.meetup_haskell,
                            "Madrid Haskell Users Group",
                            "Chicisimo")


            )

    fun getEvents() =
            listOf(
                    Interest(
                            "1",
                            R.drawable.event_lambda,
                            "Lambda World",
                            "Karumi"),
                    Interest(
                            "2",
                            R.drawable.event_barcelona,
                            "BCN Software Craftmanship",
                            "Karumi"),
                    Interest(
                            "3",
                            R.drawable.event_pamplona,
                            "Pamplona Software Craftmanship",
                            "47degree"),
                    Interest(
                            "4",
                            R.drawable.event_droidcon,
                            "Droidcon",
                            "MapBox"),
                    Interest(
                            "5",
                            R.drawable.event_codemotion,
                            "Codemotion",
                            "Plex"),
                    Interest(
                            "6",
                            R.drawable.event_techfest,
                            "Techfest",
                            "Chicisimo"),
                    Interest(
                            "7",
                            R.drawable.event_tarugoconf,
                            "TarugoConf",
                            "Chicisimo")
            )


}