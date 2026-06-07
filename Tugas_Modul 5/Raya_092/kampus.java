package kampus;

import manusia.Mahasiswa;

public class Kampus extends Mahasiswa {

    public void tampilData() {

        // bisa akses public
        System.out.println("Nama : " + nama);

        // bisa akses protected karena inheritance
        System.out.println("Jurusan : " + jurusan);

        // tidak bisa akses private
        // System.out.println(umur);

        // tidak bisa akses default beda package
        // System.out.println(alamat);

        tampilProtected();
    }
}
