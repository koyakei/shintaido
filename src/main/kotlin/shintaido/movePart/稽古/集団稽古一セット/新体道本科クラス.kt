package shintaido.movePart.稽古.集団稽古一セット

import shintaido.movePart.bodyMudrah.bodyDeveloping.心身開発体操
import shintaido.movePart.稽古.整理体操.整理体操
import shintaido.movePart.稽古.本稽古
import shintaido.movePart.稽古.稽古
import shintaido.tenshinJuso.天真柔操

/**
 * 稽古に礼法は必須なのか？
 * 入りと残心は礼法としてではなくてもある。
 */
interface 新体道本科クラス :稽古 {
    val 天真柔操: 天真柔操
    val 心身開発体操: 心身開発体操
     val 本稽古: 本稽古
    val 整理体操 : 整理体操
}