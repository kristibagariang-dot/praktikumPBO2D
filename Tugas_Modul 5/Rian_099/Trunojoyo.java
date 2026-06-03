package univ;

import matkul.pai;
import prodi.pgsd;

public class trunojoyo {

    public static void main(String[] args) {

        pai mk = new pai();

        System.out.println("=== AKSES DARI MAIN ===");

        System.out.println("Dosen : " + mk.dosen);

        mk.tampilPublic();

        mk.aksesPrivate();

        System.out.println();

        System.out.println("=== AKSES DARI CLASS PGSD ===");

        pgsd data = new pgsd();
        data.tampilData();
    }
}
