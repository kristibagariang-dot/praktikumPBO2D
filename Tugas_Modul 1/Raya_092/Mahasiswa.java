package kampus;

public class Mahasiswa {

    String nim;
    String nama;
    double nilaiAfektif;
    double nilaiTugas;
    double nilaiUTS;
    double nilaiSikap;
    double nilaiUAS;

    double nilai_akhir() {
        return (nilaiAfektif * 0.15) +
               (nilaiTugas * 0.25) +
               (nilaiUTS * 0.30) +
               (nilaiSikap * 0.10) +
               (nilaiUAS * 0.30);
    }

    String konv_nilai() {

        double na = nilai_akhir();

        if (na >= 80) {
            return "A";
        } else if (na >= 75) {
            return "B+";
        } else if (na >= 70) {
            return "B";
        } else if (na >= 65) {
            return "C+";
        } else if (na >= 60) {
            return "C";
        } else if (na >= 55) {
            return "D+";
        } else if (na >= 30) {
            return "D";
        } else {
            return "E";
        }
    }

    boolean isLulus() {

        String huruf = konv_nilai();

        return huruf.equals("A") ||
               huruf.equals("B+") ||
               huruf.equals("B") ||
               huruf.equals("C+") ||
               huruf.equals("C");
    }

    void tampilData() {

        System.out.println("NIM : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Nilai Akhir : " + nilai_akhir());
        System.out.println("Nilai Huruf : " + konv_nilai());

        if (isLulus()) {
            System.out.println("Keterangan : LULUS");
        } else {
            System.out.println("Keterangan : TIDAK LULUS");
        }
    }
}/
