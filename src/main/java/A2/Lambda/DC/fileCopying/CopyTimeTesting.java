package A2.Lambda.DC.fileCopying;

import java.io.File;
import java.io.IOException;

public class CopyTimeTesting {
    public void testAllMethods() throws IOException {
        File source = new File("src/main/java/A2/Lambda/DC/fileCopying/source.txt");
        File target = new File("src/main/java/A2/Lambda/DC/fileCopying/target.txt");

        deleteFile(target);

        double time = streamCopy(FileCopyInterface.useIOStream, source, target);
        System.out.println("Czas IOStream: " + time);

        deleteFile(target);

        time = streamCopy(FileCopyInterface.useRAF, source, target);
        System.out.println("Czas RAF: " + time);

        deleteFile(target);

        time = streamCopy(FileCopyInterface.useStandard, source, target);
        System.out.println("Czas Standard: " + time);

    }

    public static double streamCopy(FileCopyInterface fileCopy, File source, File target) throws IOException {
        long start = System.currentTimeMillis();

        fileCopy.copy(source, target);

        long end = System.currentTimeMillis();
        return end - start;
    }

    private void deleteFile(File file) {
        if (file != null) {
            file.delete();
        }
    }

}
