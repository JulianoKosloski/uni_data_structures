public class Array {
    // https://www.techiedelight.com/find-shortest-path-in-maze/

    // https://www.geeksforgeeks.org/arrays-in-java/

    // Shortest path from start to end of a maze (2D matrix of 0, 1, where 1 means an open path)

    private static boolean isOpen(int[][] matrix, int x, int y) {
        return (matrix[x][y] == 1) ? true : false;  // returns true if the coords correspond to an open path (1)
    }

    private static boolean isNewStep(boolean[][] visited, int x, int y) {
        return (visited[x][y] == true) ? false : true; // returns true if the coords haven't been used in the current iteration
    }

    private static int[] move(String direction, int x, int y) {

        switch(direction) {
            case "left":
                y = y - 1;
                break;
            case "right":
                y = y + 1;
                break;
            case "up":
                x = x - 1;
                break;
            case "down":
                x = x + 1;
                break;
            default:
                System.out.println("Invalid direction!");
        }

        int[] result = {x, y};
        return result;
    }

    static int findShortestPath(int[][] maze, int startRow, int startCol, int endRow, int endCol) {

        System.out.println("IT'S IMPOSSIBLE...just kidding");
        int stepShortest = 0;
        int stepCurrent = 0;
        int x = startRow, y = startCol;
        int [] coords;

        boolean[][] visited = new boolean[maze.length][maze[0].length];

        while(x < maze.length && y < maze[0].length) {
            
            if (isOpen(maze, x, y) && isNewStep(visited, x, y)) {
            
                coords = move("up", x, y);
                x = coords[0];
                y = coords[1];
    
                visited[x][y] = true;
                stepCurrent++;
            }

        }
        
        // maybe a do while for the first assignment, so I don't have to store a big number there
        stepShortest = (stepCurrent < stepShortest) ? stepCurrent : stepShortest; // assign a new value if the current path is shorter than the old one;

        System.out.println("The shortest path takes " + stepShortest + " steps.");
        return stepShortest;
    }

    public static void main(String[] args) {

        System.out.println("-------------MAZE---------------");

        int[][] maze = { //expected shortpath = 13
            {1,0,1,0,0,0,1,0,1,0},
            {0,1,1,0,0,1,1,0,1,1}, 
            {1,1,0,1,0,1,0,1,0,1},
            {0,1,1,1,0,1,0,1,1,1},
            {1,0,1,0,0,1,0,0,0,1},
            {0,0,1,1,1,1,0,0,1,1},
            {1,1,1,0,0,1,1,1,1,1},
            {0,1,0,0,0,0,1,0,1,0}
        };

        int steps = findShortestPath(maze, 7, 6, 0, 2);
        System.out.println(steps);





        // int[] numbers = new int[5]; //size of the array, can be acessed with the property .length
        
        // numbers[5] = 7; //this will through an exception, since it's out of bounds
        // numbers[3] = 2;
        // numbers [4] = 67;

        // System.out.println(numbers[3] + " and " + numbers[4]);
        // System.out.println("Is there something here? " + numbers[1]); //initializes values with 0 for int, null for reference types and false for boolean

        // int[][] lottery = {{3, 52, 14, 21, 23, 40}, {0, 1, 45, 76, 8, 13}};

        // for (int[] i : lottery) { //moves through 2D matrix and checks if numbers are even
        //     for(int j: i) {
        //         if (j % 2 == 0) {
        //             System.out.println("This number is even! " + j);
        //         }
        //     }
        // }

    }    
}
