package javainaction.chap03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ex1 {

    public static void main(String[] args) {

        try {
            String oneLine = Ex1.processFile((b) -> b.readLine());
            String twoLine = Ex1.processFile((b) -> b.readLine() + b.readLine());

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }


    private interface BufferedReaderProcessor {
        String process(BufferedReader b) throws IOException;
    }

    private static String processFile(BufferedReaderProcessor p) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {
            return p.process(br);
        }
    }
}
