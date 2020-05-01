package demo2;

/*
 * @program: 20200426
 * @description
 * @author: mrs.yang
 * @create: 2020 -05 -01 16 :36
 */
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
    public Cat(String name){
        super(name);
    }
    public void eat(){//重写
        System.out.println(this.name+"Animal.eat()");
    }

}
class Bird extends Animal{
    public Bird(String name) {
        super(name);
    }
    public void fly(){
        System.out.println(this.name+"mimi");
    }
}
public class TestMain {
    //不安全的向下转型
    public static void main(String[] args) {
    
    }
       // Animal animal=new Cat("niu");
        //类型转换异常    animal 没有引用bird
       // if(A  intanceof B)判断A是不是B的实例
        /*if(animal instanceof Bird)
        Bird bird=(Bird)animal;
        bird.fly();
    }*/
    //向下转型
   // public static void main3(String[] args) {
        /*Animal animal=new Bird("bu");
        animal.eat();
        //父类引用   赋值给子类
        Bird bird=(Bird)animal;
        bird.fly();
    }*/
    /*public static void main(String[] args) {
        Animal animal=new Cat("mimi");//重写之后只能调用父类的eat方法
        animal.eat();
    }*/
    /*public static Animal func(){//返回值
        *//*Cat cat=new Cat("mimi");
        return cat;*//*
        return new Cat("mimi");
    }
    public static void main(String[] args) {
       Animal animal=func();
       animal.eat();
    }*/
    /*public static void func(Animal animal){//传参时发生向上转型
       animal.eat();
    }
    public static void main(String[] args) {
        Cat cat=new Cat("mimi");
        func(cat);
    }*/
   /* public static void main(String[] args) {
        Animal animal=new Cat("mimi");//直接赋值
    }*/
   /* public static Animal func(Animal animal){
       *//* Cat cat=new Cat("hehe");
        return cat*//*;
        return new Cat("hehe");
    }
    public static void main(String[] args) {
      Animal animal=func();
      animal.eat();
    }*/

   /* public static void func(Animal animal){//传参
        animal.eat();
    }*/
    /*public static void main2(String[] args) {
        Cat cat=new Cat("mimi");
        func(cat);
    }
    public static void main1(String[] args) {
     Animal animal=new Animal("doudou");//直接赋值
     animal.eat();
    }*/
}
