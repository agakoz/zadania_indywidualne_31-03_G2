package A2.Lambda.AuK.copyFile.technique1;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File source = new File("src/main/java/A2/Lambda/DC/fileCopying/source.txt");
        File target = new File("src/main/java/A2/Lambda/DC/fileCopying/target.txt");
        FileCopy fileCopy = FileCopy.useIOStream;
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
