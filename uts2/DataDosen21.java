package uts2;

public class DataDosen21 {
    Dosen21[] dataDosen21;
    int idx;
    public  DataDosen21(int kapasitas){
        dataDosen21 = new Dosen21[kapasitas];
        idx = 0;
    }

    void tambahData(Dosen21 d){
        if(idx < dataDosen21.length){
            dataDosen21[idx] = d;
            idx++;
        } else{
            System.out.println("Data sudah penuh");
        }
    }

    void tampilDosen(){
        for (int i = 0; i < idx; i++) {
            dataDosen21[i].tampilData();
        }
    }

    void isertionASC(){ //insertion NIDN
        for (int i = 1; i < idx; i++) {
            Dosen21 temp = dataDosen21[i];
            int j = i;
            while(j > 0 && dataDosen21[j-1].nidn > temp.nidn){
                dataDosen21[j]=dataDosen21[j-1];
                j--;
            }
            dataDosen21[j] = temp;
        }
    }

    void cariNama(String key){
        boolean ditemukan = false;
        for (int i = 0; i < idx; i++) {
            if (dataDosen21[i].nama.equalsIgnoreCase(key)){
                dataDosen21[i].tampilData();
                ditemukan = true;
            }
        }
        if(!ditemukan){
            System.out.println("Data " + key + " tidak ditemukan.");
        }
    }

    void insertionDSC(){ //insertion Masa Kerja
        for (int i = 0; i < idx; i++) {
            Dosen21 temp = dataDosen21[i];
            int j = i;
            while(j > 0 && dataDosen21[j-1].msKerja < temp.msKerja){
                dataDosen21[j] = dataDosen21[j-1];
                j--;
            }
            dataDosen21[i] = temp;
        }
    }
}
