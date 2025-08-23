public class MataKuliahMain21 {
    public static void main(String[] args) {
        MataKuliah21 matkul1 = new MataKuliah21();
        matkul1.kodeMK = "001";
        matkul1.nama = "ALSD";
        matkul1.sks = 3;
        matkul1.jumlahJam = 6;

        matkul1.tampilkanInformasi();
        matkul1.ubahSKS(4);
        matkul1.tambahJam(1);
        matkul1.kurangiJam(4);
        matkul1.tampilkanInformasi();

        MataKuliah21 matkul2 = new MataKuliah21("002", "BD", 3, 5);
        matkul2.tampilkanInformasi();
        matkul2.kurangiJam(6);
        matkul2.tampilkanInformasi();
    }
}
