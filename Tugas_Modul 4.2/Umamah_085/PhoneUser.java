/*@author Taufiq*/
import java.util.Scanner;

interface Phone { //interface
int MAX_VOLUME = 100;//atribut
int MIN_VOLUME = 0;
void powerOn () ; //default
void powerOff () ; 
void VolumeUp (); 
void VolumeDown () ;
}
class PhoneUser {//interface
    private Phone phone;//encapsulation
    
    public PhoneUser (Phone phone) {//constructor
        this.phone = phone;//variabedl
    }
    void turnOnThePhone() {//method
        this.phone.powerOn();
    }
    void turnOffThePhone (){//method
        this.phone.powerOff();
    }
    void makePhoneLouder () {//method
        this.phone.VolumeUp();
    }
    void makePhoneSilent() {//method
        this.phone.VolumeDown ();
    }
}
class Ip13 implements Phone {//implementasi
    private int Volume;//atribut
    private boolean ispowerOn;
    
    public Ip13 () {//constructor
        this.Volume = 50;
    }
    public void powerOn () {//method
        ispowerOn = true;//atrtibut
        System.out.println("Handphone menyala ...");
        System.out.println("Selamat datang di Iphone13");
        System.out.println("IOS 26");
    }
    public void powerOff () {//method
        ispowerOn = false;//atribut
        System.out.println("Handphone dimatikan");
    }
    public void VolumeUp () {//method
        if (ispowerOn) {//kondisi
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
        Phone Ip13 = new Ip13 ();
        PhoneUser Umamah = new PhoneUser (Ip13) ;
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
}
