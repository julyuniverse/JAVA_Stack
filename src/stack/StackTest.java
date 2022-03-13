package stack;

public class StackTest {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();

        myStack.push(10);
        myStack.print();
        myStack.push(20);
        myStack.print();
        myStack.push(30);
        myStack.print();
        myStack.pop();
        myStack.pop();
        myStack.print();
        System.out.println(myStack.peek());
        myStack.print();

        // 결과
        // 10 has been added.
        // [10, 0, 0, 0, 0, 0, 0, 0, 0, 0]
        // 20 has been added.
        // [10, 20, 0, 0, 0, 0, 0, 0, 0, 0]
        // 30 has been added.
        // [10, 20, 30, 0, 0, 0, 0, 0, 0, 0]
        // 2 The element at index has been deleted.
        // 1 The element at index has been deleted.
        // [10, 0, 0, 0, 0, 0, 0, 0, 0, 0]
        // 10
        // [10, 0, 0, 0, 0, 0, 0, 0, 0, 0]
    }
}
