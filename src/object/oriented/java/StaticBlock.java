
package object.oriented.java;


public class StaticBlock {

    /*static int id;
    static String name;*/
    
    static{
        
        System.out.println("Static Block");
    }
    
    /*static void displayInfo(){
        
        System.out.println("ID : "+id);
        System.out.println("Name : "+name);
        
    }*/
    
    public static void main(String[] args){
        
        //StaticBlock.displayInfo();
        System.out.println("Main Method");
        
    }
    
}
