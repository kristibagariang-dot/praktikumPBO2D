package data;

import siswa.Mahasiswa;

public class Univ {
    public static void main(String[] args) {
     
        Mahasiswa mhs1 = new Mahasiswa(
                        "Imaa",
                        19,
                        "Informatika",
                        "Bangkalan",
                        "class D"
        );
        System.out.println(mhs1.tampilData());
    }
 
}
