import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class UnionIntersection {
     
      public static LinkedList<Integer> union(LinkedList<Integer> list1 , LinkedList<Integer> list2){

           List<Integer>list3 = new LinkedList<Integer>(list1);

           for(int i : list2){
                if(!list3.contains(i)){
                        list3.add(i);
                }
           }  
           return (LinkedList<Integer>) list3;    
      }

        public static LinkedList<Integer> intersection(LinkedList<Integer> list1 , LinkedList<Integer> list2){
           list1.retainAll(list2);
           return (LinkedList<Integer>) list1;    
      }

      public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);

         LinkedList<Integer> list1 = new LinkedList<Integer>();
         LinkedList<Integer> list2 = new LinkedList<Integer>();

         System.out.println("Enter the number of nodes for List1 :");
         int n1 = sc.nextInt();

         for(int i = 0 ; i < n1 ; i++){
                 int number = sc.nextInt();
                 if(list1.contains(number)){
                         System.out.println("Number is already added");
                         break;
                 }
                 list1.add(number);       
          }

         System.out.println("Enter the number of nodes for List1 :");
         int n2 = sc.nextInt();

         for(int i = 0 ; i < n2 ; i++){
                 int number = sc.nextInt();
                  if(list2.contains(number)){
                         System.out.println("Number is already added");
                         break;
                 }
                 list2.add(number);       
          }

        System.out.println(list2);

       

          System.out.println("Union of the two given list");
          LinkedList<Integer>list3 = union(list1,list2);
          Collections.sort(list3);
          System.out.println(list3);  
          
          System.out.println("Intersection of two given list");
          LinkedList<Integer>list4 = intersection(list1, list2);
          Collections.sort(list4);
          System.out.println(list4);

          sc.close();
   
      }
}
