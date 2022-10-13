import java.util.Hashtable; //synchronized, doesn't allow null values
import java.util.HashMap; //asynchronized, allows one null key and several null values --> generally preferred
import java.util.*;

public class Hash {
    // https://www.geeksforgeeks.org/hashing-in-java/

    // ADVANTAGES
    // get, put, and contains() method are all O(1) in general, so changing something into a hash map or table can speed up
    // processing, such as in the example at Data.java


    public static void main(String[] args) {

        Hashtable<String, Integer> clients_age = new Hashtable<String, Integer>(); //defines key, value pair types

        clients_age.put("John", 35);
        clients_age.put("Mary", 41);
        clients_age.put("Gertrude", 14);
        clients_age.put("Valentine", 78);
        clients_age.put("Moira", 50);

        System.out.println("Meus clientes: " + clients_age);

        System.out.println("John fez aniversario!");
        clients_age.put("John", 36);

        System.out.println("Meus clientes: " + clients_age);

        clients_age.remove("Moira");

        System.out.println("Lista atualizada de clientes: " + clients_age);

        for (Map.Entry<String, Integer> i : clients_age.entrySet()) { //advanced for loop
            System.out.println(i.getKey() + " " + i.getValue()); 
        } 

        System.out.println(clients_age.values());




    }
}
