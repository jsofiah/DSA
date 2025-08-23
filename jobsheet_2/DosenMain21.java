public class DosenMain21 {
    public static void main(String[] args) {
        Dosen21 dosen1 = new Dosen21();
        dosen1.idDosen = "0001";
        dosen1.nama = "Alzarine";
        dosen1.statusAktif = false;
        dosen1.tahunBergabung = 2006;
        dosen1.bidangKeahlian = "Bisnis";

        dosen1.tampilkanInformasi(2025);
        dosen1.setStatusAktif(true);
        dosen1.hitungMasaKerja(2025);
        dosen1.ubahKeahlian("KTI");

        Dosen21 dosen2 = new Dosen21("0002", "Alkarine", true, 2001, "CTPS");
        dosen2.tampilkanInformasi(2025);
    }
}
