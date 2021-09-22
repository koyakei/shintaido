package shintaido.fundamentalBasic.四体勢理論

import shintaido.fundamentalBasic.四体勢理論.subPosture.流動系
import shintaido.fundamentalBasic.四体勢理論.subPosture.自護系
import shintaido.fundamentalBasic.四体勢理論.subPosture.開放系

/**
 * ３つを兼ね備えて超えている
 */
interface 正立系: 開放系, 流動系,自護系 {
}