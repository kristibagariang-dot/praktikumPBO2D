package aricha;

public class RumahSakit {

    public static void main(String[] args) {

        Dokter d1 = new Dokter("Dr. Budi", "Anak");
        Pasien p1 = new Pasien("Salsa", 19);

        d1.tampilDokter();

        System.out.println();

        p1.tampilPasien();
        p1.periksa();
    }
}
