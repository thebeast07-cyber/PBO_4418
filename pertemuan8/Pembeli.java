import java.util.ArrayList;

public abstract class Pembeli {
    // property
    private String nama;
    private int umur;
    private String alamat;

    public ArrayList<Mobil> listMobil = new ArrayList<Mobil>();

    // method konstruktor
    public Pembeli() {
        nama = "NA";
        umur = 0;
        alamat = "NA";
    }

    public Pembeli(String nama, int umur, String alamat) {
        this.nama = nama;
        this.umur = umur;
        this.alamat = alamat;
    }

    // method setter & getter
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public int getUmur() {
        return umur;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getAlamat() {
        return alamat;
    }

    // abstract method
    public abstract void beliMobil(Mobil mbl);

    public abstract void dapatMobil();

    public void beliMobil(Mobil mbl, int jumlah) {

    }

    public abstract int cetak();
}
