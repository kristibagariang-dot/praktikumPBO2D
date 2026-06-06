/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author param
 */
public class Mahasiswa {

    // a. Atribut
    String nim;
    String nama;
    double nilai_afektif;
    double nilai_tugas;
    double nilai_uts;
    double nilai_uas;

    // b. Method menghitung nilai akhir
    double nilai_akhir() {
        return (nilai_afektif * 0.15) +
               (nilai_tugas * 0.25) +
               (nilai_uts * 0.30) +
               (nilai_afektif * 0.10) +
               (nilai_uas * 0.30);
    }

    // c. Method konversi nilai angka ke huruf
    char konv_nilai() {
        double na = nilai_akhir();

        if (na >= 80) {
            return 'A';
        } else if (na >= 75) {
            return 'B';   // B+
        } else if (na >= 70) {
            return 'B';
        } else if (na >= 65) {
            return 'C';   // C+
        } else if (na >= 60) {
            return 'C';
        } else if (na >= 55) {
            return 'D';   // D+
        } else if (na >= 30) {
            return 'D';
        } else {
            return 'E';
        }
    }

    // d. Method cek kelulusan
    boolean isLulus() {
        char nilaiHuruf = konv_nilai();

        return nilaiHuruf == 'A' ||
               nilaiHuruf == 'B' ||
               nilaiHuruf == 'C';
    }

    // Main untuk uji coba
    public static void main(String[] args) {

        Mahasiswa mhs = new Mahasiswa();

        mhs.nim = "250631100100";
        mhs.nama = "Paramita";
        mhs.nilai_afektif = 88;
        mhs.nilai_tugas = 90;
        mhs.nilai_uts = 91;
        mhs.nilai_uas = 90;

        System.out.println("NIM          : " + mhs.nim);
        System.out.println("Nama         : " + mhs.nama);
        System.out.println("Nilai Akhir  : " + mhs.nilai_akhir());
        System.out.println("Nilai Huruf  : " + mhs.konv_nilai());
        System.out.println("Keterangan   : " + (mhs.isLulus() ? "LULUS" : "TIDAK LULUS"));
    }
}
