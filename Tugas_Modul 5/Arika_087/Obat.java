package pelayanan;

public final class Obat {

    // final
    public final String namaObat = "Paracetamol";

    // private
    private int harga = 5000;

    public void tampilObat() {

        System.out.println("Obat         : " + namaObat);
        System.out.println("Harga Obat   : " + harga);
    }
}
