package csv.factory;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.Random;

/**
 * Class for generating random CsvRow objects
 */

public class CsvRowGenerator {

    /**
     * Constants for CsvRowGenerator
     */
    private static final YearMonth CURRENT_MONTH = YearMonth.now();
    private static final Random RANDOM = new Random();

    /**
     * Generates a random CsvRow object
     * @return a random CsvRow object
     */
    public CsvRow generateRandomRow() {
        String firstName = RandomSelector.selectRandom(CSVConstants.FIRST_NAMES);
        String lastName = RandomSelector.selectRandom(CSVConstants.LAST_NAMES);
        String reason = RandomSelector.selectRandom(CSVConstants.REASONS);
        String department = reason.equals("Appointment") ? RandomSelector.selectRandom(CSVConstants.DEPARTMENTS) : null;
        LocalDate date = CURRENT_MONTH.atDay(RANDOM.nextInt(CURRENT_MONTH.lengthOfMonth()) + 1);

        CsvRow row = new CsvRow();
        row.setFirstName(firstName);
        row.setLastName(lastName);
        row.setReason(reason);
        row.setDepartment(department);
        row.setDate(date);

        return row;
    }
}

