package com.pract;

import java.util.Comparator;

public class AgeComparator implements Comparator {
    public  int compare(Object o1,Object o2){
        User u1 = (User) o1;
        User u2 = (User) o2;

        if(u1.age == u2.age){
            return  0;
        }
        else if(u1.age > u2.age){
            return 1;
        }
        else{
            return -1;
        }
    }
}
