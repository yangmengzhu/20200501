package com.bit.demo;

/*
 * @program: 20200426
 * @description
 *
 * @author: mrs.yang
 * @create: 2020 -04 -27 18 :00
 */
//继承
class Animal{
    public String name;
    public Animal(String name){//构造方法
        this.name=name;
        System.out.println("Animal(String)");
    }

    public void eat(){
        System.out.println(this.name+"Animal.eat()");
    }
    public void sleep(){
        System.out.println("Animal.sleep()");
    }
}
class Cat extends Animal{

    public Cat(String name) {
        super(name);//显示调用，同时给name赋值
        super.eat();
        System.out.println("Cat(String)");
    }
    /* public String name;
    public void eat(){
        System.out.println("Animal.eat()");
    }*/
}
class ChineseCat extends Cat{//多层继承，不超过三层
    public ChineseCat(String name) {
        super(name);
        System.out.println("haha");
    }
}
class Bird extends Animal{
    public Bird(String name) {
        super(name);
    }
    public void fly(){
        System.out.println(this.name+"bird:fly()");//继承了name
    }
}
//抽象类
/*abstract class Shape{//抽象类
    public int age;//类内数据成员和普通成员一样
    public abstract void draw();//抽象方法：没有实际工作的方法
}
class Cycle extends Shape{
    @Override
    public void draw() {//必须重写方法
        System.out.println("画一个圆");
    }
}
class Rect extends Shape{
    @Override//必须重写方法
    public void draw() {
        System.out.println("画一个矩形");
    }
}*/
public class TestDemo {

    /*public static void main(String[] args) {
        Cat cat=new Cat("mimi");
        cat.eat();
        cat.sleep();
        Bird bird=new Bird("八哥");
        bird.eat();
        bird.fly();
        ChineseCat ccat=new ChineseCat("mini");
        ccat.eat();
    }*/

    /*public static void main1(String[] args) {
       Shape shape1=new Cycle();//不可以被实例化，可以发生向上转型
       Shape shape2=new Rect();
       //drawMap(shape1);
      // drawMap(shape2);
    }*/
}
