package main;

import hewan.Hewan;
import pegawai.Pegawai;

public class Main {
    public static void main(String[] args) {

        Hewan h = new Hewan("Kucing", 2, 4.5);
        Pegawai p = new Pegawai("Andi", "Programmer", 7000000);

        System.out.println("=== DATA HEWAN ===");
        h.tampilInfo();

        System.out.println();

        System.out.println("=== DATA PEGAWAI ===");
        p.tampilInfo();
    }
}