package shintaido.movePart.稽古

import shintaido.礼法.終了礼法
import shintaido.礼法.開始礼法
//礼法を必ず最初と最後に差し込むようにしたい
interface 稽古 {
    val 開始の礼法: 開始礼法

    val 終了礼法: 終了礼法
    val 稽古の流れList: List<稽古方法>

    interface 稽古Factory{
        var 稽古の流れList: MutableList<稽古方法>
        val 開始の礼法: 開始礼法
        val 終了礼法: 終了礼法
        val 本稽古:本稽古
        fun 礼法の追加(){
            稽古の流れList.add(0,開始の礼法)
            稽古の流れList.add(終了礼法)
        }
        fun handle():稽古
    }
}