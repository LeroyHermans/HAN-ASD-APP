package nl.han.app.Lists;

import nl.han.app.Lists.Interfaces.IHANQueue;
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
}