class MainM {
    String nim;
    String nama;
    double nilai_afektif;
    double nilai_tugas;
    double nilai_uts;
    double nilai_sikap;
    double nilai_uas;

    MainM (String nim, String nama, double afektif, double tugas,
              double uts, double sikap, double uas) {
        this.nim = nim;
        this.nama = nama;
        this.nilai_afektif = afektif;
        this.nilai_tugas = tugas;
        this.nilai_uts = uts;
        this.nilai_sikap = sikap;
        this.nilai_uas = uas;
    }

    double nilai_akhir() {
        return (nilai_afektif * 0.15) +
               (nilai_tugas * 0.25) +
               (nilai_uts * 0.30) +
               (nilai_sikap * 0.10) +
               (nilai_uas * 0.30);
    }

    String konv_nilai() {
        double na = nilai_akhir();

        if (na >= 80) return "A";
        else if (na >= 75) return "B+";
        else if (na >= 70) return "B";
        else if (na >= 65) return "C+";
        else if (na >= 60) return "C";
        else if (na >= 55) return "D+";
        else if (na >= 30) return "D";
        else return "E";
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
        System.out.println("\n=== HASIL ===");
        System.out.println("NIM : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Nilai Akhir : " + nilai_akhir());
        System.out.println("Nilai Huruf : " + konv_nilai());
        System.out.println("Keterangan : " +
                (isLulus() ? "LULUS" : "TIDAK LULUS"));
    }
}

public class MainManualll {
    public static void main(String[] args) {

        Mahasiswa m = new Mahasiswa(
                "210631100080",
                "Nurul Qomariyah",
                80,
                95,
                80,
                90,
                95
        );

        m.tampilData();
    }
}