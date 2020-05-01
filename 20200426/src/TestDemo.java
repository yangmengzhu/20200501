/*
 * @program: 20200426
 * @description
 * @author: mrs.yang
 * @create: 2020 -04 -26 18 :48
 */

public class TestDemo {
    public static void main(String[] args) {
        MyLinkedList list=new MyLinkedList();
        /*list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.display();*/
        list.addLast(5);
        list.addLast(5);
        list.addLast(6);
        list.addLast(5);
        //list.display();
       /* list.addIndex(0,3);
        list.display();
        list.addIndex(2,8);
        list.display();
        list.addIndex(6,9) ;
        list.display();*/
        list.removeAllKey(5);
        list.display();
    }
}
