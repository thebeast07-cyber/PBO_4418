public class Karyawan {
    // property
    private String nama;
    private String posisi;
    private int laba;

    // method konstruktor
    public Karyawan() {
        nama = "NA";
        posisi = "NA";
    }

    public Karyawan(String nama, String posisi) {
        this.nama = nama;
        this.posisi = posisi;
    }

    // method setter & getter
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setPosisi(String posisi) {
        this.posisi = posisi;
    }

    public String getPosisi() {
        return posisi;
    }

    public void setLaba(int laba) {
        this.laba = laba;
    }

    public int getLaba(int harga) {
        return harga - (1 / 100);
    }

    public void setHargaMobil(Mobil mbl, int harga) {
        mbl.setHarga(harga);
    }

    public void cetak() {
        System.out.println("======== Data Karyawan ========");
        System.out.println("Nama Karyawan = " + nama);
        System.out.println("Posisi Karyawan = " + posisi);
        System.out.println("Laba Karyawan = " + laba);
    }
}