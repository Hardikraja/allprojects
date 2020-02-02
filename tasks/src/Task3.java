import java.util.HashSet;
import java.util.Iterator;

public class Task3 {
    public static void main(String[] args) {
        HashSet<String> hs1 = new HashSet<String>();
        HashSet<String> hs2 = new HashSet<String>();

        //first hashset
        hs1.add("A");
        hs1.add("B");
        hs1.add("C");
        hs1.add("D");
        hs1.add("E");

        //second hashset
        hs2.add("A");
        hs2.add("B");
        hs2.add("E");
        hs2.add("G");

        Iterator it1 = hs1.iterator();
        Iterator it2 = hs2.iterator();

        int flag = 0;
        String st = "";
        System.out.println("Common Strings ");
        while (it1.hasNext()){
            flag = 0;
            st = (String)it1.next();
            it2 = hs2.iterator();
            while (it2.hasNext()){
                if(st.equals((String)it2.next())){
                    flag=1;
                    break;
                }
            }

            if(flag==1){
                System.out.println(st);
            }
        }
    }
}
