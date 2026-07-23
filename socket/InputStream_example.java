package com.ems.socket;

import java.io.*;

public class InputStream_example {

    public static void main(String[] args) {

        try {
            File file = new File("src/com/ems/socket/client.txt");

            // Print the exact location of the file
            System.out.println("File Path : " + file.getAbsolutePath());

            // Create file if it doesn't exist
            if (!file.exists()) {
                file.createNewFile();
                System.out.println("File Created.");
            }

            // Write to file
            try (OutputStreamWriter out =
                         new OutputStreamWriter(new FileOutputStream(file))) {

                out.write("Har Har Mahadev\n");
                out.write("mahakaal\n");
                out.write("jay mahakaal\n");
                out.write("jay mahakaal\n");

                out.append('2');
            }

            System.out.println("Data Written Successfully.");
            System.out.println("File Size : " + file.length() + " bytes");



        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}