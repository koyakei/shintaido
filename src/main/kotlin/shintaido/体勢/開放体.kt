package shintaido.体勢

import bodyAnalysis.HumanBody
import shintaido.系.subPosture.自護系
import shintaido.系.subPosture.開放系

// 四体勢理論では、それぞれの体勢の融合が必要　その融合を書く
interface 開放体: 開放系, HumanBody {

}
interface 正立体: 開放系, 自護系, HumanBody { // 体を注入しないで系を注入する
}

interface 自護体: 自護系, HumanBody {
}