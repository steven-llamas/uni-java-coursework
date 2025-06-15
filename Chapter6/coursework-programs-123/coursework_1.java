
class Human   // parent class
{
   public static void walk()   {   System.out.println("Human walks");    }
}
//class Boy extends Human
class Main extends Human // child class Main
{
   public static void walk() // same static method name as of parent class
   {   System.out.println("Boy walks");     }
   
   public static void main( String args[]) 
   {
       /* Reference is of Human type and object is Boy type */
       //Human obj = new Boy();
       Human h1 = new Main();
       /* Reference is of Human type and object is of Human type. */
       Human h2 = new Human();
       h1.walk(); // also call the parent class method
       h2.walk(); 
   }
}