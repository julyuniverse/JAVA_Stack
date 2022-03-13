package stack;

import array.MyArray;

public class MyStack {
    // 멤버 변수
    MyArray stack;
    int top;
    int ERROR_CODE = -999999999;

    // 생성자
    public MyStack() {
        top = 0;
        stack = new MyArray();
    }

    // 생성자
    public MyStack(int size) {
        top = 0;
        stack = new MyArray(10);
    }

    // 스택 추가
    public void push(int data) {
        stack.addElement(data);
        top++;
    }

    // 스택 제거
    public void pop() {
        stack.deletePositioningElement(--top);
    }

    // 스택 값 보기
    public int peek() {
        if(top == 0) {
            System.out.println("The stack is empty.");
            return ERROR_CODE;
        }

        return stack.getElement(top - 1);
    }

    // 출력
    public void print() {
        stack.printArray();
    }
}
