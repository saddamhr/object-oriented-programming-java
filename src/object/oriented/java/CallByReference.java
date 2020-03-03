
package object.oriented.java;


public class CallByReference {

    String name;
    
    void change(CallByReference r2){
        
        r2.name = "Rubel";
    }
    
}
