class Mahasiswa {
    String nim;
    String nama;
    double nilai_afektif;
    double nilai_tugas;
    double nilai_uts;
    double nilai_sikap;
    double nilai_uas;

    // Method menghitung nilai akhir
    double nilai_akhir() {
        return (nilai_afektif * 0.15) +
               (nilai_tugas * 0.25) +
               (nilai_uts * 0.30) +
               (nilai_sikap * 0.10) +
               (nilai_uas * 0.20);
    }

    // Method konversi nilai
    String konv_nilai() {
        double na = nilai_akhir();

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

    // Method cek kelulusan
    String isLulus() {
        String huruf = konv_nilai();

        if (huruf.equals("A") || huruf.equals("B+") ||
            huruf.equals("B") || huruf.equals("C+") ||
            huruf.equals("C"))
            return "Lulus";
        else
            return "Tidak Lulus";
    }
}

public class Main {
    public static void main(String[] args) {

        Mahasiswa mhs = new Mahasiswa();

        // Input manual
        mhs.nim = "210631100080";
        mhs.nama = "Safila Wulandania";
        mhs.nilai_afektif = 80;
        mhs.nilai_tugas = 95;
        mhs.nilai_uts = 80;
        mhs.nilai_sikap = 90;
        mhs.nilai_uas = 95;

        System.out.println("NIM            : " + mhs.nim);
        System.out.println("Nama           : " + mhs.nama);
        System.out.println("Nilai Akhir    : " + mhs.nilai_akhir());
        System.out.println("Nilai Huruf    : " + mhs.konv_nilai());
        System.out.println("Status         : " + mhs.isLulus());
    }
}
