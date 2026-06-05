package kampus;

/**
 *
 * @author Noor Fathiatul Alea
 */
public class mahasiswa {
    public String nama;
    private String password;
    int umur;
    protected String jurusan;
    
    public mahasiswa(String nama, String password, int umur, String jurusan){
        this.nama = nama;
        this.password = password;
        this.umur = umur;
        this.jurusan = jurusan;
    }
    public String getpassword(){
        return password;
    }
}

