import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class fileReader {
    public static void main(String[] args) {
        String path = "/Users/hniangthluai/Documents/inputTest.csv";
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            String line;
            int row = 1;


            while ((line = br.readLine())!= null) {
                String[] values = line.trim().split(",");
                int max = Integer.parseInt(values[0]);

                for (int i = 0; i < values.length; ++i) {
                    int num = Integer.parseInt(values[i]);
                    if (num > max) {
                        max = num;
                    }
                }

                System.out.println("ROW " + row + ": " + max);
                row ++;
            }
            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
