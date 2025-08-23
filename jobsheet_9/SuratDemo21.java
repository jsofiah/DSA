package jobsheet_9;
import java.util.Scanner;
public class SuratDemo21 {
    public static void main(String[] args) {
        StackSurat21 stack = new StackSurat21(5);
        Scanner scan = new Scanner(System.in);
        int menu;
        do {
            System.out.println("\n====================================");
            System.out.println("\t\tMenu");
            System.out.println("====================================");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat Berdasarkan Nama");
            System.out.println("====================================");
            System.out.print("Menu: ");
            menu = scan.nextInt();
            scan.nextLine();
            switch (menu) {
                case 1:
                    System.out.print("Id Surat\t: ");
                    String idSurat = scan.nextLine();
                    System.out.print("Nama\t\t: ");
                    String namaMahasiswa = scan.nextLine();
                    System.out.print("Kelas\t\t: ");
                    String kelas = scan.nextLine();
                    Surat21 srt = new Surat21(idSurat, namaMahasiswa, kelas);
                    stack.push(srt);
                    System.out.printf("Surat %s berhasil diajukan\n", srt.namaMahasiswa);
                    break;
                case 2:
                    Surat21 diproses = stack.pop();
                    if(diproses != null){
                        System.out.println("Memproses surat dari " + diproses.namaMahasiswa);
                        System.out.print("Jenis Izin (S/I): ");
                        char jenisIzin = scan.next().charAt(0);
                        System.out.print("Durasi\t\t: ");
                        int durasi = scan.nextInt();
                        diproses.suratDiproses(jenisIzin, durasi);
                        System.out.printf("Izin dari %s adalah %c\n", diproses.namaMahasiswa, jenisIzin);
                    }
                    break;
                case 3:
                    Surat21 lihat = stack.peek();
                    if(lihat != null){
                        System.out.println("Surat terakhir dikumpulkan oleh " + lihat.namaMahasiswa);
                    }
                    break;
                case 4:
                    System.out.print("Masukkan nama yang dicari: ");
                    String key = scan.nextLine();
                    stack.CariNama(key);
                    break;
                default:
                    System.out.println("Menu tidak valid");;
            }

        } while (menu >=1 && menu <=4 );
    }
}
