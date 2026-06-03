package package1;

public class MainApp {
    public static void main(String[] args) {

        Mahasiswa mhs = new Mahasiswa();

        // akses public
        System.out.println(mhs.nama);

        // akses protected
        System.out.println(mhs.jurusan);

        // akses default
        System.out.println(mhs.kampus);

        // akses method
        mhs.tampilPublic();
        mhs.tampilProtected();
        mhs.tampilDefault();

        // akses private lewat method public
        mhs.aksesPrivate();
    }
}
