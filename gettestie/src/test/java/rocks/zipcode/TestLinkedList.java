package rocks.zipcode;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class TestLinkedList {
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void TestList1() {
        LinkedList<String> list = new LinkedList<String>();
        list.add("Hello world");
        Assert.assertFalse(list.isEmpty()); // false
    }
    @Test
    public void TestList2() {
        LinkedList<String> list = new LinkedList<String>();
        list.push("Hello world");
        list.pop();
        Assert.assertTrue(list.isEmpty()); // true
    }
    @Test
    public void TestList3() {
        LinkedList<String> list = new LinkedList<String>();
        list.push("Hello world");
        list.peek();
        Assert.assertFalse(list.isEmpty()); // false
    }
}
