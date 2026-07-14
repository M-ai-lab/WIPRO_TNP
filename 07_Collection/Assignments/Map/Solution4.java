

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution4 {
    public static void main(String[] args) {
        HashMap<String, Integer> contactList = new HashMap<>();
        contactList.put("Abc", 12567890);
        contactList.put("Def", 98765210);
        contactList.put("Ghi", 55512567);

        String nameToCheck = "Abc";
        if (nameToCheck != null && !nameToCheck.isEmpty()) {
            if (contactList.containsKey(nameToCheck)) {
                System.out.println(nameToCheck + "'s phone number: " + contactList.get(nameToCheck));
            } else {
                System.out.println(nameToCheck + " not found in contacts.");
            }
        } else {
            System.out.println("Invalid name to check.");
        }

        int numberToCheck = 98765432;
        if (contactList.containsValue(numberToCheck)) {
            System.out.println("Phone number " + numberToCheck + " found in contacts.");
        } else {
            System.out.println("Phone number " + numberToCheck + " not found in contacts.");
        }

        
        Iterator<Map.Entry<String, Integer>> iterator = contactList.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println("Name: " + entry.getKey() + ", Phone: " + entry.getValue());
        }
    }
}
