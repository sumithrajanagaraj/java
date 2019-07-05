class Encapsulation 
{
    private String name; 
    private int rollno; 
    private int age;  
    public int getAge()  
    { 
      return age; 
}
    public String getName()  
    { 
      return name; 
    }  
    public int getRoll()  
    { 
       return rollno; 
    } 
    public void setAge( int newAge) 
    { 
      age = newAge; 
    } 
    public void setName(String newName) 
    { 
      name = newName; 
    } 
    public void setRoll( int newRoll)  
    { 
      rollno = newRoll; 
    }  
}
public class Encapsulate
{     
    public static void main(String args[])  
    { 
        Encapsulation obj = new Encapsulation();   
        obj.setName("summi"); 
        obj.setAge(21); 
        obj.setRoll(55);
        System.out.println("name: " + obj.getName()); 
        System.out.println("age: " + obj.getAge()); 
        System.out.println("rollno: " + obj.getRoll());
}
} 
