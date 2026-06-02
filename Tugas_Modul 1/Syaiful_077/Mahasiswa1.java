public class mahasiswa1 {
    String nim;
    String nama;
    double nilai_afektif, nilai_tugas, nilai_uts, nilai_uas, nilai_sikap;

    public mahasiswa1(String nim, String nama, double nilai_afektif, double nilai_tugas, 
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
        // Menyimpan komponen nilai dan bobot ke dalam array
        double[] komponen = {nilai_afektif, nilai_tugas, nilai_uts, nilai_sikap, nilai_uas};
        double[] bobot = {0.15, 0.25, 0.30, 0.10, 0.30};
        
        double total = 0;
        for (int i = 0; i < komponen.length; i++) {
            total += komponen[i] * bobot[i];
        }
        return total;
    }

    public String konv_nilai() {
        double na = nilai_akhir();
        // Membalik logika pengecekan dari nilai terendah ke tertinggi agar tidak perlu kata kunci 'else'
        if (na < 30) return "E";
        if (na < 55) return "D";
        if (na < 60) return "D+";
        if (na < 65) return "C";
        if (na < 70) return "C+";
        if (na < 75) return "B";
        if (na < 80) return "B+";
        return "A";
    }

    public boolean isLulus() {
        // Logika langsung: Jika nilai_akhir minimal 60, otomatis mendapatkan nilai C ke atas (Lulus)
        return nilai_akhir() >= 60;
    }

    public static void main(String[] args) {
        mahasiswa1 mhs = new mahasiswa1("250361100077", "Syaiful Bahit", 80, 95, 80, 90, 95);

        System.out.println("NIM           : " + mhs.nim);
        System.out.println("Nama          : " + mhs.nama);
        System.out.println("Nilai Akhir   : " + mhs.nilai_akhir());
        System.out.println("Nilai Huruf   : " + mhs.konv_nilai());
        System.out.println("Keterangan    : " + (mhs.isLulus() ? "LULUS" : "TIDAK LULUS"));
    }
}

