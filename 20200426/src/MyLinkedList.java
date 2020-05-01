/*
 * @program: 20200426
 * @description
 * 无头双向非循环链表
 * @author: mrs.yang
 * @create: 2020 -04 -26 18 :48
 */

class Node{
    public int data;
    public Node next;
    public Node prev;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class MyLinkedList {
    public Node head;
    public Node tail;
    //双向链表的头插法
    public void addFirst(int data){
        Node node=new Node(data);
        if(this.head==null){
            this.head=node;
            this.tail=node;
            return;
        }
        node.next=this.head;
        this.head.prev=node;
        this.head=node;
    }
    //打印链表
    public void display(){
        Node cur=this.head;
        while(cur!=null){
            System.out.print(cur.data+" ");
            cur=cur.next;
        }
        System.out.println();
    }
    //尾插法
    public void addLast(int data){
        Node node=new Node(data);
        if(this.head==null){
            this.head=node;
            this.tail=node;
            return;
        }
        tail.next=node;
        node.prev=this.tail;
        this.tail=node;
    }
    //查找是否包含关键字key
    public boolean contains(int key){
        Node cur=this.head;
        if(this.head==null){
            return false;
        }
        while(cur!=null){
            if(cur.data==key){
                return true;
            }
            cur=cur.next;
        }
        return false;
    }
    //求单链表长度
    public int size(){
        Node cur=this.head;
        int count=0;
        while(cur!=null){
            count++;
            cur=cur.next;
        }
        return count;
    }
    private boolean check(int index){
        if(index<0 || index>this.size()){
            return false;
        }
        return true;
    }
    private Node searchIndex(int index){
        Node cur=this.head;
        if(this.head==null){
            return null;
        }
        while(index>0){
            cur=cur.next;
            index--;
        }
        return cur;
    }
    //index位置插入data
    public void addIndex(int index, int data){
        //先检查index位置的合法性
        Node node=new Node(data);
        check(index);

        if(index==0){
            addFirst(data);
            return;
        }
        if(index==this.size()){
            addLast(data);
            return;
        }
        Node cur=searchIndex(index);
        if(cur==null){
            return;
        }
        node.next=cur;
        node.prev=cur.prev;
        cur.prev.next=node;
        cur.prev=node;
    }
//删除第一次出现的key
    public int remove(int key){
        Node cur=this.head;
        while(cur!=null){
            if(cur.data==key){//等于的话判断是不是头节点
                int oldData=cur.data;
                if(cur==this.head){//是头节点
                    this.head=this.head.next;
                    this.head.prev=null;
                }else{//不是头节点
                    cur.prev.next=cur.next;
                    if(cur.next!=null){
                        cur.next.prev=cur.prev;
                    }else{//尾节点，让尾节点向前挪一步
                        this.tail=cur.prev;
                    }
                }
                return oldData;
            }else{
                cur=cur.next;//不等于key，向后走一步
            }
        }
        return -1;
    }
    //删除所有的key
    public void removeAllKey(int key){
        Node cur=this.head;
        while(cur!=null){
            if(cur.data==key){//等于的话判断是不是头节点
                int oldData=cur.data;
                if(cur==this.head){//是头节点
                    this.head=this.head.next;
                    if(this.head!=null){
                        this.head.prev=null;
                    }
                }else{//不是头节点
                    cur.prev.next=cur.next;
                    if(cur.next!=null){
                        cur.next.prev=cur.prev;
                    }else{//尾节点，让尾节点向前挪一步
                        this.tail=cur.prev;
                    }
                }
            }else{
                cur=cur.next;//不等于key，向后走一步
            }
        }
    }
}
