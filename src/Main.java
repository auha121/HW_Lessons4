import java.util.LinkedHashMap;

public class Main {

    public static void main (String[] args) {
        String[] str = {"one", "two", "three", "four", "five", "six", "seven", "eight", "five",
                           "ten", "two", "twelve", "thirteen", "four", "fifteen"};
        LinkedHashMap<String, Integer> HMStr = new LinkedHashMap<>();

        for (int i = 0; i < str.length; i++) {
            if (HMStr.containsKey(str[i])) {
                HMStr.put(str[i], HMStr.get(str[i]) + 1);
            }
            else {
                HMStr.put(str[i], 1);
            }
        }
        System.out.println(HMStr);
    }
}
