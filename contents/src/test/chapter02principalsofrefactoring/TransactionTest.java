package test.chapter02principalsofrefactoring;

import chapter01firstcase.MyUtils;
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

    @Before
    public void before() throws Exception {
        System.out.println("TransactionTest.before");
    }

    @After
    public void after() throws Exception {
        System.out.println("TransactionTest.after");
    }

    /**
     * Method: toString()
     */
    @Test
    public void testToString() throws Exception {
        Transaction transaction = new Transaction(new CardEntity(0, "6225768722574669", "招商银行信用卡", "0149"), "6", "201803121710583669", new OrderInfo("5000", "201803121710583669", "银行开户手续费10.00元", "2018年3月12日17:17:38"), false, true);
        long start = System.nanoTime();
        System.out.println(MyUtils.getCurrentTime() + "transaction = " + transaction.toString());   //29480015
//        System.out.println(MyUtils.getCurrentTime() + "transaction = " + transaction.toString0());//24769620
        long end = System.nanoTime();
        System.out.println(MyUtils.getCurrentTime() + "(end - start) = " + (end - start));
    }

    /**
     * Method: toString0()
     */
    @Test
    public void testToString0() throws Exception {
        Transaction transaction = new Transaction(new CardEntity(0, "6225768722574669", "招商银行信用卡", "0149"), "6", "201803121710583669", new OrderInfo("5000", "201803121710583669", "银行开户手续费10.00元", "2018年3月12日17:17:38"), false, true);
        long start = System.nanoTime();
//        System.out.println(MyUtils.getCurrentTime() + "transaction = " + transaction.toString());   //29480015
        System.out.println(MyUtils.getCurrentTime() + "transaction = " + transaction.toString0());//24769620
        long end = System.nanoTime();
        System.out.println(MyUtils.getCurrentTime() + "(end - start) = " + (end - start));
    }

    /**
     * Method: main(String[] args)
     */
    @Test
    public void testMain() throws Exception {
        //TODO: Test goes here...
    }


} 
