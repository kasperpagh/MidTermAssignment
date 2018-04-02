package cphbusiness.pagh.utils;

import java.util.Random;

public class DiceRoller2D6
{
    public static int roll2D6()
    {
        int dieOne;
        int dieTwo;
        Random rand = new Random();
        dieOne = rand.nextInt(6)+1;
        System.out.println(dieOne);
        dieTwo = rand.nextInt(6)+1;
        System.out.println(dieTwo);
        return dieOne+dieTwo;
    }

}
