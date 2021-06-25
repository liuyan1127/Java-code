package data65;

public class MyTest {
    public static void main(String[] args) {
        int[] elements = {10, 2, 35, 4, 7, 55, 90, 32};
        MyHashTable hashTable = new MyHashTable();
        for (int e : elements) {
            hashTable.insert(e);
        }
    }
}
