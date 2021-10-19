package shintaido.movePart.稽古.stretch

import bodyAnalysis.HumanBody

/**
 *  * 自分の場合、可動域を広げる場合、こちらを静的ストレッチより優先させるが、体質によっては、静的ストレッチのほうがいいひちもいる。
 * 優先条件を書いてみるか
 * 関節がルーズになればなるほど、筋力が必要な自重トレーニング要素の強いダイナミックストレッチを行う
 * 筋肉で関節を正しく収めながら
 * 柔らかくしても正しく収めておける
 * 固くなるのは今の可動域で正確に動けるようにしてから、徐々に緩めていく。

 *
 */
interface StretchChoice {
    val humanBody:HumanBody
    val dynamicStretch:DynamicStretch
    val staticStretch:StaticStretch
    fun handle():Stretch{
        return if (humanBody.ルーズジョイントの度合い.handle() > humanBody.ルーズジョイントの許容量v.int){
            dynamicStretch
        } else{
            staticStretch
        }
    }
}