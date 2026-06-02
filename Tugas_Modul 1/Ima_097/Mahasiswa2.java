public class Mahasiswa {

    String nim;
    String nama;
    double nilaiAfektif, nilaiTugas, nilaiUTS, nilaiSikap, nilaiUAS;

    double nilaiAkhir() {
        return (nilaiAfektif * 0.15) +
               (nilaiTugas * 0.25) +
               (nilaiUTS * 0.30) +
               (nilaiSikap * 0.10) +
               (nilaiUAS * 0.20);
    }

    String konvNilai() {
        double na = nilaiAkhir();

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
        String huruf = konvNilai();

        return huruf.equals("A") ||
               huruf.equals("B+") ||
               huruf.equals("B") ||
               huruf.equals("C+") ||
               huruf.equals("C");
    }

    public static void main(String[] args) {

        Mahasiswa m = new Mahasiswa();

        m.nim = "250631100097";
        m.nama = "IMA ROTUL HASANAH";
        m.nilaiAfektif = 80;
        m.nilaiTugas = 95;
        m.nilaiUTS = 80;
        m.nilaiSikap = 90;
        m.nilaiUAS = 95;

        System.out.println("NIM          : " + m.nim);
        System.out.println("Nama         : " + m.nama);
        System.out.println("Nilai Akhir  : " + m.nilaiAkhir());
        System.out.println("Nilai Huruf  : " + m.konvNilai());
        System.out.println("Keterangan   : " +
                (m.isLulus() ? "LULUS" : "TIDAK LULUS"));
    }
}
