
package encapsulation;


public class EncapsultionTest {

    public static void main(String[] args) {
        
        Person p1 = new Person();
    
        p1.setName("Saddam");
        System.out.println("Name : "+p1.getName());
        p1.setAge(22);
        System.out.println("Age : "+p1.getAge());
        
    }
    
}
