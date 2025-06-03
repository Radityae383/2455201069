public class Queuetanpalibrary {
    private int maxSize;
    private String[] queueArray;
    private int front;
    private int rear;

    public Queuetanpalibrary(int size) {
        maxSize = size;
        queueArray = new String[maxSize];
        front = 0;
        rear = -1;
    }

    public void enqueue(String item) {
        if (rear < maxSize - 1) {
            queueArray[++rear] = item;
        } else {
            System.out.println("Queue penuh!");
        }
    }

    public String dequeue() {
        if (front <= rear) {
            return queueArray[front++];
        } else {
            System.out.println("Queue kosong!");
            return null;
        }
    }

    public String peek() {
        if (front <= rear) {
            return queueArray[front];
        } else {
            return null;
        }
    }

    public boolean isEmpty() {
        return front > rear;
    }

    public void printQueue() {
        System.out.print("Isi queue: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(queueArray[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queuetanpalibrary antrian = new Queuetanpalibrary(5);

        antrian.enqueue("Andi");
        antrian.enqueue("Budi");
        antrian.enqueue("Citra");

        antrian.printQueue(); // Output: Andi Budi Citra

        System.out.println("Paling depan: " + antrian.peek()); // Output: Andi

        antrian.dequeue(); // Keluarkan Andi
        antrian.printQueue(); // Output: Budi Citra
    }
}


