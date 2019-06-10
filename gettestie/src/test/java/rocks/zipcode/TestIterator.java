package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;
import java.util.LinkedList;

public class TestIterator {

//    private LinkedList<String> list;
//    @Before
//    public void setUp() throws Exception {
//        list = new LinkedList<String>();
//        list.add("Hello world");
//        list.add("foo");
//        list.add("bar");
//        list.add("quimbara");
//    }

    @Test
    public void TestIterator1() {

        LinkedList<String> list = new LinkedList<String>();
        list.add("Hello world");
        list.add("foo");
        list.add("bar");
        list.add("quimbara");
        Iterator iterator = list.iterator();
        int count = 1;
        while (iterator.hasNext()) {count++;}
        Assert.assertEquals(count, list.size());
    }

    @Test
    public void TestIterator2() {
    }
    @Test
    public void TestIterator3() {
    }
}
