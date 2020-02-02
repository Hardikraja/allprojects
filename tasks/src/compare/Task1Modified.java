package compare;

import java.util.*;

public class Task1Modified {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        int temp = 0;

        HashSet<Integer> random_hash_set = new HashSet<Integer>(n);
        ArrayList<Integer> prime_array_list = new ArrayList<Integer>();

        for (int i = 0 ; i < n ; i++)
        {
            random_hash_set.add((int)((Math.random()*95)+16));
        }

        Iterator random_hash_set_iterator = random_hash_set.iterator();

        System.out.println("Random numbers : - ");
        while (random_hash_set_iterator.hasNext())
        {
            temp = (int)random_hash_set_iterator.next();
            System.out.print(temp+" ");

            if(checkprime(temp))
            {
                prime_array_list.add(temp);
            }
        }
        System.out.println();
        System.out.println("Prime numbers : -"+prime_array_list);
        System.out.println("Smallest Value : - "+ getSmallestValueHashset(random_hash_set));
        System.out.println("Greatest Value : - "+getGreatestValueHashSet(random_hash_set));
    }

    public static boolean checkprime(int no)
    {
            int cnt = 0;
            for (int i = 2; i < Math.sqrt(no); i++) {
                if(no%i ==0){
                    cnt++;
                }
            }
            if(cnt==0){
                return  true;
            }
            else{
                return false;
            }
    }

    public static int getSmallestValueHashset(HashSet hs)
    {
        int smallestvalue = Integer.MAX_VALUE;
        Iterator iterator = hs.iterator();

        while (iterator.hasNext())
        {
            int number = (int)iterator.next();
            if(number <= smallestvalue)
            {
                smallestvalue = number;
            }
        }
        return smallestvalue;
    }

    public static int getGreatestValueHashSet(HashSet hs)
    {
        int greatestvalue = Integer.MIN_VALUE;
        Iterator iterator = hs.iterator();

        while (iterator.hasNext())
        {
            int number = (int)iterator.next();
            if(number >= greatestvalue)
            {
                greatestvalue = number;
            }
        }
        return greatestvalue;
    }
}
