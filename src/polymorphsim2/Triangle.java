
package polymorphsim2;


public class Triangle extends Shape{

    double base, height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double area() {
        
        System.out.print("Area for Triangle : ");
        return 0.5 * base * height; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
