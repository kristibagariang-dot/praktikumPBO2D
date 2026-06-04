package pegawai;

public class Pegawai {
    public String nama;
    protected String jabatan;
    private double gaji;

    public Pegawai(String nama, String jabatan, double gaji) {
        this.nama = nama;
        this.jabatan = jabatan;
        this.gaji = gaji;
    }

    public void tampilInfo() {
        System.out.println("Nama    : " + nama);
        System.out.println("Jabatan : " + jabatan);
        System.out.println("Gaji    : " + gaji);
    }
}