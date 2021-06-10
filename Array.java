public class Array {
    public static void main(String[] args) {
        int[][] twoArray = new int[5][];

        System.out.println(twoArray.length);
        //rows
        //no of one d arrays


        //3
        //5
        //4
        //10
        //2

        twoArray[0] = new int[3];
        twoArray[1] = new int[5];
        twoArray[2] = new int[4];
        twoArray[3] = new int[10];
        twoArray[4] = new int[2];

        //0

        twoArray[0][0] = 1;
        twoArray[0][1] = 2;


        twoArray[4][1] = 10;


        for (int i = 0; i < twoArray.length; i++) {
            for (int j = 0; j < twoArray[i].length; j++) {
                System.out.println(twoArray[i][j]);
            }
        }

        int[][] twodnumbers = {    {1,2},  {2,4},  {4,4} ,{2,3,4,4}   } ;


    }
}
