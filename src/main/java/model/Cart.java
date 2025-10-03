/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Ihsaanalf
 */
import java.util.ArrayList;
import java.util.List;
import service.MarketplaceService;

public class Cart {
    private List<Product> keranjang;

    public Cart() {
        keranjang = new ArrayList<>();
    }

    public void tambahProduk(Product p) {
        keranjang.add(p);
    }

    public void lihatKeranjang() {
        System.out.println("\n=== KERANJANG BELANJA ===");
        if (keranjang.isEmpty()) {
            System.out.println("Keranjang masih kosong.");
        } else {
            for (Product p : keranjang) {
                System.out.println(p);
            }
        }
    }

    public void hapusProduk(int id) {
        Product hapus = null;
        for (Product p : keranjang) {
            if (p.getId() == id) {
                hapus = p;
                break;
            }
        }
        if (hapus != null) {
            keranjang.remove(hapus);
            System.out.println(hapus.getNama() + " berhasil dihapus dari keranjang.");
        } else {
            System.out.println("Produk dengan ID " + id + " tidak ada di keranjang.");
        }
    }

    public void checkout() {
        if (keranjang.isEmpty()) {
            System.out.println("Keranjang kosong, tidak bisa checkout.");
            return;
        }

        double total = 0;
        for (Product p : keranjang) {
            total += p.getHarga();
        }

        Transaction transaksi = new Transaction(keranjang, total);
        MarketplaceService service = new MarketplaceService();
        service.tambahTransaksi(transaksi);

        System.out.println("Checkout berhasil. Total pembayaran: Rp " + total);
        keranjang.clear();
    }
}
