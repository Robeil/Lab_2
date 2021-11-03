package CS203Course.Lab_2.Question_7;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;

public class Temperature {

    public static double[] namedHotCold(double[] yearTemp) {

        double[] hotCold = new double[2];
        double hottest = 0.0;
        double coldest = 0.0;

        for (int i = 0; i < yearTemp.length; i++) {
            if (yearTemp[i] > hottest) {
                hottest = yearTemp[i];
            }
        }

        for (int i = 0; i < yearTemp.length; i++) {
            if (yearTemp[i] < coldest) {
                coldest = yearTemp[i];
            }
        }
        System.out.println("This is the hottest ☀️  " + hottest + " for this year.");
        System.out.println("\nThis is the coldest ❄️ " + coldest + " for this year.");
        hotCold[0] = hottest;
        hotCold[1] = coldest;

        return hotCold;
    }

    public static void main(String[] args) {

        DecimalFormat deci = new DecimalFormat();
        Random random = new Random();
        int[] monthDay = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        double[] yearTemp = new double[365];

        //Storing the entire year from random
        for (int i = 0; i < yearTemp.length; i++) {
            yearTemp[i] = (double) (random.nextInt(126));
        }

        System.out.println(Arrays.toString(namedHotCold(yearTemp)));

    }
}
