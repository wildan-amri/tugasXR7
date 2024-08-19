public class karyawan {

    int id;
    String nama;
    String unit;
    String alamat;

    public karyawan(int id, String nama, String unit, String alamat){
        this.id = id;
        this.nama = nama;
        this.unit = unit;
        this.alamat = alamat;
    }

    public void print() {
        System.out.println("ID : "+id);
        System.out.println("nama : "+nama);
        System.out.println("unit : "+unit);
        System.out.println("alamnat : "+alamat);
    }
}