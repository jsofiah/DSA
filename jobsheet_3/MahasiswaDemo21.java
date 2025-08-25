import java.util.Scanner;
public class MahasiswaDemo21 {
    public static void main(String[] args) {
        Scanner absen21 = new Scanner(System.in);
        Mahasiswa21[] arrayOfMahasiswa21 = new Mahasiswa21[3];
        String dummy;

        for (int i = 0; i < 3; i++) {
            arrayOfMahasiswa21[i] = new Mahasiswa21();
            System.out.println("Masukkan Data Mahasiswa ke-" + (i+1));
            System.out.print("NIM    : ");
            arrayOfMahasiswa21[i].nim = absen21.nextLine();
            System.out.print("Nama   : ");
            arrayOfMahasiswa21[i].nama = absen21.nextLine();
            System.out.print("Kelas  : ");
            arrayOfMahasiswa21[i].kelas = absen21.nextLine();
            System.out.print("IPK    : ");
            dummy = absen21.nextLine();
            arrayOfMahasiswa21[i].ipk = Float.parseFloat(dummy);
            System.out.println("----------------------------------------");
        }

        for (int i = 0; i < 3; i++) {
            arrayOfMahasiswa21[i].cetakInfo();
        }
    }
}
