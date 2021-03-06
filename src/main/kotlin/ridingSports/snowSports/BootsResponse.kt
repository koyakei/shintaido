package ridingSports.snowSports

import library.BootsFlex

interface BootsResponse {
    data class FootFlex(val number: Number)
    val bootsFlex:  BootsFlex
    val footFlex: FootFlex

    fun handle() = bootsFlex.number.toFloat() + footFlex.number.toFloat()
}