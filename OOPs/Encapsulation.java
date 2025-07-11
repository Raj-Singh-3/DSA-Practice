class a{
   private int a = 5;
   private int getA(){
      return a;
   }
   void temp()
   {
      System.out.println(a);
   }
}
public class Encapsulation extends a
{
   public static void main(String[] args) {
      Encapsulation e = new Encapsulation();
      // System.out.println(e.a); // error
      // System.out.println(e.getA()); //error
      e.temp();
   }
}