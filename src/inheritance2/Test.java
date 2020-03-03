
package inheritance2;


public class Test {

    public static void main(String[] args) {
     
        Teacher t1 = new Teacher();
        Teacher t2 = new Teacher();
        
        t1.setName("Saddam Hossain");
        t1.setAge(22);
        t1.setQualification("B.Sc in CSE");
        t1.displayInformation();
        
        t2.setName("Taifur Rahamn");
        t2.setAge(24);
        t2.setQualification("B.Sc in ECO");
        t2.displayInformation();
        
    }
    
}
