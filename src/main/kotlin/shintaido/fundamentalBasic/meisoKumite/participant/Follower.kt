package shintaido.fundamentalBasic.meisoKumite.participant

import shintaido.movePart.追従.Following

/**
 * 従う目標を設定するのか？
 */
interface Follower {

    val followingTarget: Following
}