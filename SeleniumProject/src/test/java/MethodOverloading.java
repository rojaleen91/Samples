
class C
{
    void display(){
        System.out.println("hi");
    }
    void display(int a){
        System.out.println("a="+a);
    }
}
public class MethodOverloading {
    public static void main(String args[]) {
        C obj1 = new C();
       obj1.display();
       obj1.display(30);
    }
}
