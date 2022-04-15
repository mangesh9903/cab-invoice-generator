package com.bridgelabz.cabinvoicegeneratortest;

import com.bridgelabz.model.Ride;
import com.bridgelabz.service.InvoiceGeneratorService;
import com.bridgelabz.serviceimpl.InvoiceGeneratorServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class InvoiceServiceTest {

    InvoiceGeneratorService invoiceGeneratorService;

    @Before
    public void setUp() throws Exception {
        invoiceGeneratorService = new InvoiceGeneratorServiceImpl();
    }

    @Test
    public void givenDistanceAndTime_shouldReturnTotalFare() {
        double distance = 2.0;
        int time = 5;
        double fare = invoiceGeneratorService.calculateFare(distance, time);
        Assert.assertEquals(25, fare, 0.0);
    }

    @Test
    public void givenLessDistanceAndTime_shouldReturnMinFare() {
        double distance = 0.1;
        int time = 1;
        double fare = invoiceGeneratorService.calculateFare(distance, time);
        Assert.assertEquals(5, fare, 0.0);
    }

    @Test
    public void givenMultipleRides_shouldReturnTotalFare() {
        Ride[] rides = {new Ride(2.0, 5),
                new Ride(0.1, 1)
        };
        double fare = invoiceGeneratorService.calculateFare(rides);
        Assert.assertEquals(30, fare, 0.0);
    }

    @Test
    public void givenMultipleRides_shouldReturninvoiceSummary() {
        Ride[] rides = {new Ride(2.0, 5),
                new Ride(0.1, 1)
        };
        InvoiceSummary summary = invoiceGeneratorService.getInvoiceSummary(rides);
        InvoiceSummary expectedInvoiceSummary = new InvoiceSummary(2, 30.0);
        Assert.assertEquals(expectedInvoiceSummary, summary);
    }

}
