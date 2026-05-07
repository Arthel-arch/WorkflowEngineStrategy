public class DiskonRamadhan implements StrategiDiskon {
    @Override
    public double hitungDiskon(double harga) {
        return harga * 0.30;
    }

    @Override
    public String getNamaDiskon() {
        return "Ramadhan (30%)";
    }
}