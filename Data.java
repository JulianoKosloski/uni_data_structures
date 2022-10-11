import java.util.Arrays;


public class Data{

    // some interesting exercises and explanation here
    // https://kingrayhan.medium.com/500-data-structures-and-algorithms-practice-problems-and-their-solutions-b45a83d803f0
        
     // 1 - Find pair with a given sum in an array:

    // brute force approach
    static void bruteSumCheck(int[] intArray, int sum) { //O(n)² (nested loop)

        int sumCounter = 0;
        for (int i = 0; i<(intArray.length -1); i++) {
            for (int j = i+1; j<intArray.length; j++) {
                if (intArray[i] + intArray[j] == sum) {
                    System.out.println("Found the sum. Values: " + intArray[i] + " and " + intArray[j]);
                    sumCounter++;
                }
            }
        }

        if (sumCounter == 0) {
            System.out.println("No sum found for value " + sum);
        } else {
            System.out.println("Sums found: " + sumCounter);
        }
    }

    // sorting approach 
    static void sortSumCheck(int[] intArray, int sum) { // O(n.log(n))





    }


    public static void main(String[] args) {

        int[] numbers = {3, 7, 14, 28, 2, 31, 5};

        Data.bruteSumCheck(numbers, 20);
        Data.bruteSumCheck(numbers, 33);


















    }
}
