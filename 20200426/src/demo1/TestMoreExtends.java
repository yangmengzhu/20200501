package demo1;

/*
 * @program: 20200426
 * @description
 * 实现多个接口
 * @author: mrs.yang
 * @create: 2020 -04 -29 13 :20
 */
class Animal{
    protected String name;
    public Animal(String name){
        this.name=name;
    }
}
interface IFlying{//动词为主    接口
    void fly();
}
interface IRunning{
    void run();
}
interface ISwimming{
    void swim();
}
class Cat extends Animal implements IRunning{
    public Cat(String name){//继承的构造方法
        super(name);//先调用父类的构造方法
    }
    @Override//接口必须有重写方法
    public void run() {
        System.out.println(this.name+"正在跑");
    }
}
/*class Fish extends Animal implements ISwimming{
    pucblic Fish(String name){
        super(name);
    }

    @Override
    public void swim() {
        System.out.println(this.name+" ");
    }
}*/
class Frog extends Animal implements ISwimming{
    public Frog(String name){
        super(name);
    }

    @Override
    public void swim() {
        System.out.println(this.name+"正在游泳");
    }
}
public class TestMoreExtends {
    public static void main(String[] args) {

    }
}
