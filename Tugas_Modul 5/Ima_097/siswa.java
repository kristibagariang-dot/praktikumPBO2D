package siswa;

 import orang.Dosen;
 public class Mahasiswa extends Dosen {
     
     public String kelas;
     public Mahasiswa(String nama,int umur,String matkul,String alamat,String kelas){
         
         super(nama,umur,matkul,alamat);
         this.kelas = kelas;
     }
     public String tampilData(){//method
         
         return "Nama : " + nama +
                "\nUmur : " + getUmur() +
                "\nMatkul : " + matkul +
                "\nkelas : " + kelas;
     }
}
