package cursor_education_JB;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        String file1 = "task.txt";
        String file2 = "taskOutput.txt";

        try (FileReader inputStream = new FileReader(file1); FileWriter outputStream = new FileWriter(file2)) {


            int a;
            while ((a = inputStream.read()) != -1) {
                outputStream.write(a);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



