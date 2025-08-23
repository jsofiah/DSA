package kuis;
public class MataKuliahMain21 {
    public static void main(String[] args) {
        MataKuliah21 mk1 = new MataKuliah21("SIB01", "Algoritma & Struktur Data", 3, 4);
        mk1.dosenPengampu[0] = new Dosen21("001", "Budiawan", 2006, "S2", "SIB");
        mk1.dosenPengampu[1] = new Dosen21("002", "Siti", 2010, "S3", "TI");
        mk1.dosenPengampu[2] = new Dosen21("003", "Ahmad", 2015, "S2", "SIB");
        mk1.jumlahDosen = 3;
        mk1.tampilkanInfo();
        System.out.println("\n");
        mk1.tambahDosen();
        System.out.println("\n");
        mk1.tampilkanInfo();
        System.out.println("\n");
        mk1.ubahNamaMK();
        System.out.println("\n");
        mk1.tampilkanInfo();
        System.out.println("\n");
        mk1.ubahSKS();
        System.out.println("\n");
        mk1.tampilkanInfo();
    }
}
