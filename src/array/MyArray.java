package array;

public class MyArray {
    // 멤버 변수
    int[] intArr; // int array
    int ARRAY_SIZE; // intArr 배열 size
    int count; // intArr 배열 내 값이 있는 개수
    int ERROR_CODE = -999999999;

    // 생성자
    public MyArray() {
        ARRAY_SIZE = 10;
        count = 0;
        intArr = new int[ARRAY_SIZE];
    }

    // 생성자
    public MyArray(int size) {
        ARRAY_SIZE = size;
        count = 0;
        intArr = new int[ARRAY_SIZE];
    }

    // 순차적인 요소 추가
    public void addElement(int data) {
        if (count >= ARRAY_SIZE) { // 배열 내에 공간이 이미 꽉 찼다면
            System.out.println("The array is full");
            return;
        }

        intArr[count++] = data;
        System.out.println(data + " has been added.");
    }

    // 위치 지정 요소 추가
    public void addPositioningElement(int index, int data) {
        if (count >= ARRAY_SIZE) { // 배열 내에 공간이 이미 꽉 찼다면
            System.out.println("The array is full");
            return;
        }

        if (index < 0 || index > count) { // 배열 내 값이 있는 index의 위치가 아니라면
            System.out.println("Check the position.");
            return;
        }

        for (int i = ARRAY_SIZE - 1; i > index; i--) {
            intArr[i] = intArr[i - 1];
        }

        intArr[index] = data;
        count++;
        System.out.println("Added " + data + " to index " + index + ".");
    }

    // 위치 지정 요소 삭제
    public void deletePositioningElement(int index) {
        if (index < 0 || index >= count) { // 배열 내 값이 있는 index의 위치가 아니라면
            System.out.println("Check the position.");
            return;
        }

        for (int i = index; i < ARRAY_SIZE; i++) {
            if(i != ARRAY_SIZE - 1) {
                intArr[i] = intArr[i + 1];
            }
        }

        intArr[--count] = 0;
        System.out.println(index + " The element at index has been deleted.");
    }

    // 위치 지정 요소 출력
    public int getElement(int index) {
        if (index < 0 || index >= count) { // 배열 내 값이 있는 index의 위치가 아니라면
            System.out.println("Check the position.");
            return ERROR_CODE;
        }

        return intArr[index];
    }

    // 배열 출력
    public void printArray() {
        System.out.print("[");
        for (int i = 0; i < ARRAY_SIZE; i++) {
            if (i == ARRAY_SIZE - 1) {
                System.out.print(intArr[i]);
            } else {
                System.out.print(intArr[i] + ", ");
            }
        }
        System.out.println("]");
    }
}
