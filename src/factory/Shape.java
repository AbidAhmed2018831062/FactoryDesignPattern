package factory;

public class Shape {
     public static void main(String[] args)
     {
         Draw dr1=new DrawFactory().getShape("Circle");
         dr1.draw();
     }
}
