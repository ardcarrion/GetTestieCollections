package rocks.zipcode;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import java.util.Stack;

public class TestStack {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void TestStack1() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        Assert.assertFalse(stack.isEmpty()); // false
    }
    @Test
    public void TestStack2() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        stack.pop();
        Assert.assertTrue(stack.isEmpty()); // true
    }
    @Test
    public void TestStack3() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        stack.peek();
        Assert.assertFalse(stack.isEmpty()); // false
    }

}
