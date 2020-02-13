class Pesanan(var makanan: MutableList<Makanan>, var minuman: MutableList<Minuman>){
    var totalHarga = 0.0
    fun cetakPesanan(){
        totalHarga = 0.0
        println("++++++++++++ Pesanan Anda ++++++++++++")
        makanan.forEachIndexed { index, makanan ->
            println("${index+1}. ${makanan.cetakMakanan()}")
            totalHarga += makanan.harga
        }
        println("--------------------------------------")
        minuman.forEachIndexed { index, minuman ->
            println("${index+1}. ${minuman.cetakMinuman()}")
            totalHarga += minuman.harga
        }
        println("--------------------------------------")
        println("Total Harga : Rp $totalHarga")
    }
    fun addMakanan(makanan: Makanan, jumlah:Int){
        for(i in 0 until jumlah){
            this.makanan.add(makanan)
        }
    }
    fun addMinuman(minuman: Minuman, jumlah:Int){
        for(i in 0 until jumlah){
            this.minuman.add(minuman)
        }
    }
    fun resetPesanan(){
        this.minuman.clear()
        this.makanan.clear()
    }
}