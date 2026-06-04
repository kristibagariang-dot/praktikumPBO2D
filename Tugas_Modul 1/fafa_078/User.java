/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
   import java.util.Scanner;
/**
 *
 * @author z
 */
public class User {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Mahasiswa m = new Mahasiswa();

        System.out.print("Masukkan NIM : ");
        m.nim = input.nextLine();

        System.out.print("Masukkan Nama : ");
        m.nama = input.nextLine();

        System.out.print("Nilai Afektif : ");
        m.nilai_afektif = input.nextDouble();

        System.out.print("Nilai Tugas : ");
        m.nilai_tugas = input.nextDouble();

        System.out.print("Nilai UTS : ");
        m.nilai_uts = input.nextDouble();

        System.out.print("Nilai Sikap : ");
        m.nilai_sikap = input.nextDouble();

        System.out.print("Nilai UAS : ");
        m.nilai_uas = input.nextDouble();

        System.out.println("\n=== HASIL ===");
        System.out.println("Nilai Akhir : " + m.nilai_akhir());
        System.out.println("Nilai Huruf : " + m.konv_nilai());
        System.out.println("Keterangan : " + m.isLulus());
    }
}

