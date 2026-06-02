public class MahasiswaManual {

    private String nim, nama;
    private double nilai_afektif, nilai_tugas, nilai_uts,
                   nilai_sikap, nilai_uas;

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getNilai_afektif() {
        return nilai_afektif;
    }

    public void setNilai_afektif(double nilai_afektif) {
        this.nilai_afektif = nilai_afektif;
    }

    public double getNilai_tugas() {
        return nilai_tugas;
    }

    public void setNilai_tugas(double nilai_tugas) {
        this.nilai_tugas = nilai_tugas;
    }

    public double getNilai_uts() {
        return nilai_uts;
    }

    public void setNilai_uts(double nilai_uts) {
        this.nilai_uts = nilai_uts;
    }

    public double getNilai_sikap() {
        return nilai_sikap;
    }

    public void setNilai_sikap(double nilai_sikap) {
        this.nilai_sikap = nilai_sikap;
    }

    public double getNilai_uas() {
        return nilai_uas;
    }

    public void setNilai_uas(double nilai_uas) {
        this.nilai_uas = nilai_uas;
    }

    // Menghitung nilai akhir
    public double nilai_akhir() {
        return (nilai_afektif * 0.15) +
               (nilai_tugas * 0.25) +
               (nilai_uts * 0.20) +
               (nilai_sikap * 0.10) +
               (nilai_uas * 0.30);
    }

    // Konversi nilai huruf
    public String konv_nilai() {
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

    // Cek kelulusan
    public boolean isLulus() {
        String huruf = konv_nilai();
        return huruf.equals("A") ||
               huruf.equals("B+") ||
               huruf.equals("B") ||
               huruf.equals("C+") ||
               huruf.equals("C");
    }

    public static void main(String[] args) {

        MahasiswaUser m = new MahasiswaUser();

        // Input manual
        m.setNim("250631100083");
        m.setNama("Siti Naifah");
        m.setNilai_afektif(80);
        m.setNilai_tugas(95);
        m.setNilai_uts(80);
        m.setNilai_sikap(90);
        m.setNilai_uas(95);

        System.out.println("===== Hasil =====");
        System.out.println("NIM           : " + m.getNim());
        System.out.println("Nama          : " + m.getNama());
        System.out.println("Nilai Afektif : " + m.getNilai_afektif());
        System.out.println("Nilai Tugas   : " + m.getNilai_tugas());
        System.out.println("Nilai UTS     : " + m.getNilai_uts());
        System.out.println("Nilai Sikap   : " + m.getNilai_sikap());
        System.out.println("Nilai UAS     : " + m.getNilai_uas());
        System.out.printf("Nilai Akhir   : %.2f\n", m.nilai_akhir());
        System.out.println("Nilai Huruf   : " + m.konv_nilai());
        System.out.println("Keterangan    : " +
                (m.isLulus() ? "LULUS" : "TIDAK LULUS"));
    }
}