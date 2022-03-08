package ridingSports.snowSports

import ridingSports.RidersAbility

interface SnowSportsRidersAbility:RidersAbility {
    /**
     * 重心移動でアンギュレーションするのだから、これは一番上に書くべきではない
     */
    val snowMobileMachineAngulationAbility: Number
}