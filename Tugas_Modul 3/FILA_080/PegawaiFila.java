public class PegawaiFila {

    static abstract class Pegawai {
        protected String nik;
        protected String nama;
        protected int kehadiran;
        protected double gaji;

        public Pegawai(String nik, String nama, int kehadiran, double gaji) {
            this.nik = nik;
            this.nama = nama;
            this.kehadiran = kehadiran;
            this.gaji = gaji;
        }

        public abstract double rekapGaji();

        public void tampilData() {
            System.out.println("NIK         : " + nik);
            System.out.println("Nama        : " + nama);
            System.out.println("Kehadiran   : " + kehadiran + " hari");
            System.out.println("Gaji Bersih : " + rekapGaji());
        }
    }

    static class PegawaiKontrak extends Pegawai {
        private int masaKontrak;
        private double uangMakan;

        public PegawaiKontrak(String nik, String nama,
                              int masaKontrak, int kehadiran,
                              double gaji) {

            super(nik, nama, kehadiran, gaji);
            this.masaKontrak = masaKontrak;
            this.uangMakan = 15000 * kehadiran;
        }

        @Override
        public double rekapGaji() {
            return gaji + uangMakan;
        }

        @Override
        public void tampilData() {
            super.tampilData();
            System.out.println("Masa Kontrak : " +
                    masaKontrak + " bulan");
            System.out.println("Uang Makan   : " +
                    uangMakan);
            System.out.println("------------------------");
        }
    }

    static class PegawaiTetap extends Pegawai {
        private double tunjangan;
        private double uangMakan;

        public PegawaiTetap(String nik,
                            String nama,
                            int kehadiran,
                            double gaji) {

            super(nik, nama, kehadiran, gaji);
            this.tunjangan = 630000;
            this.uangMakan = 15000 * kehadiran;
        }

        @Override
        public double rekapGaji() {
            return gaji + tunjangan + uangMakan;
        }

        @Override
        public void tampilData() {
            super.tampilData();
            System.out.println("Tunjangan   : " +
                    tunjangan);
            System.out.println("Uang Makan  : " +
                    uangMakan);
            System.out.println("------------------------");
        }
    }

    public static void main(String[] args) {

        Pegawai p1 = new PegawaiKontrak(
                "K001",
                "Fila",
                12,
                20,
                3000000
        );

        Pegawai p2 = new PegawaiTetap(
                "T001",
                "Ria",
                22,
                4000000
        );

        System.out.println("=== Data Pegawai Kontrak ===");
        p1.tampilData();

        System.out.println("\n=== Data Pegawai Tetap ===");
        p2.tampilData();
    }
}