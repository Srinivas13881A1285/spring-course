package array;

import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = {1,2,3,4,5,6,7,8,9,10};

        int[] numbers2 = new int[10];

        System.out.println("Please enter numbers into arary");
        for (int i = 0; i < numbers2.length; i++) {
            int number = scanner.nextInt();
            numbers2[i] = number;
        }

        System.out.println("Entered numbers");

        for (int i : numbers2) {
            System.out.println(i);
        }

    }
}
