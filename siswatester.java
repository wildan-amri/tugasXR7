//Driver CLass
import java.util.Scanner;
public class siswatester {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("masukan nama siswa : ");
        String nama = input.nextLine();
        System.out.println("masukan id siswa : ");
        int id = input.nextInt();
        System.out.println("masukan IPK siswa : ");
        double ipk = input.nextDouble();

        siswa wildan = new siswa(id, nama, ipk);
        wildan.print();
        siswa erwan = new siswa(8, "erwan", 90);
         siswa arjuna = new siswa(1, "arjuna", 90);
         siswa bima = new siswa(2, "bima", 90);
         siswa melvin = new siswa(21, "melvin", 90);
         siswa azzam = new siswa(22, "azam", 90);

        

         erwan.print();
         arjuna.print();
         bima.print();
         melvin.print();
         azzam.print();
         input.close();
    }
}