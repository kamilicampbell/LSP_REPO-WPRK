package org.howard.edu.lspfinal.question3;

/**
 * Implementation of ReportTemplate for Inventory reports.
 */
public class InventoryReport extends ReportTemplate {

    @Override
    protected void loadData() {
        System.out.println("Loading inventory data...");
    }

    @Override
    protected void formatData() {
        System.out.println("Formatting inventory data...");
    }

    @Override
    protected void printReport() {
        System.out.println("Printing inventory report.");
    }
}
