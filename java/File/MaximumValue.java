import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MaximumValue {
    public static void main(String[] args) {
        BufferedReader reader = null;
        FileReader fr = null;
        int max = Integer.MIN_VALUE;
        try {
            fr = new FileReader("/Users/jyoti-alok/Desktop/java/File/Assignments/numbers.txt"); // open the file for reading
            reader = new BufferedReader(fr);
            String line;
            while ((line = reader.readLine()) != null) { // read each line in the file
                String[] words = line.split(" "); // split the line into words
                for (int i = 0; i < words.length; i++) {
                    String word = words[i];
                    try {
                        int num = Integer.parseInt(word.trim()); // try to parse the word as an integer
                        if (num > max) {
                            max = num; // update the maximum value if necessary
                        }
                    } catch (NumberFormatException e) {
                        // ignore non-integer words
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!"); // handle file not found error
            System.exit(1);
        } catch (IOException e) {
            System.out.println("Error reading file!");
            System.exit(1);
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.out.println("Error closing file!");
                }
            }
        }
        if (max == Integer.MIN_VALUE) {
            System.out.println("No integers found in file!");
            System.exit(1);
        }
        System.out.println("Maximum value: " + max);
    }
}

