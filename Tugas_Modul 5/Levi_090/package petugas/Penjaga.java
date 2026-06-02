package petugas;

import admin.Buku;

public class Penjaga {

    public static void main(String[] args) {

        Buku b = new Buku();

        System.out.println(b.judul);
        b.tampilJudul();

        // tidak bisa:
        // b.kode
        // b.rak
        // b.kategori
    }
}
