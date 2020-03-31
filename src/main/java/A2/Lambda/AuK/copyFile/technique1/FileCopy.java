package A2.Lambda.AuK.copyFile.technique1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public interface FileCopy {

    void copy(File src, File trgt) throws IOException;

    FileCopy useIOStream = (src, trgt) -> {
        try (FileInputStream fileInputStream = new FileInputStream(src)) {
            try (FileOutputStream out = new FileOutputStream(trgt)) {
                int anotherByte;

                while ((anotherByte = fileInputStream.read()) != 1) {
                    out.write(anotherByte);
                }

            }
        }
    };
}

