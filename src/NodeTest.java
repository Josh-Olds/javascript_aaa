/**
 * @author Josh
 * @version 1.0.0
 * @ClassName NodeTest.java
 * @Description TODO
 * @createTime 2020-02-26 22:44:00
 */
public class NodeTest {
    // 单项链表
    public static void main(String[] args) {
        Node node1 = new Node("A");
        Node node2 = new Node("B");
        Node node3 = new Node("C");
        // 关联引用
        node1.next = node2;
        node2.next = node3;
        System.out.println(node1.next.data);

        // 插入node4节点
        Node node4 = new Node("D");
        node1.next = node4;
        node4.next = node2;

        System.out.println(node1.next.data);
        // 移除node4节点
        node1.next = node2;
        node4.next = null;
        System.out.println(node1.next.data);
    }
}
class Node{
    // 存本身数据
    public String data;
    // 存指向下一个的引用
    public Node next;
    public Node(String data){
        this.data = data;
    }
}
