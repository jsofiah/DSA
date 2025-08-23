public class Dosen21 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    public Dosen21(){

    }
    public Dosen21(String idDosen, String nm, boolean statusAkt, int bergabung, String keahlian){
        this.idDosen = idDosen;
        nama = nm;
        statusAktif = statusAkt;
        tahunBergabung = bergabung;
        bidangKeahlian = keahlian;
    }

    void tampilkanInformasi(int thnSkrg){
        System.out.println("Id dosen: " + idDosen);
        System.out.println("Nama dosen: " + nama);
        if(statusAktif = true){
            System.out.println("Status aktif: Aktif");
        } else{
            System.out.println("Status aktif: Tidak aktif");
        }
        System.out.println("Tahun bergabung: " + tahunBergabung);
        System.out.println("Masa kerja: " + hitungMasaKerja(thnSkrg));
        System.out.println("Bidang keahlian: " + bidangKeahlian);
    }

    void setStatusAktif(boolean status){
        statusAktif = status;
    }

    int hitungMasaKerja(int thnSkrg){
        return thnSkrg - tahunBergabung;
    }

    void ubahKeahlian(String bidang){
        bidangKeahlian = bidang;
    }

}
