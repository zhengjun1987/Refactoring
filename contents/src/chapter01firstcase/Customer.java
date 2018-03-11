package chapter01firstcase;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Author:Zheng Jun
 * E-mail:zhengjun1987@outlook.com
 * Date:2018/3/11 23:04
 * Project:Refactoring
 */
public class Customer {
    private String name;
    private Vector<Rental> rentalVector = new Vector<>();

    public Customer(String name) {
        this.name = name;
    }

    public void addElement(Rental obj) {
        rentalVector.addElement(obj);
    }

    public String getName() {
        return name;
    }

    public String statement() {
        String result = "Rental Record for " + getName() + "\n";
        double totalAmout = 0;
        int frequentRenterPoints = 0;

        Enumeration<Rental> rentalEnumeration = rentalVector.elements();
        while (rentalEnumeration.hasMoreElements()) {
            double thisAmout = 0;
            Rental rental = rentalEnumeration.nextElement();
            switch (rental.getMovie().getPriceCode()) {
                case Movie.REGULAR:
                    thisAmout += 2.0;
                    if (rental.getDayRented() > 2) {
                        thisAmout += (rental.getDayRented() - 2) * 1.5;
                    }
                    break;
                case Movie.NEW_RELEASE:
                    thisAmout += rental.getDayRented() * 3;
                    break;
                case Movie.CHILDRENS:
                    thisAmout += 1.5;
                    if (rental.getDayRented() > 3) {
                        thisAmout += (rental.getDayRented() - 3) * 1.5;
                    }
                    break;
            }

            frequentRenterPoints++;
            if (rental.getMovie().getPriceCode() == Movie.NEW_RELEASE && rental.getDayRented() > 1) {
                frequentRenterPoints++;
            }

            result += "\t" + rental.getMovie().getTitle() + "\t" + String.valueOf(thisAmout) + "\n";
            totalAmout += thisAmout;
        }

        result += "Amount owed is " + String.valueOf(totalAmout) + "\n";
        result += "You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points";

        return result;
    }
}
