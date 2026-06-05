package pasien;

/**
 *
 * @author Noor Fathiatul Alea
 */
public class dataPasien {
    public String namaPasien;
    public int umur;
    private String nomorBPJS;
    protected String penyakit;
    
    public dataPasien(String namaPasien,int umur, String nomorBPJS,String penyakit){
        this.namaPasien = namaPasien;
        this.umur = umur;
        this.nomorBPJS = nomorBPJS;
        this.penyakit = penyakit;
    }
    public String getnomorBPJS(){
        return nomorBPJS;
    }
}
