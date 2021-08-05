import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class userStrings {
    public static void main(String[] arg) {

        try {
            String file = "/Users/hniangthluai/Documents/userStrings.txt";
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            PrintWriter pw = new PrintWriter(bw);

            Scanner scan = new Scanner(System.in);
            System.out.println("Please enter Strings. After finished, enter \" Done \" ");


            while (true) {
                String input = scan.nextLine();
                if (input.equalsIgnoreCase("done"))
                    break;
                pw.print(input);
                pw.println();
            }
            pw.close();
            System.out.println(file);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
