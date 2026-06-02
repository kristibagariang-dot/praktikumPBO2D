import java.util.Scanner;
            
public class MahasiswaUser {

  private String nim,nama;
  private double nilai_afektif,nilai_tugas,nilai_uts,
          nilai_sikap,nilai_uas;

  public String getNim(){ 
    return nim;
  } 

  public void setNim(String nim){ 
    this.nim = nim; 
  } 

  public String getNama(){ 
    return nama;
  } 

  public void setNama(String nama){ 
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

  // menghitung nilai akhir
  public double nilai_akhir(){
      return (nilai_afektif * 0.15)+
             (nilai_tugas * 0.25)+ 
             (nilai_uts * 0.30)+
             (nilai_sikap * 0.10)+
             (nilai_uas * 0.30);
  }

  // konversi nilai
  public String konv_nilai(){
      double na = nilai_akhir();
      if(na >= 80)
          return "A";
      else if(na >= 75)
          return "B+";
      else if(na >= 70)
          return "B";
      else if(na >= 65)                   
          return "C+";                             
      else if(na >= 60)
          return "C";
      else if(na >= 55)
          return "D+";
      else if(na >= 30)
          return "D";
      else 
          return "E";
  }

  // cek lulus
  public boolean isLulus(){       
     String huruf = konv_nilai();         
     return huruf.equals("A")||huruf.equals("B")||
        huruf.equals("C+")|| huruf.equals("C");
  } 

  public static void main(String[] args) {

      try (Scanner input = new Scanner(System.in)) {
          MahasiswaUser m = new MahasiswaUser();
          
          System.out.println("===== INPUT DATA MAHASISWA =====");
          //            
          System.out.print("Masukkan NIM           : ");
          m.setNim(input.nextLine());
          
          System.out.print("Masukkan Nama          : ");
          m.setNama(input.nextLine());
          
          System.out.print("Masukkan Nilai Afektif : ");
          m.setNilai_afektif(input.nextDouble());
          
          System.out.print("Masukkan Nilai Tugas   : ");
          m.setNilai_tugas(input.nextDouble());
          
          System.out.print("Masukkan Nilai UTS     : ");
          m.setNilai_uts(input.nextDouble());
          
          System.out.print("Masukkan Nilai Sikap   : ");
          m.setNilai_sikap(input.nextDouble());
          
          System.out.print("Masukkan Nilai UAS     : ");
          m.setNilai_uas(input.nextDouble());
          
          System.out.println("\n===== HASIL =====");
          System.out.println("NIM          : " + m.getNim());
          System.out.println("Nama         : " + m.getNama());
          System.out.printf("Nilai Afektif : %.0f\n",m.getNilai_afektif());
          System.out.printf("Nilai Tugas   : %.0f\n",m.getNilai_tugas());
          System.out.printf("Nilai UTS     : %.0f\n",m.getNilai_uts());
          System.out.printf("Nilai Sikap   : %.0f\n",m.getNilai_sikap());
          System.out.printf("Nilai UAS     : %.0f\n",m.getNilai_uas());
          System.out.printf("Nilai Akhir  : %.0f\n",m.nilai_akhir());
          System.out.println("Nilai Huruf  : " + m.konv_nilai());
          System.out.println("Keterangan   : " +
                  (m.isLulus() ? "LULUS" : "TIDAK LULUS"));
      }
  }
}
