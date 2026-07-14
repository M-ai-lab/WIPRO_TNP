import java.util.Map;
import java.util.TreeMap;

public class Solution5 {

    private TreeMap<String, String> M1 = new TreeMap<>();

    public void saveCountryCapital(String countryName, String capital) {
        M1.put(countryName, capital);
    }

    public String getCapital(String countryName) {
        return M1.get(countryName);
    }

    public String getCountry(String capitalName) {
        for (Map.Entry<String, String> entry : M1.entrySet()) {
            if (entry.getValue().equals(capitalName)) {
                return entry.getKey();
            }
        }
        return "No Country with specified capital Name";
    }

    public void saveCapitalCountry(String countryName, String capital) {
        M1.put(countryName, capital);
    }

    public TreeMap<String, String> createCapitalCountryMap() {
        TreeMap<String, String> M2 = new TreeMap<>();

        for (Map.Entry<String, String> entry : M1.entrySet()) {
            M2.put(entry.getValue(), entry.getKey());
        }

        return M2;
    }

    public static void main(String[] args) {

        Solution5 obj = new Solution5();

        obj.saveCountryCapital("India", "Delhi");
        obj.saveCountryCapital("Japan", "Tokyo");

        System.out.println("Capital of India: " + obj.getCapital("India"));
        System.out.println("Country for Tokyo: " + obj.getCountry("Tokyo"));

        TreeMap<String, String> capitalCountryMap = obj.createCapitalCountryMap();

        System.out.println(capitalCountryMap);
    }
}