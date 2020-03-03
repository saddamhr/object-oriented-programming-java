
package overloading_constuctor;


public class Teacher {

    String name, gender, phoneNumber;
    
    Teacher(){
        
        System.out.println("No Information");
        
    }
    
    Teacher(String n, String g){
        
        name = n;
        gender = g;
    }
    
    Teacher(String n, String g, String p){
        
        name = n;
        gender = g;
        phoneNumber = p;
    }
    
    void displayInformation(){
        
        System.out.println("Name : "+name);
        System.out.println("Gender : "+gender);
        System.out.println("Phone Number : "+phoneNumber);
        System.out.println("\n\n");
        
    }
    
}
