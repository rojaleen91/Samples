class hi_Parent1{
        int a=20;
        void display(){
        System.out.println("Parent");
        }
        }
class hi_Child1 extends hi_Parent1{
    int b=10;
    void show(){
        System.out.println("Child");
    }
}
class hi_Child2 extends hi_Parent1{
    int c=30;
    void show(){
        System.out.println("Child2");
    }
}
public class HierachicalInheritance {
    public static void main (String args[]) {
        hi_Child2 child2  = new hi_Child2();
        System.out.println(child2.a);
//        System.out.println(child2.b);
        System.out.println(child2.c);
        child2.show();
        child2.display();
    }

}



















