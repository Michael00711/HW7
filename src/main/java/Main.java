public class Main {
    public static void main(String[] args) {
        MyArray myArray = new MyArray(2);


        myArray.put("first");
        myArray.put("second");
        myArray.put("3th");


        System.out.print("Array after adding elements: ");
        myArray.printArray();
        System.out.println("Length: " + myArray.length());


        String firstElement = myArray.get();
        System.out.println("First element: " + firstElement);


        System.out.print("Array after get(): ");
        myArray.printArray();
        System.out.println("Length: " + myArray.length());

        myArray.put("4th");
        myArray.put("5th");


        System.out.print("Array after adding more elements: ");
        myArray.printArray();
        System.out.println("Length: " + myArray.length());
    }
}
