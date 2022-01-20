package communicationRule

/**
 * topic にメッセージが従属するのか？いや
 * 出す側にとってメッセージは一通なんですよ。
 * 観測した時点でメッセージが生成されるなら一つでいいんじゃないか
 * プッシュ通知サーバーに送達済みなら、送達済みとして扱う。
 */
interface 受信者の責任範囲への送達LogRepository{
    fun isSentMessage(
        messageIdentifier: Message.Identifier,
        送達相手Identifier: KumiteParticipant.Identifier ): Boolean
}