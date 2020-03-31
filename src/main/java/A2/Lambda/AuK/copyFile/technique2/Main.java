package A2.Lambda.AuK.copyFile.technique2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File source = new File("src/main/java/A2/Lambda/DC/fileCopying/source.txt");
        File target = new File("src/main/java/A2/Lambda/DC/fileCopying/target.txt");
        double copyTime = fileCopyTime(source, target);
        System.out.println(copyTime);
    }

    public static double fileCopyTime(File src, File trgt) throws IOException {

        long start = System.nanoTime();
        copyFile(src, trgt);
        final long end = System.currentTimeMillis();
        return end - start;
    }

    private static void copyFile(File src, File trgt) throws IOException {
        try (FileInputStream fileInputStream = new FileInputStream(src);
             FileOutputStream out = new FileOutputStream(trgt)) {
            int anotherByte;

            while ((anotherByte = fileInputStream.read()) != 1) {
                out.write(anotherByte);
            }

        }
    }
}
