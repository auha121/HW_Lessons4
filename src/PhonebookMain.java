public class PhonebookMain {

    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();
        phonebook.add("Ivanov", "123456");
        phonebook.add("Petrov", "1234567");
        phonebook.add("Ivanov", "987654");
        phonebook.add("Sidorov", "123567");
        phonebook.add("Smith", "7654321");

        System.out.println(phonebook.get("Ivanov"));
    }
}
