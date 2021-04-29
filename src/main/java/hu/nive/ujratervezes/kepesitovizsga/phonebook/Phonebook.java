package hu.nive.ujratervezes.kepesitovizsga.phonebook;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;

public class Phonebook {


    public void exportPhonebook(Map<String, String> contacts, String output){

        if(contacts == null || output == null || output.isEmpty()){
            throw new IllegalArgumentException("Output location not specified");
        }

        Path file = Path.of(output);

        String actualLine = null;

        try (BufferedWriter writer = Files.newBufferedWriter(file);){

            for(Map.Entry<String, String> entry : contacts.entrySet()){
                actualLine = entry.getKey() + ": " + entry.getValue() + "\n";
                writer.write(actualLine);
            }
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Cannot write to file", ioe);
        }


    }

}
