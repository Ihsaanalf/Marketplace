<h1>Marketplace</h1>
<div align="Justify">
Aplikasi marketplace sederhana berbasis konsol yang memungkinkan pengguna untuk melihat daftar produk, mencari barang, memasukkan ke keranjang, melakukan checkout, serta melihat laporan transaksi.
</div>

<h3>Penjelasan Marketplace</h3>
<div align="Justify">
Marketplace adalah sistem kasir sederhana yang dirancang untuk mensimulasikan proses pembelian produk. Pengguna dapat melihat katalog produk, menambahkan barang ke keranjang berdasarkan ID, menghapus barang dari keranjang, hingga melakukan checkout untuk menyelesaikan transaksi. Sistem juga mencatat riwayat transaksi yang telah dilakukan.
</div>

Fitur utama meliputi:
1. Menampilkan daftar produk
2. Pencarian produk berdasarkan keyword
3. Pembelian produk (menambah ke keranjang)
4. Melihat isi keranjang
5. Menghapus produk dari keranjang
6. Checkout dan perhitungan total belanja
7. Melihat laporan transaksi

<h3>Diagram Class</h3>
Struktur package dan class:
<pre>MarketplaceApp
├── app
│   └── Main.java              
├── exception
│   ├── ProductNotFoundException.java
│   └── OutOfStockException.java
├── model
│   ├── Product.java 
│   ├── Cart.java 
│   └── Transaction.java 
└── service
    └── MarketplaceService.java 
</pre>
<h3>Contoh Penggunaan Fitur Utama</h3>
<h4>1. Melihat Daftar Produk</h4>
<img width="426" height="337" alt="image" src="https://github.com/user-attachments/assets/bac97343-441d-49c0-8d23-85620080e862" />

<h4>2. Melihat Daftar Menu per Kategori</h4>
<img width="300" height="400" alt="image" src="https://github.com/user-attachments/assets/2ca09e64-de8e-4c16-bb9d-567d7c4352f6" />
<h4>3. Pencarian Menu</h4>
<img width="300" height="400" alt="image" src="https://github.com/user-attachments/assets/b2a5a21a-a583-44e6-9acc-901a9fe3d003" />
<h4>4. Menambah ke Keranjang</h4>
<img width="180" height="280" alt="image" src="https://github.com/user-attachments/assets/f355ecd7-070d-42b3-8956-0712a7cd5da5" />
<h4>5. Menghapus dari Keranjang</h4>
<img width="180" height="280" alt="image" src="https://github.com/user-attachments/assets/ade3552d-f2d7-4bdf-8d5d-8586a91cef93" />
<h4>6. Melihat Keranjang</h4>
<img width="300" height="400" alt="image" src="https://github.com/user-attachments/assets/7da752fb-4384-4b07-a597-783195537fbc" />
<h4>7. Checkout</h4>
<img width="300" height="400" alt="image" src="https://github.com/user-attachments/assets/f2d21752-4525-4767-8e2e-435fa9720b2f" />
<h4>0. Keluar</h4>
<img width="175" height="275" alt="image" src="https://github.com/user-attachments/assets/567a85aa-a22b-41b6-a065-d3b1e3fbfa97" />
<h3>Link video Youtube</h3>
Link:
