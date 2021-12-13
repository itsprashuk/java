//example of herarichal inheritance
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
class alok1 extends subham1
{
void display()
{
System.out.println("i am alok");
}
public static void main(String args[])
{
alok1 a=new alok1();
a.display();
a.pj();

}
}