package anggota;

public class anggota {

    public static void main(String[] args) {
        mahasiswa mhs = new mahasiswa("Fadli", 18,
                "230631100012", "PBO");
        System.out.println(mhs.cetak2() + "\n"
                + mhs.cetak3());
    }
}