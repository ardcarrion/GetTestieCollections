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
    public void TestStack1() {
        ArrayDeque<String> deque = new ArrayDeque<>();
        deque.push("Hello world");
        Assert.assertFalse(deque.isEmpty()); // false
    }
    @Test
    public void TestStack2() {
        ArrayDeque<String> deque = new ArrayDeque<>();
        deque.push("Hello world");
        deque.pop();
        Assert.assertTrue(deque.isEmpty()); // true
    }
    @Test
    public void TestStack3() {
        ArrayDeque<String> deque = new ArrayDeque<>();
        deque.push("Hello world");
        deque.peek();
        Assert.assertFalse(deque.isEmpty()); // false
    }
}
