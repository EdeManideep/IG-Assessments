package day5;



public class Stack {
    private Contact[] stackArray;
    private int top;
    private int maxSize;

    public Stack(int maxSize) {
        this.maxSize = maxSize;
        this.stackArray = new Contact[maxSize];
        this.top = -1;
    }

    public void push(Contact contact) throws Exception {
        if (top == maxSize - 1) {
            throw new Exception("Stack is full");
        } else if (!contact.isValid()) {
            throw new Exception("Invalid contact details");
        } else {
            stackArray[++top] = contact;
        }
    }

    public Contact pop() throws Exception {
        if (top == -1) {
            throw new Exception("Stack is empty");
        } else {
            return stackArray[top--];
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }
}
