package chapter02principalsofrefactoring;

public class OrderInfo {
    private final String mOrderAmount;
    private final String mOrderNumber;
    private final String mOrderDesc;
    private final String mOrderDate;

    public OrderInfo(String pOrderAmount, String pOrderNumber, String pOrderDesc, String pOrderDate) {
        mOrderAmount = pOrderAmount;
        mOrderNumber = pOrderNumber;
        mOrderDesc = pOrderDesc;
        mOrderDate = pOrderDate;
    }

    String getOrderAmount() {
        return mOrderAmount;
    }

    String getOrderNumber() {
        return mOrderNumber;
    }

    String getOrderDesc() {
        return mOrderDesc;
    }

    String getOrderDate() {
        return mOrderDate;
    }
}
