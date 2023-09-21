package seminar1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class task7 {
    public static void main(String[] args) {
        write();
    }

    public static void write() {
        File file = new File("task7.txt");
        try {
            FileWriter writer = new FileWriter(file);
            String data = String.format("Name Surname Age %n " +
                    "Cate Smith 20 %n " +
                    "Paul Green 25 %n " +
                    "Mike Black 23");
            writer.write(data);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

