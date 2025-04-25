package org.howard.edu.lspfinal.question3;

/**
 * Abstract base class since this class cannot and should not be used to make an object directly.
 */
public abstract class ReportTemplate {

    /**
     * Template method that defines the report generation process.
     */
    public final void generateReport() {
        loadData();
        formatData();
        printReport();
    }

    /**
     * Loads the data required for the report.
     */
    protected abstract void loadData();

    /**
     * Formats the loaded data for the report.
     */
    protected abstract void formatData();

    /**
     * Prints the final report.
     */
    protected abstract void printReport();
}
