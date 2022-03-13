package array;

public class ArrayTest {
    public static void main(String[] args) {
        MyArray myArray = new MyArray();

        myArray.addElement(10);
        myArray.addElement(20);
        myArray.addElement(30);
        myArray.addPositioningElement(1, 40);

        myArray.printArray();

        myArray.deletePositioningElement(1);

        myArray.printArray();

        System.out.println(myArray.getElement(2));

        // 결과
        // 10 has been added.
        // 20 has been added.
        // 30 has been added.
        // Added 40 to index 1.
        // [10, 40, 20, 30, 0, 0, 0, 0, 0, 0]
        // 1 The element at index has been deleted.
        // [10, 20, 30, 0, 0, 0, 0, 0, 0, 0]
        // 30
    }
}
