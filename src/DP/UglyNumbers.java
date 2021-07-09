package DP;

import java.util.TreeSet;

public class UglyNumbers {

    public static long uglyNNumber(long n)
    {

        TreeSet<Long> tree = new TreeSet<>();
        int i = 1;
        tree.add(1L);

        while(i < n){
            long temp= tree.pollFirst();
            tree.add(temp*2);
            tree.add(temp*3);
            tree.add(temp*5);
            i++;
        }

        return tree.pollFirst();

    }
    public static void main(String args[]){
        System.out.println(uglyNNumber(150));
    }
}
