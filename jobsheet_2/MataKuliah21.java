public class MataKuliah21 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    public MataKuliah21(){

    }

    public MataKuliah21(String kdMK, String nm, int sks, int jmlJam){
        kodeMK = kdMK;
        nama = nm;
        this.sks = sks;
        jumlahJam = jmlJam;
    }
    void tampilkanInformasi(){
        System.out.println("Kode MK: " + kodeMK);
        System.out.println("Nama MK: " + nama);
        System.out.println("SKS: " + sks);
        System.out.println("Jumlah Jam: " + jumlahJam);
    }

    void ubahSKS(int sksBaru){
        sks = sksBaru;
        System.out.println("SKS berhasil diubah!");
    }

    void tambahJam(int jam){
        jumlahJam += jam;
    }

    void kurangiJam(int jam){
        if(jumlahJam >= jam){
            jumlahJam -= jam;
        } else{
            System.out.println("Pengurangan tidak dapat dilakukan.");
        }
    }
}
