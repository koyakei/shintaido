package communicationRule

/**
 * 全部のメッセージが既読かどうかは、別のクラスで判定する。
 */
interface 既読判定 {
    val 既読LogRepository: 既読LogRepository
    val messageIdentifier: Message.Identifier
    fun handle(): Boolean = 既読LogRepository.isRead(messageIdentifier)
}

