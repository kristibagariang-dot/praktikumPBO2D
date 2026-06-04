/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas52;

import tugas51.person;

public class student extends person {

    public void tampilData() {
        System.out.println("Nama : " + nama);
        System.out.println("Alamat : " + alamat);
        tampilPublic();
        tampilProtected();

    }
}