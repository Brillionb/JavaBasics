package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class JBexampl {
    public static void main(String[] args) {


        File file = new File("dataset_91007.txt");

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                System.out.print(scanner.nextLine() + " ");
            }
        } catch (
                FileNotFoundException e) {
            System.out.println("No file found: " + file);
        }
    }}
