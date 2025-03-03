import java.io.File;
import java.util.Scanner;
import java.io.PrintWriter;

class CalculateGrade {
    public static void main(String[] args) {
        PrintWriter output = null;
        try {
            Scanner input = new Scanner(new File("score.txt"));
            output = new PrintWriter(new File("Grade.txt"));
            String id_student = "";
            String grade = "";
            while (input.hasNext()) {
                id_student = input.nextLine();
                int pos = id_student.indexOf(" "); // หาตำแหน่งที่เป็นช่่องว่าง
                String scoreStr = id_student.substring(pos, id_student.length()); // หาตำแหน่งของคะแนน
                scoreStr = scoreStr.trim();
                double score = Double.parseDouble(scoreStr);

                if (score >= 80) {
                    grade = "A";
                } else if (score >= 70) {
                    grade = "B";
                } else if (score >= 60) {
                    grade = "C";
                } else if (score >= 50) {
                    grade = "D";
                } else
                    grade = "F";

                output.println(id_student + " " + grade);
                input.close();

            }
        } catch (

        Exception e) {
            e.printStackTrace();
        }
        output.close();

    }

}