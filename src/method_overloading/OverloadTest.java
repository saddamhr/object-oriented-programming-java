
package method_overloading;


public class OverloadTest {
    
    public static void main(String[] args) {
    
        Overload o1 = new Overload();
        
        o1.add(1, 2);
        o1.add(1.5, 0.5);
        o1.add(1, 2, 3);
        o1.add();
        
    }
}
