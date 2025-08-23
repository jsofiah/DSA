import java.util.Scanner;

public class MataKuliahDemo21{
    public static void main(String[] args) {
        Scanner absen21 = new Scanner(System.in);
        MataKuliah21[] arrayOfMataKuliah = new MataKuliah21[3];
        String kode, nama, dummy;
        int sks, jumlahJam = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            arrayOfMataKuliah[i] = new MataKuliah21();
            arrayOfMataKuliah[i].tambahData(absen21);
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Data Matakuliah ke-" + (i+1));
            arrayOfMataKuliah[i].cetakInfo();
        }
    }
}
