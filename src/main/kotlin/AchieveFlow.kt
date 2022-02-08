interface AchieveFlow {
    val goal: Goal
    val goalGetter: GoalGetter
    fun handle()
}