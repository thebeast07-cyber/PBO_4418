//Nama 	: Nailun Najah
//elas 	: A11.4418
//NIM 	:  A11.2019.12212
import java.io.*;
public class Pertemuan1_Praktik1 {
    public static void main(String args[]) throws IOException {
        InputStreamReader cin = null;
  
        try {
           cin = new InputStreamReader(System.in);
           System.out.println("Enter characters, 'q' to quit.");
           char c;
           do {
              c = (char) cin.read();
              System.out.print(c);
           } while(c != 'q');
        }finally {
           if (cin != null) {
              cin.close();
           }
        }
    } 
}
