package test.chapter06functions;

import utils.MyUtils;
import chapter02principalsofrefactoring.CardEntity;
import chapter02principalsofrefactoring.OrderInfo;
import chapter02principalsofrefactoring.Transaction;
import utils.ExecutionDurationTimer;
import utils.ExecutionTimerInterface;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

/**
 * ExecutionDurationTimer Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>���� 14, 2018</pre>
 */
public class ExecutionDurationTimerTest {

    private ExecutionDurationTimer mDurationTimer;
    private Transaction mTransaction;

    @Before
    public void before() throws Exception {
        mDurationTimer = new ExecutionDurationTimer();
        mTransaction = new Transaction(new CardEntity(0, "6225768722574669", "招商银行信用卡", "0149"), "6", "201803121710583669", new OrderInfo("5000", "201803121710583669", "银行开户手续费10.00元", "2018年3月12日17:17:38"), false, true);
    }

    @After
    public void after() throws Exception {

    }

    /**
     * Method: execute(ExecutionTimerInterface pTimerInterface)
     */
    @Test
    public void testExecute() throws Exception {
        long vExecute = mDurationTimer.execute(new ExecutionTimerInterface() {
            @Override
            public void execute() {
                mTransaction.toString();
            }
        });

        long vExecute1 = mDurationTimer.execute(new ExecutionTimerInterface() {
            @Override
            public void execute() {
                mTransaction.toString0();
            }
        });
        System.out.println(MyUtils.getCurrentTime() + "toString = " + vExecute);
        System.out.println(MyUtils.getCurrentTime() + "toString0 = " + vExecute1);
        System.out.println(MyUtils.getCurrentTime() + "vExecute/vExecute1 = " + (double) vExecute / vExecute1);
//        2018-03-14 14:42:32:533  toString = 54428
//        2018-03-14 14:42:32:533  toString0 = 22705
//        2018-03-14 14:42:32:533  vExecute/vExecute1 = 2.3971812376128607
    }


}
//        Transaction{cardType=0, orderAmount='5000', cardId='6225768722574669', cardName='招商银行信用卡', cardNo='0149', orderNumber='201803121710583669', merNo='6', tn='201803121710583669', orderDesc='银行开户手续费10.00元', orderDate='2018年3月12日17:17:38', isCardSelected=false, showResultPage=true}
//        Transaction{cardType=0, orderAmount='5000', cardId='6225768722574669', cardName='招商银行信用卡', cardNo='0149', orderNumber='201803121710583669', merNo='6', tn='201803121710583669', orderDesc='银行开户手续费10.00元', orderDate='2018年3月12日17:17:38', isCardSelected=false, showResultPage=true}
//        2018-03-14 14:34:33:243  toString = 168884
//        2018-03-14 14:34:33:244  toString0 = 71223
//        2018-03-14 14:34:33:244  vExecute/vExecute1 = 2.371200314505146
//
//        Process finished with exit code 0

