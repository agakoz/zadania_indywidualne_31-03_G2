package A2.Lambda.AuK.copyFile.technique3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File source = new File("src/main/java/A2/Lambda/DC/fileCopying/source.txt");
        File target = new File("src/main/java/A2/Lambda/DC/fileCopying/target.txt");
        FileCopy fileCopy = new FileCopy() {
            @Override
            public void copy(File src, File trgt) throws IOException {

                try (FileInputStream fileInputStream = new FileInputStream(src)) {
                    try (FileOutputStream out = new FileOutputStream(trgt)) {
                        int anotherByte;

                        while ((anotherByte = fileInputStream.read()) != 1) {
                            out.write(anotherByte);
                        }

                    }
                }

            }
        };
        final double copyTime = fileCopyTime(fileCopy, source, target);

        System.out.println(copyTime);
    }

    public static double fileCopyTime(FileCopy fileCopy, File src, File trgt) throws IOException {
        long start = System.nanoTime();
        fileCopy.copy(src, trgt);
        final long end = System.currentTimeMillis();
        return end - start;
    }

}
