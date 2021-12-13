class Constructor
{
String name;
int empid;
Constructor(String name,int empid)
{
this.name=name;
this.empid=empid;

}
public static void main(String args[])
{
Constructor c =new Constructor("prashuk",100);
Constructor c1 =new Constructor("satyam",101);
System.out.println(c.name);
System.out.println(c1.name);
}
}