package shintaido.stickFight.insertingContact

/**
 * 入身の方向を定義に入れると二重定義になるので、
 * 差し込む場所だけで区別する　先と後ろどちらを差し込むかでは区別しない　順手逆手での区別をしない
 * 前腕の体から遠い側が外として、
 * 外か内か
 * 体のお腹側に差し込むのか背中側に差し込むかで決まる
 * 外　前
 */
interface 差し込み二: 差し込み {

}