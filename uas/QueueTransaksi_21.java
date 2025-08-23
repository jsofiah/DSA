package uas;
public class QueueTransaksi_21 {
    TransaksiPengisian_21[] data;
    int front;
    int rear;
    int size;
    int max;

    public QueueTransaksi_21(int max) {
        this.max = max;
        data = new TransaksiPengisian_21[max];
        front = rear = size = 0;
    }

    public void enqueue(TransaksiPengisian_21 transaksi) {
        if (size == max) {
            System.out.println("Queue transaksi penuh!");
            return;
        }
        data[rear] = transaksi;
        rear = (rear + 1) % max;
        size++;
    }

    public void tampilRiwayat() {
        if (size == 0) {
            System.out.println("Belum ada transaksi.");
            return;
        }
        int i = front;
        for (int j = 0; j < size; j++) {
            data[i].tampilkanTransaksi();
            i = (i + 1) % max;
        }
    }
}
