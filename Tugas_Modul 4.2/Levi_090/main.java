import java.util.Scanner; // Mengimpor class Scanner untuk input dari user
// Interface Phone (sebagai blueprint)
interface Phone {
    int MAX_VOLUME = 100; // konstanta volume maksimum
    int MIN_VOLUME = 0;   // konstanta volume minimum

    void powerOn();    // method untuk menyalakan HP
    void powerOff();   // method untuk mematikan HP
    void volumeUp();   // method untuk menambah volume
    void volumeDown(); // method untuk mengurangi volume
}
// Class PhoneUser sebagai pengguna HP
class PhoneUser {
    private Phone phone; // objek phone (menggunakan interface)
    // Constructor untuk menghubungkan user dengan phone
    public PhoneUser(Phone phone) {
        this.phone = phone;
    }
    // Method untuk menyalakan HP
    void turnOnThePhone() {
        this.phone.powerOn();
    }
    // Method untuk mematikan HP
    void turnOffThePhone() {
        this.phone.powerOff();
    }
    // Method untuk menaikkan volume
    void makePhoneLouder() {
        this.phone.volumeUp();
    }
    // Method untuk menurunkan volume
    void makePhoneSilent() {
        this.phone.volumeDown();
    }
}
// Class Infinix yang mengimplementasikan interface Phone
class Infinix implements Phone {
    private int volume;       // menyimpan nilai volume
    private boolean isPowerOn; // status HP (nyala/mati)
    // Constructor (nilai awal volume 50)
    public Infinix() {
        this.volume = 50;
    }
    // Implementasi method powerOn
    @Override
    public void powerOn() {
        isPowerOn = true; // ubah status jadi nyala
        System.out.println("Handphone menyala...");
        System.out.println("Selamat datang di INFINIX");
        System.out.println("Android version 10");
    }
    // Implementasi method powerOff
    @Override
    public void powerOff() {
        isPowerOn = false; // ubah status jadi mati
        System.out.println("Handphone dimatikan");
    }
    // Implementasi method volumeUp
    @Override
    public void volumeUp() {
        if (isPowerOn) { // cek apakah HP menyala
            if (this.volume == MAX_VOLUME) { // jika volume sudah maksimal
                System.out.println("Volume Full!");
                System.out.println("Sudah " + this.getVolume() + "%");
            } else {
                this.volume += 10; // tambah volume 10
                System.out.println("Volume sekarang: " + this.getVolume());
            }
        } else {
            System.out.println("Nyalakan dulu HP-nya!!"); // jika HP mati
        }
    }
    // Implementasi method volumeDown
    @Override
    public void volumeDown() {
        if (isPowerOn) { // cek apakah HP menyala
            if (this.volume == MIN_VOLUME) { // jika volume sudah minimum
                System.out.println("Volume 0%");
            } else {
                this.volume -= 10; // kurangi volume 10
                System.out.println("Volume sekarang: " + this.getVolume());
            }
        } else {
            System.out.println("Nyalakan dulu HP-nya!!"); // jika HP mati
        }
    }
    // Method untuk mengambil nilai volume
    public int getVolume() {
        return this.volume;
    }
}
// Class utama (Main)
public class main {
    public static void main(String[] args) {
        Phone infinix = new Infinix(); // membuat objek Infinix
        PhoneUser user = new PhoneUser(infinix); // menghubungkan user dengan HP

        Scanner input = new Scanner(System.in); // membuat scanner untuk input
        String aksi; // variabel untuk menyimpan pilihan user

        // perulangan menu
        while (true) {
            System.out.println("=== APLIKASI INTERFACE ===");
            System.out.println("[1] Nyalakan HP");
            System.out.println("[2] Matikan HP");
            System.out.println("[3] Perbesar Volume");
            System.out.println("[4] Kecilkan Volume");
            System.out.println("[0] Keluar");
            System.out.println("--------------------------");
            System.out.print("Pilih aksi > ");
            
            aksi = input.nextLine(); // membaca input user

            // percabangan berdasarkan input
            if (aksi.equalsIgnoreCase("1")) {
                user.turnOnThePhone(); // panggil method nyalakan HP
            } else if (aksi.equalsIgnoreCase("2")) {
                user.turnOffThePhone(); // panggil method matikan HP
            } else if (aksi.equalsIgnoreCase("3")) {
                user.makePhoneLouder(); // panggil method volume up
            } else if (aksi.equalsIgnoreCase("4")) {
                user.makePhoneSilent(); // panggil method volume down
            } else if (aksi.equalsIgnoreCase("0")) {
                System.exit(0); // keluar program
            } else {
                System.out.println("Kamu memilih aksi yang salah!"); // jika input tidak valid
            }
        }
    }
}
