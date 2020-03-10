import com.sun.javafx.logging.PulseLogger;

import java.util.LinkedList;

/**
 * @author Josh
 * @version 1.0.0
 * @ClassName NodeTest2.java
 * @Description TODO
 * @createTime 2020-02-26 23:09:00
 */
public class NodeTest2 {

    /**
     * 双向循环链表
     * @param args
     */
    public static void main(String[] args) {
        DualNode dualNode1 = new DualNode("A");
        DualNode dualNode2 = new DualNode("B");
        DualNode dualNode3 = new DualNode("C");

        dualNode1.next = dualNode2;
        dualNode2.previous = dualNode1;

        dualNode2.next = dualNode3;
        dualNode3.previous = dualNode2;

        dualNode3.next = dualNode1;
        dualNode1.previous = dualNode3;

        System.out.println(dualNode1.previous.next.data);

        // 在1和2之前插入node4

        DualNode dualNode4 = new DualNode("D");
        dualNode1.next = dualNode4;
        dualNode4.previous = dualNode1;
        dualNode4.next = dualNode2;
        dualNode2.previous = dualNode4;

        System.out.println(dualNode1.next.data);
        System.out.println(dualNode2.previous.data);

        // 在1和2之间移除node4

        dualNode1.next = dualNode2;
        dualNode2.previous = dualNode1;

        dualNode4.next = null;
        dualNode4.previous = null;

        System.out.println(dualNode1.next.data);
        System.out.println(dualNode2.previous.data);

        LinkedList linkedList = new LinkedList();
    }

}
class DualNode{
    public DualNode previous;

    public String data;

    public DualNode next;

    public  DualNode(String data){

        this.data = data;
    }


}