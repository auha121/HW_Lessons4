import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Phonebook {
    private LinkedHashMap<String, ArrayList<String>> phonebook = new LinkedHashMap<>();

    public void add(String name, String number) {
        ArrayList<String> phonesAdd = phonebook.getOrDefault(name, new ArrayList<>());
        phonesAdd.add(number);
        phonebook.put(name, phonesAdd);
    }

    public ArrayList<String> get(String name) {
        return phonebook.get(name);
    }
}
