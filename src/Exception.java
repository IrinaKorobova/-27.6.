import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exception {
    public static void main(String[] args) {
        try {
            readFile();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
    public static void readFile() throws FileNotFoundException {
        File file = new File("pjgg");
        Scanner scanner = new Scanner(file);
        System.out.println(file.getName());
    }
}
