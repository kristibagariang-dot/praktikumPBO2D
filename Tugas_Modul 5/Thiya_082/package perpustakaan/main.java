package perpustakaan;
import kampus.*;
import akademik.*;
/**
 *
 * @author Noor Fathiatul Alea
 */
public class main {
    public static void main(String[] args) {
        //objek dosen
        dosen dsn = new dosen("pak Budi", "PBO");
        //objek mahasiswa
        mahasiswa mhs = new mahasiswa("Alea","131313",19,"informatika");
        //objek jadwal
        jadwal j = new jadwal("senin", "13.00-15.30","208");
        //objek nilai
        nilai n = new nilai("PBO",90,"2",20);
        //objek buku
        buku b = new buku("java", 10, "pemrograman", 2024);
        
        //public bisa diakses
        System.out.println("Nama Dosen      : " +dsn.namaDosen);
        System.out.println("Nama Mahasiswa  : " +mhs.nama);
        System.out.println("Hari            : " +j.hari);
        System.out.println("Mata Kuliah     : " +n.mataKuliah);
        System.out.println("Buku            : " +b.judul);
        //access private memakai method getter
        System.out.println("Password        : " +mhs.getpassword());
        System.out.println("Nilai Akhir     : " +n.getnilaiAkhir());
        System.out.println("Stok            : " +b.getStok());
        
        //default dan protected akan error jika dipanggil
        //System.out.println("Matkul        : " +dsn.matkul);
        //System.out.println("umur mahasiswa: " +mhs.umur);
        //System.out.println("jurusan       : " +mhs.jurusan);
        //System.out.println("waktu         : " +j.jam);
        //System.out.println("Ruang         : " +j.ruang);
        //System.out.println("Semester      : " +n.semester);
        //System.out.println("SKS           : " +n.sks);
    }
}
