package ridingSports.snowSports

import library.Length

interface SnowWallCondition {
    /**
     * 最大のグリップ力を発揮できる雪壁の高さ
     */
    val bestGripHight: Length

    /**
     * 現在の雪壁の高さ
     */
    val currentHight: Length
}