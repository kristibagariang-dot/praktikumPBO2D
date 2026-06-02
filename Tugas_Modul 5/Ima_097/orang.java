package orang;

public class Dosen {
    
 public String nama;
 private int umur;
 protected String matkul;
 String alamat;
 
 public Dosen(String nama, int umur, String matkul, String alamat){//untuk mengisi atribut otoomatis saat objekdibuat
    this.nama = nama;
    this.umur = umur;
    this.matkul = matkul;
    this.alamat = alamat;
}
 public int getUmur(){//get(agar class lain bisa melihat umur)
     return umur;
 }
}
