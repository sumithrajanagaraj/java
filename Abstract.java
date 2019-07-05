public class Abstract
{
public static void main(String args[])
{
MaheshPhone obj = new RameshPhone();
obj.call();
obj.move();
obj.dance();
obj.sing();
}
}
abstract class MaheshPhone
{
public void call()
{
System.out.println("calling");
}
public abstract void move();
public abstract void dance();
public abstract void sing();
}
abstract class SureshPhone extends MaheshPhone
{
public void move()
{
System.out.println("moving");
}
}
class RameshPhone extends SureshPhone 
{
public void dance()
{
System.out.println("dancing");
}
public void sing()
{
System.out.println("singing");
}
}