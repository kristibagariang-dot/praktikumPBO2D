/**
 *
 * @author Noor Fathiatul Alea
 */
import java.util.Scanner;
interface Phone {
    int MAX_VOLUME = 100;
    int MIN_VOLUME = 0;
    void powerOn();
    void powerOff();
    void volumeUp();
    void volumeDown();
}
class PhoneUser{
    private Phone phone;
    public PhoneUser(Phone phone){
        this.phone = phone;
    }
    void turnOnThePhone(){
        this.phone.powerOn();
    }
    void turnOffThePhone(){
        this.phone.powerOff();
    }
    void makePhoneLouder(){
        this.phone.volumeUp();
    }
    void makePhoneSilent(){
        this.phone.volumeDown();
    }
}
class Oppo implements Phone{
    private int volume;
    private boolean isPowerOn;
    public Oppo(){
        this.volume = 50;
    }
    public void powerOn(){
        isPowerOn = true;
        System.out.println("Handphone menyala ...");
        System.out.println("Selamat datang di Oppo");
        System.out.println("Android version 10");
    }
    public void powerOff(){
        isPowerOn = false;
        System.out.println("Handphone dimatikan");
    }
    public void volumeUp(){
        if (isPowerOn){
            if (this.volume == MAX_VOLUME){
                System.out.println("Volume full");
                System.out.println("Sudah "+ this.getVolume()+
                        "%");
            }else{
                this.volume += 10;
                System.out.println("Volume sekarang : " +
                        this.getVolume());          
            }      
        }else{
            System.out.println("Nyalakan dulu donk HP-nya!!");
        }
    }
    public void volumeDown(){
        if (isPowerOn){
            if(this.volume == MIN_VOLUME){
                System.out.println("Volume : %");
            }else{
                this.volume -= 10;
                System.out.println("Volume sekarang : " + 
                        this.getVolume());
            }
        }else{
            System.out.println("Nyalakan dulu donk HP-nya!!");
        }
    }
    public int getVolume(){
        return this.volume;
    }
}
class Main{
    public static void main(String[] args) {
        Phone Oppo = new Oppo();
        PhoneUser fadli = new PhoneUser(Oppo);
        fadli.turnOnThePhone();
        Scanner input =new Scanner(System.in);
        String aksi;
        while(true){
            System.out.println("===APLIKASI INTERFACE===");
            System.out.println("[1] Nyalakan HP");
            System.out.println("[2] Matikan HP");
            System.out.println("[3] Perbesar volume");
            System.out.println("[4] Kecilkan volume");
            System.out.println("[0] Keluar");
            System.out.println("------------------------");
            System.out.println("Pilih aksi ->");
            aksi = input.nextLine();
            if(aksi.equalsIgnoreCase("1")){
                fadli.turnOnThePhone();
            }else if(aksi.equalsIgnoreCase("2")){
                fadli.turnOffThePhone();
            }else if(aksi.equalsIgnoreCase("3")){
                fadli.makePhoneLouder();
            }else if(aksi.equalsIgnoreCase("4")){
                fadli.makePhoneSilent();
            }else if(aksi.equalsIgnoreCase("0")){
                System.exit(0);
            }else{
                System.out.println("Kamu memilih aksi yang "
                        + "salah!");
            }
        }
    }
}
