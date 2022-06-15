import java.util.HashMap;
import java.util.HashSet;


// 2 задание
public class PhoneBook {
    HashMap<String, HashSet<String>> pb;

    public PhoneBook() {
        this.pb = new HashMap<>();
    }

    public void addNamePhone(String name, String phone) {
        HashSet<String> book = pb.getOrDefault(name, new HashSet<>());
        book.add(phone);
        pb.put(name, book);
    }

    public void printCheck(String name) {
        System.out.println("Имя: " + name + " | Номер телефона: " + pb.getOrDefault(name, new HashSet<>()));
    }
}