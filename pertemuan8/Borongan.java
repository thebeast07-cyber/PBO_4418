public class Borongan extends Pembeli {
    public Borongan(String nama, int umur, String alamat) {
        super(nama, umur, alamat);
    }

    public void beliMobil(Mobil mbl) {
        if (listMobil.size() == 0) {
            listMobil.add(mbl);
        } else {
            if (mbl.getType() != listMobil.get(0).getType()) {
                System.out.println("Anda hanya bisa memilih dan membeli 1 type mobil saja");
            } else {
                listMobil.add(mbl);
            }
        }
    }

    public void beliMobil(Mobil mbl, int jumlah) {
        for (int i = 0; i < jumlah; i++) {
            beliMobil(mbl);
        }
    }

    public void dapatMobil() {
        if (listMobil.size() == 0) {
            System.out.println("Mobil belum dibeli");
        } else {
            System.out.println("======== Data Pelanggan ========");
            System.out.println("Nama Pembeli = " + getNama());
            System.out.println("Nama Pembeli = " + getUmur());
            System.out.println("Nama Pembeli = " + getAlamat());

            System.out.println("======== Data Pembelian Mobil Borongan ========");
            Mobil mbl1 = new Mobil();
            for (int i = 0; i < listMobil.size(); i++) {
                mbl1 = listMobil.get(i);
                System.out.println("Merek = " + mbl1.getMerek());
                System.out.println("CC = " + mbl1.getCc());
                System.out.println("Type = " + mbl1.getType());
                System.out.println("Harga = " + mbl1.getHarga());
            }
        }
    }

    public int cetak() {
        Mobil mbl1 = new Mobil();
        int totalHarga = 0;
        for (int i = 0; i < listMobil.size(); i++) {
            mbl1 = listMobil.get(i);
            totalHarga = totalHarga + mbl1.getHarga();
        }
        return totalHarga;
    }
}
