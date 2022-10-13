import java.util.Stack;

public class MyStack {
    // https://www.geeksforgeeks.org/stack-class-in-java/

    static void printStringStack(Stack<String> s) {
        for (String i : s) {
            System.out.println(i); 
        }
    }


    public static void main(String[] args) {

        Stack<String> fruits = new Stack<String>();

        if (fruits.empty()) {
            System.out.println("Nothing was added yet.");
        }

        fruits.push("Apple"); //apple is on top of the stack
        fruits.push("Banana"); //now banana is on top of the stack

        fruits.pop(); //now apple is back on top of the stack

        
        printStringStack(fruits); //should only print apple at this point
        
        fruits.push("Lemon");
        fruits.push("Orange");

        printStringStack(fruits); //iteration starts at the bottom of the stack

        System.out.println("This is on top: " + fruits.peek()); // peek() retrieves the element on top of the stack

        System.out.println("This is the Lemon position: " + fruits.search("Lemon")); //returns the position from the top of the stack (starts with 1) or -1 if there's no such element
    }
}

