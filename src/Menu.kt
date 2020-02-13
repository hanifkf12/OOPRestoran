class Menu(var makanan: MutableList<Makanan>, var minuman: MutableList<Minuman>){
    fun cetakMenuMakanan(){
        println("+++++++++++++ Menu Makanan +++++++++++++")
        makanan.forEachIndexed { index, makanan ->
            println("${index+1}. ${makanan.cetakMakanan()}")
        }
    }

    fun cetakMenuMinuman(){
        println("+++++++++++++ Menu Minuman +++++++++++++")
        minuman.forEachIndexed { index, minuman ->
            println("${index+1}. ${minuman.cetakMinuman()}")

        }
    }
}