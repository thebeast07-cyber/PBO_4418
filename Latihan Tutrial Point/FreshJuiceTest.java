//Nama 	: Nailun Najah
//elas 	: A11.4418
//NIM 	:  A11.2019.12212
public class FreshJuiceTest {
 
    public static void main(String args[]) {
       FreshJuice juice = new FreshJuice();
       juice.size = FreshJuice.FreshJuiceSize.MEDIUM ;
       System.out.println("Size: " + juice.size);
    }
 }
 class FreshJuice {
    enum FreshJuiceSize{ SMALL, MEDIUM, LARGE }
    FreshJuiceSize size;
 }