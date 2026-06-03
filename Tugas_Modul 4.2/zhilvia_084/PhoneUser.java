 import java.util.Scanner;
interface Phone { 
int MAX_VOLUME = 100;
int MIN_VOLUME = 0;
void powerOn () ; 
void powerOff () ; 
void VolumeUp (); 
void VolumeDown () ;
}
class PhoneUser {
    private Phone phone;
    
    public PhoneUser (Phone phone) {
        this.phone = phone;
    }
    void turnOnThePhone() {
        this.phone.powerOn();
    }
    void turnOffThePhone (){
        this.phone.powerOff();
    }
    void makePhoneLouder () {
        this.phone.VolumeUp();
    }
    void makePhoneSilent() {
        this.phone.VolumeDown ();
    }
}
class apple implements Phone {//implementasi
    private int Volume;//atribut
    private boolean ispowerOn;
    
    public apple () {//constructor
        this.Volume = 50;
    }
    public void powerOn () {
        ispowerOn = true;
        System.out.println("Handphone menyala ...");
        System.out.println("Selamat datang di Iphone 11");
        System.out.println("IOS 26");
    }
    public void powerOff () {
        ispowerOn = false;
        System.out.println("Handphone dimatikan");
    }
    public void VolumeUp () {
        if (ispowerOn) {
            if (this.Volume == MAX_VOLUME) { 
                System.out.println("Volume Ful1");
                System.out.println("sudah" + this.getVolume() + "%");
            } else {
                this.Volume += 10;
                System. out.println("Volume sekarang : " + this.getVolume ());
            }
        } else {
            System.out.println("Nyalakan dulu donk HP-nya!!");
        }
    }
    public void VolumeDown () {//method
        if (ispowerOn) {//kondisi
            if (this.Volume == MIN_VOLUME) {
                System.out.println("Volume : 0%");
            } else {
                this.Volume -= 10;
                System.out.println("Volume sekarang: " + this.getVolume());
            }
        } else {
            System.out.println("Nyalakan dulu HP-nya!!");
        }
    }
    public int getVolume () {//method
        return this.Volume;//statement
    }
}
class Main {
    public static void main(String[]args) {
        Phone apple = new apple ();
        PhoneUser Umamah = new PhoneUser (apple) ;
        Umamah.turnOnThePhone () ;
        Scanner input = new Scanner (System. in);
        String aksi;
        while (true) {
            System.out.println("=== APLIKASI INTERFACE ===");
            System.out.println(" [1] Nyalakan HP");
            System.out.println(" [2] Matikan HP");
            System.out.println("[3] Perbesar Volume"); 
            System.out.println("[4] Kecilkan Volume");
            System.out.println(" [0] Keluar");
            System.out.println("-------");
            System.out.print ("Pilih aksi -> ");
            aksi = input.nextLine () ;
            if (aksi.equalsIgnoreCase ("1")) {
                Umamah.turnOnThePhone();
            } else if (aksi.equalsIgnoreCase ("2")) {
                Umamah.turnOffThePhone();
            } else if (aksi.equalsIgnoreCase ("3")) {
                Umamah.makePhoneLouder();
            } else if (aksi.equalsIgnoreCase ("4")) {
                Umamah.makePhoneSilent ();
            } else if (aksi. equalsIgnoreCase ("0")) {
            System. exit(0);
            } else {
                System. out.println ("Kamu memilih aksi yang salah!");
            }
        }
    }

