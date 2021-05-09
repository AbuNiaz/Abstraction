
package abstraction_inheritance_polymorphism;

public class Circle extends Shape {
    
     //dim1,dim2
    
    //area= PI*r*r
    Circle(double r){
        super(r,r);
    }

   
    @Override
    void area(){
       
        double result= Math.PI* dim1*dim2;
        System.out.println("Circle Area is :"+result);
    }
    
}
