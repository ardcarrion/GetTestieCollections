package rocks.zipcode;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Vector;

public class TestVector {
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void TestVector1() {
        Vector<String> vector = new Vector<>();
        vector.add("Hello world");
        Assert.assertFalse(vector.isEmpty()); // false
    }
    @Test
    public void TestVector2() {
        Vector<String> vector = new Vector<>();
        vector.add("Hello world");
        vector.remove(0);
        Assert.assertTrue(vector.isEmpty()); // true
    }
    @Test
    public void TestVector3() {
        Vector<String> vector = new Vector<>();
        vector.add("Hello world");
        int expected = 1;
        int actual = vector.size();
        Assert.assertEquals(expected, actual);
    }
}
