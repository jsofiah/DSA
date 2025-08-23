package jobsheet_9;
public class Mahasiswa21 {
    String nim;
    String nama;
    String kelas;
    int nilai;

    public Mahasiswa21() {
    }

    public Mahasiswa21(String nim, String nama, String kelas) {
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        nilai = -1;
    }

    public void tugasDinilai(int nilai){
        this.nilai = nilai;
    }
}