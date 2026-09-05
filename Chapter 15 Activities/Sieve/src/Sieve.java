import java.util.Scanner;

import java.util.*;

/**
 * A program that implements the sieve of Eratosthenes.
*/



public class Sieve
{
    static ArrayList<Integer> nums = new ArrayList<>();



    static ArrayList<Integer> primes = new ArrayList<>();
    public static void main(String[] args)
    {
        /**Scanner in = new Scanner(System.in);
        System.out.println("Compute primes up to which integer?");
        int n = in.nextInt();
        **/

        // Your work goes here
        int cap = 1000;


        for (int i = 2; i <= cap; i++){
            nums.add(i);
        }

        System.out.print(sieve(2));
        
        
    }

    public static ArrayList<Integer>  sieve(int n)
    {
        primes.add(n);
        ArrayList<Integer> newNums = new ArrayList<>();
        for (int i = 0; i < nums.size(); i++)
        {
            if (! (nums.get(i) % n == 0))
            {
                newNums.add(nums.get(i));
            }
        }

        nums.clear();
        for (int i = 0; i < newNums.size(); i++){
            nums.add(newNums.get(i));
        }

        if (nums.size() == 0)
        {return primes;}
        else{
            sieve(nums.get(0));

        }

        return primes;
    }
}
