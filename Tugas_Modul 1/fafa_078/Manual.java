public class Manual {
    public static void main(String[] args) {

        Mahasiswa m = new Mahasiswa();

        m.nim = "250631100078";
        m.nama = "MUHAMMAD FAWAZUL HAQ";
        m.nilai_afektif = 80;
        m.nilai_tugas = 95;
        m.nilai_uts = 80;
        m.nilai_sikap = 90;
        m.nilai_uas = 95;

        System.out.println("NIM : " + m.nim);
        System.out.println("Nama : " + m.nama);
        System.out.println("Nilai Akhir : " + m.nilai_akhir());
        System.out.println("Nilai Huruf : " + m.konv_nilai());
        System.out.println("Keterangan : " + m.isLulus());
    }
}

