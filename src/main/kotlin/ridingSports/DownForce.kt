package ridingSports

import library.Force

interface DownForce {
    val force: Force
    operator fun unaryPlus()
    operator fun unaryMinus()
}