package communicationRule

interface PushInformation {
    val selfInformation: SelfInformation
    fun handle()
}