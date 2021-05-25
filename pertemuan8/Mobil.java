public class Mobil {
    // property
    private String merek;
    private int cc;
    private String type;
    private int harga;

    // method konstruktor
    public Mobil() {
        merek = "NA";
        cc = 0;
        type = "NA";
        harga = 0;
    }

    public Mobil(String merek, int cc, String type, int harga) {
        this.merek = merek;
        this.cc = cc;
        this.type = type;
        this.harga = harga;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public String getMerek() {
        return merek;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public int getCc() {
        return cc;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getHarga() {
        return harga;
    }
}
