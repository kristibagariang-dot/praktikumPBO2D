package univ.akademik;

public class Mahasiswa extends Manusia {
    
    // PRIVATE: Hanya bisa diakses di dalam class ini sendiri
    private String kodeRahasia = "MZAHRIR-088";
    
    // DEFAULT (Tanpa modifier): Hanya bisa diakses oleh rekan se-package
    String prodi; 
    
    // PUBLIC: Bisa diakses dari mana saja tanpa batas
    public String nim;

    public Mahasiswa(String nama, String prodi, String nim) {
        super(nama);
        this.prodi = prodi;
        this.nim = nim;
    }

    // Method Public untuk mengakses properti Private (Getter)
    public String getKodeRahasia() {
        return this.kodeRahasia;
    }
}