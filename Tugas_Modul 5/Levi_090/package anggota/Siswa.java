package anggota;

import admin.Buku;

public class Siswa extends Buku {

    public void lihatBuku() {

        System.out.println(judul);

        // protected bisa karena inheritance
        System.out.println(rak);

        tampilJudul();
        tampilRak();

        // tidak bisa
        // kode
        // kategori
    }

    public static void main(String[] args) {

        Siswa s = new Siswa();
        s.lihatBuku();
    }
}
