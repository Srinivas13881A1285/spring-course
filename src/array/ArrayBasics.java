package array;

public class ArrayBasics {
    public static void main(String[] args) {
        //type[] array-name = new type[size];

        float[] numbers = new float[10];

        int[] ins = {1,2,3,4,6,7,8,10,};
        String[] names = {"Suresh","Srinivas"};
        char ch ='a';

//        float[] floats = new float[100];

        for(int i = 0; i < numbers.length;i++){
            numbers[i] = i;//
        }

        //byte -128 to 127
        //short

        //int (mostly used)


        //long
        //BigInteger

        //127

        // 200

        // 1111 1111

        //char



        //float
        //double

        byte b = (byte) 200;
        System.out.println(b);

        // arrays fixed in size
        // 100 - size


        // collections are implemented on arrays.
        // growable in size
        // dynamic
    }
}
