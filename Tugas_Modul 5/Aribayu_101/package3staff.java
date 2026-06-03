package package3;

import package1.Mahasiswa;

public class Staff extends Mahasiswa {

    public static void main(String[] args) {

        Staff stf = new Staff();

        // public bisa diakses
        System.out.println(stf.nama);

        // protected bisa diakses karena inheritance
        System.out.println(stf.jurusan);

        stf.tampilProtected();
    }
}
