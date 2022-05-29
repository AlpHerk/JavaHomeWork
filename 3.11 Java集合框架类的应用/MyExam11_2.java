import java.util.*;

public class MyExam11_2 {
   public static void main(String[] args) {
       Set<String> set = new HashSet<>();
       set.add("Hello");
       set.add("World");
       set.add("Excel");
       set.add("Java");
       printSet(set);
   } 

   public static void printSet(Set<String> set) {
        Iterator<String> iter = set.iterator();
        while(iter.hasNext()) {
            System.out.println(iter.next() + " ");
        }            

   }
}
