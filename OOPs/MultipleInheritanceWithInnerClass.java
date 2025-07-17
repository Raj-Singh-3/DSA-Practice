class D{
    class A{
        int a;
        void showA()
        {
            System.out.println("This is A");
        }
    }
    class B{
        int b;
        void showB()
        {
            System.out.println("This is B");
        }
    }
    class C{
        int c;
        void showC()
        {
            System.out.println("This is C");
        }
    }

}

public class MultipleInheritanceWithInnerClass {
    public static void main(String[] args) {
        D obj = new D();
        D.A aObj = obj.new A();
        aObj.showA();
    }
}
