/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

/**
 *
 * @author Ihsaanalf
 */
import java.util.Scanner;
import model.Cart;
import model.Product;
import service.MarketplaceService;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MarketplaceService service = new MarketplaceService();
        Cart cart = new Cart();

        int pilihan;
        do {
            System.out.println("\n=== MENU MARKETPLACE ===");
            System.out.println("1. Lihat Produk");
            System.out.println("2. Cari Produk");
            System.out.println("3. Beli Produk");
            System.out.println("4. Lihat Keranjang");
            System.out.println("5. Hapus Produk dari Keranjang");
            System.out.println("6. Checkout");
            System.out.println("7. Laporan Transaksi");
            System.out.println("8. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // buang newline

            switch (pilihan) {
                case 1:
                    service.tampilkanProduk();
                    break;
                case 2:
                    System.out.print("Masukkan nama produk yang dicari: ");
                    String keyword = scanner.nextLine();
                    service.cariProduk(keyword);
                    break;
                case 3:
                    System.out.print("Masukkan ID produk yang ingin dibeli: ");
                    int idBeli = scanner.nextInt();
                    Product p = service.getProdukById(idBeli);
                    if (p != null) {
                        cart.tambahProduk(p);
                        System.out.println(p.getNama() + " berhasil ditambahkan ke keranjang.");
                    } else {
                        System.out.println("Produk tidak ditemukan.");
                    }
                    break;
                case 4:
                    cart.lihatKeranjang();
                    break;
                case 5:
                    cart.lihatKeranjang();
                    System.out.print("Masukkan ID produk yang ingin dihapus dari keranjang: ");
                    int idHapus = scanner.nextInt();
                    cart.hapusProduk(idHapus);
                    break;
                case 6:
                    cart.checkout();
                    break;
                case 7:
                    service.tampilkanLaporanTransaksi();
                    break;
                case 8:
                    System.out.println("Terima kasih sudah menggunakan Marketplace!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 8);

        scanner.close();
    }
}

