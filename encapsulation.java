// example of encapsulation

class Encapsulation
{
private int empid;
public void setEmpid(int eid)
{
empid=eid;
}
public  int getEmpid()
{
return empid;
}
}
class company{
public static void main(String args[])
{
Encapsulation e = new Encapsulation();
e.setempid(100);
System.out.println(e.getEmpid());
}
}
