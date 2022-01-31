package cursor_education_JB;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        try{
        //Or with anonymous ('unnamed') objects
        PrintWriter p = new PrintWriter(new BufferedWriter(new FileWriter("task.txt")));

        p.println("  Write a main program that copies a given text file");
        p.println("into another file using SimpleReader to read the");
        p.println("input file and SimpleWriter to write the output");
        p.println("file. The names of the input text file to be copied");
        p.println("and of the destination file where the copy is to be");
        p.println("rsaved are provided as command-line arguments. Assume");
        p.println("that appropriate arguments will be provided and no error");
        p.println("checking is necessary. The command-line arguments are");
        p.println("accessible by your main program through the String[]");
        p.println("print args array parameter to the main method.");
        p.println("  ");
        p.println("  Copy and modify the previous main program so that it");
        p.println("handles all possible IOExceptions and main will not");
        p.println("throw any IOException. Output meaningful error message(s)");
        p.println("if an IOException occurs.");
        p.println("  ");
        p.println("  *** Copy and modify the previous main program so that it");
        p.println("also includes appropriate error checks on the command line");
        p.println("arguments, e.g., missing arguments, missing input file,");
        p.println("non-readable input file, etc. (The java.io.File class");
        p.println("provides helpful methods to check some of the possible errors.)");

        p.close();
    } catch (Exception e) {
    }
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

