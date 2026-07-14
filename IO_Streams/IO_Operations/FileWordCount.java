package IO_Operations;



import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeMap;

public class FileWordCount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter input file name: ");
        String inputFile = sc.nextLine();

        System.out.print("Enter output file name: ");
        String outputFile = sc.nextLine();

        TreeMap<String, Integer> map = new TreeMap<>();

        try {
            Scanner file = new Scanner(new File(inputFile));

            while (file.hasNext()) {
                String word = file.next();

                if (map.containsKey(word)) {
                    map.put(word, map.get(word) + 1);
                } else {
                    map.put(word, 1);
                }
            }

            file.close();

            FileWriter fw = new FileWriter(outputFile);

            for (String key : map.keySet()) {
                fw.write(key + " : " + map.get(key) + "\n");
            }

            fw.close();

            System.out.println("Word count written to output file.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}