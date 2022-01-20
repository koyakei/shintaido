package communicationRule

interface Message {
    @JvmInline
    value class Identifier(val long: Long)
    val isRead: Boolean
}