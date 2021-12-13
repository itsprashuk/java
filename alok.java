//example of multilevel inheritance
class subham1
{
void pj()
{
System.out.println("i am subham");
}
}
class prashuk3 extends subham1
{
void pj2()
{
System.out.println("i am prashuk");
}
}
class alok extends prashuk3
{
void display()
{
System.out.println("i am alok");
}
public static void main(String args[])
{
alok a=new alok();
a.display();
a.pj2();
a.pj();
}
}