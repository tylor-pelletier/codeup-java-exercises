import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileIO {

    public static void main(String[] args) {

        String directory = "reports";
        String fileName = "reportOne.txt";
        Path reportsDirectory = Paths.get(directory);
        Path reportsFile = Paths.get(directory, fileName);

        // boolean of if the directory or file exists
        System.out.println(Files.exists(reportsDirectory));
        System.out.println(Files.notExists(reportsDirectory));
        System.out.println(Files.exists(reportsFile));
        System.out.println(Files.notExists(reportsFile));

        // if the directory does not exist, make the directory
        if (Files.notExists(reportsDirectory)) {
            try {
                Files.createDirectories(reportsDirectory);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // if the file does not exist, make the file
        if (!Files.exists(reportsFile)) {
            try {
                Files.createFile(reportsFile);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // read through all the lines in the file and print them out
        List<String> firstReport = null;
        try {
            firstReport = Files.readAllLines(reportsFile);
            System.out.println(firstReport);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // gets rid of everything in the file but what is added in this new list
        List<String> reportExtras = new ArrayList<>();
        reportExtras.add("locations");
        reportExtras.add("managers");

        try {
            Files.write(reportsFile, reportExtras);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // append to the list without getting rid of anything
        reportExtras = new ArrayList<>();
        reportExtras.add("workers");
        reportExtras.add("production");
        reportExtras.add("costs");

        try {
            Files.write(reportsFile, reportExtras, StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // replace one string with a different string


    }
}