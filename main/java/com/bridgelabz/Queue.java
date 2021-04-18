package com.bridgelabz;

public class Queue {
    public INode head;
    public INode tail;

    public Queue() {
        this.head = null;
        this.tail = null;
    }


    /* This is method which adds the Nodes, if there is No nodes it will add it to first and make it
    as head and tail, later when the next node is added it added to the tails next and later it will be made as tail
    @param newINode of type INode
    */

    public void push(INode newINode) {
        if (this.tail == null) {
            this.tail = newINode;
        }
        if (this.head == null) {
            this.head = newINode;
        } else {
            this.tail.setNext(newINode);
            this.tail = newINode;
        }
    }

    /* This method is used to append the string with the nodes and
    @return String this is appended string of total nodes
     */

    public String printMyNodes() {
        if (this.head != null) {
            String nodeslist = "";
            INode tempINode = head;
            while (tempINode.getNext() != null) {
                nodeslist = nodeslist + tempINode.getKey();
                if (!tempINode.equals(tail)) nodeslist = nodeslist + "->";
                tempINode = tempINode.getNext();
            }
            nodeslist = nodeslist + tempINode.getKey();
            System.out.println(nodeslist);
            return nodeslist;
        } else{ System.out.println("empty");return "empty";}
    }


  /* This method is used to calculate size Queue
    @return size of the Stack
     */

    public int lengthOfQueue() {
        int size=0;
        INode tempINode = head;
        while (tempINode!= null) {
            size++;
            tempINode = tempINode.getNext();
        }
        return size;
    }

}
