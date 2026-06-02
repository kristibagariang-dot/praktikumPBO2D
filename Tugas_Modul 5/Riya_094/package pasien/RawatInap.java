/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pasien;

// final class
public final class RawatInap extends Pasien {

    private int nomorKamar;

    public RawatInap(String nama, int umur, String penyakit, int nomorKamar) {
        super(nama, umur, penyakit);
        this.nomorKamar = nomorKamar;
    }

    public void tampilRawatInap() {

        // memanggil method parent
        tampilPasien();

        System.out.println("Nomor Kamar : " + nomorKamar);

        // akses protected
        System.out.println("Nama dari protected : " + nama);

        // akses default
        System.out.println("Penyakit dari default : " + penyakit);

        tampilRahasia();
    }
}