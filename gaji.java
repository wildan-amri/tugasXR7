import java.util.Scanner;

public class gaji {

    public static void main(String[] args) {
       double jamkerja, tarif, pajak, gaji;
        
       Scanner input = new Scanner(System.in);
        System.out.println("masukan jam kerja");
        jamkerja = input.nextDouble();
        System.out.println("masukan tarif per jam");
        tarif = input.nextDouble();
        System.out.println("masukan pajak");
        pajak = input.nextDouble();

        gaji=jamkerja*tarif;
        pajak=(pajak/100)*gaji;
        gaji=gaji-pajak;
        System.out.println("gaji bersih : "+gaji);
    }
}