import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MyExam13_3 {
    public static void main(String[] args) 
        throws IOException, ClassNotFoundException {

        class Book implements Serializable {
            String bookId;
            String bookName;
            int    count;

            Book(String bookId, String bookName, int count) {
                this.bookId = bookId;
                this.bookName = bookName;
                this.count  = count;
            }

            void print() {
                System.out.println(this.bookId + "\t\t" + this.bookName + "\t\t" + this.count);
            }
        }

        List<Book> books = new ArrayList<>();
        books.add(new Book("01", "大学计算机基础", 50));
        books.add(new Book("02", "C语言程序设计", 80));
        books.add(new Book("03", "Java程序设计", 100));

        String fileName = "bookInfo.dat";
        FileOutputStream   fo = new FileOutputStream(fileName);
        ObjectOutputStream ou = new ObjectOutputStream(fo);

        for(Book book : books) {
            ou.writeObject(book);
        }
        ou.flush();
        fo.close();
        ou.close();

        ObjectInputStream in = null;
        int total = 0;
        System.out.println("图书编号\t图书名字\t\t数量");
        try {
            in = new ObjectInputStream(new FileInputStream(fileName));
            while(true) {
                Book book = (Book)in.readObject();
                book.print();
                total += book.count;
            }
        } catch (EOFException e) {
            in.close();
            System.out.println("共有图书" + total + "册.");
        }
    }
}
