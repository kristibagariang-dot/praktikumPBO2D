package data;

/*@author Taufiq*/
public class Mahasiswa {
    public String nama;          
    private int umur;            
    protected String jurusan;    
    String alamat;               

    public Mahasiswa(String nama, int umur, String jurusan, String alamat) {
        this.nama = nama;
        this.umur = umur;
        this.jurusan = jurusan;
        this.alamat = alamat;
    }
    public int getUmur() {
        return umur;
    }
    public void tampilData() {
        System.out.println("Nama     : " + nama);
        System.out.println("Umur     : " + umur);
        System.out.println("Jurusan  : " + jurusan);
        System.out.println("Alamat   : " + alamat);
    }
} 
