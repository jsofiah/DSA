package kuis;
import java.util.Scanner;
public class Dosen21 {
    public String nidn;
    public String nama;
    public int tahunMasuk;
    public String jenjangPendidikan;
    public String prodi;
    public Scanner absen21 = new Scanner(System.in);

    public Dosen21(){
        
    }

    public Dosen21(String nidn, String nama, int tahunMasuk, String jenjangPendidikan, String prodi){
        this.nidn = nidn;
        this.nama = nama;
        this.tahunMasuk = tahunMasuk;
        this.jenjangPendidikan = jenjangPendidikan;
        this.prodi = prodi;
    }

    public void tampilkanInfo(){
        System.out.println("NIDN               : " + nidn);
        System.out.println("Nama Dosen         : " + nama);
        System.out.println("Tahun Masuk        : " + tahunMasuk);
        System.out.println("Jenjang Pendidikan : " + jenjangPendidikan);
        System.out.println("Program Studi      : " + prodi);
        System.out.println("----------------------------------------");
    }

    public void ubahProdi(){
        System.out.print("Masukkan program studi baru: ");
        String prodiBaru = absen21.nextLine();
        prodi = prodiBaru;
    }
    public void ubahPendidikan(){
        System.out.print("Masukkan jenjang pendidikan baru: ");
        String pendidikanBaru = absen21.nextLine();
        jenjangPendidikan = pendidikanBaru;
    }

    public void tampilData() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'tampilData'");
    }
}