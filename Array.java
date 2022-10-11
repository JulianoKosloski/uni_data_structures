public class Array {
    // https://www.techiedelight.com/merge-two-arrays-satisfying-given-constraints/
    // https://www.techiedelight.com/find-shortest-path-in-maze/

    // https://www.geeksforgeeks.org/arrays-in-java/

    // Shortest path from start to end of a maze (2D matrix of 0, 1, where 1 means an open path)
    static void shortestPath(int[][] maze, int startX, int startY, int endX, int endY) {

        System.out.println("IT'S IMPOSSIBLE...just kidding");
        



    }

    public static void main(String[] args) {

        int[] numbers = new int[5]; //size of the array, can be acessed with the property .length
        
        // numbers[5] = 7; //this will through an exception, since it's out of bounds
        numbers[3] = 2;
        numbers [4] = 67;

        System.out.println(numbers[3] + " and " + numbers[4]);
        System.out.println("Is there something here? " + numbers[1]); //initializes values with 0 for int, null for reference types and false for boolean

        int[][] lottery = {{3, 52, 14, 21, 23, 40}, {0, 1, 45, 76, 8, 13}};

        for (int[] i : lottery) { //moves through 2D matrix and checks if numbers are even
            for(int j: i) {
                if (j % 2 == 0) {
                    System.out.println("This number is even! " + j);
                }
            }
        }

        int[][] maze = {
            {1,0,1,0,0,0,1,0,1,0},
            {0,1,1,0,0,1,1,0,1,1}, 
            {1,1,0,1,0,1,0,1,0,1},
            {0,1,1,1,0,1,0,1,1,1},
            {1,0,1,0,0,1,0,0,0,1},
            {0,0,1,1,1,1,0,0,1,1},
            {1,1,1,0,0,1,1,1,1,1},
            {0,1,0,0,0,0,1,0,1,0}
        };

    }
}
