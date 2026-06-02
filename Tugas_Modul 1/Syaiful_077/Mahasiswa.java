public class mahasiswa {
    // Menggunakan modifier 'private' dan 'final' untuk enkapsulasi yang lebih baik
    private final String nim, nama;
    private final double nilaiAfektif, nilaiTugas, nilaiUts, nilaiUas, nilaiSikap;

    // Nama variabel menggunakan aturan camelCase standar Java
    public mahasiswa(String nim, String nama, double nilaiAfektif, double nilaiTugas, double nilaiUts, double nilaiSikap, double nilaiUas) {
        this.nim = nim;
        this.nama = nama;
        this.nilaiAfektif = nilaiAfektif;
        this.nilaiTugas = nilaiTugas;
        this.nilaiUts = nilaiUts;
        this.nilaiSikap = nilaiSikap;
        this.nilaiUas = nilaiUas;
    }

    public double nilai_akhir() {
        return (nilaiAfektif * 0.15) + (nilaiTugas * 0.25) + (nilaiUts * 0.30) + (nilaiSikap * 0.10) + (nilaiUas * 0.30);
    }

    public String konv_nilai() {
        double na = nilai_akhir();
        // Menggunakan ternary operator yang lebih ringkas dibanding if-else bertingkat
        return (na >= 80) ? "A"  : (na >= 75) ? "B+" : (na >= 70) ? "B"  : 
               (na >= 65) ? "C+" : (na >= 60) ? "C"  : (na >= 55) ? "D+" : 
               (na >= 30) ? "D"  : "E";
    }

    // === TAMBAHKAN MAIN METHOD DI BAWAH INI UNTUK MENJALANKAN PROGRAM ===
    public static void main(String[] args) {
        // Membuat objek mahasiswa baru (Contoh menggunakan NIM akhiran 077 Anda)
        mahasiswa mhs = new mahasiswa("250631100077", "Syaiful", 85, 80, 75, 90, 80);

        // Menampilkan hasil ke console
        System.out.println("NIM         : " + mhs.nim);
        System.out.println("Nama        : " + mhs.nama);
        System.out.println("Nilai Akhir : " + mhs.nilai_akhir());
        System.out.println("Nilai Huruf : " + mhs.konv_nilai());
    }
} // <--- Pastikan kurung kurawal penutup kelas ini ada

