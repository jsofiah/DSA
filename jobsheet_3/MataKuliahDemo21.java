import java.util.Scanner;
public class MataKuliahDemo21 {
    public static void main(String[] args) {
        Scanner absen21 = new Scanner(System.in);
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlah = absen21.nextInt();
        absen21.nextLine();

        MataKuliah21[] arrayOfMataKuliah = new MataKuliah21[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            arrayOfMataKuliah[i] = new MataKuliah21();
            arrayOfMataKuliah[i].tambahData(absen21);
        }

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Data Matakuliah ke-" + (i+1));
            arrayOfMataKuliah[i].cetakInfo();
        }
    }
}
