package akademik;

/**
 *
 * @author Noor Fathiatul Alea
 */
public class nilai {
    public String mataKuliah;
    private int nilaiAkhir;
    protected String semester;
    int sks;
    
    public nilai(String mataKuliah, int nilaiAkhir, String semester, int sks){
        this.mataKuliah = mataKuliah;
        this.nilaiAkhir = nilaiAkhir;
        this.semester = semester;
        this.sks = sks;
    }
    public int getnilaiAkhir(){
        return nilaiAkhir;
    }
}
