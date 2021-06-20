//       Scanner input = new Scanner(System.in);

import java.util.*;

public  class Result {


           public static void main(String[]args){

               //int[] elements = new int[0];
       List<Integer> elements = null;
               rearrange(elements);
       }

       public static List<Integer> rearrange(List<Integer> elements) {
           // Write your code here
          elements = new ArrayList<>(){};
           elements.add(2);
           elements.add(8);
           elements.add(6);
           elements.add(8);
           System.out.println("The ascending order of the List with it`s binary  is % ");
       // the order of the arrayList
           Collections.sort(elements);
       // enhance is good for pulling

          // use set method to remove the duplicated method with using linked hashset
           Set<Integer> listWithoutDuplicates = new LinkedHashSet<Integer>(elements);
           elements.addAll(listWithoutDuplicates);
           System.out.println(listWithoutDuplicates);
         //  System.out.println("list without duplicates : " + elements);
          // System.out.println(elements);
           for(int k : listWithoutDuplicates) {
// all element list 1, 2,4, 1
               String h =  Integer.toBinaryString(k);
             //  System.out.println(+ k);

              // System.out.println(+ k);

 // String h =  Integer.toBinaryString(k);

  System.out.println(h.toString());

       }

         return elements;

          }
}











