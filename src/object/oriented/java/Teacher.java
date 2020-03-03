
package object.oriented.java;


public class Teacher {
    
    String name, gender, phoneNumber;
    
    /*Teacher(){
        
        System.out.println("No Value");
    }
    
    Teacher(String n, String g, String p){
        
        name = n;
        gender = g;
        phoneNumber = p;
        
    }*/
    
    void displayInformation(){
        
        System.out.println("Name : "+name);
        System.out.println("Gender : "+gender);
        System.out.println("Phone Number : "+phoneNumber);
        System.out.print("\n\n");
        
    }
    
}
