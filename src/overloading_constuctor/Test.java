
package overloading_constuctor;


public class Test {

    public static void main(String[] args) {
        
        Teacher teacher1 = new Teacher();
        //teacher1.displayInformation();
        
        Teacher teacher2 = new Teacher("Saddam Hossaib", "Male");
        teacher2.displayInformation();
        
        Teacher teacher3 = new Teacher("Taifur Rahman","Male","01725556353");
        teacher3.displayInformation();
        
        
    }
    
}
