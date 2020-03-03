
package methodoverriding;


public class Test {

    public static void main(String[] args) {
        
        Teacher t = new Teacher();
        Person p = new Person();
        
        t.name = "Saddam";
        t.age = 22;
        t.qulaification = "B.Sc in CSE";
        t.displayInformation();
        
        p.name = "Taifur";
        p.age = 24;
        p.displayInformation();
        
    }
    
}
