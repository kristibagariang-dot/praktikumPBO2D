import java.util.Scanner; // mengimpor Scanner untuk input dari user

// Interface Phone
interface Phone {
    int MAX_VOLUME = 100; // konstanta volume maksimal
    int MIN_VOLUME = 0;   // konstanta volume minimal

    void powerOn();   // method untuk menyalakan HP
    void powerOff();  // method untuk mematikan HP
    void volumeUp();  // method untuk menaikkan volume
    void volumeDown();// method untuk menurunkan volume
}

// Class sebagai pengontrol HP
class PhoneUser {
    private Phone phone; // objek dari interface Phone

    // constructor untuk mengisi objek phone
    public PhoneUser(Phone phone) {
        this.phone = phone;
    }

    void turnOnThePhone() {
        this.phone.powerOn(); // memanggil method powerOn
    }

    void turnOffThePhone() {
        this.phone.powerOff(); // memanggil method powerOff
    }

    void makePhoneLouder() {
        this.phone.volumeUp(); // memanggil method volumeUp
    }

    void makePhoneSilent() {
        this.phone.volumeDown(); // memanggil method volumeDown
    }
}

// Class Realme sebagai implementasi interface Phone
class Realme implements Phone {
    private int volume;       // variabel untuk menyimpan volume
    private boolean isPowerOn; // status HP (true = hidup, false = mati)

    // constructor
    public Realme() {
        this.volume = 50; // volume awal
    }

    // implementasi method powerOn
    public void powerOn() {
        isPowerOn = true; // HP dinyalakan
        System.out.println("Handphone menyala...");
        System.out.println("Selamat datang di REALME");
        System.out.println("Android version 10");
    }

    // implementasi method powerOff
    public void powerOff() {
        isPowerOn = false; // HP dimatikan
        System.out.println("Handphone dimatikan");
    }

    // implementasi method volumeUp
    public void volumeUp() {
        if (isPowerOn) { // cek apakah HP menyala
            if (this.volume == MAX_VOLUME) { // jika volume maksimal
                System.out.println("Volume full");
                System.out.println("Sudah " + this.getVolume() + "%");
            } else {
                this.volume += 10; // menambah volume
                System.out.println("Volume sekarang: " + this.getVolume());
            }
        } else {
            System.out.println("Nyalakan dulu donk HP-nya!!"); // jika HP mati
        }
    }

    // implementasi method volumeDown
    public void volumeDown() {
        if (isPowerOn) { // cek apakah HP menyala
            if (this.volume == MIN_VOLUME) { // jika volume minimum
                System.out.println("Volume = 0%");
            } else {
                this.volume -= 10; // mengurangi volume
                System.out.println("Volume sekarang: " + this.getVolume());
            }
        } else {
            System.out.println("Nyalakan dulu donk HP-nya!!"); // jika HP mati
        }
    }

    // method untuk mengambil nilai volume
    public int getVolume() {
        return this.volume;
    }
}

// Class utama
class Main2 {
    public static void main(String[] args) {

        Phone Realme = new Realme(); // membuat objek Realme
        PhoneUser naifah = new PhoneUser(Realme); // membuat objek user

        naifah.turnOnThePhone(); // menyalakan HP saat awal program

        Scanner input = new Scanner(System.in); // membuat scanner
        String aksi; // variabel untuk menyimpan pilihan user

        while (true) { // perulangan menu
            System.out.println("=== APLIKASI INTERFACE ===");
            System.out.println("[1] Nyalakan HP");
            System.out.println("[2] Matikan HP");
            System.out.println("[3] Perbesar Volume");
            System.out.println("[4] Kecilkan Volume");
            System.out.println("[0] Keluar");

            System.out.print("Pilih aksi: ");
            aksi = input.nextLine(); // membaca input user

            if (aksi.equalsIgnoreCase("1")) {
                naifah.turnOnThePhone(); // aksi menyalakan HP
            } else if (aksi.equalsIgnoreCase("2")) {
                naifah.turnOffThePhone(); // aksi mematikan HP
            } else if (aksi.equalsIgnoreCase("3")) {
                naifah.makePhoneLouder(); // aksi menaikkan volume
            } else if (aksi.equalsIgnoreCase("4")) {
                naifah.makePhoneSilent(); // aksi menurunkan volume
            } else if (aksi.equalsIgnoreCase("0")) {
                System.exit(0); // keluar dari program
            } else {
                System.out.println("Kamu memilih aksi yang salah!"); // input tidak valid
            }
        }
    }
}
