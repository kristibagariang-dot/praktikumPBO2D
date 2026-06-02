/**
 *
 * @author Noor Fathiatul Alea
 */
import java.util.Scanner;

public class Mahasiswa {
    private String nim, nama;
    private double nilaiAfektif, nilaiTugas, nilaiUTS, 
            nilaiSikap, nilaiUAS;
    
    public void setData(String nim, String nama, 
            double nilaiAfektif, double nilaiTugas, 
            double nilaiUTS, double nilaiSikap, double nilaiUAS){
    this.nim = nim;
    this.nama = nama;
    this.nilaiAfektif = nilaiAfektif;
    this.nilaiTugas = nilaiTugas;
    this.nilaiUTS = nilaiUTS;
    this.nilaiSikap = nilaiSikap;
    this.nilaiUAS= nilaiUAS;
    }
    public double nilaiAkhir(){
        return(nilaiAfektif*0.15)+(nilaiTugas*0.25)+(nilaiUTS*0.30)
                +(nilaiSikap*0.10)+(nilaiUAS*0.30);
    }
    public String konvNilai(){
        double na = nilaiAkhir();
        if(na >=80)
            return"A";
        else if(na>=75)
            return"B+";
        else if(na>=70)
            return"B";
        else if(na>=65)
            return"C+";
        else if(na>=60)
            return"C";
        else if(na>=55)
            return"D+";
        else if(na>=30)
            return"D";
        else
            return"E";
        
    }
    public boolean isLulus(){
        String huruf = konvNilai();
        if(huruf.equals("A")||
           huruf.equals("B+")||
           huruf.equals("B")||
           huruf.equals("C+")||
           huruf.equals("C")){
            return true;
        }else{
            return false;
        }      
    }
    public void tampilData(){
        System.out.println("HASIL DATA MAHASISWA");
        System.out.println("NIM            : "+nim);
        System.out.println("Nama           : "+nama);
        System.out.println("Nilai akhir    : "+nilaiAkhir()); 
        System.out.println("Nilai huruf    : "+konvNilai());
        System.out.println("keterangan     : "+(isLulus()? 
                 "LULUS" : "TIDAK LULUS"));
     }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Mahasiswa m2 = new Mahasiswa();
        System.out.println("INPUT DATA MAHASISWA");
        System.out.print("masukkan NIM : ");
        String nim = input.nextLine();
        System.out.print("masukkan nama : ");
        String nama = input.nextLine();
        System.out.print("masukkan nilai afektif : ");
        double Afektif = input.nextDouble();
        System.out.print("masukkan nilai tugas : ");
        double tugas = input.nextDouble();
        System.out.print("masukkan nilai UTS : ");
        double UTS = input.nextDouble();
        System.out.print("masukkan nilai sikap : ");
        double sikap = input.nextDouble();
        System.out.print("masukkan nilai UAS : ");
        double UAS = input.nextDouble();
        
        m2.setData(nim, nama, Afektif, tugas, UTS, sikap, UAS);
        System.out.println("HASIL DATA MAHASISWA");
        m2.tampilData();
        }  
        
       
    }
