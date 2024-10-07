/**
 * @author Daniel Tackie
 * @since Week 4 of CSC6301

 * @param Main class takes two classes(one that creates a linked list) and another that(sorts the linked list) and implements it into one program
 */

import java.util.LinkedList;
import java.util.Scanner;
/** 
 * This class ask the user for a list length and uses Sortlist class and Num class to display a sorted list
 * import Java Collections Framework */

public class Main{
    /** public class that accepts the desired list length
     */
        public static void main(String[] args){
            /** Main Function */
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers do you want to add? ");
        int n = sc.nextInt();
        /** accepts user list length */
        
        Num listInUse = new Num();
        listInUse.addNumbers(n);
        /**connecting main function to num class */

        SortList sorted = new SortList();
        LinkedList<Integer> numbers = listInUse.getNumbers();
        sorted.sort(numbers);
        sorted.afterSort(numbers);
        /**connecting main function to sortlist class */

        sc.close();
        /**closing program */
        }
}
