import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("===== nomor, nama, dan harga barang =====");
        System.out.println("111 Baju = 50000");
        System.out.println("112 Celana = 30000");
        System.out.println("113 Dress = 80000");
        System.out.println("114 Aksesoris = 15000");
        System.out.println("=========================================");
        System.out.println(" ");
        System.out.println("SILAHKAN MASUKKAN DETAIL BELANJA");

        Scanner scanner = new Scanner(System.in);

        try {

            System.out.println("Masukkan ID Pelanggan:");
            String idPelanggan = scanner.nextLine();
            Pelanggan pelanggan = new Pelanggan(idPelanggan);

            System.out.println("Masukkan Nama Barang (Baju, Celana, Dress, Aksesoris):");
            String namaBarang = scanner.nextLine();
            int hargaBarang;

            switch (namaBarang.toLowerCase()) {
                case "baju":
                    hargaBarang = 50000;
                    break;
                case "celana":
                    hargaBarang = 30000;
                    break;
                case "dress":
                    hargaBarang = 80000;
                    break;
                case "aksesoris":
                    hargaBarang = 15000;
                    break;
                default:
                    // Exception Handling: Melempar IllegalArgumentException jika input tidak sesuai
                    throw new IllegalArgumentException("Kesalahan input, silahkan masukkan ulang");
            }

            Barang barang = new Barang(namaBarang, hargaBarang);

            System.out.println("Masukkan Jumlah Barang:");
            int jumlahBarang = scanner.nextInt();

            Transaksi transaksi = new Transaksi(pelanggan, barang, jumlahBarang);
            System.out.println(transaksi.toString());

        } catch (Exception e) {
            // Exception Handling: Menangkap dan menampilkan pesan kesalahan
            System.out.println(e.getMessage());
        }
        scanner.close();
        
       
    }
    
     
}
