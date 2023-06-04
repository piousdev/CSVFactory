package csv.factory;

import java.time.LocalDate;

/**
 * Class representing a single row in the CSV data
 */
public class CsvRow {
    /**
     * Constants for CsvRow
     */
    private String firstName;
    private String lastName;
    private String reason;
    private String department;
    private LocalDate date;

    /**
     * Constructor for CsvRow
     * @param firstName
     * @param lastName
     * @param reason
     * @param department
     * @param date
     */

    public CsvRow(String firstName, String lastName, String reason, String department, LocalDate date) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.reason = reason;
        this.department = department;
        this.date = date;
    }

    /**
     * Default constructor for CsvRow
     */
    public CsvRow() {}

    /**
     * Getters and setters for CsvRow
     */
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}