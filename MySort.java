// import java.util.*;

public class MySort {

    // https://www.geeksforgeeks.org/sorting-in-java/
    // https://stackabuse.com/sorting-algorithms-in-java/

    // -----------BUBBLE SORT----------I will try to implement Bubble Sort by heart without ever having a class about it
    static void bubbleSort(int[] args) { //----> O(n^2)

        boolean sorted = false;

        while(!sorted) {

            sorted = true; //assumes it will be sorted, change the value if it's not

            for (int i=0; i < args.length -1; i++) {

                if (args[i] > args[i+1]) {
                    sorted = false;
                    int temp = args[i];
                    args[i] = args[i+1];
                    args[i+1] = temp;
                }

            }
        }
        System.out.println("Array sorted with bubbles!");
    }

    //------------INSERTION SORT----------- here I had to check some code to understand the logic
    static void insertionSort(int[] args) { // ------> O(n^2)

        for (int i = 1; i < args.length; i++) {

            int current = args[i];
            int lower = i - 1;

            while (lower >= 0 && current < args[lower]) { //shifts while it's not in the right position
                args[lower+1] = args[lower];
                lower--;
            }
            args[lower+1] = current;
        }
        System.out.println("Array sorted with insertion!");
    }

    //--------------SELECTION SORT-----------------
    static void selectionSort(int[] args) { // ----> O(n^2)

        for(int i = 0; i < args.length; i++) {
            int min = args[i]; 
            int copyIndex = i;

            for (int j = i+1; j < args.length; j++) {
                if (min > args[j]) { //if the minimum value is higher than any other value, take the lower of the two
                    min = args[j];
                    copyIndex = j;
                }
            }

            int temp = args[i];
            args[i] = min;
            args[copyIndex] = temp;
        }
        System.out.println("Array sorted with selection!");
    }

    //-----------------MERGE SORT--------------------- // this one is complex and uses recursion, but it has O(n.logn)
    static void mergeSort(int[] args, int left, int right) {
        
        if (right <= left) { //stopping condition (two subarrays meet)
            return;
        }

        int mid = (left+right)/2;

        mergeSort(args, left, mid); //sort left, including mid
        mergeSort(args, mid+1, right); // sort right, excluding mid
        merge(args, left, mid, right); // join arrays together

        System.out.println("Array sorted with divide and conquer/merge!");
    }

    static void merge(int[] array, int left, int mid, int right) {

        // length of subarrays
        int lengthLeft = mid - left + 1;
        int lengthRight = right - mid;
    
        // creating subarrays
        int leftArray[] = new int [lengthLeft];
        int rightArray[] = new int [lengthRight];
    
        // copying subarrays
        for (int i = 0; i < lengthLeft; i++) {
            leftArray[i] = array[left+i];
        }

        for (int i = 0; i < lengthRight; i++) {
            rightArray[i] = array[mid+i+1];
        }

        // iterators for temp subarrays
        int leftIndex = 0;
        int rightIndex = 0;
    
        // copying from leftArray and rightArray back into array
        for (int i = left; i < right + 1; i++) {
            // if there are still uncopied elements in R and L, copy minimum of the two
            if (leftIndex < lengthLeft && rightIndex < lengthRight) {
                if (leftArray[leftIndex] < rightArray[rightIndex]) {
                    array[i] = leftArray[leftIndex];
                    leftIndex++;
                }
                else {
                    array[i] = rightArray[rightIndex];
                    rightIndex++;
                }
            }
            // if all the elements have been copied from rightArray, copy the rest of leftArray
            else if (leftIndex < lengthLeft) {
                array[i] = leftArray[leftIndex];
                leftIndex++;
            }
            // if all the elements have been copied from leftArray, copy the rest of rightArray
            else if (rightIndex < lengthRight) {
                array[i] = rightArray[rightIndex];
                rightIndex++;
            }
        }
    }

    //-----------------QUICKSORT------------------- // basically the best, but sometimes heap sort wins over it

    static void quickSort(int[] args) {





        System.out.println("Array sorted with divide and conquer/quick!");
    }

    public static void main(String[] args) {

        int[] sorte = {33, 11, 4, 76, 9, 12, 80, 54, 41, 38, 22, 19, 2, 47};

        // Arrays.sort(sorte); //the std method uses quicksort

        // bubbleSort(sorte);
        // insertionSort(sorte);
        // selectionSort(sorte);
        mergeSort(sorte, 0 , sorte.length-1);
        // quickSort(sorte);

        for(int i: sorte) {
            System.out.println(i);
        }
        

    }
}





