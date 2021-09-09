package shintaido.fundamentalBasic.mudrah

interface MudrahSize {
    val size: Int
    fun unaryPlus(size: Int){
//        size + this.size
    }

    fun unaryMinus(size: Int){
//        this.size - size
    }
}