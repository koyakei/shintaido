package library

interface 平面 {
    fun findX(y: Number): Number
    fun findY(y: Number): Number
    fun find接点(v: DistanceVector<Number>): 点
}