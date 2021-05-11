package kasus1;

public class daftar_run {
    public static void main(String[] args) {       
        Mahasiswa mhs = new Mahasiswa("Naja","12277");
        mhs.ambil_matkul("Rekayasa Perangkat lunak");
        mhs.ambil_matkul("Pemrograman Berbasis Web");
        mhs.ambil_matkul("Agama");
        mhs.get_info();

    }


}