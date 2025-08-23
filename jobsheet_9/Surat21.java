package jobsheet_9;
public class Surat21 {
    String idSurat;
    String namaMahasiswa;
    String kelas;
    char jenisIzin;
    int durasi;

    public Surat21() {
    }

    public Surat21(String idSurat, String namaMahasiswa, String kelas) {
        this.idSurat = idSurat;
        this.namaMahasiswa = namaMahasiswa;
        this.kelas = kelas;
    }
    
    public void suratDiproses(char jenisIzin, int durasi){
        this.jenisIzin = jenisIzin;
        this.durasi = durasi;
        
    }

    
}
