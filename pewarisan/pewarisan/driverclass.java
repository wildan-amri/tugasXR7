package pewarisan;

import java.util.Scanner;

public class driverclass {
    public static void main(String[] args) {
        DVD movie = new DVD();
        CD music = new CD();

        Scanner input = new Scanner(System.in);
        System.out.println("mau pilih CD atau DVD");
       String pilih = input.nextLine();
       if (pilih.equals("DVD")) {
         movie.print();
       } if (pilih.equals("CD")) { 
        music.print();
       } else {
        System.out.println("error");
       }
       
        
       input.close();
    }
    
}
