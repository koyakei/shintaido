package ridingSports.snowSports

import library.Direction
import library.点
import library.点Range
import ridingSports.RidersAttitude


interface SkiRidersAttitude: RidersAttitude {
    val yawDirectionAgainstFallLine : Direction
    val centerOfMassMovableRange: 点Range
    val 荷重点の位置 : 点
}