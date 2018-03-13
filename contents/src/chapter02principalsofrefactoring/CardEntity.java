package chapter02principalsofrefactoring;

public class CardEntity {
    private final int mCardType;
    private final String mCardId;
    private final String mCardName;
    private final String mCardNo;

    public CardEntity(int pCardType, String pCardId, String pCardName, String pCardNo) {
        mCardType = pCardType;
        mCardId = pCardId;
        mCardName = pCardName;
        mCardNo = pCardNo;
    }

    int getCardType() {
        return mCardType;
    }

    String getCardId() {
        return mCardId;
    }

    String getCardName() {
        return mCardName;
    }

    String getCardNo() {
        return mCardNo;
    }
}
