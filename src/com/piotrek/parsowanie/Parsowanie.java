package com.piotrek.parsowanie;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Properties;
import java.nio.file.Path;
import java.util.Scanner;
import java.io.FileReader;
import java.io.Reader;

/**
 * Created by Piotr on 03.04.2016.
 */
public class Parsowanie{
    public static void main(String[] args) throws IOException {
        String fileName;
        System.out.print("Podaj nazwę pliku:");
        Scanner odczyt = new Scanner(System.in);
        fileName = odczyt.nextLine();
        Reader fileReader = new FileReader(fileName);
        Properties properties = new Properties();
        properties.load(fileReader);
        properties.list(System.out);
    }
}
