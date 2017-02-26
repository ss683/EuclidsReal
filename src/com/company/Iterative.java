package com.company;

/**
 * Created by ss683 on 2/24/17.
 */
public class Iterative {
    public Iterative(int fir, int sec)
    {
        first = fir;
        second = sec;
    }

    public int GCD() {
        if (first == 0 && second != 0)
            return GCD = second;
        else if (first != 0 && second == 0)
            return GCD = first;
        else if (first == 0 && second == 0)
            return GCD = 0;
        else {
            while (first != second) {
                if (second > first) {
                    second = second - first;
                }
                else
                    first = first - second;
            }
            return GCD = first;
        }
    }
    public int second;
    public int first;
    public int GCD;
    public int temp;
    public int remainder;
}