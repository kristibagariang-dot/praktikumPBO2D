import java.util.Scanner;

interface Phone { // interface
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

class SamsungA06 implements Phone {
    private int Volume;
    private boolean ispowerOn;

    public SamsungA06() {
        this.Volume = 50;
    }

    public void powerOn() {
        ispowerOn = true;
        System.out.println("Handphone menyala ...");
        System.out.println("Selamat datang di Samsung A06");
        System.out.println("Versi Android 15");
    }

    public void powerOff() {
        ispowerOn = false;
        System.out.println("Handphone dimatikan");
    }

    public void VolumeUp() {
        if (ispowerOn) {
            if (this.Volume == MAX_VOLUME) {
                System.out.println("Volume Full");
                System.out.println("Sudah " + this.getVolume() + "%");
            } else {
                this.Volume += 10;
                System.out.println("Volume sekarang : " + this.getVolume() + "%");
            }
        } else {
            System.out.println("Nyalakan dulu HP-nya!!");
        }
    }

    public void VolumeDown() {
        if (ispowerOn) {
            if (this.Volume == MIN_VOLUME) {
                System.out.println("Volume : 0%");
            } else {
                this.Volume -= 10;
                System.out.println("Volume sekarang : " + this.getVolume() + "%");
            }
        } else {
            System.out.println("Nyalakan dulu HP-nya!!");
        }
    }

    public int getVolume() {
        return this.Volume;
    }
}

class Main {
    public static void main(String[] args) {

        Phone SamsungA06 = new SamsungA06();
        PhoneUser Rama = new PhoneUser(SamsungA06);

        Rama.turnOnThePhone();

        Scanner input = new Scanner(System.in);
        String aksi;

        while (true) {
            System.out.println("\n=== APLIKASI INTERFACE ===");
            System.out.println("[1] Nyalakan HP");
            System.out.println("[2] Matikan HP");
            System.out.println("[3] Perbesar Volume");
            System.out.println("[4] Kecilkan Volume");
            System.out.println("[0] Keluar");
            System.out.println("-------");

            System.out.print("Pilih aksi -> ");
            aksi = input.nextLine();

            if (aksi.equalsIgnoreCase("1")) {
                Rama.turnOnThePhone();
            } else if (aksi.equalsIgnoreCase("2")) {
                Rama.turnOffThePhone();
            } else if (aksi.equalsIgnoreCase("3")) {
                Rama.makePhoneLouder();
            } else if (aksi.equalsIgnoreCase("4")) {
                Rama.makePhoneSilent();
            } else if (aksi.equalsIgnoreCase("0")) {
                System.exit(0);
            } else {
                System.out.println("Kamu memilih aksi yang salah!");
            }
        }
    }
}
