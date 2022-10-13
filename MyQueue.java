import java.util.*;
import java.util.LinkedList;

public class MyQueue {
    //Queue enforces FIFO (First-in, first-out), like a queue in real life
    //Queue is an interface, so it must be implemented by a class before it's ready to be used
    //other alternative is to use a class that already implements it, such as Linked List







    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<String>();

        fila.add("John"); //use add to put elements in the queue
        fila.add("Jesus");
        fila.add("Jenny");
        fila.add("Jorge");

        String first = fila.remove(); //removes the first in line
        System.out.println("O primeiro desistiu: " + first);
        System.out.println("Agora o primeiro eh " + fila.peek()); //view the head of the queue

        System.out.println("Fila atual: " + fila + ". Tamanho: " + fila.size()); //all general collection methods (contains, size,...) work here
        if (fila.contains("Jorge")) {
            System.out.println("TA AQUI O BICHO");
        } else {
            System.out.println("O bicho nao ta aqui ");
        }

        Iterator loop = fila.iterator();

        while (loop.hasNext()) { 
            System.out.println(loop.next() + " aaaaaaaaaaaAaaAaaAAaaaA");
        }

        



    }
}
