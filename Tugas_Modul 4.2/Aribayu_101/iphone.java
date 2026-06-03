import java.util.Scanner; // Mengimpor library Scanner untuk input data dari keyboard

// Interface Phone
interface Phone {

    // Konstanta volume maksimum
    int MAX_VOLUME = 100;

    // Konstanta volume minimum
    int MIN_VOLUME = 0;

    // Method untuk menyalakan HP
    void powerOn();

    // Method untuk mematikan HP
    void powerOff();

    // Method untuk memperbesar volume
    void volumeUp();

    // Method untuk memperkecil volume
    void volumeDown();
}

// Class PhoneUser
class PhoneUser {

    // Membuat objek phone dari interface Phone
    private Phone phone;

    // Constructor PhoneUser
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

    // Method untuk memperbesar volume
    void makePhoneLouder() {
        this.phone.volumeUp();
    }

    // Method untuk memperkecil volume
    void makePhoneSilent() {
        this.phone.volumeDown();
    }
}

// Class Iphone mengimplementasikan interface Phone
class Iphone implements Phone {

    // Variabel volume
    private int volume;

    // Variabel status power
    private boolean isPowerOn;

    // Constructor Iphone
    public Iphone() {

        // Volume awal 50
        this.volume = 50;
    }

    // Method menyalakan HP
    public void powerOn() {
        isPowerOn = true;
        System.out.println("Handphone menyala...");
        System.out.println("Selamat datang di IPHONE");
        System.out.println("IOS Version 17");
    }

    // Method mematikan HP
    public void powerOff() {
        isPowerOn = false;
        System.out.println("Handphone dimatikan");
    }

    // Method memperbesar volume
    public void volumeUp() {

        // Jika HP menyala
        if (isPowerOn) {

            // Jika volume sudah maksimal
            if (this.volume == MAX_VOLUME) {
                System.out.println("Volume full");
                System.out.println("Sudah " + this.getVolume() + "%");
            } else {

                // Menambah volume 10
                this.volume += 10;

                // Menampilkan volume sekarang
                System.out.println("Volume sekarang : " + this.getVolume());
            }

        } else {

            // Jika HP mati
            System.out.println("Nyalakan dulu dong HP-nya!!");
        }
    }

    // Method memperkecil volume
    public void volumeDown() {

        // Jika HP menyala
        if (isPowerOn) {

            // Jika volume minimum
            if (this.volume == MIN_VOLUME) {
                System.out.println("Volume : 0%");
            } else {

                // Mengurangi volume 10
                this.volume -= 10;

                // Menampilkan volume sekarang
                System.out.println("Volume sekarang : " + this.getVolume());
            }

        } else {

            // Jika HP mati
            System.out.println("Nyalakan dulu dong HP-nya!!");
        }
    }

    // Method mengambil nilai volume
    public int getVolume() {
        return this.volume;
    }
}

// Class Main
class Main {

    // Method utama program
    public static void main(String[] args) {

        // Membuat objek Iphone
        Phone iphone = new Iphone();

        // Membuat objek PhoneUser
        PhoneUser fadli = new PhoneUser(iphone);

        // Menyalakan HP
        fadli.turnOnThePhone();

        // Membuat Scanner untuk input
        Scanner input = new Scanner(System.in);

        // Variabel aksi
        String aksi;

        // Perulangan menu
        while (true) {

            // Tampilan menu
            System.out.println("=== APLIKASI INTERFACE ===");
            System.out.println("[1] Nyalakan HP");
            System.out.println("[2] Matikan HP");
            System.out.println("[3] Perbesar Volume");
            System.out.println("[4] Kecilkan Volume");
            System.out.println("[0] Keluar");
            System.out.println("---------------------------");

            // Input pilihan
            System.out.print("Pilih aksi -> ");
            aksi = input.nextLine();

            // Jika pilih 1
            if (aksi.equalsIgnoreCase("1")) {
                fadli.turnOnThePhone();

            // Jika pilih 2
            } else if (aksi.equalsIgnoreCase("2")) {
                fadli.turnOffThePhone();

            // Jika pilih 3
            } else if (aksi.equalsIgnoreCase("3")) {
                fadli.makePhoneLouder();

            // Jika pilih 4
            } else if (aksi.equalsIgnoreCase("4")) {
                fadli.makePhoneSilent();

            // Jika pilih 0
            } else if (aksi.equalsIgnoreCase("0")) {
                System.exit(0);

            // Jika input salah
            } else {
                System.out.println("Kamu memilih aksi yang salah!");
            }
        }
    }
}
