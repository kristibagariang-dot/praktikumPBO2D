package matkul;

public class pai {

    public String dosen = "Pak Ahmad";

    private int sks = 3;

    protected String ruangan = "Lab Komputer";

    String hari = "Senin";

    public void tampilPublic() {
        System.out.println("Dosen : " + dosen);
    }

    private void tampilPrivate() {
        System.out.println("SKS : " + sks);
    }

    protected void tampilProtected() {
        System.out.println("Ruangan : " + ruangan);
    }

    void tampilDefault() {
        System.out.println("Hari : " + hari);
    }

    public void aksesPrivate() {
        tampilPrivate();
    }
}
