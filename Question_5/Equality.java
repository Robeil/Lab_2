package CS203Course.Lab_2.Question_5;

public class Equality {

    public static void checkEquality(int[] array1, int[] array2) {

        boolean areEqual = true;
        //checking if they have the same length first
        if (array1.length == array2.length) {
            //HERE we loop, if they have the same element
            for (int i = 0; i < array1.length; i++) {
                areEqual = true;

                    if (array1[i] != array2[i]) {
                        areEqual = false;
                }
            }
        }else {
            areEqual = false;
        }
        //Checking every element if they are equal
        if(areEqual){
            System.out.println("Both array are EQUAL");
        } else{
            System.out.println("Both array are NOT EQUAL");
        }

    }

    public static void main(String[] args) {

        int[] array1 = {1, 3, 5, 6, 6, 7};
        int[] array2 = {1, 3, 5, 6, 6, 7};

        Equality.checkEquality(array1, array2);
    }
}
