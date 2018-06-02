package nl.han.app.Tree;

import org.junit.Assert;
import org.junit.Test;

public class TreeTest {

    @Test
    public void SimpleTreeTest(){
        Tree<String> stringTree = new Tree<String>();
        stringTree.setValue("A");
        Tree<String> stringTree1 = new Tree<String>();
        stringTree1.setValue("B");
        Tree<String> stringTree2 = new Tree<String>();
        stringTree2.setValue("C");
        Tree<String> stringTree3 = new Tree<String>();
        stringTree3.setValue("D");

        stringTree.addChild(stringTree1);
        stringTree1.addChild(stringTree2);
        stringTree2.addChild(stringTree3);

        Assert.assertEquals(false, stringTree.isLeaf());
        Assert.assertEquals(true, stringTree3.isLeaf());
    }

    @Test
    public void SimpleTreeTest2(){
        Tree<String> stringTree = new Tree<String>();
        stringTree.setValue("A");
        Tree<String> stringTree1 = new Tree<String>();
        stringTree1.setValue("B");
        Tree<String> stringTree2 = new Tree<String>();
        stringTree2.setValue("C");
        Tree<String> stringTree3 = new Tree<String>();
        stringTree3.setValue("D");

        stringTree.addChild(stringTree1);
        stringTree1.setNextSibling(stringTree2);
        stringTree2.addChild(stringTree3);

        Assert.assertEquals(true, stringTree1.isLeaf());
        Assert.assertEquals(true, stringTree3.isLeaf());
    }
}