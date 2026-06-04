class Mahasiswa {
    String nim;
    String nama;
    int nilaiAfektif;
    int nilaiTugas;
    int nilaiUTS;
    int nilaiSikap;
    int nilaiUAS;

    // Constructor
    Mahasiswa(String nim, String nama, int nilaiAfektif, int nilaiTugas,
              int nilaiUTS, int nilaiSikap, int nilaiUAS) {
        this.nim = nim;
        this.nama = nama;
        this.nilaiAfektif = nilaiAfektif;
        this.nilaiTugas = nilaiTugas;
        this.nilaiUTS = nilaiUTS;
        this.nilaiSikap = nilaiSikap;
        this.nilaiUAS = nilaiUAS;
    }

    void tampilData() {
        System.out.println("NIM            : " + nim);
        System.out.println("Nama           : " + nama);
        System.out.println("Nilai Afektif  : " + nilaiAfektif);
        System.out.println("Nilai Tugas    : " + nilaiTugas);
        System.out.println("Nilai UTS      : " + nilaiUTS);
        System.out.println("Nilai Sikap    : " + nilaiSikap);
        System.out.println("Nilai UAS      : " + nilaiUAS);
    }
}

public class Main {
    public static void main(String[] args) {

        Mahasiswa mhs = new Mahasiswa(
                "250631100080",     
                "Kafilatul Hima",
                80,
                95,
                80,
                90,
                95
        );

        mhs.tampilData();
    }
}