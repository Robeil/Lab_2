package CS203Course.Lab_2.Question_4;

import java.util.Arrays;

public class Max_Min {
    public static int[] maxMin(int[] array) {

        int[] maxMin = new int[2];
        int min = 0;
        int max = 0;

        //finding maximum number and storing in the array
        for (int i = 0; i < array.length; i++) {

            if (array[i] > max) {
                max = array[i];
            }
        }

        //finding minimum number and storing in the array
        for (int i = 0; i < array.length; i++) {

            if (array[i] < min) {
                min = array[i];
            }
        }

        maxMin[0] = max;
        maxMin[1] = min;

        return maxMin;
    }

    public static void main(String[] args) {

        int[] array = {1, 4, -9, 33, 19, 78, 5};
        int[] newArray = maxMin(array);

        System.out.println(Arrays.toString(newArray));

    }
}
