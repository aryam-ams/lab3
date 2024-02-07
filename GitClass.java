import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GitClass {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("hello GitHub");
        readstudents();
    }
    public static void readstudents() throws FileNotFoundException {
        File file = new File("C:/Users/afsalem/IdeaProjects/SWE206LAB/src/students.txt");
        Scanner input = new Scanner(file);

        int count = 0;
        while (input.hasNextLine()) {
            String line = input.next();
            count++;
        }
        input.close();
        String[] students = new String[count];

        Scanner input2 = new Scanner(file);
        for (int i = 0; i < count; i++) {
            String line = input2.next();
            students[i] = line;
        }
        input2.close();
        for(String x: students){
            System.out.println(x);
        }
    }
    public static void randomgrouping(){
        System.out.println("groups made!");
    }
}
