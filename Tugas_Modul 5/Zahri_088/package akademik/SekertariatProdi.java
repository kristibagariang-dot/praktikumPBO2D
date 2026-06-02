package akademik;

class SekretariatProdi {
   
    String kuotaKelas;

    SekretariatProdi(String kuotaKelas) {
        this.kuotaKelas = kuotaKelas;
    }

    void cekKuota() {
        System.out.println("Kuota Kelas: " + kuotaKelas);
    }
}