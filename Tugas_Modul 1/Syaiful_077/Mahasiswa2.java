import java.util.Scanner;

public class mahasiswa2 {
    // Menyimpan data teks mahasiswa
    private final String nim, nama;
    // Menggunakan array untuk mengelompokkan nilai: [afektif, tugas, uts, sikap, uas]
    private final double[] nilai = new double[5];
    // Menyimpan bobot persen masing-masing nilai secara berurutan
    private final double[] bobot = {0.15, 0.25, 0.30, 0.10, 0.30};

    // Konstruktor menerima parameter dan langsung memasukkannya ke dalam array 'nilai'
    public mahasiswa2(String nim, String nama, double afektif, double tugas, double uts, double sikap, double uas) {
        this.nim = nim;
        this.nama = nama;
        this.nilai[0] = afektif;
        this.nilai[1] = tugas;
        this.nilai[2] = uts;
        this.nilai[3] = sikap;
        this.nilai[4] = uas;
    }

    // Menghitung total nilai menggunakan perulangan FOR loop agar lebih ringkas
    public double nilai_akhir() {
        double total = 0;
        for (int i = 0; i < nilai.length; i++) {
            total += nilai[i] * bobot[i];
        }
        return total;
    }

    // Menggunakan Operator Ternary tunggal sebagai pengganti blok if-else bertingkat
    public String konv_nilai() {
        double na = nilai_akhir();
        return (na >= 80) ? "A"  : (na >= 75) ? "B+" : (na >= 70) ? "B"  : 
               (na >= 65) ? "C+" : (na >= 60) ? "C"  : (na >= 55) ? "D+" : 
               (na >= 30) ? "D"  : "E";
    }

    // Logika Kelulusan disederhanakan: jika nilai akhir mencapai angka 60 ke atas, otomatis lulus
    public boolean isLulus() {
        return nilai_akhir() >= 60;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Menampung input teks
        System.out.print("Masukkan NIM            : ");
        String nim = input.nextLine();

        System.out.print("Masukkan Nama           : ");
        String nama = input.nextLine();

        // Menggunakan array lokal untuk menampung input angka secara berurutan lewat perulangan
        String[] label = {"Afektif", "Tugas  ", "UTS    ", "Sikap  ", "UAS    "};
        double[] inputNilai = new double[5];
        
        for (int i = 0; i < label.length; i++) {
            System.out.print("Masukkan Nilai " + label[i] + "  : ");
            inputNilai[i] = input.nextDouble();
        }

        // Inisialisasi objek dengan memecah isi array inputNilai
        mahasiswa2 mhs = new mahasiswa2(nim, nama, inputNilai[0], inputNilai[1], inputNilai[2], inputNilai[3], inputNilai[4]);

        // Menampilkan output hasil akhir program
        System.out.println("\n===== HASIL =====");
        System.out.println("NIM           : " + mhs.nim);
        System.out.println("Nama          : " + mhs.nama);
        System.out.println("Nilai Akhir   : " + mhs.nilai_akhir());
        System.out.println("Nilai Huruf   : " + mhs.konv_nilai());
        System.out.println("Keterangan    : " + (mhs.isLulus() ? "LULUS" : "TIDAK LULUS"));

        input.close();
    }
}

