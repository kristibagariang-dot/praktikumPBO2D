package krs;

import akademik.Mahasiswa; 

public class KrsKhusus extends Mahasiswa {
    private String namaMatkul;

    public KrsKhusus(String nim, String namaMahasiswa, double 
            ipkMinimal, String namaMatkul) {
        super(nim, namaMahasiswa, ipkMinimal); 
        this.namaMatkul = namaMatkul;
    }

    public void cetakKrs() {
        System.out.println("=== KARTU RENCANA STUDI (KRS) ===");
        System.out.println("NIM Mahasiswa : " + getNim()); 
        System.out.println("Nama Mhs      : " + namaMahasiswa); 

        System.out.println("Syarat IPK    : " + ipkMinimal);   
        System.out.println("Mengambil     : " + namaMatkul);
    }
}