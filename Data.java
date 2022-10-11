import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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
                    System.out.println("Found the sum for value " + sum + ". Values: " + intArray[i] + " and " + intArray[j]);
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
    static void sortSumCheck(int[] intArray, int sum) { // O(n.log(n)) --> time complexity of the sorting algorithm

        Arrays.sort(intArray);

        int sumCounter = 0;

        int end = intArray.length - 1;
        int start = 0;

        while (start < end) {

            int currentSum = intArray[start] + intArray[end];
            if (currentSum == sum) {
                System.out.println("Found the sum for value " + sum + ". Values: " + intArray[start] + " and " + intArray[end]);
                sumCounter++;
                start++;
            } else if (currentSum < sum) {
                start++;
            } else if (currentSum > sum) {
                end--;
            }
        }

        if (sumCounter == 0) {
            System.out.println("No sum found for value " + sum);
        } else {
            System.out.println("Sums found: " + sumCounter);
        }

    }

    // hash approach
    static void hashSumCheck(int[] intArray, int sum) { //O(n) but uses O(n) extra memory (space)

        Map<Integer, Integer> map = new HashMap<>();
        int sumCounter = 0;


        for (int i= 0; i<intArray.length; i++) {

            int diff = sum - intArray[i];
            if (map.containsKey(diff)) {
                System.out.println("Found the sum for value " + sum + ". Values: " + intArray[i] + " and " + intArray[map.get(diff)]);
                sumCounter++;
            }

            map.put(intArray[i], i);

        }

        if (sumCounter == 0) {
            System.out.println("No sum found for value " + sum);
        } else {
            System.out.println("Sums found: " + sumCounter);
        }

    }

    public static void main(String[] args) {

        int[] numbers = {3, 7, 14, 28, 2, 31, 5};

        System.out.println("Using brute force:"); 

        Data.bruteSumCheck(numbers, 20);
        Data.bruteSumCheck(numbers, 33);
        Data.sortSumCheck(numbers, 8);

        // System.out.println("Using sorting:"); 

        // Data.sortSumCheck(numbers, 20);
        // Data.sortSumCheck(numbers, 33);
        // Data.sortSumCheck(numbers, 8);

        // System.out.println("Using a HashMap:"); 

        // Data.hashSumCheck(numbers, 20);
        // Data.hashSumCheck(numbers, 33);
        // Data.hashSumCheck(numbers, 8);

        

















    }
}
