package demo1;

/*
 * @program: 20200426
 * @description
 * 接口
 * @author: mrs.yang
 * @create: 2020 -04 -29 12 :29
 */
interface Shape{
    //public abstract void draw();//抽象方法默认是public abstract
    void draw();
    default void func(){//被default修饰具体实现的方法
        System.out.println("haha");
    }
    //public static final int a=10;//默认a是常量
    int a=10;
}
class Cycle implements Shape{
    @Override
    public void draw() {//必须重写方法，不能省略public
        System.out.println("画一个○");
    }
}
public class TestInterFace  {
    public static void drawMap(Shape shape){
        shape.draw();
    }
    public static void main(String[] args) {
        Shape shape=new Cycle();//向上转型
        drawMap(shape);
    }
}
