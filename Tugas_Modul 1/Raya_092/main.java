package kampus;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Mahasiswa mhs = new Mahasiswa();

        System.out.print("Masukkan NIM : ");
        mhs.nim = input.nextLine();

        System.out.print("Masukkan Nama : ");
        mhs.nama = input.nextLine();

        System.out.print("Nilai Afektif : ");
        mhs.nilaiAfektif = input.nextDouble();

        System.out.print("Nilai Tugas : ");
        mhs.nilaiTugas = input.nextDouble();

        System.out.print("Nilai UTS : ");
        mhs.nilaiUTS = input.nextDouble();

        System.out.print("Nilai Sikap : ");
        mhs.nilaiSikap = input.nextDouble();

        System.out.print("Nilai UAS : ");
        mhs.nilaiUAS = input.nextDouble();

        System.out.println();
        mhs.tampilData();

        input.close();
    }
}
