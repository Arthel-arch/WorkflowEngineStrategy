public class Kasir {
    private StrategiDiskon strategi;

    // Method untuk mengganti strategi secara dinamis saat runtime
    public void setStrategi(StrategiDiskon strategi) {
        this.strategi = strategi;
    }

    public void prosesPembayaran(String item, double harga) {
        if (strategi == null) {
            System.out.println("Pilih strategi diskon terlebih dahulu!");
            return;
        }

        double diskon = strategi.hitungDiskon(harga);
        double total = harga - diskon;

        System.out.println("Item     : " + item);
        System.out.println("Harga    : Rp " + String.format("%,.0f", harga));
        System.out.println("Diskon   : " + strategi.getNamaDiskon());
        System.out.println("Potongan : Rp " + String.format("%,.0f", diskon));
        System.out.println("Total    : Rp " + String.format("%,.0f", total));
        System.out.println("------------------------------------");
    }
}
