package User_package;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReferenceArray;

public class Mainuser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total users :-");
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<User> arrayList = new ArrayList<User>(n);

        String tempname;
        int tempage;
        User user;

        for (int i = 0 ; i < n ; i++)
        {
            System.out.println("Enter name ");
            tempname = sc.nextLine();
            System.out.println("Enter age ");
            tempage = Integer.parseInt(sc.nextLine());
            arrayList.add(new User(tempname,tempage));
        }

        Iterator iterator;
        iterator = arrayList.iterator();

        while (iterator.hasNext())
        {
            user = (User)iterator.next();
            System.out.println("Name :- "+user.getUser_name() + " ,Age :-" + user.getUser_age());
        }

        Collections.sort(arrayList,new AgeComparator());

        System.out.println("After sorting : - ");
        iterator = arrayList.iterator();
        while (iterator.hasNext())
        {
            user = (User)iterator.next();
            System.out.println("Name :- "+user.getUser_name() + " ,Age :-" + user.getUser_age());
        }




    }
}
