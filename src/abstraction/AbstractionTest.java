
package abstraction;


public class AbstractionTest {
    
    public static void main(String[] args) {
        
        MobileUser mu;
        
        mu = new Rahim();
        mu.sendMessage();
        
        
        mu = new Karim();
        mu.sendMessage();
        
    }
}
