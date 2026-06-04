package hewan;

public class Hewan {
    public String nama;
    protected int umur;
    private double berat;

    public Hewan(String nama, int umur, double berat) {
        this.nama = nama;
        this.umur = umur;
        this.berat = berat;
    }

    public void tampilInfo() {
        System.out.println("Nama Hewan : " + nama);
        System.out.println("Umur       : " + umur);
        System.out.println("Berat      : " + berat);
    }
}