class A
{
    A(){
        System.out.println("a");
    }
    A(int a){
        System.out.println("a="+a);
    }
}

public class ConstructorOverloading {
    public static void main(String args[]) {


    A obj1 = new A();
    A obj2 = new A(25);
}
}
