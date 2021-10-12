package shintaido.martialArt.組手

import KumiteParticipant
import shintaido.martialArt.単技.単技
import shintaido.martialArt.武道の技

interface 二人組の約束組手: 約束組手 {
    val 一人目の参加者: KumiteParticipant
    val 二人目の参加者: KumiteParticipant

}