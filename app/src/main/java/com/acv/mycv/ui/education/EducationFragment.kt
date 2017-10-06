package com.acv.mycv.ui.education

import android.support.v7.app.AppCompatActivity
import com.acv.mycv.R
import com.acv.mycv.ui.common.*
import com.acv.mycv.ui.skills.height
import com.acv.mycv.ui.skills.toDp
import com.acv.mycv.ui.works.Work
import com.acv.mycv.ui.works.WorkViewHolder
import kotlinx.android.synthetic.main.collapsing_toolbar.*
import kotlinx.android.synthetic.main.fragment_works.*


class EducationFragment : BaseFragment() {
    override fun getLayout() = R.layout.fragment_works

    override fun onCreate() {
        appbar.height(toDp(120))

        with(activity as AppCompatActivity) {
            setSupportActionBar(toolbar)
            supportActionBar!!.apply {
                setDisplayShowTitleEnabled(true)
                setDisplayHomeAsUpEnabled(true)
                title = "Mis Trabajos"
            }
        }

        with(rvWorks) {
            layoutManager = linearLayoutManager()
            adapter = EducationAdapter(getItems(), ::DegreeViewHolder) { listener(it) }
        }
    }

    fun listener(it: Degree) =
            coordinator.snackBar(it.name)

    fun getItems() = mutableListOf(
            Degree(
                    "Desarrollo de Aplicaciones Informáticas",
                    "F.P Grado Superior ",
                    "Mª Auxiliadora León, Spain",
                    "2010 - 2012",
                    "•Java\n •PHP\n •C#\n •SQL\n "
            ),
            Degree(
                    "Administración de Sistemas Informáticos",
                    "F.P Grado Superior ",
                    "Mª Auxiliadora León, Spain",
                    "2008 - 2010",
                    "•SQL\n •C++\n •Linux\n •Redes\n"
            )
    )
}
