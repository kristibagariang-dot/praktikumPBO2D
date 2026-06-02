/**
 *
 * @author Noor Fathiatul Alea
 */
class Pegawai {
    protected String nik;
    protected String nama;
    protected int kehadiran;
    protected int gaji;  
    
    public void setData(String nik,String nama,int kehadiran,int gaji ){
        this.nik = nik;
        this.nama = nama;
        this.kehadiran = kehadiran;
        this.gaji = gaji;
    }
    public int rekapGaji(){
        return 0;
    }
    public void tampilData(){
        System.out.println("Data pegawai");
    }
}
class PegawaiKontrak extends Pegawai{
    int masaKontrak;
    int uangMakan;
    
    PegawaiKontrak(String nik,String nama,int kehadiran,int gaji,int masaKontrak){
        super.setData(nik, nama, kehadiran, gaji);
        this.masaKontrak = masaKontrak;
    }
    @Override
    public int rekapGaji(){
        uangMakan = 15000*kehadiran;
        return uangMakan + gaji;
    }
    @Override
    public void tampilData(){
        System.out.println("NIK: " + nik);
        System.out.println("Nama: " + nama);
        System.out.println("Kehadiran: " + kehadiran);
        System.out.println("Masa Kontrak: " + masaKontrak);
        System.out.println("Gaji Bersih: " + rekapGaji());
    }
}
class  PegawaiTetap extends Pegawai{
    int tunjangan = 630000;
    int uangMakan;
    
    PegawaiTetap (String nik,String nama,
            int kehadiran,int gaji){
        super.setData(nik, nama, kehadiran, gaji);
    }
    @Override
    public int rekapGaji(){
        uangMakan = 15000*kehadiran;
        return tunjangan + uangMakan + gaji;
    }
    @Override
    public void tampilData(){
        System.out.println("NIK: " + nik);
        System.out.println("Nama: " + nama);
        System.out.println("Kehadiran: " + kehadiran);
        System.out.println("Tunjangan: " + tunjangan);
        System.out.println("Gaji Bersih: " + rekapGaji());
    }
}
public class latihan{
    public static void main(String[] args) {
        Pegawai p;
        
        p = new PegawaiKontrak("001", "Budi",20,3000000,6);
        p.tampilData();
        System.out.println();
        
        p = new PegawaiTetap("0002","andi",22,4000000);
        p.tampilData();
        System.out.println();
    }
}
