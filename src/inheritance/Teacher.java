
package inheritance;


public class Teacher extends Person {

    String qualification;
    
    void displayInformation2(){
        
        dislplayIformation1();
        System.out.println("Qualification : "+qualification);
        System.out.println("\n\n");
    }
    
}

