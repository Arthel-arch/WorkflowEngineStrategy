public class Main {
    public static void main(String[] args) {
        Kasir kasir = new Kasir();

        // 1. Pelanggan Member Biasa beli Laptop
        kasir.setStrategi(new DiskonMember());
        kasir.prosesPembayaran("Laptop Gaming", 15000000);

        // 2. Pelanggan Gold beli Smartphone
        kasir.setStrategi(new DiskonGold());
        kasir.prosesPembayaran("Smartphone Flagship", 10000000);

        // 3. Saat Ramadhan, semua diskon jadi 30%
        kasir.setStrategi(new DiskonRamadhan());
        kasir.prosesPembayaran("Keyboard Mechanical", 1500000);
    }
}