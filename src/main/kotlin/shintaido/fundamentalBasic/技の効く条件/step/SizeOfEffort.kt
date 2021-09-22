package shintaido.fundamentalBasic.技の効く条件.step

import shintaido.fundamentalBasic.技の効く条件.StepOfHowToGetEffectiveness

/**
 * First term
 */
interface SizeOfEffort : StepOfHowToGetEffectiveness {
    val nextStep: SizePhysically
}