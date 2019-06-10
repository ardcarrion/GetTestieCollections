package rocks.zipcode;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayDeque;

public class TestArrayDeque {
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void TestDeque1() {
        ArrayDeque<String> deque = new ArrayDeque<>();
        deque.push("Hello world");
        Assert.assertFalse(deque.isEmpty()); // false
    }
    @Test
    public void TestDeque2() {
        ArrayDeque<String> deque = new ArrayDeque<>();
        deque.push("Hello world");
        deque.pop();
        Assert.assertTrue(deque.isEmpty()); // true
    }
    @Test
    public void TestDeque3() {
        ArrayDeque<String> deque = new ArrayDeque<>();
        deque.push("Hello world");
        deque.peek();
        Assert.assertFalse(deque.isEmpty()); // false
    }
}
