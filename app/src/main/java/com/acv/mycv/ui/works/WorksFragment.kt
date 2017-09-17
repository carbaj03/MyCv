package com.acv.mycv.ui.works

import android.support.v7.app.AppCompatActivity
import com.acv.mycv.R
import com.acv.mycv.ui.common.*
import kotlinx.android.synthetic.main.collapsing_toolbar.*
import kotlinx.android.synthetic.main.fragment_works.*


class WorksFragment : BaseFragment() {
    override fun getLayout() = R.layout.fragment_works

    override fun onCreate() {
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
            addItemDecoration(DividerDecorationK(context.color(R.color.primary), 1f))
            adapter = WorkAdapter(getItems(), ::WorkViewHolder) { listener(it) }
        }
    }

    fun listener(it: Work) =
            coordinator.snackBar(it.name)

    fun getItems() = listOf(
            Work(
                    "Android Developer"
                    , "Mo2o Madrid, Spain"
                    , "jul. de 2016 - actualidad • 1 año y 3 meses"
                    , " •Desarrollo aplicaciones nativas Android. \n" +
                    " • Participo en la gestión de los proyectos. \n" +
                    " • Colaboro ofreciendo ideas tanto de ux como de ui. \n" +
                    " • Ayudo en la creación de los servicios REST."
                    , R.drawable.mo2o
            ),
            Work(
                    "Informático"
                    , "GPI Informática León, Spain"
                    , "ago. de 2012 - jun. de 2016 • 4 años"
                    , " • Desarrollo de aplicaciones nativas Android multiplataforma, adaptandose tanto a mobil como a tablets.\n" +
                    " • Creación de páginas web con CMS(drupal, wordpress), como con php, html5, css, JS. \n" +
                    " • Mantenimiento y soporte de sistemas informáticos y redes."
                    , R.drawable.mo2o
            )
    )
}
