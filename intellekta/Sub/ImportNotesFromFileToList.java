package com.intellekta.Sub;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;

public class ImportNotesFromFileToList {

    private static String rail = "Notes.txt";
    private static String rail1 = "Write.txt";

    public static void readNotesToList() throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(rail));
             BufferedWriter writer = new BufferedWriter(new FileWriter(rail1))) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
            }
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("File not found");
        } finally {
            System.out.println("Process finished");
        }
    }
    public static void writeCommentToNotes() throws IOException {
        Scanner scanner = new Scanner(System.in);
        try (FileWriter fileWriter = new FileWriter(rail)){
            while (scanner.hasNext()) {
                String text = scanner.nextLine();
                fileWriter.append("#").append(text);
            }
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("File not found");
        } finally {
            System.out.println("Process finished");
        }
    }
}
