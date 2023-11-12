package teacherExample;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{

    public static Scanner scanner = new Scanner(System.in);

    public static void main( String[] args ) {

        String untilSpace = scanner.next();
        String fullLine = scanner.nextLine();
        System.out.println(untilSpace);
        System.out.println(fullLine);

    }
}
