class array2
{
public static void main(String args[])
{
int ar[]= {11,12,13,14,15};
int count=0;
int count2=0;

System.out.println("------------array elements-------------");
for(int i=0;i<ar.length;i++) {
        if (ar[i] %2 == 0)
            count++;
        else
            count2++;
    }
System.out.println("no of elements:"+ar.length);
System.out.println("even no:"+count);
System.out.println("odd no:"+count2);
}
}