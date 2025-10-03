/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

/**
 *
 * @author Ihsaanalf
 */
import java.util.ArrayList;
import java.util.List;
import model.Product;
import model.Transaction;

public class MarketplaceService {
    private List<Product> daftarProduk;
    private List<Transaction> daftarTransaksi;

    public MarketplaceService() {
        daftarProduk = new ArrayList<>();
        daftarTransaksi = new ArrayList<>();

        // contoh data produk
        daftarProduk.add(new Product(1, "Laptop", 5, 7500000));
        daftarProduk.add(new Product(2, "Smartphone", 10, 3500000));
        daftarProduk.add(new Product(3, "Headset", 15, 250000));
        daftarProduk.add(new Product(4, "Keyboard", 8, 400000));
    }

    public void tampilkanProduk() {
        System.out.println("\n=== DAFTAR PRODUK ===");
        for (Product p : daftarProduk) {
            System.out.println(p);
        }
    }

    public void cariProduk(String keyword) {
        System.out.println("\n=== HASIL PENCARIAN ===");
        boolean ditemukan = false;
        for (Product p : daftarProduk) {
            if (p.getNama().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(p);
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Produk dengan kata kunci \"" + keyword + "\" tidak ditemukan.");
        }
    }

    public Product getProdukById(int id) {
        for (Product p : daftarProduk) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    public void tambahTransaksi(Transaction t) {
        daftarTransaksi.add(t);
    }

    public void tampilkanLaporanTransaksi() {
        System.out.println("\n=== LAPORAN TRANSAKSI ===");
        if (daftarTransaksi.isEmpty()) {
            System.out.println("Belum ada transaksi.");
        } else {
            for (Transaction t : daftarTransaksi) {
                System.out.println(t);
            }
        }
    }
}




