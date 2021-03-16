public class mobilDemo {
    public static void main(String args[]) {
        mobil mobilku = new mobil();
        mobilku.warna = "Hitam";
	mobilku.thProduksi = 2006;
	System.out.println("Warna: " + mobilku.warna);
	System.out.println("Tahun: " + mobilku.thProduksi);  
        
        //mobil2
        mobilku.hidupkanMobil();
        mobilku.ubahgigi();
        System.out.println("Gigi saat ini : "+ mobilku.gigi);
        mobilku.matikanMobil();
    }
}

class mobil {
    String warna;
    int thProduksi;
    int gigi = 1;
    boolean mobil;
    
    void hidupkanMobil() {
        mobil = true;
        System.out.println("Menghidupkan Mobil");
}
    void matikanMobil(){
        mobil = false;
        System.out.println("Mematikan Mobil");
    }
    void ubahgigi(){
        gigi++;
    }
}