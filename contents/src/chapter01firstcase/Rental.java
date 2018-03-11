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
        return movie.getRentalAmount(dayRented);
    }

    public int getPoints() {
        return movie.getPoints(dayRented);
    }
}
