package kasus1;

import java.util.ArrayList;

public class Mahasiswa{
    private String nama_mhs;
    private String nim;
    private ArrayList<String> matkul = new ArrayList<>();

    Mahasiswa(){}
    Mahasiswa(String nama_mhs, String nim){
        this.nama_mhs = nama_mhs;
        this.nim = nim;
    }

    public void matkul_diambil(String matkul){
        this.matkul.add(matkul);
    }

    public void get_info(){
       System.out.println("Nama Mahasiswa: " + this.nama_mhs);
       System.out.println("NIM: " + this.nim);
       for (int i = 0; i < this.matkul.size(); i++) {
           System.out.println(this.matkul.get(i));
       }
    }


}