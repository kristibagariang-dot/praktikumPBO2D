package data;

import anggota.Orang;

public class Mahasiswa extends Orang {

    public void tampilkanData() {
        System.out.println("Nama : " + nama);
        System.out.println("Alamat : " + alamat);

        // Tidak bisa akses private
        // System.out.println(umur);

        // Default juga tidak bisa beda package
        // System.out.println(hobi);
    }
}
