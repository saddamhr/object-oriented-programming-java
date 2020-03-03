
package methodoverriding;


public class Teacher extends Person{

    String qulaification;
    
    @Override
    void displayInformation(){
        
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Qualification : "+qulaification);
        System.out.println("\n\n");
    }
    
}
