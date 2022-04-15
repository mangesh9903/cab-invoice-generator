package com.bridgelabz.service;

import com.bridgelabz.cabinvoicegeneratortest.InvoiceSummary;
import com.bridgelabz.model.Ride;

/*********************************************************************
 * Purpose: Interface for Invoice Generator Service.
 *
 * @author Mangesh Bhujang
 * @version 1.0
 * @since 12-04-2022
 *
 **********************************************************************/
public interface InvoiceGeneratorService {
    double MINIMUM_COST_PER_KILOMETER = 10.0;
    int COST_PER_TIME = 1;
    double MINIMUM_FARE = 5;

    double calculateFare(double distance, int time);

    double calculateFare(Ride[] rides);

    InvoiceSummary getInvoiceSummary(Ride[] rides);
}
