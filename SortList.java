
import java.util.Collections;
import java.util.LinkedList;
/**
 This class sorts a linked list 
 @param Sortlist numbers the linked list of integers to sort. */

/** This class will sort an unsorted list using java collections sort method */

public class SortList {
    /** class that sorts unsorted Linked List */
    public void sort(LinkedList<Integer> numbers){
        /** Linked List */
        Collections.sort(numbers);
        /** sort function */
    }
    public void afterSort(LinkedList<Integer> numbers){   
        System.out.println("Linked List after sorting: " + numbers);
        /** prints sorted Linked List */
        }
    }
