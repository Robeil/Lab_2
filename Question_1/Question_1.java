package CS203Course.Lab_2.Question_1;

public class Question_1 {

    int[] number = new int[25]; // fixme instead we have to create the array first

    public int[] searchAccount(int[] number) { // FIXME We should not give the length in the first square bracket

        for (int i = 0; i < number.length; i++)
            number[i] = number[i - 1] + number[i + 1];
        return number;    // FIXME => the  return type is int not an array but we have to change it
    }
}
