class MahasiswaP {
    String nim;
    String nama;
    double nilai_afektif;
    double nilai_tugas;
    double nilai_uts;
    double nilai_uas;
    double nilai_sikap;

    public MahasiswaP(String nim, String nama, double nilai_afektif, double nilai_tugas,
                     double nilai_uts, double nilai_sikap, double nilai_uas) {
        this.nim = nim;
        this.nama = nama;
        this.nilai_afektif = nilai_afektif;
        this.nilai_tugas = nilai_tugas;
        this.nilai_uts = nilai_uts;
        this.nilai_sikap = nilai_sikap;
        this.nilai_uas = nilai_uas;
    }
    public double nilai_akhir() {
        return (nilai_afektif * 0.15) +
               (nilai_tugas * 0.25) +
               (nilai_uts * 0.30) +
               (nilai_sikap * 0.10) +
               (nilai_uas * 0.30);
    }
    public String konv_nilai() {
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

    public boolean isLulus() {
        String huruf = konv_nilai();
        return huruf.equals("A") || huruf.equals("B+") || huruf.equals("B")
                || huruf.equals("C+") || huruf.equals("C");
    }
}

class MainMahasiswa {
    public static void main(String[] args) {
        
        String nim  = "250631100088"; 
        String nama = "Moh Zahri Ramadani"; 
        
        double n_afektif = 80;
        double n_tugas   = 95;
        double n_uts     = 80;
        double n_sikap   = 90;
        double n_uas     = 95;   
        MahasiswaP mhs = new MahasiswaP(nim, nama, n_afektif, n_tugas, n_uts, n_sikap, n_uas);
        System.out.println("=== DATA MAHASISWA ===");
        System.out.println("NIM          : " + mhs.nim);
        System.out.println("Nama         : " + mhs.nama);
        System.out.println("Nilai Akhir  : " + mhs.nilai_akhir());
        System.out.println("Grade        : " + mhs.konv_nilai());
        System.out.println("Status       : " + (mhs.isLulus() ? "LULUS" : "TIDAK LULUS"));
    }
}
