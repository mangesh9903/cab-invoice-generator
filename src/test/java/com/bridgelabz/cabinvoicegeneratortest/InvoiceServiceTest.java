package com.bridgelabz.cabinvoicegeneratortest;

import com.bridgelabz.service.InvoiceGeneratorService;
import com.bridgelabz.serviceimpl.InvoiceGeneratorServiceImpl;
import org.junit.Assert;
import org.junit.Test;

public class InvoiceServiceTest {

    @Test
    public void givenDistanceAndTime_shouldReturnTotalFare() {
        InvoiceGeneratorService invoiceGeneratorService = new InvoiceGeneratorServiceImpl();
        double distance = 2.0;
        int time = 5;
        double fare = invoiceGeneratorService.calculateFare(distance, time);
        Assert.assertEquals(25, fare, 0.0);
    }

    @Test
    public void givenLessDistanceAndTime_shouldReturnMinFare() {
        InvoiceGeneratorService invoiceGeneratorService = new InvoiceGeneratorServiceImpl();
        double distance = 0.1;
        int time = 1;
        double fare = invoiceGeneratorService.calculateFare(distance, time);
        Assert.assertEquals(5, fare, 0.0);
    }

}
