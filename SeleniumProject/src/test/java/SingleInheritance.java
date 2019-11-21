
class Parent{
    int a=20;
    void display(){
        System.out.println("Parent");
    }
}
class Child extends Parent{
    int b=20;
    void show(){
        System.out.println("Child");
    }
}

public class SingleInheritance {
    public static void main(String args[]) {
        Child si=new Child();
        System.out.println(si.a);
        System.out.println(si.b);
        si.display();
        si.show();
    }
}
