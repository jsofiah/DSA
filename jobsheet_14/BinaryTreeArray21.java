public class BinaryTreeArray21 {
    Mahasiswa21[] dataMahasiswa;
    int idxLast;

    public BinaryTreeArray21() {
        this.dataMahasiswa = new Mahasiswa21[10];
        idxLast = -1;
    }

    void populateData(Mahasiswa21 dataMhs[], int idxLast){
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }
    
    void traverseInOrder(int idxStart){
        if(idxStart <= idxLast){
            if(dataMahasiswa[idxStart] != null){
                traverseInOrder(2*idxStart+1);
                dataMahasiswa[idxStart].tampilInformasi();
                traverseInOrder(2*idxStart+2);
            }
        }
    }

    public void add(Mahasiswa21 data) {
        if (idxLast < dataMahasiswa.length - 1) {
            idxLast++;
            dataMahasiswa[idxLast] = data;
        } else {
            System.out.println("Tree sudah penuh");
        }
    }

    public void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast && dataMahasiswa[idxStart] != null) {
            dataMahasiswa[idxStart].tampilInformasi();
            traversePreOrder(2 * idxStart + 1);
            traversePreOrder(2 * idxStart + 2);
        }
    }
}