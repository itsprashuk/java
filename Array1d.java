import  java.util.Scanner;
class Array1d
{
public static void main(String args[])
{
int n;
Scanner sc=new Scanner(System.in);
System.out.println("enter a length of an array");
n=sc.nextInt();
int a[]=new int[n];
System.out.println("enter "+n+"Elements store in array");
for( int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
System.out.println("elements are present in an array :\n");
for( int i=0;i<n;i++)
{
System.out.println(a[i]);
}
}
}


