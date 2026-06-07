package app;

import manusia.Mahasiswa;
import manusia.Dosen;
import kampus.Kampus;

public class MainApp {

    public static void main(String[] args) {

        Mahasiswa mhs = new Mahasiswa();

        System.out.println("=== DATA MAHASISWA ===");

        // akses public
        System.out.println(mhs.nama);

        mhs.tampilPublic();

        // akses private lewat method public
        mhs.aksesPrivate();

        Dosen dsn = new Dosen();

        System.out.println("\n=== DATA DOSEN ===");
        dsn.tampilDosen();

        Kampus kp = new Kampus();

        System.out.println("\n=== DATA KAMPUS ===");
        kp.tampilData();
    }
}
