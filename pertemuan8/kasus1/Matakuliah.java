package kasus1;
import java.util.ArrayList;

public class Matakuliah{
	private ArrayList<String> matkulTambahan = new ArrayList<String>();
    private ArrayList<String> matkulPokok = new ArrayList<String>();   

    public static void main(String[] args) {
        ArrayList<String> matkulTambahan = new ArrayList<String>();
        matkulTambahan.add("Agama");
        matkulTambahan.add("Bahasa Indonesia");
        matkulTambahan.add("Bahasa inggris");
        matkulTambahan.add("PPKN");

        ArrayList<String> matkulkPokok = new ArrayList<String>();
        matkulkPokok.add("Dasar Pemrograman");
        matkulkPokok.add("Basis Data");
        matkulkPokok.add("Pemrograman Berbasis Objek");
        matkulPokok.add("Rekayasa Perangkat Lunak");


    }

}