/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
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

class Samsung implements Phone {

    private int volume;
    private boolean isPowerOn;

    public Samsung () {
        this.volume = 50;
    }

    public void powerOn() {
        isPowerOn = true;

        System.out.println("Handphone menyala...");
        System.out.println("Selamat datang di Samsung");
        System.out.println("Android version 14");
    }

    public void powerOff() {
        isPowerOn = false;

        System.out.println("Handphone dimatikan");
    }

    public void volumeUp() {

        if (isPowerOn) {

            if (this.volume == MAX_VOLUME) {
                System.out.println("Volume Full");
                System.out.println("Sudah " + this.getVolume() + "%");
            } else {
                this.volume += 10;
                System.out.println("Volume sekarang : " + this.getVolume());
            }

        } else {
            System.out.println("Nyalakan dulu dong HP-nya!!");
        }
    }

    public void volumeDown() {

        if (isPowerOn) {

            if (this.volume == MIN_VOLUME) {
                System.out.println("Volume : 0%");
            } else {
                this.volume -= 10;
                System.out.println("Volume sekarang : " + this.getVolume());
            }

        } else {
            System.out.println("Nyalakan dulu dong HP-nya!!");
        }
    }

    public int getVolume() {
        return this.volume;
    }
}

class HandP {

    public static void main(String[] args) {

        Phone Samsung = new Samsung();
        PhoneUser fadhil = new PhoneUser(Samsung);

        fadhil.turnOnThePhone();

        Scanner input = new Scanner(System.in);
        String aksi;

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

            if (aksi.equalsIgnoreCase("1")) {

                fadhil.turnOnThePhone();

            } else if (aksi.equalsIgnoreCase("2")) {

                fadhil.turnOffThePhone();

            } else if (aksi.equalsIgnoreCase("3")) {

                fadhil.makePhoneLouder();

            } else if (aksi.equalsIgnoreCase("4")) {

                fadhil.makePhoneSilent();

            } else if (aksi.equalsIgnoreCase("0")) {

                System.exit(0);

            } else {

                System.out.println("Kamu memilih aksi yang salah!");
            }
        }
    }
}
