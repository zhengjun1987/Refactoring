package test.chapter02principalsofrefactoring;

import utils.MyUtils;
import chapter02principalsofrefactoring.OrderInfo;
import utils.ExecutionDurationTimer;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * OrderInfo Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>���� 14, 2018</pre>
 */
public class OrderInfoTest {

    private static final int REPEAT_TIMES = 1000;
    private OrderInfo mOrderInfo;
    private ExecutionDurationTimer mExecutionDurationTimer;

    @Before
    public void before() throws Exception {
        mExecutionDurationTimer = new ExecutionDurationTimer();
        mOrderInfo = new OrderInfo("5000", "201803141509580037", "13524275852 charged 50.00", "2018-3-14 15:10:08");
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: toStringBuilder()
     * 1576
     */
    @Test
    public void testToStringBuilder() throws Exception {
        long vExecute = mExecutionDurationTimer.execute(REPEAT_TIMES, mOrderInfo::toStringBuilder);
        System.out.println(MyUtils.getCurrentTime() + "(sum / REPEAT_TIMES) = " + (vExecute / REPEAT_TIMES));
    }

    /**
     * Method: toStringPlus()
     * 1387
     */
    @Test
    public void testToStringPlus() throws Exception {
        long vExecute = mExecutionDurationTimer.execute(REPEAT_TIMES, () -> mOrderInfo.toStringPlus());
        System.out.println(MyUtils.getCurrentTime() + "(sum / REPEAT_TIMES) = " + (vExecute / REPEAT_TIMES));
    }

    /**
     * Method: toStringBuffer()
     * 1551
     */
    @Test
    public void testToStringBuffer() throws Exception {
        long vExecute = mExecutionDurationTimer.execute(REPEAT_TIMES, mOrderInfo::toStringBuffer);
        System.out.println(MyUtils.getCurrentTime() + "(sum / REPEAT_TIMES) = " + (vExecute / REPEAT_TIMES));
    }
}
