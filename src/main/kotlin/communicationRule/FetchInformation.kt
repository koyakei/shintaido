package communicationRule

interface FetchInformation {
    val selfInformation: SelfInformation
    fun handle()
}