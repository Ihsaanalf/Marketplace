/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Ihsaanalf
 */
import java.util.List;

public class Transaction {
    private List<Product> produkDibeli;
    private double totalHarga;

    public Transaction(List<Product> produkDibeli, double totalHarga) {
        this.produkDibeli = produkDibeli;
        this.totalHarga = totalHarga;
    }

    @Override
    public String toString() {
        return "Transaksi: " + produkDibeli.size() + " produk, Total = Rp " + totalHarga;
    }
}


