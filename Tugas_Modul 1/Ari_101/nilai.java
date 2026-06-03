import java.util.Scanner;

class Mahasiswa {
    String nim;
    String nama;
    double nilaiAfektif;
    double nilaiTugas;
    double nilaiUTS;
    double nilaiSikap;
    double nilaiUAS;

    // Menghitung nilai akhir
    double nilaiAkhir() {
        return (nilaiAfektif * 0.15) +
               (nilaiTugas * 0.25) +
               (nilaiUTS * 0.20) +
               (nilaiSikap * 0.10) +
               (nilaiUAS * 0.30);
    }

    // Konversi nilai huruf
    String konvNilai() {
        double na = nilaiAkhir();

        if (na >= 80)
            return "A";
        else if (na >= 75)
            return "B+";
        else if (na >= 70)
            return "B";
        else if (na >= 65)
            return "C+";
        else if (na >= 60)
            return "C";
        else if (na >= 55)
            return "D+";
        else if (na >= 30)
            return "D";
        else
            return "E";
    }

    // Cek kelulusan
    boolean isLulus() {
        String nilaiHuruf = konvNilai();

        return nilaiHuruf.equals("A") ||
               nilaiHuruf.equals("B+") ||
               nilaiHuruf.equals("B") ||
               nilaiHuruf.equals("C+") ||
               nilaiHuruf.equals("C");
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Mahasiswa mhs = new Mahasiswa();

        System.out.print("Masukkan NIM            : ");
        mhs.nim = input.nextLine();

        System.out.print("Masukkan Nama           : ");
        mhs.nama = input.nextLine();

        System.out.print("Masukkan Nilai Afektif  : ");
        mhs.nilaiAfektif = input.nextDouble();

        System.out.print("Masukkan Nilai Tugas    : ");
        mhs.nilaiTugas = input.nextDouble();

        System.out.print("Masukkan Nilai UTS      : ");
        mhs.nilaiUTS = input.nextDouble();

        System.out.print("Masukkan Nilai Sikap    : ");
        mhs.nilaiSikap = input.nextDouble();

        System.out.print("Masukkan Nilai UAS      : ");
        mhs.nilaiUAS = input.nextDouble();

        System.out.println("\n===== HASIL =====");
        System.out.println("NIM          : " + mhs.nim);
        System.out.println("Nama         : " + mhs.nama);
        System.out.println("Nilai Akhir  : " + mhs.nilaiAkhir());
        System.out.println("Nilai Huruf  : " + mhs.konvNilai());

        if (mhs.isLulus()) {
            System.out.println("Status       : LULUS");
        } else {
            System.out.println("Status       : TIDAK LULUS");
        }

        input.close();
    }
}
