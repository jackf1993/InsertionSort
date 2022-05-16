/* author: Jack Farah
 * description: implementation of InsetionSort.
*/

public class Main {

    public static void main(String[] args) {

        int []array = {4, 5, 1, 3, 2};  //create array with predetermined elements.

        for(int i = 1; i < array.length  ; i++){ //incrementing through array indexes
            int temp = array[i];  //create a temp variable to hold the element we are comparing.
            int j;  //initialize j outside of second loop in order to use it again outside the loop's scope

            for(j = i; j >0 && array[j-1] > temp; j--){  //nested for loop that we will use for the insertion sorting algorithm.
                array[j] = array[j-1];           // compares the current index at index j to the index j-1 then loops to the next index.
            }                                   // and shifts the indexes to the right of which the conditions have met.
            array[j]= temp;    //finally sets the current index to the beginning of the array

        }


        for(int a =0; a < array.length; a++){  //prints out array after the insertion sorting is completed.
            System.out.print(array[a] +", ");
        }
        System.out.print("\b\b");

    }


}
