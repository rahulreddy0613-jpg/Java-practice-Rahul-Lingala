public class ArrayDoWhile {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8};

        System.out.println("Using Do-While Loop:");
        int i = 0;

        do {
            System.out.println(numbers[i]);
            i++;
        } while (i < numbers.length);
    }
}
