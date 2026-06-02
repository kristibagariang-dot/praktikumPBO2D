import java.util.Scanner;

public class Mahasiswa {

    String nim;
    String nama;
    double nilai;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumlah = input.nextInt();
        input.nextLine();

        Mahasiswa[] data = new Mahasiswa[jumlah];

        for (int i = 0; i < jumlah; i++) {

            data[i] = new Mahasiswa();

            System.out.println("\nData Mahasiswa ke-" + (i + 1));

            System.out.print("NIM : ");
            data[i].nim = input.nextLine();

            System.out.print("Nama : ");
            data[i].nama = input.nextLine();

            System.out.print("Nilai : ");
            data[i].nilai = input.nextDouble();
            input.nextLine();
        }

        System.out.println("\n=== DATA MAHASISWA ===");

        for (int i = 0; i < jumlah; i++) {

            System.out.println("NIM   : " + data[i].nim);
            System.out.println("Nama  : " + data[i].nama);
            System.out.println("Nilai : " + data[i].nilai);
            System.out.println("----------------------");
        }

        input.close();
    }
              }
