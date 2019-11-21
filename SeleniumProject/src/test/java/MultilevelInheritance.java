
class Parent1{
    int a=20;
    void display(){
        System.out.println("Parent");
    }
}
class Child1 extends Parent{
    int b=10;
    void show(){
        System.out.println("Child");
    }
}
class Child2 extends Child1{
    int c=30;
    void show(){
        System.out.println("Child2");
    }
}
public class MultilevelInheritance {
    public static void main (String args[]) {
        Child2 child2 = new Child2();
        System.out.println(child2.a);
        System.out.println(child2.b);
        System.out.println(child2.c);
        child2.show();
        child2.display();
    }

}
