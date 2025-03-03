import java.io.*;
class FileDemo2{
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("Demo.txt");
        } catch(Exception e) {e.printStackTrace();
        }
    }
}