public class Transaksi {
    private Pelanggan pelanggan;
    private Barang barang;
    private int jumlah;

    public Transaksi(Pelanggan pelanggan, Barang barang, int jumlah) {
        this.pelanggan = pelanggan;
        this.barang = barang;
        this.jumlah = jumlah;
    }

    public int hitungTotalBayar() {
        return barang.getHarga() * jumlah;
    }

    public String toString() {
        return "\n" + "=========== SELAMAT BERBELANJA ==========\n" +
                "ID PELANGGAN: " + pelanggan.getIdPelanggan() + "\n" +
                "============= Detail Barang =============\n" +
                "Nama Barang: " + barang.getNama() + "\n" +
                "Jumlah Barang: " + jumlah + "\n" +
                "Total Bayar = " + hitungTotalBayar() + "\n" +
                "====== TERIMA KASIH, DATANG KEMBALI ======";
    }
}
