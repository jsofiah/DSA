package uts;
public class Mahasiswa2122 {
    String nim;
    String nama;
    String prodi;

    public Mahasiswa2122(String nim, String nama, String prodi){
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }

    void tampilMahasiswa(){
        System.out.println("=================================");
        System.out.println("        Tampil Mahasiswa         ");
        System.out.println("=================================");
        System.out.println("NIM\t\t: " + nim);
        System.out.println("Nama\t\t: " + nama);
        System.out.println("Prodi\t\t: " + prodi);
    }
}
