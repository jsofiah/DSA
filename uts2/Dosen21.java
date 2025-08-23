package uts2;

public class Dosen21 {
    int nidn;
    String nama;
    String email;
    int thnMasuk;
    String prodi;
    int msKerja;

    public Dosen21(int nidn, String nama, String email, int thnMasuk, String prodi) {
        this.nidn = nidn;
        this.nama = nama;
        this.email = email;
        this.thnMasuk = thnMasuk;
        this.prodi = prodi;
        MasaKerja();
    }

    public void MasaKerja(){
        msKerja = (2025 - thnMasuk);
    }

    void tampilData(){
        System.out.println("===========================================");
        System.out.println("            Data Dosen           ");
        System.out.println("===========================================");
        System.out.println("NIDN\t\t: " + nidn);
        System.out.println("Nama\t\t: " + nama);
        System.out.println("Email\t\t: " + email);
        System.out.println("Masa Kerja\t: " + msKerja);
        System.out.println("Program Studi\t: " + prodi);
    }
}
