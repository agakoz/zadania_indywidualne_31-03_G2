package A2.Lambda.JW.fileCopying;

import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class FileCopyingMachine {


    public void findCopyTime() throws IOException {

        String sourcePath = "src/main/java/A2/Lambda/JW/fileCopying/sourceJW.txt";
        String targetPath = "src/main/java/A2/Lambda/JW/fileCopying/targetJW.txt";
        File source = new File(sourcePath);
        File target = new File(targetPath);
        deleteFile(target);

        double firstTime = fileCopyTime(FileCopy.copyUsingInputOutputStream, source, target);
        System.out.println(firstTime);
        deleteFile(target);

        double secondTime = fileCopyTime(FileCopy.copyUsingFileChannel, source, target);
        System.out.println(secondTime);
        deleteFile(target);

        double thirdTime = fileCopyTime(FileCopy.copyUsingNewInputOutput, source, target);
        System.out.println(thirdTime);
        deleteFile(target);


    }

    public static double fileCopyTime(FileCopy fileCopy, File source, File target) throws IOException {
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
 interface FileCopy {
    void copy(File source, File target) throws IOException;
     FileCopy copyUsingInputOutputStream = (source, target) -> {
         try (FileInputStream in = new FileInputStream(source);
              FileOutputStream out = new FileOutputStream(target)) {
             int nextByte;
             while ((nextByte = in.read()) != -1) {
                 out.write(nextByte);
             }
         }
     };
      FileCopy copyUsingNewInputOutput = (source, target) -> {
          Path sourcePath = source.toPath();
          Path targetPath = target.toPath();
          Files.copy(sourcePath, targetPath, StandardCopyOption.REPLACE_EXISTING);
      };

      FileCopy copyUsingFileChannel = (source, target) -> {
          try(

                  FileChannel in = new FileInputStream(source).getChannel();
                  FileChannel out = new FileOutputStream(target).getChannel()) {
              out.transferFrom(in, 0, in.size());
          }


      };
}

