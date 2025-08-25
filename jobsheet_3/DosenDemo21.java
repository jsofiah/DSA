import java.util.Scanner;
public class DosenDemo21 {
    public static void main(String[] args) {
        Scanner absen21 = new Scanner(System.in);
        int jumlahDosen, usia;
        String kode, nama, jenisKelamin = null;
        System.out.print("Masukkan jumlah dosen: ");
        jumlahDosen = absen21.nextInt();
        absen21.nextLine();
        Dosen21[] arrayOfDosen = new Dosen21[jumlahDosen];

        for (int i = 0; i < jumlahDosen ; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i+1));
            System.out.print("Kode Dosen    : ");
            kode = absen21.nextLine();
            System.out.print("Nama Dosen    : ");
            nama = absen21.nextLine();
            System.out.print("Jenis Kelamin : ");
            jenisKelamin = absen21.nextLine();
            System.out.print("Usia Dosen    : ");
            usia = absen21.nextInt();
            
            arrayOfDosen[i] = new Dosen21(kode, nama, jenisKelamin, usia);
            absen21.nextLine();
        }
        DataDosen21.semuaDosen(arrayOfDosen, jenisKelamin);
        DataDosen21.jumlahPerKelamin(arrayOfDosen);
        DataDosen21.rataUsiaDosenPerKelamin(arrayOfDosen);
        DataDosen21.dosenTertua(arrayOfDosen);
        DataDosen21.dosenTermuda(arrayOfDosen);
    }
}
