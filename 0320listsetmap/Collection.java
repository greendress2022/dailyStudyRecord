package listsetmap;

import java.util.ArrayList;
import java.util.Iterator;
//three ways to iterate an arraylist
public class Collection {
    public static void main(String[] args) {
        ArrayList<String> strList = new ArrayList<>();
        strList.add("Lisa");
        strList.add("Frank");
        strList.add("Peter");
        System.out.println(strList.toString());
        System.out.println(strList);
        System.out.println(strList.contains(""));
        strList.add("Frank");
        strList.add(0, "Alan");// unique method, add in a specific index
        //strList.removeAll(strList);
        System.out.println(strList.isEmpty());
        System.out.println(strList.size());
        Iterator it = strList.iterator();
//        while(it.hasNext()){
//           String s =(String) it.next();   //notice here, it.next() returns
//            if(s=="Lisa"){
//                strList.add("LLLLLL");
//            }
        //iterator drawback:ConcurrentModificationException but for loop can solve this
        for (int i = 0; i < strList.size(); i++) {
            String s = strList.get(i);
            if (s.equals("Lisa")) {
                strList.add("it works");
            }
            System.out.println(s);
        }
        //strong for: clear short
        for (String s : strList)
            System.out.println(s);
    }


}



