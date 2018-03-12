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

            frequentRenterPoints += rental.getPoints();
            thisAmout += rental.getRentalAmount();

            result += "\t" + rental.getMovie().getTitle() + "\t" + String.valueOf(thisAmout) + "\n";
            totalAmout += thisAmout;
        }

        result += "Amount owed is " + String.valueOf(totalAmout) + "\n";
        result += "You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points";

        return result;
    }

    public static void main(String[] args) {
        Customer wangshuai = new Customer("王帅");
        wangshuai.addElement(new Rental(new Movie("乌龙山剿匪记",1),3));
        wangshuai.addElement(new Rental(new Movie("功夫",2),3));
        wangshuai.addElement(new Rental(new Movie("东京热不热",1),3));
        wangshuai.addElement(new Rental(new Movie("小猪佩奇",3),3));
        wangshuai.addElement(new Rental(new Movie("疯狂的石头",2),3));
        Customer linzhangbin = new Customer("林彰彬");
        linzhangbin.addElement(new Rental(new Movie("乌龙山剿匪记",MovieType.REGULAR),3));
        linzhangbin.addElement(new Rental(new Movie("功夫",MovieType.NEW_RELEASE),3));
        linzhangbin.addElement(new Rental(new Movie("东京热不热",MovieType.REGULAR),3));
        linzhangbin.addElement(new Rental(new Movie("小猪佩奇",MovieType.CHILDREN),3));
        linzhangbin.addElement(new Rental(new Movie("疯狂的石头",MovieType.NEW_RELEASE),3));

        System.out.println(wangshuai.statement());
        System.out.println();
        System.out.println(linzhangbin.statement());
    }
}

//        Rental Record for 王帅
//        乌龙山剿匪记	3.5
//        功夫	9.0
//        东京热不热	3.5
//        小猪佩奇	1.5
//        疯狂的石头	9.0
//        Amount owed is 26.5
//        You earned 7 frequent renter points
//
//        Rental Record for 林彰彬
//        乌龙山剿匪记	3.5
//        功夫	9.0
//        东京热不热	3.5
//        小猪佩奇	1.5
//        疯狂的石头	9.0
//        Amount owed is 26.5
//        You earned 7 frequent renter points
//
//        Process finished with exit code 0
