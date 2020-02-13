class Kasir(var pesanan: Pesanan) {
    fun bayar() {

        println("------------------ Struk Pembayaran ------------------")
        pesanan.cetakPesanan()
        println("-------------------- Terima Kasih --------------------")

    }
}