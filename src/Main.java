import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public Main()  {
    }

    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("Alfavit.txt");
        fileWriter.write("A a \n");
        fileWriter.write("B b \n");
        fileWriter.write("C c \n");
        fileWriter.write("... \n");
        fileWriter.write("... \n");
        fileWriter.write("Z z \n");
        fileWriter.write("0 \n");
        fileWriter.write("1 \n");
        fileWriter.write("2 \n");
        fileWriter.write("... \n");
        fileWriter.write("9 \n");
        fileWriter.close();
        FileReader fileReader = new FileReader("Alfavit.txt");
        Scanner scanner = new Scanner(fileReader);
        while(scanner.hasNextLine()){
            System.out.println(scanner.nextLine());

            fileReader.close();
        }
    }

}