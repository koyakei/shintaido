package shintaido.calligraphy

import shintaido.movePart.攻防.切込切払理論.切り込み
import shintaido.礼法.終了礼法
import shintaido.礼法.開始礼法

/**
 * 円と線
 */
interface 生命の実線 : 切り込み{
    interface 入筆法: 開始礼法
    val 入筆: 入筆法

    interface 終筆法: 終了礼法
    val 終筆: 終筆法

}