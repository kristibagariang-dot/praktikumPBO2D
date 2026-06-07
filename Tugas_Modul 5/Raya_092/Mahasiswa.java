package manusia;

public class Mahasiswa {

    // public modifier
    public String nama = "Raya";

    // private modifier
    private int umur = 20;

    // protected modifier
    protected String jurusan = "Informatika";

    // default modifier
    String alamat = "Surabaya";

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
}
