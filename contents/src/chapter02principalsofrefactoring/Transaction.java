package chapter02principalsofrefactoring;

import utils.MyUtils;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/3/12 17:12
 */
public class Transaction {
    private int cardType;
    private String orderAmount,cardId,cardName,cardNo,orderNumber,merNo,tn,orderDesc,orderDate;
    private boolean isCardSelected,showResultPage;

    public Transaction(CardEntity cardEntity, String pMerNo, String pTn, OrderInfo orderInfo, boolean pIsCardSelected, boolean pShowResultPage) {
        cardType = cardEntity.getCardType();
        orderAmount = orderInfo.getOrderAmount();
        cardId = cardEntity.getCardId();
        cardName = cardEntity.getCardName();
        cardNo = cardEntity.getCardNo();
        orderNumber = orderInfo.getOrderNumber();
        merNo = pMerNo;
        tn = pTn;
        orderDesc = orderInfo.getOrderDesc();
        orderDate = orderInfo.getOrderDate();
        isCardSelected = pIsCardSelected;
        showResultPage = pShowResultPage;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Transaction{");
        sb.append("cardType=").append(cardType);
        sb.append(", orderAmount='").append(orderAmount).append('\'');
        sb.append(", cardId='").append(cardId).append('\'');
        sb.append(", cardName='").append(cardName).append('\'');
        sb.append(", cardNo='").append(cardNo).append('\'');
        sb.append(", orderNumber='").append(orderNumber).append('\'');
        sb.append(", merNo='").append(merNo).append('\'');
        sb.append(", tn='").append(tn).append('\'');
        sb.append(", orderDesc='").append(orderDesc).append('\'');
        sb.append(", orderDate='").append(orderDate).append('\'');
        sb.append(", isCardSelected=").append(isCardSelected);
        sb.append(", showResultPage=").append(showResultPage);
        sb.append('}');
        return sb.toString();
    }

    public String toString0() {
        return "Transaction{" +
                "cardType=" + cardType +
                ", orderAmount='" + orderAmount + '\'' +
                ", cardId='" + cardId + '\'' +
                ", cardName='" + cardName + '\'' +
                ", cardNo='" + cardNo + '\'' +
                ", orderNumber='" + orderNumber + '\'' +
                ", merNo='" + merNo + '\'' +
                ", tn='" + tn + '\'' +
                ", orderDesc='" + orderDesc + '\'' +
                ", orderDate='" + orderDate + '\'' +
                ", isCardSelected=" + isCardSelected +
                ", showResultPage=" + showResultPage +
                '}';
    }



    public static void main(String[] args) {
        Transaction transaction = new Transaction(new CardEntity(0, "6225768722574669", "招商银行信用卡", "0149"), "6", "201803121710583669", new OrderInfo("5000", "201803121710583669", "银行开户手续费10.00元", "2018年3月12日17:17:38"), false, true);
        long start = System.nanoTime();
//        System.out.println(MyUtils.getCurrentTime() + "transaction = " + transaction.toString());   //29480015
        System.out.println(MyUtils.getCurrentTime() + "transaction = " + transaction.toString0());//24769620
        long end = System.nanoTime();
        System.out.println(MyUtils.getCurrentTime() + "(end - start) = " + (end - start));
    }
}
