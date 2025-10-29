import java.util.ArrayList;
import java.util.Scanner;

/**
 * kelas {@code product} mempresentasikan sebuah produk dalam program
 * Menerapkan konsep encapsulation dengan menggunakan modfier private
 * untuk atribut dan menyediakan getter dan setter
 */
class Product {
    private String name;
    private int quantity;
    private double price;

    /**
     * konstruktor yang digunakan untuk membuat objek produk baru.
     * @param n digunakan untuk nama produk
     * @param q digunakan untuk jumlah stok produk
     * @param p digunakan untuk harga produk
     */
    public Product(String n, int q, double p) {
        setName(n);
        setQuantity(q);
        setPrice(p);
    }

    /**
     * Menampilkan informasi produk
     */
    public void showInfo() {
        System.out.println("Product: " + getName() + ", Jumlah: " + getQuantity() + ", Price: " + getPrice());
    }

    /**
     * @return nama produk
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return jumlah stok produk
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Mengatur jumlah produk
     * @param quantity jumlah stok baru
     * @throws IllegalArgumentException jika jumlah bersifat negatif
     */
    public void setQuantity(int quantity) {
        if (quantity < 0) {
            throw new IllegalArgumentException("Jumlah stok tidak boleh negatif.");
        }
        this.quantity = quantity;
    }


    /**
     * @return harga produk
     */
    public double getPrice() {
        return price;
    }

    /**
     * Mengatur harga produk
     * @param price harga produk baru
     * @throws IllegalArgumentException jika harga negatif
     */
    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Harga produk tidak boleh negatif.");
        }
        this.price = price;
    }
}

/**
 * kelas {@code StockManagement} digunakan untuk mengelola daftar produk
 * Menerapkan konsep Extract Interface dengan melalui implementasi interface {@link Manageable}
 */
class StockManagement implements Manageable {
    /** Daftar produk yang dikelola */
    public ArrayList<Product> list = new ArrayList<>();

    /**
     * Menambahkan produk baru ke daftar stok
     * @param name nama produk
     * @param quantity jumlah produk
     * @param price harga produk
     * Menerapkan konsep Rename method
     */
    @Override
    public void addProduct(String name, int quantity, double price) {
        Product p = new Product(name, quantity, price);
        list.add(p);
    }

    /**
     * Menghapus produk dari daftar berdasarkan nama
     * @param name nama produk yang akan di hapus
     * Menerapkan konsep Rename Method
     */
    @Override
    public void removeProduct(String name) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().equalsIgnoreCase(name)) {
                list.remove(i);
                System.out.println("Produk '" + name + "' berhasil dihapus.");
                return;
            }
        }
        System.out.println("Produk '" + name + "' tidak ditemukan.");
    }

    public void searchProduct(String name) {
        for (Product p : list) {
            if (p.getName().equalsIgnoreCase(name)) {
                System.out.println("Produk ditemukan:");
                p.showInfo();
                return;
            }
        }
        System.out.println("Produk '" + name + "' tidak ditemukan.");
    }

        /**
         * Menampilkan seluruh data produk yang tersimpan
         */
    @Override
    public void printAll() {
        for (Product p : list) {
            p.showInfo();
        }
    }

    /**
     * Menghitung total nilai semua stok barang dalam daftar
     */
    @Override
    public void totalValue() {
        double total = 0;
        for (Product p : list) {
            total += p.getPrice() * p.getQuantity();
        }
        System.out.println("Total nilai stok = Rp " + total);
    }
}

/**
 * Kelas utama {@code Main} menjalankan program manajemen stok barang
 * Mengimplementasikan interaksi pengguna dengan melalui terminal
 * untuk menambahkan, menampilkan, dan menghapus produk
 * Menerapkan konsep Extract Superclass
 */
public class Main {
    /**
     * Metode utama yang digunakan untuk menjalankan program
     * @param args argumen dari baris perintah
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StockManagement sm = new StockManagement();

        System.out.println("=== PROGRAM MANAJEMEN STOK BARANG ===");

        System.out.print("Masukkan jumlah produk yang ingin ditambahkan: ");
        int jumlah = input.nextInt();
        input.nextLine(); // membersihkan buffer

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nInput data produk ke-" + (i + 1));
            System.out.print("Nama produk  : ");
            String name = input.nextLine();
            System.out.print("Jumlah stok  : ");
            int quantity = input.nextInt();
            System.out.print("Harga produk : ");
            double price = input.nextDouble();
            input.nextLine(); // bersihkan enter

            sm.addProduct(name, quantity, price);
        }

        System.out.println("\n=== DATA STOK BARANG ===");
        sm.printAll();
        sm.totalValue();

        System.out.print("\nMasukkan nama produk yang ingin dihapus: ");
        String hapus = input.nextLine();
        sm.removeProduct(hapus);

        System.out.println("\n=== DATA STOK SETELAH DIHAPUS ===");
        sm.printAll();
        sm.totalValue();

        input.close();
    }
}
