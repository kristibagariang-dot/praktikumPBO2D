package anggota;

/**
 *
 * @author param
 */
public class anggota {
    public static void main(String[] args) {
        mahasiswa mhs = new mahasiswa ("sehun", 19, "250631100100", "PBO");
        System.out.println(mhs.cetak2() + "\n" + mhs.cetak3());
    }
}
