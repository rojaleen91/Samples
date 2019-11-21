class  Override_Parent{
        void display(){
        System.out.println("Parent");
        }
        }
class Override_Child extends Override_Parent{
    int a=10;
    void display(){
        super.display();
        System.out.println("Child");
    }
}

public class Methodoverriding {
    public static void main(String args[]) {
        Override_Child child = new Override_Child();
        child.display();
    }
}
