package ridingSports

import library.DistanceVector
import library.Vector
import library.点

interface ForwardAfterwardBalance {
    val 体の動きDistanceVector: DistanceVector
    val skiの動きDistanceVector: DistanceVector
    // 重力方向と慣性の合力ベクトル
    fun verticalVector(): DistanceVector
    // 0 だと仮定して考える
    // 能力次第で0 にすることは可能
    fun 慣性() : Vector {
        return 体の動きDistanceVector - skiの動きDistanceVector
    }

    // verticalVector 上に板の中有信を置く
    val centerLateralResistance:点
    // 現時点の抵抗の中心なのか？それとも

    val 抵抗面: DistanceVector
    fun 抵抗面の垂直方向 (): DistanceVector

    // パウダーに突っ込んで前のめりになるときに問題なく機能する数式なのかをテストする。
    // 上り坂になると、抵抗の中心って後ろに来ると思うが、それを数式で表現するのはどうやってやればいいのか？
    // ただの抵抗の中心ではだめ　抵抗面の垂直方向が
    fun handle():DistanceVector
    //　centerLateralResistance + 抵抗面の垂直方向 = 重心の存在可能位置
}