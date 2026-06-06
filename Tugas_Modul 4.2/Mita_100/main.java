import java.util.Scanner;

interface Phone { // Interface sebagai "kontrak" untuk semua jenis HP
    int MAX_VOLUME = 100; // volume maksimal
    int MIN_VOLUME = 0;   // volume minimal

    void powerOn();       // method untuk menyalakan HP
    void powerOff();      // method untuk mematikan HP
    void volumeUp();      // method untuk menambah volume
    void volumeDown();    // method untuk mengurangi volume
    int getVolume();      // method untuk mengambil nilai volume
}

class PhoneUser {  // Class yang merepresentasikan pengguna HP
    private Phone phone; // menggunakan interface (abstraksi)

    // constructor untuk menghubungkan user dengan HP
    public PhoneUser(Phone phone) { // constructor untuk menghubungkan user dengan HP
        this.phone = phone;
    }

    void turnOnThePhone() {  //method untuk menyalakan HP
        phone.powerOn();
    }
    
    void turnOffThePhone() {  // method untuk mematikan HP
        phone.powerOff();
    }

    
    void makePhoneLouder() {   // method untuk menaikkan volume
        phone.volumeUp();
    }

    void makePhoneSilent() {   // method untuk mnurunkan volume
        phone.volumeDown();
    }
}

class Samsung implements Phone {  // Class Samsung sebagai implementasi dari interface Phone
    private int volume;       // menyimpan nilai volume
    private boolean isPowerOn; // status HP (on/off)

    public Samsung() {  // constructor, volume awal = 50
        volume = 50;
    }

    public void powerOn() {  // implementasi method powerOn
        isPowerOn = true;
        System.out.println("HP Samsung menyala...");
    }

    public void powerOff() {  // implementasi method powerOff
        isPowerOn = false;
        System.out.println("HP dimatikan");
    }

    public void volumeUp() {  // implementasi method volumeUp
        // cek apakah HP menyala
        if (isPowerOn) {
            // cek apakah sudah maksimal
            if (volume >= MAX_VOLUME) {
                System.out.println("Volume sudah maksimal");
            } else {
                volume += 10; // tambah volume
                System.out.println("Volume: " + volume);
            }
        } else {
            System.out.println("Nyalakan HP dulu!");
        }
    }

    public void volumeDown() {    // implementasi method volumeDown
        // cek apakah HP menyala
        if (isPowerOn) {
            // cek apakah sudah minimum
            if (volume <= MIN_VOLUME) {
                System.out.println("Volume sudah minimum");
            } else {
                volume -= 10; // kurangi volume
                System.out.println("Volume: " + volume);
            }
        } else {
            System.out.println("Nyalakan HP dulu!");
        }
    }

    // method untuk mengambil nilai volume sekarang
    public int getVolume() {
        return volume;
    }
}

// Class utama untuk menjalankan program
public class main {
    public static void main(String[] args) {

        // membuat objek HP dari class Oppo
        Phone hp = new Samsung();

        // membuat objek user yang menggunakan HP
        PhoneUser user = new PhoneUser(hp);

        // untuk input dari keyboard
        Scanner input = new Scanner(System.in);

        String aksi; // variabel untuk menyimpan pilihan user

        // perulangan menu agar program terus berjalan
        while (true) {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Nyalakan HP");
            System.out.println("2. Matikan HP");
            System.out.println("3. Volume Up");
            System.out.println("4. Volume Down");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");

            aksi = input.nextLine(); // membaca input user

            // percabangan untuk memilih aksi
            switch (aksi) {
                case "1":
                    user.turnOnThePhone(); // panggil method nyalakan HP
                    break;
                case "2":
                    user.turnOffThePhone(); // panggil method matikan HP
                    break;
                case "3":
                    user.makePhoneLouder(); // naikkan volume
                    break;
                case "4":
                    user.makePhoneSilent(); // turunkan volume
                    break;
                case "0":
                    System.out.println("Program selesai");
                    System.exit(0); // keluar dari program
                default:
                    System.out.println("Pilihan salah!");
            }
        }
    }
}
