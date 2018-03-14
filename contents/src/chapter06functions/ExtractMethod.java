package chapter06functions;

import chapter01firstcase.Customer;
import chapter01firstcase.Rental;

import java.util.Enumeration;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/3/14 14:15
 */
public class ExtractMethod extends Customer{
    public ExtractMethod(String name) {
        super(name);
    }

    void printOwing(){
        printBanner();
        printDetails(getOutstanding());
}

    private double getOutstanding() {
        double pOutstanding = 0.0;
        Enumeration<Rental> vElements = rentalVector.elements();
        //calculating outstanding
        while (vElements.hasMoreElements()) {
            Rental vRental = vElements.nextElement();
            pOutstanding += vRental.getRentalAmount();
        }
        return pOutstanding;
    }

    private void printDetails(double pOutstanding) {
        //print details
        System.out.println("name = " + name);
        System.out.println("amout = " + pOutstanding);
    }

    private void printBanner() {
        //print banner
        System.out.println("*************************************************");
        System.out.println("**************** Customer Owes ******************");
        System.out.println("*************************************************");
    }
}
