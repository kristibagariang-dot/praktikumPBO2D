package aplikasi;

import krs.KrsKhusus;

public class Main {
    public static void main(String[] args) {
       
        KrsKhusus mhs1 = new KrsKhusus("230631100012", "Moh Zahri Ramadani", 
                3.00, "Pemrograman Berorientasi Objek");

        mhs1.cetakKrs();
        System.out.println("============================");
        System.out.println("Nama: " + mhs1.namaMahasiswa);

    }
}
