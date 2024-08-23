  import java.util.Scanner;
public class karyawantester {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("masukan id");
      int id = input.nextInt();
      System.out.println("masukan nama karyawan");
      String nama = input.nextLine();
      System.out.println("masukan unit karyawan");
      String unit = input.nextLine();
      System.out.println("masukan alamat karyawan");
      String alamat = input.nextLine();

      karyawan erwan = new karyawan(id, nama, unit, alamat);
      erwan.print();
      System.out.println();
        karyawan angger = new karyawan(2, "annger", "kurikulum", "malang");
        karyawan cya = new karyawan(3, "cya", "tukang kebersihan", "madura");
        karyawan zitta = new karyawan(4, "zitta", "tenaga usaha", "nganjuk");
        karyawan wildan = new karyawan(5, "wildan", "guru", "kediri");
        karyawan abid = new karyawan(6, "abid", "guru", "blitar");

      angger.print();
      cya.print();
      zitta.print();
      wildan.print();
      abid.print();
      input.close();

    }
}
