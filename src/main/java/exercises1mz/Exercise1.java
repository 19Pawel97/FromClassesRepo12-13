package exercises1mz;

public class Exercise1 {
    private int[] array;

    public Exercise1() {
        array = new int[10];
    }

    public Exercise1(int size) {
        array = new int[size];
    }

    public int[] addToArray() {
        for (int i = 1; i <= array.length; i++) {
            array[i - 1] = i;
        }
        return array;
    }

    public void printArray() {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public void printArraySize() {
        System.out.println("The array size is: " + array.length);
    }

    public int getArraySize() {
        return array.length;
    }

    public int[] multiplication(int mul) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= mul;
        }
        return array;
    }
}
