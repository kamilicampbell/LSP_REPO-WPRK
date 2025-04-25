package org.howard.edu.lspfinal.question3;

/**
 * Implementation of ReportTemplate for Sales reports.
 */
public class SalesReport extends ReportTemplate {

    @Override
    protected void loadData() {
        System.out.println("Loading sales data...");
    }

    @Override
    protected void formatData() {
        System.out.println("Formatting sales data...");
    }

    @Override
    protected void printReport() {
        System.out.println("Printing sales report.");
    }
}
