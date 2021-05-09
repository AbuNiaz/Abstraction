
package abstraction_inheritance_polymorphism;

public class Rectangle extends Shape {
    
     //dim1,dim2
    
    Rectangle(double dim1, double dim2){
        super(dim1,dim2);
    }
    
    @Override
    void area(){
       
        double result= dim1*dim2;
        System.out.println("Rectangle Area is :"+result);
    }

}
