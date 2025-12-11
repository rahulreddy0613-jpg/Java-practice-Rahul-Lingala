public class ArrayWhileLoop {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20};

        System.out.println("Using While Loop:");
        int i = 0;

        while (i < numbers.length) {
            System.out.println(numbers[i]);
            i++;
        }
    }
}
