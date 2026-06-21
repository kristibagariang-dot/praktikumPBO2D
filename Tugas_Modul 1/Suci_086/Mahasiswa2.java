class Mahasiswa {

    String nim;
    String nama;
    double nilaiAfektif;
    double nilaiTugas;
    double nilaiUTS;
    double nilaiSikap;
    double nilaiUAS;

    double hitungNilaiAkhir() {
        return (0.1 * nilaiAfektif) +
               (0.2 * nilaiTugas) +
               (0.25 * nilaiUTS) +
               (0.15 * nilaiSikap) +
               (0.3 * nilaiUAS);
    }

    void tampilkanData() {
        System.out.println("NIM          : " + nim);
        System.out.println("Nama         : " + nama);
        System.out.println("Nilai Afektif : " + nilaiAfektif);
        System.out.println("Nilai Tugas   : " + nilaiTugas);
        System.out.println("Nilai UTS     : " + nilaiUTS);
        System.out.println("Nilai Sikap   : " + nilaiSikap);
        System.out.println("Nilai UAS     : " + nilaiUAS);
        System.out.println("Nilai Akhir   : " + hitungNilaiAkhir());
    }
}

class Main {

    public static void main(String[] args) {

        Mahasiswa mhs = new Mahasiswa();

        mhs.nim = "210631100080";
        mhs.nama = "Suci Amalia Mavardani";
        mhs.nilaiAfektif = 80;
        mhs.nilaiTugas = 95;
        mhs.nilaiUTS = 80;
        mhs.nilaiSikap = 90;
        mhs.nilaiUAS = 95;

        mhs.tampilkanData();
    }
}
