public class karyawan {

    private int id;
    private String nama;
    private String unit;
    private String alamat;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getUnit() {
        return this.unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getAlamat() {
        return this.alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

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