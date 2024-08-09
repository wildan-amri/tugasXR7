//Driver CLass
public class siswatester {

    public static void main(String[] args) {
        siswa erwan = new siswa();
        siswa arjuna = new siswa();
        siswa bima = new siswa();
        siswa melvin = new siswa();
        siswa azzam = new siswa();

        erwan.id = 8;
        erwan.nama ="erwan";
        erwan.ipk = 90;

        arjuna.id = 1;
        arjuna.nama ="arjuna";
        arjuna.ipk = 90;

        bima.id = 2;
        bima.nama ="bima";
        bima.ipk = 90;

        melvin.id = 21;
        melvin.nama ="melvin";
        melvin.ipk = 90;

        azzam.id = 22;
        azzam.nama ="azzam";
        azzam.ipk = 90;

        System.out.println("nama:"+erwan.nama+" absen:"+erwan.id+" ipk:"+erwan.ipk);
        System.out.println("nama:"+arjuna.nama+" absen:"+arjuna.id+" ipk:"+arjuna.ipk);
        System.out.println("nama:"+bima.nama+" absen:"+bima.id+" ipk:"+bima.ipk);
        System.out.println("nama:"+melvin.nama+" absen:"+melvin.id+" ipk:"+melvin.ipk);
        System.out.println("nama:"+azzam.nama+" absen:"+azzam.id+" ipk:"+azzam.ipk);
    }
}