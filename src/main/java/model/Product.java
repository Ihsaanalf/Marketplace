/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Ihsaanalf
 */
public class Product {
    private int id;
    private String nama;
    private int stok;
    private double harga;

    public Product(int id, String nama, int stok, double harga) {
        this.id = id;
        this.nama = nama;
        this.stok = stok;
        this.harga = harga;
    }

    public int getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public int getStok() {
        return stok;
    }

    public double getHarga() {
        return harga;
    }

    public void kurangiStok(int jumlah) {
        if (stok >= jumlah) {
            stok -= jumlah;
        } else {
            System.out.println("Stok tidak mencukupi untuk produk: " + nama);
        }
    }

    @Override
    public String toString() {
        return "[" + id + "] " + nama + " | Stok: " + stok + " | Harga: Rp " + harga;
    }
}
