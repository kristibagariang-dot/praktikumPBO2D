package nama2;

import nama1.Mahasiswa;

public class Dosen {

    public static void main(String[] args) {

        Mahasiswa mhs = new Mahasiswa();

        // public bisa diakses
        System.out.println(mhs.nama);

        // protected tidak bisa
        // System.out.println(mhs.jurusan);

        // default tidak bisa
        // System.out.println(mhs.alamat);

        // private tidak bisa
        // System.out.println(mhs.umur);
    }
}
