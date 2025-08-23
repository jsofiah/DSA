package jobsheet_6;
public class DataDosen21{
    Dosen21[] dataDosen;
    int idx;

    public DataDosen21(int kapasitas) {
        dataDosen = new Dosen21[kapasitas];
        idx = 0;
    }

    void tambah (Dosen21 d){
        if(idx < dataDosen.length){
            dataDosen[idx] = d;
            idx++;
        } else{
            System.out.println("Data sudah penuh");
        }
    }

    void tampil(){
        for (int i = 0; i < idx; i++) {
            dataDosen[i].tampilInformasi();
            System.out.println("=======================================");
        }
    }

    void bubbleASC(){
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 1; j < idx - i; j++) {
                if(dataDosen[j].usia < dataDosen[j-1].usia){
                    Dosen21 tmp = dataDosen[j];
                    dataDosen[j] = dataDosen[j-1];
                    dataDosen[j-1] = tmp;
                }
            }
        }
    }

    void selectionDSC(){
        for (int i = 0; i < idx - 1; i++) {
            int idxMin = i;
            for (int j = i+1; j < idx; j++) {
                if(dataDosen[j].usia > dataDosen[idxMin].usia){
                    idxMin =j;
                }
            }
            Dosen21 tmp = dataDosen[idxMin];
            dataDosen[idxMin] = dataDosen[i];
            dataDosen[i] = tmp;
        }
    }

    void insertionDSC(){
        for (int i = 1; i < idx; i++) {
            Dosen21 temp = dataDosen[i];
            int j = i;
            while (j>0 && dataDosen[j-1].usia < temp.usia){
                dataDosen[j]=dataDosen[j-1];
                j--;
            }
            dataDosen[j] = temp;
        }
    }
}