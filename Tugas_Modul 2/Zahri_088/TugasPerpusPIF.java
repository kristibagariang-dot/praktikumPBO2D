public class TugasPerpusPIF {
    //superclass
    static class Perpustakaan {
        String judul, pengarang;
        int tahunTerbit;

        //construktor tanpar 
        public Perpustakaan() {
            this.judul = "Belum ada judul";
            this.pengarang = "Anonim";
            this.tahunTerbit = 0;
        }
        //constructor dgpar
        public Perpustakaan(String judul, String pengarang, int tahunTerbit) {
            this.judul = judul;
            this.pengarang = pengarang;
            this.tahunTerbit = tahunTerbit;
        }

        //method
        public void tampilkan() {
            System.out.println("Judul          : " + judul);
            System.out.println("Pengarang      : " + pengarang);
            System.out.println("Tahun Terbit   : " + tahunTerbit);
        }
    }

    //subclass
    static class Buku extends Perpustakaan {
        String penerbit, kategori;
        int stok;

        //conssubc
        public Buku(String judul, String pengarang, int tahunTerbit, String penerbit, String kategori, int stok) {
            
            super(judul, pengarang, tahunTerbit);
            this.penerbit = penerbit;
            this.kategori = kategori;
            this.stok = stok;
        }
        
        //method
        public void Hasil() {
            System.out.println("========== BUKU ==========");
            xxxxxxxxxxxxxxxxxsuper.tampilkan();
            System.out.println("Penerbit       : " + penerbit);
            System.out.println("Kategori       : " + kategori);
            System.out.println("Stok           : " + stok);
            System.out.println("===============================\n");
        }
    }

    //subclass
    static class Novel extends Perpustakaan {
        String kategoriNovel, status;

        //consmet
        public Novel(String judul, String pengarang, int tahunTerbit, String kategoriNovel, String status) {
            
            super(judul, pengarang, tahunTerbit);
            this.kategoriNovel = kategoriNovel;
            this.status = status;
        }

        public void Hasil() {
            System.out.println("========== NOVEL =========");
            super.tampilkan();
            System.out.println("Kategori Novel : " + kategoriNovel);
            System.out.println("Status Pinjam  : " + status);
            System.out.println("===============================\n");
        }
    }

    //maimet
    public static void main(String[] args) {
        Buku b1 = new Buku("Strategi Pendidikan Modern", "ZahriRamadani", 2028, "UTM Press", "Buku Pendidikan", 10);
        
        Novel n1 = new Novel("Negri 5 Menara", "Ahmad Fuadi", 2009, "Romantis-Religi", "Tersedia");

        b1.Hasil();
        n1.Hasil();
    }
}
    
