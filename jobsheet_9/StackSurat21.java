package jobsheet_9;
public class StackSurat21 {
    Surat21[] stack;
    int size;
    int top;

    public StackSurat21(int size){
        this.size = size;
        stack = new Surat21[size];
        top = -1;
    }

    public boolean isFull(){
        if (top == size - 1){
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty(){
        if (top == -1){
            return true;
        } else {
            return false;
        }
    }

    public void push(Surat21 srt){
        if (!isFull()){
            top++;
            stack[top] = srt;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan surat lagi.");
        }
    }

    public Surat21 pop(){
        if(!isEmpty()){
            Surat21 s = stack[top];
            top--;
            return s;
        } else {
            System.out.println("Stack kosong! Tidak ada surat untuk diproses.");
            return null;
        }
    }

    public Surat21 peek(){
        if(!isEmpty()){
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada surat yang diajukan");
            return null;
        }
    }

    public void CariNama(String key){
        boolean ditemukan = false;
        for (int i = top; i >= 0; i--) {
            if(stack[i].namaMahasiswa.equalsIgnoreCase(key)){
                System.out.println("Surat ditemukan:");
                System.out.println("ID\tNama\tKelas");
                System.out.println(stack[i].idSurat + "\t" + stack[i].namaMahasiswa + "\t" + stack[i].kelas);
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Surat mahasiswa dengan nama " + key + " tidak ditemukan.");
        }
    }
}
