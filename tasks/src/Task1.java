
import java.lang.reflect.Array;
import java.util.*;
public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();

        int[] arr;
        arr = new int[n];

        // random numbers greater than 15
        for (int i = 0; i < n ; i++) {

            arr[i] = (int)((Math.random()*15)+16);
        }

        List<Integer> arl = new ArrayList<Integer>(arr.length);
        List<Integer> primeal = new ArrayList<Integer>();

        // array to arraylist
        for (int temp : arr) {
            arl.add(temp);
        }

        //arraylist of numbers
        System.out.println("numbers :"+arl);

        //find prime numbers in array list
        System.out.print("Prime numbers : ");
        for (int it: arl) {
            int cnt = 0;
            for (int i = 2; i < Math.sqrt(it); i++) {
                if(it%i ==0){
                    cnt++;
                }
            }
            if(cnt==0){
                System.out.print(it +", ");
                primeal.add(it);
            }

        }
        System.out.println();
        System.out.println("arraylist of prime : "+primeal);

        Arrays.sort(arr);
        System.out.println("Smallest element : "+arr[0]);
        System.out.println("largest element : "+arr[arr.length-1]);
    }
}


/*

Output :-

Enter n :
15
numbers :[21, 28, 27, 16, 20, 26, 24, 29, 20, 25, 17, 30, 17, 20, 26]
Prime numbers : 29, 25, 17, 17,
arraylist of prime : [29, 25, 17, 17]
Smallest element : 16
largest element : 30

Process finished with exit code 0


*/
