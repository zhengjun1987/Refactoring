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

    public String toStringBuilder() {
        final StringBuilder sb = new StringBuilder("OrderInfo{");
        sb.append("mOrderAmount='").append(mOrderAmount).append('\'');
        sb.append(", mOrderNumber='").append(mOrderNumber).append('\'');
        sb.append(", mOrderDesc='").append(mOrderDesc).append('\'');
        sb.append(", mOrderDate='").append(mOrderDate).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public String toStringPlus() {
        return "OrderInfo{" +
                "mOrderAmount='" + mOrderAmount + '\'' +
                ", mOrderNumber='" + mOrderNumber + '\'' +
                ", mOrderDesc='" + mOrderDesc + '\'' +
                ", mOrderDate='" + mOrderDate + '\'' +
                '}';
    }

    public String toStringBuffer() {
        final StringBuffer sb = new StringBuffer("OrderInfo{");
        sb.append("mOrderAmount='").append(mOrderAmount).append('\'');
        sb.append(", mOrderNumber='").append(mOrderNumber).append('\'');
        sb.append(", mOrderDesc='").append(mOrderDesc).append('\'');
        sb.append(", mOrderDate='").append(mOrderDate).append('\'');
        sb.append('}');
        return sb.toString();
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
