package com.bridgelabz.cabinvoicegeneratortest;
/*********************************************************************
 * Purpose: class for Implementation Of InvoiceGeneratorService.
 *
 * @author Mangesh Bhujang
 * @version 1.0
 * @since 12-04-2022
 *
 **********************************************************************/
public class InvoiceSummary {
    private final int noOfRides;
    private final double totalFare;
    private final double averageFare;


    public InvoiceSummary(int noOfRides, double totalFare) {
        this.noOfRides = noOfRides;
        this.totalFare = totalFare;
        this.averageFare = this.totalFare / this.noOfRides;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InvoiceSummary summary = (InvoiceSummary) o;
        return noOfRides == summary.noOfRides && Double.compare(summary.totalFare, totalFare) == 0 && Double.compare(summary.averageFare, averageFare) == 0;
    }
}
