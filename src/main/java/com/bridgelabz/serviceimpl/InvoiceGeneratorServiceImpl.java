package com.bridgelabz.serviceimpl;

import com.bridgelabz.cabinvoicegeneratortest.InvoiceSummary;
import com.bridgelabz.model.Ride;
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
     * @return Returning totalFare Or MINIMUM_FARE
     */
    @Override
    public double calculateFare(double distance, int time) {
        double totalFare = distance * MINIMUM_COST_PER_KILOMETER + time * COST_PER_TIME;
        if (totalFare < MINIMUM_FARE)
            return MINIMUM_FARE;
        else
            return totalFare;
    }

    /**
     * Method :- Method for Calculate Fare for Multiple Rides.
     *
     * @param rides Passing Multiple Rides
     * @return Returning Total Fare of Multiple Rides.
     */
    @Override
    public double calculateFare(Ride[] rides) {
        double totalFare = 0;
        for (Ride ride : rides) {
            totalFare = totalFare + this.calculateFare(ride.distance, ride.time);
        }
        return totalFare;
    }

    /**
     * Method :- Method For Calculate Invoice Summary.
     *
     * @param rides passing total rides
     * @return returning invoice sumaary.
     */
    @Override
    public InvoiceSummary getInvoiceSummary(Ride[] rides) {
        double totalFare = calculateFare(rides);
        return new InvoiceSummary(rides.length, totalFare);
    }
}
