package pers.mingda.designpatterns.chapt3;

import java.io.InputStream;
import java.io.IOException;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import pers.mingda.designpatterns.chapt3.LowerCaseInputStream;

public class InputTest {
    public static void main(String[] args) throws IOException {
        int c;
        try {
            InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("src/main/java/pers/mingda/designpatterns/chapt3/test.txt")));

            while((c = in.read()) >= 0) {
                System.out.print((char)c);
            }

            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
//     public static void main(String[] args) {
//         System.out.println("workdin directory = " + System.getProperty("user.dir"));
//     }
}