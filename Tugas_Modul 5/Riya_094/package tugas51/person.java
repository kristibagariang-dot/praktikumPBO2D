/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas51;

public class person {
    public String nama = "Kafilatul";
    private int NIM = 80;
    protected String alamat = "Bangkalan";
    String hobi = "Maennnn";
    public void tampilPublic() {
        System.out.println("Public : " + nama);
    }
    private void tampilPrivate() {
        System.out.println("Private : " + NIM);
    }
    protected void tampilProtected() {
        System.out.println("Protected : " + alamat);
    }
    void tampilDefault() {
        System.out.println("Default : " + hobi);
    }
    public void aksesPrivate() {
        tampilPrivate();
    }
}