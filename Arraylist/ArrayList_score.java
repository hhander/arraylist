package Arraylist;

import java.util.ArrayList;

public class ArrayList_score {
    public static void main(String[] args) {
        ArrayList<Integer> ScoreList = new ArrayList();
        ScoreList.add(98);
        ScoreList.add(77);
        ScoreList.add(66);
        ScoreList.add(89);
        ScoreList.add(79);
        ScoreList.add(50);

        for (int i = 0; i < ScoreList.size(); i++)
        {
            if(ScoreList.get(i)<80)
            {
                ScoreList.remove(i);
                i--;
            }

        }





        System.out.println(ScoreList);
    }


}
