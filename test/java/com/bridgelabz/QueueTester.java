package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QueueTester {
    MyNode<Integer> node1 = new MyNode<>(30);
    MyNode<Integer> node2 = new MyNode<>(56);
    MyNode<Integer> node3 = new MyNode<>(70);


    @Test
    public void testpushFirstAtFirst() {
        Queue Queue2 = new Queue();
        Queue2.push(node1);
        Queue2.push(node2);
        Queue2.push(node3);
        String result2 = Queue2.printMyNodes();
        Assertions.assertEquals("30->56->70", result2);
    }

    @Test
    public void testpop(){
        Queue Queue2 = new Queue();
        Queue2.push(node1);
        Queue2.push(node2);
        Queue2.push(node3);
        INode result=Queue2.pop();
        Assertions.assertEquals(node1,result);
        Queue2.printMyNodes();
        INode result2=Queue2.pop();
        Queue2.printMyNodes();
        Assertions.assertEquals(node2,result2);
        INode result5=Queue2.pop();
        Assertions.assertEquals(node3,result5);
        Queue2.printMyNodes();
    }

}
