package chapter02principalsofrefactoring;

import chapter01firstcase.MyUtils;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/3/12 17:12
 */
public class Transaction {
    private int cardType;
    private String orderAmount,cardId,cardName,cardNo,orderNumber,merNo,tn,orderDesc,orderDate;
    private boolean isCardSelected,showResultPage;

    Transaction(int pCardType, String pOrderAmount, String pCardId, String pCardName, String pCardNo, String pOrderNumber, String pMerNo, String pTn, String pOrderDesc, String pOrderDate, boolean pIsCardSelected, boolean pShowResultPage) {
        cardType = pCardType;
        orderAmount = pOrderAmount;
        cardId = pCardId;
        cardName = pCardName;
        cardNo = pCardNo;
        orderNumber = pOrderNumber;
        merNo = pMerNo;
        tn = pTn;
        orderDesc = pOrderDesc;
        orderDate = pOrderDate;
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
        Transaction transaction = new Transaction(0, "201803121710583669", "6225768722574669", "招商银行信用卡", "0149", "201803121710583669", "6", "201803121710583669", "银行开户手续费10.00元", "2018年3月12日17:17:38", false, true);
        long start = System.nanoTime();
        System.out.println(MyUtils.getCurrentTime() + "transaction = " + transaction.toString());
        long end1 = System.nanoTime();
        System.out.println(MyUtils.getCurrentTime() + "transaction = " + transaction.toString0());
        long end2 = System.nanoTime();
        System.out.println(MyUtils.getCurrentTime() + "(end1 - start) = " + (end1 - start));
        System.out.println(MyUtils.getCurrentTime() + "(end2 - end1) = " + (end2 - end1));
    }
}
