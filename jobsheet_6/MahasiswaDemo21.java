package jobsheet_6;
import java.util.Scanner;

public class MahasiswaDemo21{
    public static void main(String[] args) {
        Scanner input21 = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = input21.nextInt();
        input21.nextLine();
        
        MahasiswaBerprestasi21 list = new MahasiswaBerprestasi21(jumlah);
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Masukkan data mahasiswa ke " + (i+1) + ": ");
            System.out.print("Nama: ");
            String nama = input21.nextLine();
            System.out.print("NIM: ");
            String nim = input21.nextLine();
            System.out.print("Kelas: ");
            String kelas = input21.nextLine();
            System.out.print("IPK: ");
            double ipk = input21.nextDouble();
            input21.nextLine();
            System.out.println("===================================");

            Mahasiswa21 m = new Mahasiswa21(nim, nama, kelas, ipk);
            list.tambah(m);
        }

        System.out.println("Data mahasiswa sebelum sorting: ");
        list.tampil();

        System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC): ");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC): ");
        list.selectionSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC): ");
        list.insertionSort();
        list.tampil();
    }
}
