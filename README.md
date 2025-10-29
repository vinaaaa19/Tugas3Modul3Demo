# Praktikum
# PL_AVINAPINKY_141: Program Manajemen Stok Brang

# 📖 Deskripsi Proyek

Program ini merupakan aplikasi berbasis **Java** yang digunakan untuk mengelola data stok barang di gudang atau toko.  
Aplikasi ini menerapkan konsep **Pemrograman Berorientasi Objek (OOP)** seperti:

- **Encapsulation** → Melindungi data dalam class `Product` melalui penggunaan `private` field dan `getter/setter`.
- **Interface Extraction** → Menggunakan interface `Manageable` agar class `StockManagement` memiliki kontrak metode yang jelas.
- **Refactoring / Rename Method** → Menyusun ulang nama metode agar lebih deskriptif dan mudah dibaca.
- **Superclass & Interface Implementation** → Class `StockManagement` mengimplementasikan interface `Manageable` sebagai pengelola stok produk.

---
## ⚙️ **Fitur Program**
1. **Menambahkan produk baru** (nama, jumlah, harga).
2. **Menampilkan semua produk** yang tersimpan di stok.
3. **Menghitung total nilai stok** berdasarkan harga × jumlah.
4. **Menghapus produk** berdasarkan nama.
5. **Validasi input** agar jumlah dan harga tidak boleh negatif.

---
## 🚀 **Cara Menjalankan Program**
1. Pastikan kamu sudah menginstal:
    - **Java Development Kit (JDK)** versi 8 atau lebih baru.
    - **IntelliJ IDEA / VS Code / NetBeans**.
2. Buka proyek ini di IntelliJ IDEA.
3. Jalankan file `Main.java` dengan klik kanan → **Run 'Main.main()'**.
4. Masukkan jumlah produk, nama, jumlah stok, dan harga sesuai petunjuk.
5. Program akan menampilkan daftar produk dan total nilai stok.

---
### Menjalankan Kode

Anda dapat menjalankan program melalui terminal dengan langkah-langkah berikut (asumsikan Anda berada di direktori akar proyek):

1. **Clone repository dari GitHub:**
   ```bash
   (ganti) git clone https://github.com/vinaaaa19/Praktikumm.git

### 🧠 Interaksi

Program akan meminta pengguna untuk **memasukkan data produk**, lalu menampilkan **daftar stok dan total nilainya**, serta memberi kesempatan untuk **menghapus produk** dari daftar.

| Langkah | Input | Contoh   |
|:---|:---|:---------|
| 1 | Jumlah produk yang ingin ditambahkan | `2`      |
| 2 | Nama produk pertama | `Pen`    |
| 3 | Jumlah stok produk pertama | `3`      |
| 4 | Harga produk pertama | `70000`  |
| 5 | Nama produk kedua | `Mouse`  |
| 6 | Jumlah stok produk kedua | `5`      |
| 7 | Harga produk kedua | `100000` |
| 8 | Nama produk yang ingin dihapus (opsional) | `Mouse`  |

💻 **Output Program**

| Tahap | Output |
|:------|:--------|
| **Input Awal** | `=== PROGRAM MANAJEMEN STOK BARANG ===`<br>`Masukkan jumlah produk yang ingin ditambahkan: 2` |
| **Input Produk ke-1** | `Nama produk  : Pen`<br>`Jumlah stok  : 3`<br>`Harga produk : 70000` |
| **Input Produk ke-2** | `Nama produk  : Mouse`<br>`Jumlah stok  : 5`<br>`Harga produk : 100000` |
| **Daftar Stok Awal** | `=== DATA STOK BARANG ===`<br>`Product: Pen, Jumlah: 3, Price: 70000.0`<br>`Product: Mouse, Jumlah: 5, Price: 100000.0`<br>`Total nilai stok = Rp 650,000.00` |
| **Hapus Produk** | `Masukkan nama produk yang ingin dihapus: Mouse`<br>`Produk 'Mouse' berhasil dihapus.` |
| **Daftar Stok Akhir** | `=== DATA STOK SETELAH DIHAPUS ===`<br>`Product: Pen, Jumlah: 3, Price: 70000.0`<br>`Total nilai stok = Rp 210,000.00` |

