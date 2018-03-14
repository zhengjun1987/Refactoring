package test.chapter01firstcase;

import utils.MyUtils;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

/**
 * MyUtils Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>���� 13, 2018</pre>
 */
public class MyUtilsTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: getCurrentTime()
     */
    @Test
    public void testGetCurrentTime() throws Exception {
        System.out.println(MyUtils.getCurrentTime());
    }
}
