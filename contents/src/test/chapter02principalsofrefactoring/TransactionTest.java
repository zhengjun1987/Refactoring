package test.chapter02principalsofrefactoring;

import chapter02principalsofrefactoring.CardEntity;
import chapter02principalsofrefactoring.OrderInfo;
import chapter02principalsofrefactoring.Transaction;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import utils.ExecutionDurationTimer;
import utils.MyUtils;

/**
 * Transaction Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>���� 15, 2018</pre>
 */
public class TransactionTest {

    public static final int TIMES = 1000;
    private Transaction mTransaction;
    private ExecutionDurationTimer mExecutionDurationTimer;

    @Before
    public void before() throws Exception {
        mExecutionDurationTimer = new ExecutionDurationTimer();
        mTransaction = new Transaction(new CardEntity(0, "6225768722574669", "招商银行信用卡", "0149"), "6", "201803121710583669", new OrderInfo("5000", "201803121710583669", "银行开户手续费10.00元", "2018年3月12日17:17:38"), false, true);
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: toString()
     * 2721
     */
    @Test
    public void testToString() throws Exception {
        long vExecute = mExecutionDurationTimer.execute(TIMES, () -> mTransaction.toString());
        System.out.println(MyUtils.getCurrentTime() + "(vExecute / TIMES) = " + (vExecute / TIMES));
    }

    /**
     * Method: toString0()
     * 3278
     */
    @Test
    public void testToString0() throws Exception {
        long vExecute = mExecutionDurationTimer.execute(TIMES, () -> mTransaction.toString0());
        System.out.println(MyUtils.getCurrentTime() + "(vExecute / TIMES) = " + (vExecute / TIMES));
    }

    /**
     * Method: main(String[] args)
     */
    @Test
    public void testMain() throws Exception {
    }


} 
