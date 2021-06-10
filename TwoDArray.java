import java.util.Arrays;

public class TwoDArray {
    public static void main(String[] args) {
        //oneD array - numbers,strings,chars,
        //[1,2,3,4,5]

        //twoDarray array of oneDb

//        0//[1,2,3,4,5]
//
//        1//[11,12,13,14,15]
//
//        2//[21,22,23,24,25]
//
//        3//[31,32,33,34,35]


        int[] numbers = new int[5];

        numbers[0] = 10;
        numbers[1] = 20;

        System.out.println(Arrays.toString(numbers));


        int[] arrayOne = {1, 2, 3, 4, 5};
        int[] arrayTwo = {6, 7, 8, 9, 10};
        int[] arrayThree = {11, 12, 13, 14, 15};


        //type[][] array-name  = new type[3][5];rowls cols

        int[][] twoDNumbers = new int[3][5];

        twoDNumbers[0] = arrayOne;
        twoDNumbers[1] = arrayTwo;
        twoDNumbers[2] = arrayThree;


        System.out.println("size of two d array");
        System.out.println(twoDNumbers.length);

        System.out.println("size of first one d array ");
        System.out.println(twoDNumbers[0].length);

//           ctrl + D

        for (int i = 0; i < twoDNumbers.length; i++) {
                int[] array = twoDNumbers[i];

            for (int i1 = 0; i1 < array.length; i1++) {
                System.out.print(array[i1]+" ");
            }
            System.out.println();

        }

    }
}
