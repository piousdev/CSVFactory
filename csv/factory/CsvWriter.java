package csv.factory;

import org.jetbrains.annotations.NotNull;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Class for writing CSV data to a file
 */
public class CsvWriter {

    /**
     * Writes the given rows to a CSV file
     * @param rows
     * @param filePath
     * @throws FileNotFoundException
     */
    public void writeCsv(@NotNull List<CsvRow> rows, String filePath) throws FileNotFoundException {
        try (PrintWriter writer = new PrintWriter(filePath)) {
            writer.println("firstname,lastname,reason,department,date");
            for (CsvRow row : rows) {
                writer.println(row.getFirstName() + "," + row.getLastName() + "," + row.getReason() + ","
                        + (row.getDepartment() == null ? "" : row.getDepartment()) + "," + row.getDate());
            }
        }
    }
}