import java.io.*;

public class Main {
    public static void main(String[] args) {
        java.lang.String inputFile = "input.txt";
        java.lang.String outputFile = "output.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            java.lang.String line;
            while ((line = reader.readLine()) != null) {
                String replacedLine = line.replaceAll("Nha Trang", "Vũng Tàu");
                writer.write(replacedLine);
                writer.newLine();
            }

            System.out.println("Thay thế và ghi file thành công!");
        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi khi đọc/ghi file: " + e.getMessage());
        }
    }
}
