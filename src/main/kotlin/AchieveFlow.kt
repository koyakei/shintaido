interface AchieveFlow {
    val currentStatus: CurrentStatus
    val goal: Goal
    val goalGetter: GoalGetter
    fun handle()
}