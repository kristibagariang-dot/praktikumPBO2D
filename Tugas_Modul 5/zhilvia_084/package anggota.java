package anggota;

public class Orang {

    public String nama = "Zhilvia";      // public
    private int umur = 20;              // private
    protected String alamat = "Surabaya"; // protected
    String hobi = "Membaca";            // default

    public int getUmur() {
        return umur;
    }
}
