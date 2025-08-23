package uts;
public class DataPenilaian2122 {
    Penilaian2122[] dataNilai;
    int idx;

    public DataPenilaian2122(int kapasitas) {
        dataNilai = new Penilaian2122[kapasitas];
        idx = 0;
    }

    void tambahNilai(Penilaian2122 p) {
        if (idx < dataNilai.length) {
            dataNilai[idx] = p;
            idx++;
        } else {
            System.out.println("Data penilaian sudah penuh");
        }
    }

    void tampil() {
        for (int i = 0; i < idx; i++) {
            dataNilai[i].tampilPenilaian();
        }
    }

    void insertionDSC(){
        for (int i = 1; i < idx; i++) {
            Penilaian2122 temp = dataNilai[i];
            int j = i;
            while (j>0 && dataNilai[j-1].nilaiAkhir < temp.nilaiAkhir) {
                dataNilai[j] = dataNilai[j-1];
                j--;
            }
            dataNilai[j] = temp;
        }
    }


void cariByNIM(String nim) {
    boolean ditemukan = false;
    for (int i = 0; i < idx; i++) {
        if (dataNilai[i].mahasiswa.nim.equals(nim)) {
            dataNilai[i].tampilPenilaianNIM();
            ditemukan = true;
        }
    }
    if (!ditemukan) {
        System.out.println("Data mahasiswa dengan NIM " + nim + " tidak ditemukan.");
    }
}
}