package communicationRule

import KumiteParticipant

/**
 * 現在メッセージがどこにスタックしているか？
 * ネットワークの経路を登録して通過したフラグを投げる？そんなことないだろ。
 * 相手の管理先に送達したログを記録してあるかどうかで判定するのが良いのかな。
 */
interface 送達判定 {
    val 受信者の責任範囲Repository: 受信者の責任範囲への送達LogRepository
    val 送達相手Identifier: KumiteParticipant.Identifier
    val messageIdentifier: Message.Identifier
    fun handle(): Boolean{
        return 受信者の責任範囲Repository.isSentMessage(
            messageIdentifier,送達相手Identifier
        )
    }
}



interface 送信者の責任範囲

interface 全体の責任{

}
