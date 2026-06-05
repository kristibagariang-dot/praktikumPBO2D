package pasien;

/**
 *
 * @author Noor Fathiatul Alea
 */
public class rawatInap extends dataPasien {
    public int nomorKamar;
    public String lamaMenginap;
    protected String tipeKamar;
    private int biaya;
    
    public rawatInap(String namaPasien,int umur, String nomorBPJS,String penyakit, 
            int nomorKamar, String lamaMenginap, String tipeKamar, int biaya){
        super(namaPasien, umur, nomorBPJS, penyakit);
        this.nomorKamar = nomorKamar;
        this.lamaMenginap = lamaMenginap;
        this.tipeKamar = tipeKamar;
        this.biaya = biaya;
    }
    public int getbiaya(){
        return biaya;
    }
}
