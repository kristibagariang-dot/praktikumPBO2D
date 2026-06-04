package Main;

/*@author Taufiq*/
import data.Mahasiswa;
import kehadiran.MahasiswaAktif;

public class MainApp {
    public static void main(String[] args) {

        Mahasiswa mhs = new Mahasiswa("Adit", 23, "Informatika", "Bangkalan");
        mhs.tampilData();

        System.out.println("\n------------------\n");

        MahasiswaAktif aktif = new MahasiswaAktif("Umamah", 20, "Informatika", "Bangkalan");
        aktif.aksesData();

        System.out.println("\nAkses dari Main:");
        System.out.println(mhs.nama);
        System.out.println(mhs.getUmur());
    }
}   
