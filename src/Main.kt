fun main(){
    val bakso = Makanan("Bakso Urat",15000.0)
    val bakso1 = Makanan("Bakso Beranak",25000.0)
    val bakso2 = Makanan("Bakso Telor",18000.0)

    val esTeh = Minuman("Es Teh",3000.0)
    val esJeruk = Minuman("Es Jeruk",4000.0)
    val esNutrisari = Minuman("Es Nutrisari",3000.0)

    var makanans = mutableListOf(bakso,bakso1,bakso2)
    var minumans = mutableListOf(esTeh,esJeruk,esNutrisari)

    val menu = Menu(makanans,minumans)
    var input = 0
    var pilihanMakanan = mutableListOf<Makanan>()
    var pilihanMinuman = mutableListOf<Minuman>()
//    var pesananPelanggan = mutableListOf<Pesanan>()
    var pesanan = Pesanan(pilihanMakanan,pilihanMinuman)
    do {
        println("=================== Bakso Maman ===================")
        if(!pesanan.makanan.isEmpty()){
            println("Terdapat 1 Pesanan")
        }
        println("1. Pilih Makanan")
        println("2. Pilih Minuman")
        println("3. Bayar")
        println("4. Lihat Pesanan")
        println("5. Keluar")
        print("Masukan Pilihan : ")
        input= readLine()!!.toInt()
        when(input){
            1 -> {
                menu.cetakMenuMakanan()
                print("Masukan Pilihan Makanan : ")
                val pilihMakanan = readLine()!!.toInt()
                print("Masukan Jumlah : ")
                 val jumlahMakanan = readLine()!!.toInt()
                pesanan.addMakanan(menu.makanan[pilihMakanan-1],jumlahMakanan)
            }
            2 ->{
                menu.cetakMenuMinuman()
                print("Masukan Pilihan Minuman : ")
                val pilihMinuman = readLine()!!.toInt()
                print("Masukan Jumlah : ")
                val jumlahMinuman = readLine()!!.toInt()
                pesanan.addMinuman(menu.minuman[pilihMinuman-1],jumlahMinuman)
            }
            3->{
                var kasir = Kasir(pesanan)
                kasir.bayar()
                pesanan.resetPesanan()
            }
            4->{
                pesanan.cetakPesanan()
            }
            5->{
                println("----- Shut Down -----")
            }
        }
    }while (input!=5)
}