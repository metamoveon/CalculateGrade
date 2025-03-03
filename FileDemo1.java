import java.io.*;

class FileDemo1{
    public static void main(String[] args) {
        File f = new File("score.txt");
        try {
            FileWriter writer = new FileWriter(f);
            writer.write("id_student1   70\n");
            writer.write("id_student2   75\n");
            writer.write("id_student3   54\n");
            writer.write("id_student4   45");
            writer.close();
            System.out.println("Write file complete");
            
        } catch (Exception e) { e.printStackTrace();
        } finally {
        }
    }
}