package kuis;
import  java.util.Scanner;
public class DosenMain21 {
    public static void main(String[] args) {
        Scanner absen21 = new Scanner(System.in);
        Dosen21 dosen1 = new Dosen21();
        dosen1.nidn = "001";
        dosen1.nama = "Budiawan";
        dosen1.tahunMasuk = 2006;
        dosen1.jenjangPendidikan = "S2";
        dosen1.prodi = "SIB";
        Dosen21 dosen2 = new Dosen21("002", "Siti Rahmawati", 2010, "S3", "TI");
        Dosen21 dosen3 = new Dosen21("003", "Ahmad Fauzi", 2015, "S2", "SIB");

        System.out.println("\n");
        System.out.println("----------------------------------------");
        System.out.println("\t Cetak Data Dosen");
        System.out.println("----------------------------------------");
        dosen1.tampilkanInfo();
        dosen2.tampilkanInfo();
        dosen3.tampilkanInfo();
        
        System.out.println("\n");
        System.out.println("----------------------------------------");
        System.out.println("\t Ubah Data Prodi Dosen");
        System.out.println("----------------------------------------");
        dosen1.ubahProdi();
        dosen1.tampilkanInfo();
        dosen2.ubahProdi();
        dosen2.tampilkanInfo();
        dosen3.ubahProdi();
        dosen3.tampilkanInfo();

        System.out.println("\n");
        System.out.println("----------------------------------------");
        System.out.println("\t Ubah Data Pendidikan Dosen");
        System.out.println("----------------------------------------");
        dosen1.ubahPendidikan();
        dosen1.tampilkanInfo();
        dosen2.ubahPendidikan();
        dosen2.tampilkanInfo();
        dosen3.ubahPendidikan();
        dosen3.tampilkanInfo();
    }
}
