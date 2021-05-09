
package abstraction_inheritance_polymorphism;

public class Text {
    
    public static void main(String[] args){
    
    Shape shape;

    shape = new Rectangle(25,30);
      shape.area();
      
     shape = new Circle(35);
     shape.area();
}

}