package com.company;

/**
 * Created by ss683 on 2/24/17.
 */
public class Recursive {
    public Recursive(int fir, int sec)
    {
        first = fir;
        second = sec;
    }

    public int GCD()
    {
        if(first == 0 && second != 0)
            return GCD = second;
        else if(first != 0 && second == 0)
            return GCD = first;
        else if(first == 0 && second == 0)
            return GCD = 0;
        else {
            if(second > first)
            {
                temp = second;
                second = first;
                first = temp;
            }
            remainder = first % second;
            first = second;
            second = remainder;
            Recursive no = new Recursive(first, second);
            no.GCD();
        }
        return GCD();
    }

    public int second;
    public int first;
    public int GCD;
    public int temp;
    public int remainder;
}
