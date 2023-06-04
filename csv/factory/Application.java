package csv.factory;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

/**
 * Main class for the CSV factory
 */

public class Application {
    /**
     * Main method for the CSV factory
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        CsvRowGenerator generator = new CsvRowGenerator();
        CsvWriter writer = new CsvWriter();

        List<CsvRow> rows = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            rows.add(generator.generateRandomRow());
        }


        // note: this will throw java.io.FileNotFoundException error if the file path is not absolute
        try {
            writer.writeCsv(rows, "add-absolute-path/csv-factory.csv");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}