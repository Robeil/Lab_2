package CS203Course.Lab_2.Question_8;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Fortune {

    private ArrayList<String> fortune;

    public Fortune() {

    }

    public ArrayList<String> getFortune() {
        return this.fortune;
    }

    public void setFortune(ArrayList<String> fortune) {
        this.fortune = fortune;
    }

    public String fortuneTelling(ArrayList<String> fortune) {

        Random random = new Random();
        int ranFor = 0;

        for (int i = 0; i < fortune.size(); i++) {
            ranFor = random.nextInt(10);
            if (ranFor == i) {
                fortune.get(ranFor);
            }
        }
        return fortune.get(ranFor);
    }

    public static void main(String[] args) {
        Fortune teller1 = new Fortune();

        //List of fortune to tell
        ArrayList<String> fortune = new ArrayList<>();
        fortune.add("You will get 4.0 GPA this semester.");
        fortune.add("Happiness is programming.");
        fortune.add("Satisfaction follows hard work.");
        fortune.add("Patience is virtue.");
        fortune.add("You will be a milliner in 2022.");
        fortune.add("Long life is in store for you.");
        fortune.add("You have a magnetic personality.");
        fortune.add("Your smile is a treasure to all who know you.");
        fortune.add("All your hard work will soon pay off.");
        fortune.add("Your present plans going to succeed");

        Scanner input = new Scanner(System.in);
        String userInput;

        System.out.println("Would you like me to tell you fortune?");
        userInput = input.next();

        while (true) {

            if (userInput.toLowerCase().charAt(0) == 'y') {
                //calling the fortune-teller
                System.out.println(teller1.fortuneTelling(fortune));
            } else {
                System.out.println("Okay GoodBye for now");
                break;
            }
            System.out.println("Would you like me to tell you fortune again?");
            userInput = input.next();
        }

    }
}
