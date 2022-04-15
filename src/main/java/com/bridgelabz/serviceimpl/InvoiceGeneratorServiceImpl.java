package com.bridgelabz.serviceimpl;

import com.bridgelabz.service.InvoiceGeneratorService;

/*********************************************************************
 * Purpose: class for Implementation Of InvoiceGeneratorService.
 *
 * @author Mangesh Bhujang
 * @version 1.0
 * @since 12-04-2022
 *
 **********************************************************************/
public class InvoiceGeneratorServiceImpl implements InvoiceGeneratorService {
    /**
     * Method :- Method to Calculate Total Fare.
     *
     * @param distance Passing Input as Distance
     * @param time     Passing Input as a Time
     * @return Returning Total Fare
     */
    @Override
    public double calculateFare(double distance, int time) {
        double totalFare = distance * MINIMUM_COST_PER_KILOMETER + time * COST_PER_TIME;
        return totalFare;
    }
}
