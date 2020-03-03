
package inheritance;


public class TestInheritance {

    public static void main(String[] args) {
        
        Teacher t1 = new Teacher();
        Teacher t2 = new Teacher();
        
        t1.name = "Saddam Hossain";
        t1.age = 22;
        t1.qualification = "B.Sc in CSE";
        t1.displayInformation2();
        
        t2.name = "Taifur Rahman";
        t2.age = 24;
        t2.qualification = "B.Sc in ECO";
        t2.displayInformation2();
        
    }
    
}
