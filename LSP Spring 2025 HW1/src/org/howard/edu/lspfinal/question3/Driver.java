package org.howard.edu.lspfinal.question3;

/**
 * Demonstrates the usage of the ReportTemplate pattern with different report types.
 */
public class Driver {
    public static void main(String[] args) {
        ReportTemplate salesReport = new SalesReport();
        ReportTemplate inventoryReport = new InventoryReport();

        salesReport.generateReport();
        System.out.println();
        inventoryReport.generateReport();
    }
}
