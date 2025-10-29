/**
 * Interface {@code Manageable} mendefinisikan perilaku dasar yang harus dimiliki
 * oleh kelas pengelola stok produk.
 * Menerapkan konsep Extract Interface
 */
public interface Manageable {

    /**
     * Menambahkan produk ke daftar
     * @param name nama produk
     * @param quantity jumlah stok produk
     * @param price harga produk
     */
    void addProduct(String name, int quantity, double price);

    /**
     * Menghapus produk dari daftar
     * @param name nama produk
     */
    void removeProduct(String name);

    /**
     * Menampilkan keseluruhan data produk
     */
    void printAll();

    /**
     * Menghitung total nilai stok
     */
    void totalValue();
}
