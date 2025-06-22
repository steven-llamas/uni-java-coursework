
class Human // parent class, Human
{
   //Overridden Method
   public void walk()   {   System.out.println("Human walks");   }
}
class Main extends Human // child class, Main
{
   //Overriding Method
   public void walk()    {   System.out.println("Boy walks");   }
   public static void main( String args[]) 
   {	/* Reference is of Human type and object is Boy type */	
       Human h1 = new Main();
       /* Reference is of HUman type and object is of Human type. */
       Human h2 = new Human();
       h1.walk(); // call to child class method
       h2.walk(); // call to parent class method
   }
}