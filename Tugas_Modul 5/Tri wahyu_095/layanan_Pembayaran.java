package layanan;

public class Pembayaran {

    public final int biayaPerHari = 500000;

    public void totalBayar(int lamaInap) {

        int total = biayaPerHari * lamaInap;

        System.out.println("\n=== PEMBAYARAN ===");
        System.out.println("Biaya per Hari : " + biayaPerHari);
        System.out.println("Total Bayar    : " + total);
    }
}
