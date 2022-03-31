package ridingSports.snowSports

import library.Distance

interface SnowWallCondition {
    /**
     * 最大のグリップ力を発揮できる雪壁の高さ
     */
    val bestGripHight: Distance

    /**
     * 現在の雪壁の高さ
     */
    val currentHight: Distance
}