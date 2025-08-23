package kuis;
import java.util.Scanner;

public class MataKuliah21 {
    public String kodeMK;
    public String namaMK;
    public int sks;
    public Dosen21[] dosenPengampu;
    public int jumlahDosen = 0;
    public Scanner input = new Scanner(System.in);

    public MataKuliah21(String kodeMK, String namaMK, int sks, int maxDosen) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.sks = sks;
        this.dosenPengampu = new Dosen21[maxDosen];
    }

    public void tampilkanInfo() {
        System.out.println("\nKode MK       : " + kodeMK);
        System.out.println("Nama MK       : " + namaMK);
        System.out.println("SKS           : " + sks);
        System.out.println("Dosen Pengampu:");
        for (int i = 0; i < jumlahDosen; i++) {
            dosenPengampu[i].tampilkanInfo();
        }
        System.out.println("----------------------------------------");
    }

    public void ubahNamaMK() {
        System.out.println("----------------------------------------");
        System.out.println("\t\tUbah Nama Mata Kuliah");
        System.out.println("----------------------------------------");
        System.out.print("Masukkan nama mata kuliah baru: ");
        this.namaMK = input.nextLine();
    }

    public void ubahSKS() {
        System.out.println("----------------------------------------");
        System.out.println("\t\t Ubah SKS");
        System.out.println("----------------------------------------");
        System.out.print("Masukkan jumlah SKS baru: ");
        int sksBaru = input.nextInt();
        input.nextLine();
        if (sksBaru >= 2) {
            this.sks = sksBaru;
        } else {
            System.out.println("SKS tidak valid. Minimal 2 SKS");
        }
    }

    public void tambahDosen() {
        if (jumlahDosen < dosenPengampu.length) {
            System.out.println("----------------------------------------");
            System.out.println("\t Tambah Data Dosen");
            System.out.println("----------------------------------------");
            System.out.print("NIDN               : ");
            String nidnBaru = input.nextLine();
            System.out.print("Nama Dosen         : ");
            String namaBaru = input.nextLine();
            System.out.print("Tahun Masuk        : ");
            int tahunMasukBaru = input.nextInt();
            input.nextLine();
            System.out.print("Jenjang Pendidikan : ");
            String pendidikanBaru = input.nextLine();
            System.out.print("Program Studi      : ");
            String prodiBaru = input.nextLine();

            dosenPengampu[jumlahDosen] = new Dosen21(nidnBaru, namaBaru, tahunMasukBaru, pendidikanBaru, prodiBaru);
            jumlahDosen++;
            System.out.println("Dosen berhasil ditambahkan!\n");
        } else {
            System.out.println("Kapasitas dosen penuh, tidak bisa menambahkan dosen baru.");
        }
    }
}
