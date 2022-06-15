import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] animals = {"cat", "dog", "mouse", "lion", "cat", "rat", "pig", "cow", "dog", "hamster", "bull", "donkey", "sheep"};
        HashMap<String, Integer> fetus = new HashMap<>();
        for (String x : animals) {
            fetus.put(x, fetus.getOrDefault(x, 0) + 1);
        }
        System.out.println(fetus);   // 1 задание






        PhoneBook book = new PhoneBook(); // 2 задание
        book.addNamePhone("Mike", "111-11-11");
        book.addNamePhone("Bob", "222-22-22");
        book.addNamePhone("Fred", "333-33-33");
        book.addNamePhone("Kate", "444-44-44");
        book.addNamePhone("Megan", "555-55-55");
        book.addNamePhone("Sophie", "666-66-66");
        book.addNamePhone("Mike", "777-77-77");
        book.addNamePhone("Sarah", "888-88-88");



        book.printCheck("Mike");
        book.printCheck("Bob");
        book.printCheck("Sarah");
        book.printCheck("Kate");
        book.printCheck("Megan");


}
}