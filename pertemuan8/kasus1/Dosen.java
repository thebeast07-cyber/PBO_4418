package kasus1;
public class Dosen{
    private String nama_dosen;
    private String nip;

    Dosen(String nama_dosen, String nip){
        this.nama_dosen = nama_dosen;
        this.nip = nip;
    }

    public void get_info() {
        System.out.println("Nama Dosen: " + this.nama_dosen);
        System.out.println("NIP Dosen: " + this.nip);
    }

}