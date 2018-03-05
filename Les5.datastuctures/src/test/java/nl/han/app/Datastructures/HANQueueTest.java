package nl.han.app.Datastructures;

import nl.han.app.Datastructures.Interfaces.IHANQueue;
import org.junit.Assert;
import org.junit.Test;

public class HANQueueTest {

    @Test
    public void addItemToQueueTest(){
        IHANQueue<Integer> sut = new HANQueue<Integer>();
        Integer val1 = 10;
        Integer val2 = 5;

        sut.enQueue(val1);
        sut.enQueue(val2);

        Assert.assertEquals(val1, sut.deQueue());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void emptyQueTest(){
        IHANQueue<Integer> sut = new HANQueue<Integer>();
        Integer val1 = 10;
        Integer val2 = 5;

        sut.enQueue(val1);
        sut.enQueue(val2);
        sut.makeEmpty();

        Assert.assertEquals(null, sut.deQueue());
    }

    @Test
    public void addMultipleItemAndDequeFew(){
        IHANQueue<Integer> sut = new HANQueue<Integer>();
        Integer val1 = 10;
        Integer val2 = 5;

        sut.enQueue(val1);
        sut.enQueue(val2);
        sut.enQueue(val1);
        sut.deQueue();
        sut.deQueue();
        sut.enQueue(val2);

        Assert.assertEquals(val1, sut.deQueue());
    }
}