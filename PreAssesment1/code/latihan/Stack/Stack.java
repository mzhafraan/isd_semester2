
public class Stack {

    private int[] arr;
    private int top;

    public Stack(int size) {
        arr = new int[size];
        top = -1;

    }

    public void push(int num) {
        if (top == arr.length - 1) {
            System.out.println("Stack is Full");
        } else {
            top++;
            arr[top] = num;
        }
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack is Underflow");
            return -1;
        } else {
            int poppedElement = arr[top];
            top--;
            System.out.println("Popping element...\n");
            return poppedElement;
            
        }
    }

    public int peek() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return -1;
        } else {
            return arr[top];
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void display(){
        if (top == -1 ) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack elements: ");
            for (int i = top; i >= 0; i--) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Initialize a stack: ");
        Stack stack = new Stack(5);
        System.out.println("Is the stack empty? " + stack.isEmpty());
        System.out.println("\nInput some elements on the stack:");
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.display();
        System.out.println("\nTop element of the stack: " + stack.peek());
        stack.pop();
        stack.pop();
        stack.display();
        System.out.println("\nTop element of the stack after pop: " + stack.peek());
        System.out.println("\nIs stack empty? " + stack.isEmpty());
    }
}
