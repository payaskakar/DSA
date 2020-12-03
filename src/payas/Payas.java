package payas;

import java.util.*;

public class Payas {
   public static void countStudents(){
       List<String> list=new ArrayList<>(9);
       list.add("alok");
       list.add("amit");
       list.add("suresh");
       list.add("amit");
       list.add("vidya");
       list.add("sindhu");
       list.add("vidya");
       list.add("vidya");
       list.add("alok");

       List<String>set=new ArrayList<>(5);
       set.add("alok");
       set.add("amit");
       set.add("suresh");
       set.add("vidya");
       set.add("sindhu");

       for(int i=0;i<5;i++)
       {
           int count=0;
           for (String s : list) {
               if (set.get(i).equals(s))
                   count++;
           }
           System.out.println(set.get(i)+" -> " + count);
       }
   }

    public static void main(String[] args) {
        countStudents();
    }
}
