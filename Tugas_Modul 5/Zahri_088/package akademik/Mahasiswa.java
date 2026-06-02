package akademik;

public class Mahasiswa {
    
    private String nim;

    public String namaMahasiswa;

    protected double ipkMinimal; 

    public Mahasiswa(String nim, String namaMahasiswa, double ipkMinimal) {
        this.nim = nim;
        this.namaMahasiswa = namaMahasiswa;
        this.ipkMinimal = ipkMinimal;
    }

    public String getNim() {
        return nim;
    }
}