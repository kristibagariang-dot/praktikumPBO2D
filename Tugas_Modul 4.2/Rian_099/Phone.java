import java.util.Scanner; 

interface Phone {
    int MAX_VOLUME = 100; 
    int MIN_VOLUME = 0;   

    void powerOn();       
    void powerOff();
    void volumeUp();
    void volumeDown();   

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

class Redmi implements Phone {
    private int volume;
    private boolean isPowerOn; 
    
    public Redmi() {
        this.volume = 50;
    }

    public void powerOn() {
        isPowerOn = true;
        System.out.println("HP Redmi Note 12 pro 5G menyala...");
        System.out.println("Selamat datang di redmi");
        System.out.println("Android version 13");
    }

    public void powerOff() {
        isPowerOn = false;
        System.out.println("HP dimatikan");
    }

    public void volumeUp() {
        if (isPowerOn) {
            if (this.volume == MAX_VOLUME) {
                System.out.println("Volume Full");
            } else {
                this.volume += 10;
                System.out.println("Volume sekarang: " + this.volume);
            }
        } else {
            System.out.println("Nyalakan dulu HP-nya!");
        }
    }

    public void volumeDown() {
        if (isPowerOn) {
            if (this.volume == MIN_VOLUME) {
                System.out.println("Volume 0");
            } else {
                this.volume -= 10;
                System.out.println("Volume sekarang: " + this.volume);
            }
        } else {
            System.out.println("Nyalakan dulu HP-nya!");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Phone redmi = new Redmi(); 
        PhoneUser user = new PhoneUser(redmi);

        Scanner input = new Scanner(System.in);
        String aksi;

        while (true) {
            System.out.println("\n=== APLIKASI INTERFACE ===");
            System.out.println("[1] Nyalakan HP");
            System.out.println("[2] Matikan HP");
            System.out.println("[3] Perbesar Volume");
            System.out.println("[4] Kecilkan Volume");
            System.out.println("[0] Keluar");

            System.out.print("Pilih aksi: ");
            aksi = input.nextLine();

            if (aksi.equals("1")) {
                user.turnOnThePhone();
            } else if (aksi.equals("2")) {
                user.turnOffThePhone();
            } else if (aksi.equals("3")) {
                user.makePhoneLouder();
            } else if (aksi.equals("4")) {
                user.makePhoneSilent();
            } else if (aksi.equals("0")) {
                System.exit(0);
            } else {
                System.out.println("Pilihan salah!");
            }
        }
    }
}1
