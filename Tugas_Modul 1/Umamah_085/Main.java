/*@author Taufiq*/
class Mahasiswa {
    String nim, nama;
    double afektif, tugas, uts, sikap, uas;

    double nilaiAkhir() {
        return (afektif * 0.15) + (tugas * 0.25) + 
               (uts * 0.30) + (sikap * 0.10) + 
               (uas * 0.30);
    }

    String konversiNilai() {
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
        String huruf = konversiNilai();
        return huruf.equals("A") || huruf.equals("B+") ||
               huruf.equals("B") || huruf.equals("C+") ||
               huruf.equals("C");
    }
}

public class Main {
    public static void main(String[] args) {
        Mahasiswa m = new Mahasiswa();

        m.nim = "250631100085";
        m.nama = "Mahsunatul Umamah";
        m.afektif = 80;
        m.tugas = 95;
        m.uts = 80;
        m.sikap = 90;
        m.uas = 95;

        System.out.println("NIM : " + m.nim);
        System.out.println("Nama : " + m.nama);
        System.out.println("Nilai Akhir : " + m.nilaiAkhir());
        System.out.println("Nilai Huruf : " + m.konversiNilai());
        System.out.println("Keterangan : " + (m.isLulus() ? "LULUS" : "TIDAK LULUS"));
    }
}
