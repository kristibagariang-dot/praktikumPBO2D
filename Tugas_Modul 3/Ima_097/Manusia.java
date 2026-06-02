class Manusia {
    String nama;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return "Nama Manusia : " + nama;
    }
}

class Pelajar extends Manusia {
    private String nama;

    @Override
    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public String getNama() {
        return "Nama Pelajar : " + nama;
    }
}

class Karyawan extends Manusia {
    private String namaKar;

    @Override
    public void setNama(String nama) {
        this.namaKar = nama;
    }

    @Override
    public String getNama() {
        return "Nama Karyawan : " + namaKar;
    }
}

public class Latihan1 {
    public static void main(String[] args) {

        Pelajar pelajar1 = new Pelajar();
        Karyawan karyawan1 = new Karyawan();
        Manusia mns;

        mns = pelajar1;
        mns.setNama("IMA ROTUL HASANAH");
        System.out.println(mns.getNama());

        mns = karyawan1;
        mns.setNama("ZHILVIA QURUN NADA");
        System.out.println(mns.getNama());
    }
}
