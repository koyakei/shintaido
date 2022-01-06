package ridingSports.sailing

import ridingSports.Thruster

/**
 * フィン
 * セール
 * リフトする仕組み
 * この３つを合わせてセーリングシステム
 */
interface SailingSystem: Thruster {
    val sailShape: SailShape
    val sailTrimStatus: SailTrimStatus
}

