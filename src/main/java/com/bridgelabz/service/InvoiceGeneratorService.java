package com.bridgelabz.service;

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

    double calculateFare(double distance, int time);
}
