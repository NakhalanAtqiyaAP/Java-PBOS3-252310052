class Driver {
    private String idDriver;
    private String namaDriver;
    private String nomorPlat;

    public Driver(String idDriver, String namaDriver, String nomorPlat) {
        this.idDriver = idDriver;
        this.namaDriver = namaDriver;
        this.nomorPlat = nomorPlat;
    }

    public void terimaPesanan() {
        System.out.println("Driver " + namaDriver + " menerima pesanan.");
    }

    public void antarPesanan() {
        System.out.println("Driver " + namaDriver + " sedang mengantar pesanan.");
    }

    public String getNamaDriver() {
        return namaDriver;
    }
}

class PesananFood {
    private String idPesanan;
    private String namaMakanan;
    private double hargaTotal;

    public PesananFood(String idPesanan, String namaMakanan) {
        this.idPesanan = idPesanan;
        this.namaMakanan = namaMakanan;
        this.hargaTotal = 0.0;
    }

    public void hitungTotal(double hargaSatuan, int jumlah) {
        if (hargaSatuan > 0 && jumlah > 0) {
            this.hargaTotal = hargaSatuan * jumlah;
        }
    }

    public void tampilkanDetailPesanan() {
        System.out.println("ID Pesanan: " + idPesanan);
        System.out.println("Nama Makanan: " + namaMakanan);
        System.out.println("Harga Total: Rp" + hargaTotal);
    }

    public void prosesDenganDriver(Driver driver) {
        System.out.println("Memproses pesanan " + idPesanan + " dengan driver " + driver.getNamaDriver());
        driver.terimaPesanan();
        driver.antarPesanan();
    }
}


public class Pesanan {
    public static void main(String[] args) {
        PesananFood pesanan = new PesananFood("ORD-001", "Ayam Goreng");
        Driver driver = new Driver("DRV-01", "Budi", "B 1234 CD");

        pesanan.hitungTotal(25000, 2);
        pesanan.tampilkanDetailPesanan();
        pesanan.prosesDenganDriver(driver);

    }
}