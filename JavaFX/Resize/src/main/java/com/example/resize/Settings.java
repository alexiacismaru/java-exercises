package com.example.resize;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Formatter;
import java.util.HashMap;
import java.util.Map;

public class Settings {
    private static final File SETTINGS_FILE = new File("settings.txt");//new File

    public static void saveSettings(Map<String, Double> settings) {
        try (Formatter formatter = new Formatter(SETTINGS_FILE)) {//Formatter that writes to SETTINGS_FILE
            //describes a format of a TextInputControl text by using two distinct mechanisms: A filter ( getFilter() )
            //that can intercept and modify user input
            for (Map.Entry<String, Double> entry : settings.entrySet()) {//iterate over each of the map's entries and write them to file
                formatter.format("%s=%.0f%n", entry.getKey(), entry.getValue());//each entry is to be written on a separate line
            }//save any setting of type Double
             //use Map for a unique String and value
        } catch (IOException exc) {
            //OK to handle the exception here and not in the client IF saving the window size is considered
            //as not being a major functionality of the client application
            exc.printStackTrace();//whenever an exception occurs, it should be caught and the stack trace is to be printed
        }//the Formatter should be closed under all circumstances --exception or no exception
    }

    public static Map<String, Double> loadSettings() {
        Map<String, Double> props = new HashMap<>();//new Map to store the settings
        try (FileReader fileReader = new FileReader(SETTINGS_FILE)) {//FileReader that reads from SETTINGS_FILE
            final char[] buffer = new char[100];//array of 100 bytes
            fileReader.read(buffer);//read the contents of the file into the buffer

            String[] lines = new String(buffer).trim().split("\n");//create a string based on the contents of the buffer
            for (String line : lines) {//parse the String's data and store each property into the Map
                String[] tokens = line.split("=");//split the data line per line --for each line, you can split
                                                  //the content by the '=' character
                String key = tokens[0];
                Double value = Double.parseDouble(tokens[1]);//split the data line per line
                props.put(key, value);//return the Map
            }
            return props;
        } catch (Exception exc) {
            return null;//whenever an exception occurs, it should be caught and null is to be returned
        }//the FileReader should be closed under all circumstances --exception or no exception
    }
}
