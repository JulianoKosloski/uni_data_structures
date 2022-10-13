import java.util.LinkedList;

public class MyLinkedList {
    // https://www.geeksforgeeks.org/linked-list-in-java/


    public static void main(String[] args) {

        LinkedList<String> listaVIP = new LinkedList<String>();


        listaVIP.add("Johnny");
        listaVIP.add("ET Bilu");
        listaVIP.add("Madonna");
        listaVIP.add("Seya");
        listaVIP.add("Marionete");
        listaVIP.add("Regiane");

        listaVIP.remove("Johnny");

        System.out.println("Lista da festa:" + listaVIP);

        listaVIP.removeFirst();
        listaVIP.removeLast();

        System.out.println("Lista atualizada" + listaVIP);
    }
}
