package package2;

import package1.Mahasiswa;

public class Dosen {

    public static void main(String[] args) {

        Mahasiswa mhs = new Mahasiswa();

        // Bisa karena public
        System.out.println(mhs.nama);

        // Tidak bisa karena protected
        // System.out.println(mhs.jurusan);

        // Tidak bisa karena default
        // System.out.println(mhs.kampus);

        // Tidak bisa karena private
        // System.out.println(mhs.umur);

        mhs.tampilPublic();
    }
}
