
package inheritance2;


public class Teacher extends Person{
    
    String qualification;

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
    
    void displayInformation(){
        
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Qualification : "+qualification);
        System.out.println("\n\n");
        
    }
    
}
