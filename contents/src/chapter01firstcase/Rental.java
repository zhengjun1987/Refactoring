package chapter01firstcase;

/**
 * Author:Zheng Jun
 * E-mail:zhengjun1987@outlook.com
 * Date:2018/3/11 23:03
 * Project:Refactoring
 */
public class Rental {
    private Movie movie;
    private int dayRented;

    public Rental(Movie movie, int dayRented) {
        this.movie = movie;
        this.dayRented = dayRented;
    }

    public Movie getMovie() {
        return movie;
    }

    public int getDayRented() {
        return dayRented;
    }

    public double getRentalAmount() {
        int priceCode = movie.getPriceCode();
        double thisAmout = 0;
        if (priceCode == 0) {
            return movie.getRentalAmount(dayRented);
        } else {

            switch (priceCode) {
                case Movie.REGULAR:
                    thisAmout += 2.0;
                    if (getDayRented() > 2) {
                        thisAmout += (getDayRented() - 2) * 1.5;
                    }
                    break;
                case Movie.NEW_RELEASE:
                    thisAmout += getDayRented() * 3;
                    break;
                case Movie.CHILDRENS:
                    thisAmout += 1.5;
                    if (getDayRented() > 3) {
                        thisAmout += (getDayRented() - 3) * 1.5;
                    }
                    break;
            }
        }
        return thisAmout;
    }

    public int getPoints() {
        int frequentRenterPoints=0;
        int priceCode = getMovie().getPriceCode();
        if (priceCode==0) {
            return movie.getPoints(dayRented);
        }else {
            frequentRenterPoints++;
            if (priceCode == Movie.NEW_RELEASE && getDayRented() > 1) {
                frequentRenterPoints++;
            }
        }
        return frequentRenterPoints;
    }
}
