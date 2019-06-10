package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;
import java.util.PriorityQueue;

public class TestPriorityQueue {
    @Test
    public void TestPque1() {
        PriorityQueue<String> queue = new PriorityQueue<>();
        String str = "Hello world";
        queue.add(str);
        Assert.assertFalse(queue.isEmpty()); // false
        Assert.assertTrue(queue.contains(str));

    }
    @Test
    public void TestPque2() {
        PriorityQueue<String> queue = new PriorityQueue<>();
        String expected = "Hello world";
        queue.add(expected);
        queue.add("buffer");
        String actual = queue.poll();
        Assert.assertEquals(expected, actual); // true
    }
    @Test
    public void TestPque3() {
        PriorityQueue<String> queue = new PriorityQueue<>();
        queue.offer("Hello world");
        queue.peek();
        Assert.assertFalse(queue.isEmpty()); // false
    }

    @Test
    public void TestPque4() {
        PriorityQueue<String> queue = new PriorityQueue<>();
        String str = "Hello world";
        queue.add(str);
        queue.add(str);
        queue.add(str);
        queue.add(str);
        queue.remove(str);
        Assert.assertFalse(queue.isEmpty()); // false
    }

}
