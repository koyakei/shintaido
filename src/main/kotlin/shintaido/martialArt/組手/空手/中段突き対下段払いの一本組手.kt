package shintaido.martialArt.組手.空手

import KumiteParticipant
import shintaido.fundamentalBasic.技
import shintaido.martialArt.単技.attack.punch.不動立ち前進による中段追い突き本突き
import shintaido.martialArt.単技.recieve.karate.不動立ち前進による下段払い受け
import shintaido.martialArt.組手.二人組の約束一本組手

/**
 * 空手の中段対下段払いの一本組みてを加工
 *
 */
class 中段突き対下段払いの一本組手(
    override val 一人目の参加者: KumiteParticipant = 中段突き対下段払いの一本組手攻撃側()
, override val 二人目の参加者: KumiteParticipant) : 二人組の約束一本組手 {
    class 中段突き対下段払いの一本組手攻撃側(override val identifier: KumiteParticipant.Identifier
    =KumiteParticipant.Identifier(1)
    , override val 技Set: Set<技> = setOf(不動立ち前進による中段追い突き本突き()))
        : KumiteParticipant{
        override fun handle() {
            技Set.stream().findFirst()
            // 一番目の技を出す
        }
    }

    class 下段払い受け側(override val identifier: KumiteParticipant.Identifier
                            =KumiteParticipant.Identifier(2)
                            , override val 技Set: Set<技> = setOf(不動立ち前進による下段払い受け()))
        : KumiteParticipant{
        override fun handle() {
            技Set.stream().findFirst()
            // 一番目の技を出す
        }
    }

    override fun handle() {
        // 実行順序によらない実行ってどうするの？　スクリプトっぽく書いてしまっているが。
        // stream で渡しといて、 handle を順番に実行でいいのかな。
        一人目の参加者.handle()
        二人目の参加者.handle()
    }
}