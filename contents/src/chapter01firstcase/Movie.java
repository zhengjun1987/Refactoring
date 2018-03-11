package chapter01firstcase;

/**
 * Author:Zheng Jun
 * E-mail:zhengjun1987@outlook.com
 * Date:2018/3/11 23:00
 * Project:Refactoring
 */
public class Movie {
    public static final int REGULAR = 1;
    public static final int NEW_RELEASE = 2;
    public static final int CHILDRENS = 3;
    private String title;
    private int priceCode;
    private MovieType movieType;

    public Movie(String title, int priceCode) {
        this.title = title;
        this.priceCode = priceCode;
    }

    public Movie(String title, MovieType movieType) {
        this.title = title;
        this.movieType = movieType;
    }

    public double getRentalAmount(int rentalDays) {
        return movieType.getRentalAmount(rentalDays);
    }

    public int getPoints(int rentalDays) {
        return movieType.getPoints(rentalDays);
    }

    public String getTitle() {
        return title;
    }

    public int getPriceCode() {
        return priceCode;
    }

    public void setPriceCode(int priceCode) {
        this.priceCode = priceCode;
    }
}
