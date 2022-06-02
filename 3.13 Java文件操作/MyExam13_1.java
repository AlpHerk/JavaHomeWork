import java.io.File;
import java.io.IOException;

public class MyExam13_1 {

    public static void main(String[] args) throws IOException {

        String dirName  = "test";
        String fileName = "exam.txt";

        File dir = new File(dirName);
        dir.mkdir();

        File file = new File(dirName + "\\" + fileName);
        file.createNewFile();
        file.setReadOnly();
    }
}
