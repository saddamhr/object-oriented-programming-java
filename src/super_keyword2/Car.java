
package super_keyword2;


public class Car extends Vehicle{

    double gear;
    
    Car(String color, int weight, double gear){
        super(color,weight);
        this.gear = gear;
    }
    
    @Override
    void attribute(){
        super.attribute();
        System.out.println("Gear : "+gear);
    }
    
    
    
    
}
