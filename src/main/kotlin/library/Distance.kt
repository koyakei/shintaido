package library

data class Distance(val distance: Number) {

    infix operator fun div(distance: Distance): Distance {
        return Distance(distance = distance.distance)
    }
    infix operator fun div(number: Number): Number {
        return distance
    }
}