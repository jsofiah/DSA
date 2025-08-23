public class MahasiswaMain21 {
    public static void main(String[] args) {
        Mahasiswa21 mhs1 = new Mahasiswa21();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2441720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("S2 2K");
        mhs1.updateIpk(3.60);
        mhs1.tampilkanInformasi();

        Mahasiswa21 mhs2 = new Mahasiswa21("Annisa Nabila", "21441720160", 3.25, "TI 2L");
        mhs2.tampilkanInformasi();
        mhs2.updateIpk(4.5);
        mhs2.tampilkanInformasi();

        Mahasiswa21 mhs21 = new Mahasiswa21("Sofiah", "244107060065", 4, "SIB 1A");
        mhs21.tampilkanInformasi();
    }
}
