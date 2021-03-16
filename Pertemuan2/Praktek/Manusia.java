 public class Manusia {
    String nama;
    Boolean punyaTv = false;

    public Manusia() {
    }

    public Manusia(String nama) {
        this.nama = nama;
    }

    public String namaSaya() {
        return nama;
    }

    public void beliTv(TV tiviku) {
        this.punyaTv = true;
    }

    public void jualSemuaTv() {
        this.punyaTv = false;
    }

    public Boolean cekTv() {
        return punyaTv;
    }

}

class TV {

    public TV() {
    }

}

class TestTv {
    public static void main(String[]args){
        Manusia man1 = new Manusia("Erik");
        TV tvku = new TV();
        System.out.println(man1.namaSaya());
        man1.beliTv(tvku);
        System.out.println(man1.cekTv());
        man1.jualSemuaTv();
        System.out.println(man1.cekTv());
    }
}

