package uts;

public class Penilaian2122 {
    Mahasiswa2122 mahasiswa;
    MataKuliah2122 mataKuliah;
    double nilaiTugas;
    double nilaiUTS;
    double nilaiUAS;
    double nilaiAkhir;

    public Penilaian2122(Mahasiswa2122 mahasiswa, MataKuliah2122 mataKuliah, double tugas, double uts, double uas) {
        this.mahasiswa = mahasiswa;
        this.mataKuliah = mataKuliah;
        this.nilaiTugas = tugas;
        this.nilaiUTS = uts;
        this.nilaiUAS = uas;
        hitungNilaiAkhir();
    }

    public void hitungNilaiAkhir() {
        nilaiAkhir = (0.3 * nilaiTugas) + (0.3 * nilaiUTS) + (0.4 * nilaiUAS);
    }

    public void tampilPenilaian() {
        System.out.println("=================================");
        System.out.println("        Tampil Penilaian         ");
        System.out.println("=================================");
        System.out.println("Nama Mahasiswa\t: " + mahasiswa.nama);
        System.out.println("Nama Mata Kuliah: " + mataKuliah.namaMK);
        System.out.println("Nilai Tugas\t: " + nilaiTugas);
        System.out.println("Nilai UTS\t: " + nilaiUTS);
        System.out.println("Nilai UAS\t: " + nilaiUAS);
        System.out.println("Nilai Akhir\t: " + nilaiAkhir);
    }

    public void tampilPenilaianNIM() {
        System.out.println("=================================");
        System.out.println("        Tampil Penilaian         ");
        System.out.println("=================================");
        System.out.println("Nama Mahasiswa\t: " + mahasiswa.nama);
        System.out.println("Nama Mata Kuliah: " + mataKuliah.namaMK);
        System.out.println("Prodi\t\t: " + mahasiswa.prodi);
        System.out.println("Nilai Tugas\t: " + nilaiTugas);
        System.out.println("Nilai UTS\t: " + nilaiUTS);
        System.out.println("Nilai UAS\t: " + nilaiUAS);
        System.out.println("Nilai Akhir\t: " + nilaiAkhir);
    }
}
