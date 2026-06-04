import java.util.Scanner;

interface Phone {

    int MAX_VOLUME = 100;
    int MIN_VOLUME = 0;

    void powerOn();

    void powerOff();

    void volumeUp();

    void volumeDown();
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
        this.phone.volumeUp();
    }

    void makePhoneSilent() {
        this.phone.volumeDown();
    }
}

class VivoY51 implements Phone {

    private int volume;
    private boolean isPowerOn;

    public VivoY51() {
        this.volume = 50;
    }

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("Handphone menyala...");
        System.out.println("Selamat datang di VIVO Y51");
        System.out.println("Android version 14");
    }

    @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("Handphone dimatikan");
    }

    @Override
    public void volumeUp() {

        if (isPowerOn) {

            if (this.volume == MAX_VOLUME) {
                System.out.println("Volume penuh");
            } else {
                this.volume += 10;
                System.out.println(
                        "Volume sekarang : " + this.getVolume());
            }

        } else {
            System.out.println("Nyalakan dulu dong HP-nya!");
        }
    }

    @Override
    public void volumeDown() {

        if (isPowerOn) {

            if (this.volume == MIN_VOLUME) {
                System.out.println("Volume habis");
            } else {
                this.volume -= 10;
                System.out.println(
                        "Volume sekarang : " + this.getVolume());
            }

        } else {
            System.out.println("Nyalakan dulu dong HP-nya!");
        }
    }

    public int getVolume() {
        return this.volume;
    }
}

public class modul42 {

    public static void main(String[] args) {

        VivoY51 vivo = new VivoY51();
        PhoneUser fadil = new PhoneUser(vivo);

        Scanner input = new Scanner(System.in);
        String aksi;

        while (true) {

            System.out.println("=== MENU INTERFACE ===");
            System.out.println("[1] Nyalakan HP");
            System.out.println("[2] Matikan HP");
            System.out.println("[3] Perbesar Volume");
            System.out.println("[4] Perkecil Volume");
            System.out.println("[0] Keluar");
            System.out.println("----------------------");
            System.out.print("Pilih aksi > ");

            aksi = input.nextLine();

            if (aksi.equalsIgnoreCase("1")) {
                fadil.turnOnThePhone();

            } else if (aksi.equalsIgnoreCase("2")) {
                fadil.turnOffThePhone();

            } else if (aksi.equalsIgnoreCase("3")) {
                fadil.makePhoneLouder();

            } else if (aksi.equalsIgnoreCase("4")) {
                fadil.makePhoneSilent();

            } else if (aksi.equalsIgnoreCase("0")) {
                System.out.println("Program selesai");
                break;

            } else {
                System.out.println("Maaf menu tidak tersedia");
            }
        }

        input.close();
    }
}
