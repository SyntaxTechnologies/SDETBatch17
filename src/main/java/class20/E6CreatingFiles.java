package class20;

import java.io.FileWriter;
import java.io.IOException;

public class E6CreatingFiles {


    public static void main(String[] args) throws IOException {
        FileWriter f=new FileWriter("Test.txt");
        for (int i = 0; i < 10000000; i++) {
            f.write("Batch 17 is great \n");
        }
        f.close();
    }
}
