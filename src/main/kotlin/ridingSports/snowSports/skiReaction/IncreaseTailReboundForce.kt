package ridingSports.snowSports.skiReaction

import library.Force

/**
 * トップの返るパワーを増やす
 */
interface IncreaseTailReboundForce {
    val しならせる余地: Any
    val pressureForce:Force

    /**
     * リバウンド
     */
    fun handle() :Force
}