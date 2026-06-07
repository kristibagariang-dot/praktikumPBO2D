import java.util.Scanner; // Mengimpor class Scanner untuk input dari keyboard

// Interface Phone
interface Phone {

    int MAX_VOLUME = 100; // Konstanta volume maksimum
    int MIN_VOLUME = 0;   // Konstanta volume minimum

    void powerOn();       // Method menyalakan HP
    void powerOff();      // Method mematikan HP
    void volumeUp();      // Method menambah volume
    void volumeDown();    // Method mengurangi volume
}

// Class PhoneUser
class PhoneUser {

    private Phone phone; // Membuat objek phone dari interface Phone

    // Constructor
    public PhoneUser(Phone phone) {
        this.phone = phone; // Mengisi objek phone
    }

    // Method menyalakan HP
    void turnOnThePhone() {
        this.phone.powerOn();
    }

    // Method mematikan HP
    void turnOffThePhone() {
        this.phone.powerOff();
    }

    // Method memperbesar volume
    void makePhoneLouder() {
        this.phone.volumeUp();
    }

    // Method memperkecil volume
    void makePhoneSilent() {
        this.phone.volumeDown();
    }
}

// Class Samsung sebagai implementasi interface Phone
class Samsung implements Phone {

    private int volume;          // Variabel volume
    private boolean isPowerOn;   // Status HP hidup/mati

    // Constructor
    public Samsung() {
        this.volume = 50; // Volume awal = 50
    }

    // Method menyalakan HP
    public void powerOn() {
        isPowerOn = true; // HP menjadi hidup

        System.out.println("Handphone menyala ...");
        System.out.println("Selamat datang di SAMSUNG");
        System.out.println("Android version 14");
    }

    // Method mematikan HP
    public void powerOff() {
        isPowerOn = false; // HP mati

        System.out.println("Handphone dimatikan");
    }

    // Method menambah volume
    public void volumeUp() {

        // Jika HP hidup
        if (isPowerOn) {

            // Jika volume sudah maksimal
            if (this.volume == MAX_VOLUME) {

                System.out.println("Volume Full");
                System.out.println("Sudah " + this.getVolume() + "%");

            } else {

                // Menambah volume 10
                this.volume += 10;

                System.out.println("Volume sekarang : "
                        + this.getVolume());
            }

        } else {

            // Jika HP mati
            System.out.println("Nyalakan dulu dong HP-nya!!");
        }
    }

    // Method mengurangi volume
    public void volumeDown() {

        // Jika HP hidup
        if (isPowerOn) {

            // Jika volume minimum
            if (this.volume == MIN_VOLUME) {

                System.out.println("Volume : 0%");

            } else {

                // Mengurangi volume 10
                this.volume -= 10;

                System.out.println("Volume sekarang : "
                        + this.getVolume());
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
public class Main {

    public static void main(String[] args) {

        // Membuat objek Samsung
        Phone samsung = new Samsung();

        // Membuat objek user HP
        PhoneUser fadli = new PhoneUser(samsung);

        // Menyalakan HP pertama kali
        fadli.turnOnThePhone();

        // Membuat scanner input
        Scanner input = new Scanner(System.in);

        String aksi; // Variabel pilihan menu

        // Perulangan menu
        while (true) {

            System.out.println("=== APLIKASI INTERFACE ===");
            System.out.println("[1] Nyalakan HP");
            System.out.println("[2] Matikan HP");
            System.out.println("[3] Perbesar Volume");
            System.out.println("[4] Kecilkan Volume");
            System.out.println("[0] Keluar");
            System.out.println("--------------------------");

            System.out.print("Pilih aksi -> ");
            aksi = input.nextLine();

            // Pilihan 1
            if (aksi.equalsIgnoreCase("1")) {

                fadli.turnOnThePhone();

            }

            // Pilihan 2
            else if (aksi.equalsIgnoreCase("2")) {

                fadli.turnOffThePhone();

            }

            // Pilihan 3
            else if (aksi.equalsIgnoreCase("3")) {

                fadli.makePhoneLouder();

            }

            // Pilihan 4
            else if (aksi.equalsIgnoreCase("4")) {

                fadli.makePhoneSilent();

            }

            // Pilihan keluar
            else if (aksi.equalsIgnoreCase("0")) {

                System.exit(0);

            }

            // Jika input salah
            else {

                System.out.println("Kamu memilih aksi yang salah!");
            }
        }
    }
}
