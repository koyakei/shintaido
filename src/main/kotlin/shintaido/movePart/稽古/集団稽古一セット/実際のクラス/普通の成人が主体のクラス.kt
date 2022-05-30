package shintaido.movePart.稽古.集団稽古一セット.実際のクラス

import shintaido.movePart.bodyMudrah.bodyDeveloping.心身開発体操
import shintaido.movePart.稽古.整理体操.整理体操
import shintaido.movePart.稽古.本稽古
import shintaido.movePart.稽古.稽古方法
import shintaido.movePart.稽古.集団稽古一セット.新体道本科クラス
import shintaido.tenshinJuso.天真柔操
import shintaido.礼法.終了礼法
import shintaido.礼法.開始礼法

/**
 * 10-70歳が参加
 */
class 普通の成人が主体のクラス(
    override val 開始の礼法: 開始礼法 = 本科の開始礼法(),
    override val 終了礼法: 終了礼法 = 本科の終了礼法(),
    override val 稽古の流れList: List<稽古方法>,
    override val 天真柔操: 天真柔操,
    override val 心身開発体操: 心身開発体操,
    override val 整理体操: 整理体操, override val 本稽古: 本稽古
) : 新体道本科クラス {
}