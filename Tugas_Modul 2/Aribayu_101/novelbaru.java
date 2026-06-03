import java.util.Scanner;

class NovelBaru extends Novel{

    NovelBaru(String judul, int tahunTerbit,
              String penulis, String kategori, String status){
        super(judul,tahunTerbit,penulis,kategori,status);
    }

    public String toString(){
        return super.toString() +
               "\nJenis Novel : Novel Baru";
    }
}

class NovelLama extends Novel{

    NovelLama(String judul, int tahunTerbit,
              String penulis, String kategori, String status){
        super(judul,tahunTerbit,penulis,kategori,status);
    }

    public String toString(){
        return super.toString() +
               "\nJenis Novel : Novel Lama";
    }
}

public class PerpustakaanB {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Judul Novel : ");
        String judul = input.nextLine();

        System.out.print("Tahun Terbit : ");
        int tahun = input.nextInt();
        input.nextLine();

        System.out.print("Penulis : ");
        String penulis = input.nextLine();

        System.out.print("Kategori : ");
        String kategori = input.nextLine();

        System.out.print("Status : ");
        String status = input.nextLine();

        System.out.print("Masukkan batas tahun novel baru : ");
        int batas = input.nextInt();

        Novel novel;

        if(tahun >= batas){
            novel = new NovelBaru(judul,tahun,penulis,kategori,status);
        }else{
            novel = new NovelLama(judul,tahun,penulis,kategori,status);
        }

        System.out.println("\nHASIL DATA NOVEL");
        System.out.println(novel.toString());
    }
}
