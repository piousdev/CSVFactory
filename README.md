# CSV Factory

CSV Factory is a Java program which generates a CSV file with data that is selected at random. It uses different classes and methods to generate rows of data at random and write them to a CSV file.

## Classes

### CSVConstants

This class holds the constant values used for generating the CSV data. It contains arrays of first names, last names, reasons for appointment, and department names.

### CsvRow

This class represents a single row in the CSV data. It holds the values for first name, last name, reason for appointment, department, and date.

### CsvRowGenerator

This class is responsible for generating random CsvRow objects. It uses the `RandomSelector` class to select random values from the arrays in the `CSVConstants` class. The date is randomly generated within the current month.

### CsvWriter

This class writes the generated CsvRow objects to a CSV file. You can specify the file path when calling the `writeCsv` method.

### RandomSelector

This class has a static method `selectRandom` that selects a random element from a given array.

### Application

This is the main class that ties everything together. It generates a specified number of CsvRow objects, then writes them to a CSV file.

## Usage

```java
public class Application {
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
```
In the `Application` class, you can adjust the number of rows to be generated and the file path where the CSV file will be saved. Make sure to provide an absolute path to prevent a `FileNotFoundException`.

## Important Notes

- The `CsvRowGenerator` class generates a random date in the current month for each row.
- The department field in the `CsvRow` class is only filled if the reason for the appointment is "Appointment". Otherwise, it is left null.
- The `CsvWriter` class handles null department fields gracefully by writing an empty string in the CSV file.

## Dependencies

The project uses the `org.jetbrains.annotations.NotNull` annotation, so you'll need to include the JetBrains annotations library in your project.

## Build & Run

Compile and run the `Application` class. Make sure to update the file path in the `Application` class before running the program. The CSV file will be written to the specified location.

## License

This project is licensed under the terms of the MIT license.

*This is a re-upload from one of my exercises at BeCode*