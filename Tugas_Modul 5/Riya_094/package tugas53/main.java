/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas53;

import tugas52.student;
import tugas51.person;
public class main {
    public static void main(String[] args) {
        person p = new person();
        System.out.println(p.nama);
        p.tampilPublic();
        System.out.println("---------------");

        student s = new student();
        s.tampilData();

        System.out.println("---------------");
        p.aksesPrivate();
    }
}