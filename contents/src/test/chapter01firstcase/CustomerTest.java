package test.chapter01firstcase;

import chapter01firstcase.Customer;
import chapter01firstcase.Movie;
import chapter01firstcase.MovieType;
import chapter01firstcase.Rental;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

/**
 * Customer Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>���� 13, 2018</pre>
 */
public class CustomerTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: addElement(Rental obj)
     */
    @Test
    public void testAddElement() throws Exception {
    }

    /**
     * Method: getName()
     */
    @Test
    public void testGetName() throws Exception {
    }

    /**
     * Method: statement()
     */
    @Test
    public void testStatement() throws Exception {
        Customer wangshuai = new Customer("王帅");
        wangshuai.addElement(new Rental(new Movie("乌龙山剿匪记",1),3));
        wangshuai.addElement(new Rental(new Movie("功夫",2),3));
        wangshuai.addElement(new Rental(new Movie("东京热不热",1),3));
        wangshuai.addElement(new Rental(new Movie("小猪佩奇",3),3));
        wangshuai.addElement(new Rental(new Movie("疯狂的石头",2),3));
        Customer linzhangbin = new Customer("林彰彬");
        linzhangbin.addElement(new Rental(new Movie("乌龙山剿匪记", MovieType.REGULAR),3));
        linzhangbin.addElement(new Rental(new Movie("功夫",MovieType.NEW_RELEASE),3));
        linzhangbin.addElement(new Rental(new Movie("东京热不热",MovieType.REGULAR),3));
        linzhangbin.addElement(new Rental(new Movie("小猪佩奇",MovieType.CHILDREN),3));
        linzhangbin.addElement(new Rental(new Movie("疯狂的石头",MovieType.NEW_RELEASE),3));

        System.out.println(wangshuai.statement());
        System.out.println();
        System.out.println(linzhangbin.statement());
    }

    /**
     * Method: main(String[] args)
     */
    @Test
    public void testMain() throws Exception {
    }


} 
