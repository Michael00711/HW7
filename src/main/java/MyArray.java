public class MyArray {
    private String[] array;
    private int size;

    public MyArray(int initialCapacity) {
        array = new String[initialCapacity];
        size = 0;
    }


    public int length() {
        return size;
    }


    public void put(String str) {

        if (size == array.length) {
            resize();
        }
        array[size] = str;
        size++;
    }

    // Метод для получения первой строки и сдвига массива
    public String get() {
        if (size == 0) {
            return null; // если массив пустой
        }
        String firstElement = array[0];
        // Сдвигаем все элементы влево на одну позицию
        for (int i = 1; i < size; i++) {
            array[i - 1] = array[i];
        }
        array[size - 1] = null;
        size--;
        return firstElement;
    }


    private void resize() {
        String[] newArray = new String[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    public void printArray() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
