package br.edu.irati.ifpr.tcc_mobile.ui.presentation.onboarding

import androidx.annotation.DrawableRes
import br.edu.irati.ifpr.tcc_mobile.R

data class Page(
    val title: String,
    val description: String,
    @DrawableRes val image: Int
)

val pages = listOf(
    Page(
        title = "Pag 1",
        description = "Pagágina 1",
        image = R.drawable.onboarding1
    ),
    Page(
        title = "Pag 2",
        description = "Página 2",
        image = R.drawable.onboarding2
    ),
    Page(
        title = "Pag 3",
        description = "Página 3",
        image = R.drawable.onboarding3
    )
)
