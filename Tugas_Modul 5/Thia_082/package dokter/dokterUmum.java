package dokter;

/**
 *
 * @author Noor Fathiatul Alea
 */
public final class dokterUmum {
    public String namaDokter;
    public String jadwalPraktek;
    protected String spesialis;
    private String kodeDokter;
    
    public dokterUmum(String namaDokter,String jadwalPraktek, String spesialis,
            String kodeDokter){
        this.namaDokter = namaDokter;
        this.jadwalPraktek = jadwalPraktek;
        this.spesialis = spesialis;
        this.kodeDokter = kodeDokter;
    }
    public String getkodeDokter(){
        return kodeDokter;
    }
    
}
