package perpustakaan;

/**
 *
 * @author Noor Fathiatul Alea
 */
public class buku {
    public String judul;
    private int stok;
    protected String kategori;
    int tahun;
    
    public buku(String judul, int stok, String kategori, int tahun){
        this.judul = judul;
        this.stok = stok;
        this.kategori = kategori;
        this.tahun = tahun;
    }
    public int getStok(){
        return stok;
    }
}
