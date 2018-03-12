package nl.han.app.Tree;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BinarySearchTreeTest {

    BinarySearchTree<Integer> sut;

    @Before
    public void setUp(){
        sut = new BinarySearchTree<Integer>();
    }

    @Test
    public void testAddLeft(){
        sut.add(10);
        sut.add(5);
        Assert.assertTrue(sut.hasLeft());
        Assert.assertFalse(sut.hasRight());
    }

    @Test
    public void testHasChildren(){
        Assert.assertFalse(sut.hasBothChildren());
        sut.add(10);
        Assert.assertTrue(sut.hasValue());
        sut.add(9);
        Assert.assertTrue(sut.hasLeft());
        sut.add(11);
        Assert.assertTrue(sut.hasBothChildren());
    }

    @Test
    public void testAddRight(){
        sut.add(10);
        sut.add(11);
        Assert.assertTrue(sut.hasRight());
        Assert.assertFalse(sut.hasLeft());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddEquals(){
        sut.add(10);
        sut.add(10);
    }

    @Test
    public void testFind(){
        sut.add(10);
        sut.add(9);
        sut.add(8);
        sut.add(12);
        sut.add(15);
        Assert.assertNull(sut.find(0));
        Assert.assertEquals(10, (int)sut.find(10));
        Assert.assertEquals(9 , (int)sut.find(9));
        Assert.assertEquals(15, (int)sut.find(15));
    }

    @Test
    public void testFindMin(){
        sut.add(10);
        sut.add(9);
        sut.add(8);
        sut.add(12);
        sut.add(15);
        Assert.assertEquals(8, (int)sut.findMin(sut).getValue());
    }

    @Test
    public void testFindMax(){
        sut.add(10);
        sut.add(9);
        sut.add(8);
        sut.add(12);
        sut.add(15);
        Assert.assertEquals(15, (int)sut.findMax(sut).getValue());
    }
}