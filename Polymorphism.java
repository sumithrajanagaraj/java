class Doctor{
  public void treatPatient(){
  System.out.println("Doctors details");
  
}
class Surgeon extends Doctor{
  public void treatPatient(){
 System.out.println("Surgeon details");
  }
}
}
class Polymorphism{
  public static void main(String args[])
{
    Doctor doctorObj = new Doctor();
    doctorObj.treatPatient();
   
    Surgeon surgeonObj = new Surgeon();
    surgeonObj.treatPatient();
  }
}