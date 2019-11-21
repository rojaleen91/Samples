class  super_Parent1{
        int a=20;
        void display(){
        System.out.println("Parent");
        }
        }
class super_Child1 extends super_Parent1{
    int a=10;
    void show(){
        System.out.println("Child");
        //System.out.println(b);
        System.out.println(a);
        System.out.println(super.a);
        display();
    }
}
public class SuperKeyword{
        public static void main (String args[]) {
       super_Child1 child  = new super_Child1();
        child.show();

    }

}
