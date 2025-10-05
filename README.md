<h1>Marketplace</h1>
<div align="Justify">
Aplikasi marketplace sederhana berbasis konsol yang memungkinkan pengguna untuk melihat daftar produk, mencari barang, memasukkan ke keranjang, melakukan checkout, serta melihat laporan transaksi.
</div>

<h3>Penjelasan Marketplace</h3>
<div align="Justify">
Marketplace adalah sistem kasir toko sederhana yang dirancang untuk mensimulasikan proses pembelian produk. Pengguna dapat melihat katalog produk, menambahkan barang ke keranjang berdasarkan ID, menghapus barang dari keranjang, hingga melakukan checkout untuk menyelesaikan transaksi. Sistem juga mencatat riwayat transaksi yang telah dilakukan.
</div>

Fitur utama meliputi:
1. Menampilkan daftar produk
2. Pencarian produk
3. Pembelian produk (menambah ke keranjang)
4. Melihat isi keranjang
5. Menghapus produk dari keranjang
6. Checkout dan perhitungan total belanja
7. Melihat laporan transaksi
8. Keluar

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
<h3>Contoh Penggunaan Fitur Utama & Cara Menjalankan Progam</h3>
<h4>1. Melihat Daftar Produk</h4>
<img width="426" height="337" alt="image" src="https://github.com/user-attachments/assets/bac97343-441d-49c0-8d23-85620080e862" />
<p>Pada menu ini, sistem akan menampilkan seluruh daftar produk yang tersedia beserta ID, nama, harga, dan stok. Fitur ini memudahkan pengguna sebelum memilih produk yang ingin dibeli.</p>
<h4>2. Pencarian produk</h4>
<img width="415" height="303" alt="image" src="https://github.com/user-attachments/assets/88a39ab2-040c-4730-ad91-cb1e956b9e9a" />
<p>Pengguna dapat mencari produk berdasarkan nama/keyword. Hasil pencarian akan menampilkan produk yang sesuai dengan kata kunci.</p>
<h4>3. Pembelian produk (menambah ke keranjang)</h4>
<img width="378" height="268" alt="image" src="https://github.com/user-attachments/assets/c464a284-4960-4176-bb27-d06f27c63bc5" />
<p>Produk dapat ditambahkan ke keranjang dengan memasukkan ID produk. Jika produk tersedia, maka akan muncul notifikasi bahwa produk berhasil dimasukkan ke keranjang.</p>
<h4>4. Melihat isi keranjang</h4>
<img width="400" height="279" alt="image" src="https://github.com/user-attachments/assets/af32e775-c322-472a-88c6-e4dfec08471a" />
<p>Menampilkan daftar produk yang sudah dimasukkan ke keranjang, lengkap dengan jumlah dan harga total per produk.</p>
<h4>5. Menghapus produk dari keranjang</h4>
<img width="466" height="334" alt="image" src="https://github.com/user-attachments/assets/25c50d45-82fe-4260-83a6-0835a07c0eff" />
<p>Pengguna dapat menghapus produk dari keranjang dengan memasukkan ID produk. Sistem akan memperbarui isi keranjang setelah produk dihapus.</p>
<h4>6. Checkout dan perhitungan total belanja</h4>
<img width="418" height="242" alt="image" src="https://github.com/user-attachments/assets/57513d5a-8e62-4631-aa3b-055320b54331" />
<p>Fitur checkout akan menghitung total belanjaan dan menyelesaikan transaksi. Setelah checkout, keranjang akan dikosongkan dan transaksi dicatat.</p>
<h4>7. Melihat laporan transaksi</h4>
<img width="280" height="282" alt="image" src="https://github.com/user-attachments/assets/f688695a-2260-4339-91a5-c880960c5405" />
<p>Menampilkan riwayat transaksi yang sudah dilakukan, sehingga pengguna bisa melihat detail belanja sebelumnya.</p>
<h4>8. Keluar</h4>
<img width="426" height="232" alt="image" src="https://github.com/user-attachments/assets/778ad2bf-e9a9-4a6f-ad3d-fa776098a746" />
<p>Fitur untuk keluar dari aplikasi. Sistem akan menampilkan pesan terima kasih dan program berhenti berjalan.</p>

<h3>Link video Youtube</h3>
Link: https://youtu.be/xvS2waDg43Q
