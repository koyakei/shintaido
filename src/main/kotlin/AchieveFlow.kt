interface AchieveFlow {
    val currentStatus: CurrentStatus
    val goal: Goal
    val achievingGoal: AchievingGoal
    fun handle()
}