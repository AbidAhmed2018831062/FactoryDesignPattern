package factory;

public class DrawFactory{
    public Draw getShape(String name)
    {
        if(name.equals("Circle"))
        return new Circle();
        else if(name.equals("Square"))
        return new Square();
        else
        return new Rectangle();
    }
}