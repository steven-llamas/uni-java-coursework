/*
Program: 5. Polymorphism via Inheritance
Superclass Shapes with two subclass - Triangle & Circle
*/

class Shapes // parent class
{
    public void area() {    System.out.print("\nArea of ");  }
}

class Triangle extends Shapes // child class1 
{
    public void area() {  System.out.print("Triangle: ½ * base * height.");  }
}

class Circle extends Shapes // child class2
{
    public void area() {  System.out.print("Circle: 3.14 * radius * radius.");  }
}

class Main 
{
    public static void main(String[] args) 
    {
        Shapes myShape = new Shapes();  // Create a Shapes object
        Shapes myTriangle = new Triangle();  // Create a Triangle object
        Shapes myCircle = new Circle();  // Create a Circle object
        
        // child classes can use area () method of parent class via Inheritance & Polymorphism
        myShape.area();
        myTriangle.area();
        myShape.area();
        myCircle.area();
    }
}