package package1;

public class Mahasiswa {

    // public → bisa diakses dari mana saja
    public String nama = "Ari";

    // private → hanya bisa diakses di dalam class ini
    private int umur = 20;

    // protected → bisa diakses package sama & subclass
    protected String jurusan = "Informatika";

    // default → hanya bisa diakses dalam package yang sama
    String kampus = "Universitas ABC";

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
        System.out.println("Default : " + kampus);
    }

    // method untuk memanggil private method
    public void aksesPrivate() {
        tampilPrivate();
    }
}
