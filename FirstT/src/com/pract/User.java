package com.pract;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class User {
    String uname;
    int age;

    public User(String uname, int age) {
        this.uname = uname;
        this.age = age;
    }

    public String getUname() {
        return uname;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many users are there ?");
        int n  = Integer.parseInt(sc.nextLine());
        ArrayList<User> al = new ArrayList<User>(n);

        String st ="";
        int nage = 0;
        for (int i = 0; i < n; i++) {
            st = sc.nextLine();
            nage = Integer.parseInt(sc.nextLine());
            al.add(new User(st,nage));
        }

        Iterator it = al.iterator();
        User tempobj ;
        while (it.hasNext()){
            tempobj = (User)it.next();
            System.out.println(tempobj.getUname()+" "+tempobj.getAge());
        }

        Collections.sort(al, new AgeComparator());
        System.out.println("After Sorting by Age ");
        it = al.iterator();
        while (it.hasNext()){
            tempobj = (User)it.next();
            System.out.println(tempobj.getUname()+" "+tempobj.getAge());
        }
    }
}
