package com.acv.mycv.data.cache

import com.acv.mycv.ui.skills.detail.LargeItem
import com.acv.mycv.ui.skills.detail.NormalItem
import com.acv.mycv.ui.skills.detail.ShortItem


class SkillCache {
    fun loadSkillDetail(idSkill: String) = when (idSkill) {
        "1" -> listOf(
                NormalItem("Sealed class",
                        "Permite representar jerarquías restringidas en las que un objeto sólo puede ser de un tipo de las dadas."),
                LargeItem("Lambdas",
                        "Una función anónima (función literal, expresión lambda) es una subrutina definida que no está enlazada a un identificador."),
                LargeItem("Delegation", ""),
                ShortItem("Extensions", "", "")
        )
        else -> listOf(
                NormalItem("Otros",
                        "Permite representar jerarquías restringidas en las que un objeto sólo puede ser de un tipo de las dadas."),
                LargeItem("Lambdas",
                        "Una función anónima (función literal, expresión lambda) es una subrutina definida que no está enlazada a un identificador."),
                LargeItem("Delegation", ""),
                ShortItem("Extensions", "", "")
        )
    }
}
