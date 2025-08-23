package uts;

public class MataKuliah2122 {  
    String kodeMK;
    String namaMK;
    int sks;

public MataKuliah2122 (String kodeMK, String namaMK, int sks) {
    this.kodeMK = kodeMK;
    this.namaMK = namaMK;
    this.sks = sks;
}

public void tampilMataKuliah() {
    System.out.println("=================================");
    System.out.println("       Tampil Mata Kuliah        ");
    System.out.println("=================================");
    System.out.println("Kode MK\t\t: " + kodeMK);
    System.out.println("Nama MK\t\t: " + namaMK);
    System.out.println("SKS\t\t: " + sks);
}
}