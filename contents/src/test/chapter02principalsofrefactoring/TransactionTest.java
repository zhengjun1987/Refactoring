package test.chapter02principalsofrefactoring;

import utils.MyUtils;
import chapter02principalsofrefactoring.CardEntity;
import chapter02principalsofrefactoring.OrderInfo;
import chapter02principalsofrefactoring.Transaction;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

/**
 * Transaction Tester.
 *
 * @author <郑军>
 * @version 1.0
 * @since <pre>2018年3月13日</pre>
 */
public class TransactionTest {

    private Transaction mTransaction;

    @Before
    public void before() throws Exception {
        System.out.println("TransactionTest.before");
        mTransaction = new Transaction(new CardEntity(0, "6225768722574669", "招商银行信用卡", "0149"), "6", "201803121710583669", new OrderInfo("5000", "201803121710583669", "银行开户手续费10.00元", "2018年3月12日17:17:38"), false, true);
    }

    @After
    public void after() throws Exception {
        System.out.println("TransactionTest.after");
    }

    /**
     * Method: toString()
     * 27926160
     */
    @Test
    public void testToString() throws Exception {
        long start = System.nanoTime();
        System.out.println(MyUtils.getCurrentTime() + "transaction = " + mTransaction.toString());   //29480015
//        System.out.println(MyUtils.getCurrentTime() + "transaction = " + transaction.toString0());//24769620
        long end = System.nanoTime();
        System.out.println(MyUtils.getCurrentTime() + "(end - start) = " + (end - start));
    }

    /**
     * Method: toString0()
     * 26724380
     */
    @Test
    public void testToString0() throws Exception {
        long start = System.nanoTime();
//        System.out.println(MyUtils.getCurrentTime() + "transaction = " + transaction.toString());   //29480015
        System.out.println(MyUtils.getCurrentTime() + "transaction = " + mTransaction.toString0());//24769620
        long end = System.nanoTime();
        System.out.println(MyUtils.getCurrentTime() + "(end - start) = " + (end - start));
    }

    /**
     * Method: main(String[] args)
     */
    @Test
    public void testMain() throws Exception {
    }


} 
