
package problem_solving2;


public class Circle extends Shape{
    
    Circle(double r){
        
        super(r,r);
        
    }
    
    @Override
    void area(){
        
        double result = Math.PI * dim1 * dim2;
        System.out.printf("Circle Area : %.4f\n",result);
        
    }
    
}
