import java.util.Scanner;
public class Tugas2PBO {
    private String nim;
    private String nama;
    private double nilai_afektif;
    private double nilai_tugas;
    private double nilai_uts;
    private double nilai_sikap;
    private double nilai_uas;
    
    public Tugas2PBO(String nim, String nama, double nilai_afektif,
                     double nilai_tugas, double nilai_uts,
                     double nilai_sikap, double nilai_uas) {
        this.nim = nim;
        this.nama = nama;
        this.nilai_afektif = nilai_afektif;
        this.nilai_tugas = nilai_tugas;
        this.nilai_uts = nilai_uts;
        this.nilai_sikap = nilai_sikap;
        this.nilai_uas = nilai_uas;
    }
    public double nilai_akhir() {
        return (nilai_afektif * 0.15) + (nilai_tugas * 0.25) +
               (nilai_uts * 0.30) + (nilai_sikap * 0.10) + (nilai_uas * 0.30);
    }
    public String konv_nilai() {
        double NA = nilai_akhir();
        if (NA >= 80) return "A";
        else if (NA >= 75) return "B+"; 
        else if (NA >= 70) return "B";
        else if (NA >= 65) return "C+";
        else if (NA >= 60) return "C";
        else if (NA >= 55) return "D+";
        else if (NA >= 30) return "D";
        else return "E";
    }
    
    public boolean isLulus() {
        String huruf = konv_nilai();
        return huruf.equals("A") || huruf.equals("B+") || huruf.equals("B")
                || huruf.equals("C+") || huruf.equals("C");
    }

    public void tampilData() {
        System.out.println("NIM          : " + nim);
        System.out.println("Nama         : " + nama);
        System.out.println("Nilai Akhir  : " + nilai_akhir());
        System.out.println("Nilai Huruf  : " + konv_nilai());
        System.out.println("Keterangan   : " + (isLulus() ? "LULUS" : "TIDAK LULUS"));
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan NIM          : ");
        String nim = input.nextLine();
        
        System.out.print("Masukkan Nama         : ");
        String nama = input.nextLine();
        
        System.out.print("Masukkan Nilai Afektif: ");
        double nAfektif = input.nextDouble();
        
        System.out.print("Masukkan Nilai Tugas  : ");
        double nTugas = input.nextDouble();
        
        System.out.print("Masukkan Nilai UTS    : ");
        double nUTS = input.nextDouble();
        
        System.out.print("Masukkan Nilai Sikap  : ");
        double nSikap = input.nextDouble();
  
        System.out.print("Masukkan Nilai UAS    : ");
        double nUAS = input.nextDouble();
        
        Tugas1PBO mhs = new Tugas1PBO(nim, nama,nAfektif,nTugas,nUTS,nSikap,nUAS);
        mhs.tampilData();
        
        input.close(); 
    }
}
