public class Tes {
    public static void main(String[] args) {
        Karyawan k1 = new Karyawan("Arya", "Admin");
        Karyawan k2 = new Karyawan("Eko", "Admin");

        Mobil mbl1 = new Sedan("BMW", 3000, "X5", 800000000);
        Mobil mbl2 = new Minibus("Toyota", 1500, "Avanza", 200000000);
        Mobil mbl3 = new Bus("Toyota", 5000, "Evo S", 950000000);

        k1.cetak();
        Pembeli p1 = new Individu("Odie", 19, "Jl Hasanudin");
        p1.beliMobil(mbl1);
        p1.dapatMobil();

        System.out.println(" ");

        k2.cetak();
        Pembeli p2 = new Borongan("Roffi", 20, "Jl Mawar");
        p2.beliMobil(mbl1, 5);
        p2.dapatMobil();

    }
}
