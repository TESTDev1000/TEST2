package main;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {
                6,
                10,
                77,
                34,
                0,
                1,
                2,
                8,
                56,
                99,
                100,
                66,
                32
        };

        bubbleSorting(numbers);
        System.out.println(arrayToString(numbers));
    }

    public static void bubbleSorting(int[] array) {
        int n = array.length;

        for (int i = 0; i < n; i++) {
            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
    }

    public static String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);

            if (i < array.length - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }
}