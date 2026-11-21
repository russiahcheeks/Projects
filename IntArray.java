import java.util.Arrays;

public class IntArray {

    private int length;
    private int myArray[];

    // Constructor
    public IntArray(int size) {
        length = size;
        myArray = new int[size];
    }

    // Returns number of elements
    public int size() {
        return length;
    }

    // Fills array with random numbers 1-6
    public void fillRand() {
        for (int i = 0; i < length; i++) {
            myArray[i] = (int)(Math.random() * 6) + 1;
        }
    }

    // Sets a value at specified index
    public void set(int index, int value) {
        if (index >= 0 && index < length) {
            myArray[index] = value;
        }
    }

    // Returns value at specified index
    public int get(int index) {
        if (index >= 0 && index < length) {
            return myArray[index];
        }
        return -1;
    }

    // Clears the array
    public void clear() {
        myArray = new int[0];
        length = 0;
    }

    // Returns true if array has no elements
    public boolean isEmpty() {
        return length == 0;
    }

    // Sorts the array
    public void sort() {
        Arrays.sort(myArray);
    }

    // Prints array contents
    @Override
    public String toString() {
        String result = "";

        for (int i = 0; i < length; i++) {
            result += myArray[i] + " ";
        }

        return result;
    }
}