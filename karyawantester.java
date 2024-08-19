public class karyawantester {
    public static void main(String[] args) {
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
    }
}
