package communicationRule

interface 既読LogRepository{
    fun isRead(messageIdentifier: Message.Identifier):Boolean
}