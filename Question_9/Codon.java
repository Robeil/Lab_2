package CS203Course.Lab_2.Question_9;

import java.util.ArrayList;

public class Codon {

    public static ArrayList<String> makeDNAList(String codon){
        ArrayList<String> DNAList = new ArrayList<>();

        for(int i = 0; i < (codon.length() /3) * 3; i += 3){
            DNAList.add(codon.substring(i, i+3));
        }
        return DNAList;
    }

    public static void main(String[] args){
        ArrayList<String> DNAList = Codon.makeDNAList("GATTCGA");
        System.out.println(DNAList);
    }
}
