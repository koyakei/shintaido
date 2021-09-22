package shintaido.fundamentalBasic.meisoKumite

import shintaido.fundamentalBasic.meisoKumite.participant.Follower
import shintaido.fundamentalBasic.meisoKumite.participant.Leader

/**
 * 瞑想組み手は流動体に限定しない。
 * 引くのに対して追従　追いかけていく
 * 攻めるほうが意識的に考えるのをやめる
 */
interface Hikari : Kumite{
    val follower : Follower
    val leader: Leader
}