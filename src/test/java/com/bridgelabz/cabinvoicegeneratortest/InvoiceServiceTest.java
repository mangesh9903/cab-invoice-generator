package com.bridgelabz.cabinvoicegeneratortest;

import org.junit.Assert;

public class InvoiceServiceTest {

    public void givenDistanceAndTime_shouldReturnTotalFare() {
        InvoiceGeneratorService invoiceGeneratorService = new InvoiceGeneratorServiceImpl();
        double distance = 2.0;
        int time = 5;
        double fare = invoiceGeneratorService.calculateFare(distance, time);
        Assert.assertEquals(25, fare, 0.0);

    }
}
