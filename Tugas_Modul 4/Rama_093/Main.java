package nama1;

public class Main {
    public static void main(String[] args) {

        Mahasiswa mhs = new Mahasiswa();

        // public
        System.out.println(mhs.nama);

        // protected
        System.out.println(mhs.jurusan);

        // default
        System.out.println(mhs.alamat);

        // private tidak bisa diakses langsung
        // System.out.println(mhs.umur);

        mhs.tampilPublic();
        mhs.tampilProtected();
        mhs.tampilDefault();

        // akses private lewat method public
        mhs.aksesPrivate();
    }
}
