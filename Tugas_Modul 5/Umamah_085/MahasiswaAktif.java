 package kehadiran;

/* @author Taufiq*/
import data.Mahasiswa;

public class MahasiswaAktif extends Mahasiswa {

    public MahasiswaAktif(String nama, int umur, String jurusan, String alamat) {
        super(nama, umur, jurusan, alamat);
    }
    public void aksesData() {
        System.out.println("Akses dari subclass:");
        System.out.println("Nama: " + nama);
        System.out.println("Jurusan: " + jurusan);
        System.out.println("Umur: " + getUmur());
    }
}
