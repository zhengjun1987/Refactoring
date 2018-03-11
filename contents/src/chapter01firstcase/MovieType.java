package chapter01firstcase;

/**
 * Author:Zheng Jun
 * E-mail:zhengjun1987@outlook.com
 * Date:2018/3/12 00:08
 * Project:Refactoring
 */
public enum MovieType {
    REGULAR(2, 2, 1.5),
    NEW_RELEASE(0, 0, 3),
    CHILDREN(1.5, 3, 1.5);
    private double startPrice;
    private int exemptDuration;
    private double expiredPrice;

    MovieType(double startPrice, int exemptDuration, double expiredPrice) {
        this.startPrice = startPrice;
        this.exemptDuration = exemptDuration;
        this.expiredPrice = expiredPrice;
    }

    double getRentalAmount(int rentalDays) {
        double result = this.startPrice;
        if (rentalDays > exemptDuration) {
            result += (rentalDays - exemptDuration) * expiredPrice;
        }
        return result;
    }

    int getPoints(int rentalDays) {
        int i = 1;
        if (this == NEW_RELEASE && rentalDays > 1) {
            i++;
        }
        return i;
    }
}
