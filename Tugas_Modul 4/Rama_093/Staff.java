
package nama3;

import nama1.Mahasiswa;

public class Staff extends Mahasiswa {

    public static void main(String[] args) {

        Staff st = new Staff();

        // public
        System.out.println(st.nama);

        // protected bisa karena inheritance
        System.out.println(st.jurusan);

        // default tidak bisa
        // System.out.println(st.alamat);

        // private tidak bisa
        // System.out.println(st.umur);
    }
}
