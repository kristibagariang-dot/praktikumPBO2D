package nama1;

public class Mahasiswa {

    // public
    public String nama = "Rama";

    // private
    private int umur = 19;

    // protected
    protected String jurusan = "Informatika";

    // default
    String alamat = "Sumenep";

    // method public
    public void tampilPublic() {
        System.out.println("Public : " + nama);
    }

    // method private
    private void tampilPrivate() {
        System.out.println("Private : " + umur);
    }

    // method protected
    protected void tampilProtected() {
        System.out.println("Protected : " + jurusan);
    }

    // method default
    void tampilDefault() {
        System.out.println("Default : " + alamat);
    }

    // akses private
    public void aksesPrivate() {
        tampilPrivate();
    }
}
