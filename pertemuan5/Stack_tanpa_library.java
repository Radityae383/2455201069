package pertemuan5;

public class Stack_tanpa_library {
    private int maxSize;
    private String[] stackArray;
    private int top;

    public Stack_tanpa_library(int size) {
        maxSize = size;
        stackArray = new String[maxSize];
        top = -1; // Stack kosong
    }

    public void push(String item) {
        if (top < maxSize - 1) {
            stackArray[++top] = item;
        } else {
            System.out.println("Stack penuh!");
        }
    }

    public String pop() {
        if (top >= 0) {
            return stackArray[top--];
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }

    public String peek() {
        if (top >= 0) {
            return stackArray[top];
        } else {
            return null;
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void printStack() {
        System.out.print("Isi stack: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
    }

    // Tambahkan main method di sini
    public static void main(String[] args) {
        Stack_tanpa_library stack = new Stack_tanpa_library(5);

        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.printStack(); // Isi stack: A B C

        System.out.println("Pop: " + stack.pop()); // Pop: C
        stack.printStack(); // Isi stack: A B
    }
}