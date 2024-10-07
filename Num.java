import java.util.LinkedList;
import java.util.Scanner;
/** @param Num class accepts values for a Linked List */
/** This class takes user's integer input and creates a Linked List  */


public class Num {
    private LinkedList<Integer> numbers;
    /** private linked listS */
    public Num(){
        numbers = new LinkedList<>();
        /** create Linked List named 'numbers' */
    }
    public void addNumbers(int n){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++){
            System.out.println("Enter a number: ");
            int x = sc.nextInt();
            numbers.add(x);
            /** for loop to keep accepting values */
        }
    System.out.println("You've submitted the following list: " + numbers);
    }
    /** display unsorted list */

    public LinkedList<Integer> getNumbers(){
        return numbers;
        /** deliver the class to other classes */



    }
}
