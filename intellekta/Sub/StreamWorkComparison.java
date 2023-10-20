package com.intellekta.Sub;

import java.io.*;
import java.util.*;

public class StreamWorkComparison {

    private static String fileName = "Note.txt";

    public static Long checkFileReaderWork() throws IOException {
        long start = System.currentTimeMillis();
        try(FileReader reader = new FileReader(fileName)) {
            int count;
            while ((count = reader.read())!= -1){
                System.out.println(count);
            }
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println(-1);
        }
        long finish = System.currentTimeMillis();
        Long time = start - finish;
        return time;
    }

    public static Long checkBufferedReaderWork() throws IOException {
        long start = System.currentTimeMillis();
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            int count;
            while ((count = bufferedReader.read()) != -1) {
                System.out.println(count);
            }
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println(-1);
        }
        long finish = System.currentTimeMillis();
        Long time = start - finish;
        return time;
    }
    public static Long checkScannerWork() throws IOException {
        long start = System.currentTimeMillis();

        try (Scanner scanner = new Scanner(fileName)) {
            while (scanner.hasNextLine()) {
                System.out.println(scanner);
            }
        }
        long finish = System.currentTimeMillis();
        Long time = start - finish;
        return time;

    }

    public static void compareReading() throws IOException {
        Long l1 = checkBufferedReaderWork();
        Long l2 = checkFileReaderWork();
        Long l3 = checkScannerWork();
        List<Long> list = new ArrayList<>();
        list.add(l1);
        list.add(l2);
        list.add(l3);
        Collections.sort(list);
        for (Long time : list) {
            if (time == null) {
                return;
            }
            System.out.println(time);
        }
    }
}
