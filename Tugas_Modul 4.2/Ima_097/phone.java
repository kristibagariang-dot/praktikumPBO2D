import java.util.Scanner;

interface Phone {

    int MAX_VOLUME = 100;
    int MIN_VOLUME = 0;

    void powerOn();
    void powerOff();
    void VolumeUp();
    void VolumeDown();
}

class PhoneUser {

    private Phone phone;

    public PhoneUser(Phone phone) {
        this.phone = phone;
    }

    void turnOnThePhone() {
        this.phone.powerOn();
    }

    void turnOffThePhone() {
        this.phone.powerOff();
    }

    void makePhoneLouder() {
        this.phone.VolumeUp();
    }

    void makePhoneSilent() {
        this.phone.VolumeDown();
    }
}

class Vivo implements Phone {

    private int volume;
    private boolean isPowerOn;

    public Vivo() {
        this.volume = 50;
    }

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("Handphone menyala ...");
        System.out.println("Selamat datang di VIVO");
        System.out.println("Android version 10");
    }

    @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("Handphone dimatikan");
    }

    @Override
    public void VolumeUp() {
        if (isPowerOn) {

            if (volume == MAX_VOLUME) {
                System.out.println("Volume Full!");
            } else {
                volume += 10;
                System.out.println("Volume sekarang : " + volume);
            }

        } else {
            System.out.println("Nyalakan HP terlebih dahulu!");
        }
    }

    @Override
    public void VolumeDown() {
        if (isPowerOn) {

            if (volume == MIN_VOLUME) {
                System.out.println("Volume = 0");
            } else {
                volume -= 10;
                System.out.println("Volume sekarang : " + volume);
            }

        } else {
            System.out.println("Nyalakan HP terlebih dahulu!");
        }
    }
}

public class Main {

    public static void main(String[] args) {

        Vivo hp = new Vivo();
        PhoneUser ima = new PhoneUser(hp);

        Scanner input = new Scanner(System.in);
        String aksi;

        do {
            System.out.println("\n--- APLIKASI INTERFACE ---");
            System.out.println("[1] Nyalakan HP");
            System.out.println("[2] Matikan HP");
            System.out.println("[3] Perbesar Volume");
            System.out.println("[4] Kecilkan Volume");
            System.out.println("[0] Keluar");
            System.out.print("Pilih aksi -> ");

            aksi = input.nextLine();

            if (aksi.equalsIgnoreCase("1")) {
                ima.turnOnThePhone();
            } else if (aksi.equalsIgnoreCase("2")) {
                ima.turnOffThePhone();
            } else if (aksi.equalsIgnoreCase("3")) {
                ima.makePhoneLouder();
            } else if (aksi.equalsIgnoreCase("4")) {
                ima.makePhoneSilent();
            } else if (aksi.equalsIgnoreCase("0")) {
                System.out.println("Terima kasih telah menggunakan aplikasi");
            }

        } while (!aksi.equalsIgnoreCase("0"));
    }
}
