package shintaido.martialArt.単技.recieve.karate

import shintaido.martialArt.単技.recieve.general.下段払い受け
import shintaido.martialArt.種目別の技.karate.正拳
import shintaido.martialArt.種目別の技.武器の種類
import shintaido.movePart.移動行為.前進
import shintaido.movePart.立ち方.不動立ち

// 前進はインターフェイスなの？　前進にも色々あるからなぁ　リーフノードのせっていじょうほうじゃないやろ
class 不動立ち前進による下段払い受け(
    override val 武器の種類: 武器の種類 = 正拳()) : 下段払い受け, 不動立ち, 前進 {
}