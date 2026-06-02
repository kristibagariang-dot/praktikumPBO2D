package univ.akademik;

public class IdentitasMM {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa("Moh Zahri Ramadani", "Pendidikan Informatika", "250411100001");

        // === OUTPUT: BUKTI MODIFIER DEFAULT ===
       
        System.out.println("Program Studi Mahasiswa : " + mhs.prodi);
        System.out.println("+----------------------------------------------------------+");
    }
}