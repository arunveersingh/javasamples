package com.oopsfeedmecode.sample4;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MultiLineAndReadStringExample {

    void methodJava7() {
        try (BufferedReader reader = Files.newBufferedReader(Paths.get("data.csv"), Charset.defaultCharset())) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(",");
                // Process values
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    void methodJava8() {
        try (BufferedReader reader = Files.newBufferedReader(Paths.get("data.csv"))) {
            reader.lines()
                    .map(line -> line.split(","))
                    .forEach(values -> {
                        // Process values
                    });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    void methodAfterJava11() {
        try {
            String csvContent = Files.readString(Path.of("data.csv"));
            csvContent.lines()
                    .map(line -> line.split(","))
                    .forEach(values -> {
                        // Process values
                    });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
