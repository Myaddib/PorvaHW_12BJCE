package cursor_education_JB;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        String file1 = "task.txt";
        String file2 = "taskOutput.txt";

        File file = new File(file2);
        file.createNewFile();
        FileReader inputStream = null;
        FileWriter outputStream = null;

        try {
            inputStream = new FileReader(file1);
            outputStream = new FileWriter(file2);

            int a;
            while ((a = inputStream.read()) != -1) {
                outputStream.write(a);
            }

        } catch (IOException e) {
            System.err.println(e.getMessage());

        } finally {
            inputStream.close();
            outputStream.close();
        }
    }
}

