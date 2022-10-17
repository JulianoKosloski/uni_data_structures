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

    static int partition(int[] array, int begin, int end) {
        int pivot = end;

        int counter = begin;
        for (int i = begin; i < end; i++) {
            if (array[i] < array[pivot]) {
                int temp = array[counter];
                array[counter] = array[i];
                array[i] = temp;
                counter++;
            }
        }
        int temp = array[pivot];
        array[pivot] = array[counter];
        array[counter] = temp;
    
        return counter;
    }

    static void quickSort(int[] array, int begin, int end) {

        if (end <= begin) { //stopping condition
            return;
        }

        int pivot = partition(array, begin, end);
        quickSort(array, begin, pivot-1);
        quickSort(array, pivot+1, end);

        System.out.println("Array sorted with divide and conquer/quick!");
    }

    // TESTING RECURSION

    static long factorial(int n){

        if (n < 0) { //stopping condition
            return 0;
        } else if (n > 20) {
            System.out.println("Numero muito grande! ---- " + n);
            return 0;
        }

        long result = n * fac(n-1);

        System.out.println("O resultado do fatorial de " + n + ": " + result);
        return result;
    }

    static long fac(int n) {

        long result;
    
        if (n == 0) {
            result = 1;
            return result;
        } 

        result = n * fac(n-1); 

        return result;
    }

    static void printFibonacci(int n) {
        
        //where n is the number of entries in the fibonacci series
        if (n <= 2) {
            System.out.println("Not a valid position!");
            return;
        }

        n = n-3;

        System.out.println(1);
        System.out.println(1);

        fibo(1, 1, n);

        System.out.println("Sequence ended with " + (n + 3) + " entries!");

    }

    static void fibo(int previous, int current, int entries) {

        if(entries < 0) {
            return;
        }

        entries--;
        int next;
        next = previous + current;
        previous = current;
        current = next;

        System.out.println(next);

        fibo(previous, current, entries);
    }

    public static void main(String[] args) {

        int[] sorte = {1, 3, 5, 11};

        // Arrays.sort(sorte); //the std method uses quicksort

        // bubbleSort(sorte);
        // insertionSort(sorte);
        // selectionSort(sorte);
        // mergeSort(sorte, 0 , sorte.length-1);
        // quickSort(sorte);

        int seq = 20;
        printFibonacci(seq);


    }
}





