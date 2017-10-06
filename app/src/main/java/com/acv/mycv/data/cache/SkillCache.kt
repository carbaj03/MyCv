package com.acv.mycv.data.cache

import com.acv.mycv.R
import com.acv.mycv.ui.skills.Skill
import com.acv.mycv.ui.skills.detail.LargeItem
import com.acv.mycv.ui.skills.detail.NormalItem
import com.acv.mycv.ui.skills.detail.ShortItem
import com.acv.mycv.ui.skills.detail.SolidItem


class SkillCache {
    private val KOTLIN = "1"
    private val LIBRERIES = "2"
    private val SOLID = "3"

    fun getSkillDetail(idSkill: String) =
            when (idSkill) {
                KOTLIN -> listOf(
                        NormalItem(
                                "Sealed class",
                                "Permite representar jerarquías restringidas en las que un objeto sólo puede ser de un tipo de las dadas."),
                        LargeItem(
                                "Lambdas",
                                "Una función anónima (función literal, expresión lambda) es una subrutina definida que no está enlazada a un identificador."),
                        LargeItem(
                                "Delegation",
                                "La delegación de propiedades utilizará otro objeto que es capaz de devolver un resultado cuando se llame al get y al set (en caso de que se utilice var)."),
                        ShortItem(
                                "Extensions",
                                "Las funciones de extensión (o extension functions en inglés) son funciones que, como su propio nombre indica, nos ayudan a extender la funcionalidad de clases sin necesidad de tocar su código.",
                                "")
                )
                LIBRERIES -> listOf(
                        NormalItem(
                                "ButterKnife",
                                "Nos permite eliminar el boilerplate de relacionar vistas con el código."),
                        LargeItem(
                                "Dagger",
                                "Injector de Dependencias"),
                        LargeItem(
                                "Retrofit",
                                "Es un cliente REST que nos facilita el uso de servicios web."),
                        ShortItem(
                                "Glide",
                                "Permite la carga y el cacheo de imágenes de manera rápida y asíncrona.",
                                ""),
                        LargeItem(
                                "RxJava",
                                "Te facilita la programación asíncrona, basada en eventos mediante el uso de Observables.")
                )
                SOLID -> listOf(
                        NormalItem(
                                "Single responsibility",
                                "La noción de que un objeto solo debería tener una única responsabilidad."),
                        LargeItem(
                                "Open-closed",
                                "la noción de que las 'entidades de software … deben estar abiertas para su extensión, pero cerradas para su modificación'."),
                        LargeItem(
                                "Liskov substitution",
                                "Objetos de un programa deberían ser reemplazables por instancias de sus subtipos sin alterar el correcto funcionamiento del programa."),
                        ShortItem(
                                "Interface segregation",
                                "Muchas interfaces cliente específicas son mejores que una interfaz de propósito general.",
                                ""),
                        LargeItem(
                                "Dependency inversion",
                                "Depender de abstracciones, no depender de implementaciones.")
                )

                else -> listOf(
                        SolidItem("Otros",
                                "Permite representar jerarquías restringidas en las que un objeto sólo puede ser de un tipo de las dadas.", R.color.primary),
                        SolidItem("Lambdas",
                                "Una función anónima (función literal, expresión lambda) es una subrutina definida que no está enlazada a un identificador.", R.color.primary_dark),
                        SolidItem("Delegation", "", R.color.accent),
                        SolidItem("Extensions", "", R.color.accent)
                )
            }

    fun getAll() = mutableListOf(
            Skill(KOTLIN, R.drawable.kotlin, "Kotlin"),
            Skill(LIBRERIES, R.drawable.mo2o, "Librerias"),
            Skill(SOLID, R.drawable.solid, "Solid"),
            Skill("4", R.drawable.clean, "Clean Architecture"),
            Skill("5", R.drawable.git, "Git / GitFlow"),
            Skill("6", R.drawable.test, "Test")
    )

    fun getBy(idSkill: String): Skill =
            getAll().first { it.id == idSkill }
}
