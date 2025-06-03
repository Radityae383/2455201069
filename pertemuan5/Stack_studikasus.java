package pertemuan5;

public class Stack_studikasus {
    private String[] stack;
    private int top;
    private int capacity;

    public Stack_studikasus(int size) {
        capacity = size;
        stack = new String[capacity];
        top = -1;
    }

    public void push(String value) {
        if (top < capacity - 1) {
            stack[++top] = value;
        } else {
            System.out.println("Stack penuh!");
        }
    }

    public String pop() {
        if (top >= 0) {
            return stack[top--];
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }

    public String peek() {
        if (top >= 0) {
            return stack[top];
        } else {
            return null;
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void printStack() {
        System.out.print("Isi Stack: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Stack_studikasus undoStack = new Stack_studikasus(5);

        undoStack.push("Halo");
        undoStack.push("Halo Dunia");
        undoStack.push("Halo Dunia Java");

        undoStack.printStack();

        System.out.println("Undo 1 langkah...");
        undoStack.pop();

        System.out.println("Teks terakhir setelah undo: " + undoStack.peek());
        undoStack.printStack();
    }
}
