import java.util.Scanner;
public class DataDosen21 {
    static Scanner absen21 = new Scanner(System.in);
    static void semuaDosen(Dosen21[] dosen, String jenisKelamin){
        System.out.println("Data Semua Dosen");
        for (Dosen21 dosen21 : dosen) {
            System.out.println("Kode Dosen      : " + dosen21.kode);
            System.out.println("Nama Dosen      : " + dosen21.nama);
            System.out.println("Jenis Kelamin : " + dosen21.jenisKelamin);
            System.out.println("Usia Dosen      : " + dosen21.usia);
            System.out.println("-----------------------------------");
            absen21.nextLine();
        } return;
    }

    static void jumlahPerKelamin(Dosen21[] dosen21){
        int perempuan = 0, laki = 0;
        String keyJenis;
        System.out.print("Cari Jumlah Dosen Per Jenis Kelamin (Pria/Wanita): ");
        keyJenis = absen21.nextLine();

        System.out.println("Jumlah Dosen " + keyJenis);
        for (int i = 0; i < dosen21.length; i++) {
            if(keyJenis.equalsIgnoreCase("Pria")){
                if(dosen21[i].jenisKelamin.equalsIgnoreCase("Pria")){
                    laki++;
                    System.out.println("Kode Dosen      : " + dosen21[i].kode);
                    System.out.println("Nama Dosen      : " + dosen21[i].nama);
                    System.out.println("Jenis Kelamin : " + dosen21[i].jenisKelamin);
                    System.out.println("Usia Dosen      : " + dosen21[i].usia);
                }
            } else if(keyJenis.equalsIgnoreCase("Wanita")){
                if(dosen21[i].jenisKelamin.equalsIgnoreCase("Wanita")){
                    perempuan++;
                    System.out.println("Kode Dosen      : " + dosen21[i].kode);
                    System.out.println("Nama Dosen      : " + dosen21[i].nama);
                    System.out.println("Jenis Kelamin : " + dosen21[i].jenisKelamin);
                    System.out.println("Usia Dosen      : " + dosen21[i].usia);
                    System.out.println();
                }
            }
        }
    }

    static void rataUsiaDosenPerKelamin(Dosen21[] dosen21){
        int jumlahUsia = 0, jumlahDosen = 0;
        double rata;
        String keyJenis;
        System.out.print("Masukkan Jenis Kelamin (Pria/Wanita) Dosen untuk Rata Usia: ");
        keyJenis = absen21.nextLine();

        System.out.println("Rata Usia Dosen dengan Jenis Kelamin " + keyJenis);
        for (int i = 0; i < dosen21.length; i++) {
            if(keyJenis.equalsIgnoreCase("Pria")){
                if(dosen21[i].jenisKelamin.equalsIgnoreCase("Pria")){
                    jumlahUsia += dosen21[i].usia;
                    jumlahDosen++;
                }
            } else if(keyJenis.equalsIgnoreCase("Wanita")){
                if(dosen21[i].jenisKelamin.equalsIgnoreCase("Wanita")){
                    jumlahUsia += dosen21[i].usia;
                    jumlahDosen++;
                }
            }
        }
        rata = jumlahUsia / jumlahDosen;
        System.out.println("Rata rata usia dosen dengan jenis kelamin " + keyJenis + " : " + rata);
    }

    static void dosenTertua(Dosen21[] dosen21){
        int tertua = 0;
        for (int i = 0; i < dosen21.length; i++) {
            if (dosen21[tertua].usia < dosen21[i].usia){
                tertua = i;
            }
        }
        System.out.println("Dosen tertua yaitu " + dosen21[tertua].nama + " berumur " + dosen21[tertua].usia);
        return;
    }

    static void dosenTermuda(Dosen21[] dosen21){
        int termuda = 0;
        for (int i = 0; i < dosen21.length; i++) {
            if (dosen21[termuda].usia < dosen21[i].usia){
                termuda = i;
            }
        }
        System.out.println("Dosen termuda yaitu " + dosen21[termuda].nama + " berumur " + dosen21[termuda].usia);
        return;
    }
    
}