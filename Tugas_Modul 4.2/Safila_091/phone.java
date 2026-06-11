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

// Ganti Vivo sesuai HP kalian
class Vivo implements Phone {

    private int volume;
    private boolean isPowerOn;

    public Vivo() {
        this.volume = 50;
    }

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("Handphone menyala");
        System.out.println("Selamat datang di Vivo");
        System.out.println("Android versi 14");
    }

    @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("Handphone dimatikan");
    }

    @Override
    public void volumeUp() {
        if (isPower
