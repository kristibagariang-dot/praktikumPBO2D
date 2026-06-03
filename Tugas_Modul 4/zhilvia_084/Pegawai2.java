import java.util.Scanner;
class Transaksi {
    String nama;
    String nis;

    Transaksi(String nama, String nis) {
        this.nama = nama;
        this.nis = nis;
    }

    void tampilData() {
        System.out.println("Nama Siswa : " + nama);
        System.out.println("NIS        : " + nis);
    }

    // Polymorphism (akan dioverride)
    int hitungTotal() {
        return 0;
    }
}
class PembayaranSPP extends Transaksi {
    String bulan;
    int biayaPokok;
    int denda = 0;
    final int admin = 5000;

    PembayaranSPP(String nama, String nis, String bulan, 
            int biayaPokok, int tanggalBayar) {
        super(nama, nis);
        this.bulan = bulan;
        this.biayaPokok = biayaPokok;

        // Kondisi denda
        if (tanggalBayar > 10) {
            denda = 15000;
        }
    }

    // Override (Modul 3 - Polymorphism)
    @Override
    int hitungTotal() {
        return biayaPokok + admin + denda;
    }

    void tampilSPP() {
        tampilData();
        System.out.println("Bulan      : " + bulan);
        System.out.println("Biaya Pokok: " + biayaPokok);
        System.out.println("Denda      : " + denda);
        System.out.println("Admin      : " + admin);
        System.out.println("Total Bayar: " + hitungTotal());
    }
}
class PembayaranSeragam extends Transaksi {
    String ukuran;
    int hargaDasar;
    int tambahanUkuran = 0;
    final int admin = 5000;

    PembayaranSeragam(String nama, String nis, 
            String ukuran, int hargaDasar) {
        super(nama, nis);
        this.ukuran = ukuran;
        this.hargaDasar = hargaDasar;

        // Tambahan ukuran XL
        if (ukuran.equalsIgnoreCase("XL")) {
            tambahanUkuran = 20000;
        }
    }

    @Override
    int hitungTotal() {
        return hargaDasar + tambahanUkuran + admin;
    }

    void tampilSeragam() {
        tampilData();
        System.out.println("Ukuran     : " + ukuran);
        System.out.println("Harga Dasar: " + hargaDasar);
        System.out.println("Tambahan   : " + tambahanUkuran);
        System.out.println("Admin      : " + admin);
        System.out.println("Total Bayar: " + hitungTotal());
    }
}

 class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== LOGIN SISTEM ===");
        System.out.print("Masukkan ID: ");
        String id = input.nextLine();

        System.out.print("Masukkan Password: ");
        String password = input.nextLine();

        String adminID = "admin";
        String adminPass = "12345";

        boolean isAdmin = false;

        // CEK LOGIN
        if (id.equals(adminID) && password.equals(adminPass)) {
            isAdmin = true;
            System.out.println("Login Admin Berhasil!\n");
        } else {
            System.out.println("Login User (Siswa)\n");
        }

        // INPUT DATA SISWA
        System.out.print("Nama: ");
        String nama = input.nextLine();

        System.out.print("NIS: ");
        String nis = input.nextLine();

        System.out.println("\n1. Pembayaran SPP");
        System.out.println("2. Pembayaran Seragam");
        System.out.print("Pilih: ");
        int pilih = input.nextInt();

        if (pilih == 1) {
            input.nextLine();
            System.out.print("Bulan: ");
            String bulan = input.nextLine();

            System.out.print("Biaya Pokok: ");
            int biaya = input.nextInt();

            System.out.print("Tanggal Bayar: ");
            int tanggal = input.nextInt();

            PembayaranSPP spp = new PembayaranSPP(nama, nis, 
                    bulan, biaya, tanggal);
            System.out.println("\n=== RINCIAN SPP ===");
            spp.tampilSPP();

        } else if (pilih == 2) {
            input.nextLine();
            System.out.print("Ukuran (S/M/L/XL): ");
            String ukuran = input.nextLine();

            System.out.print("Harga Dasar: ");
            int harga = input.nextInt();

            PembayaranSeragam seragam = new PembayaranSeragam(nama, 
                    nis, ukuran, harga);
            System.out.println("\n=== RINCIAN SERAGAM ===");
            seragam.tampilSeragam();
        }

        // FITUR KHUSUS ADMIN
        if (isAdmin) {
            System.out.println("\n[AKSES ADMIN]");
            System.out.println("Admin bisa mengedit data (simulasi)");
        }
    }
