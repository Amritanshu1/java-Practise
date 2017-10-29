import java.util.Scanner;
class input
{
public static void main(String[] args)
{
   int i,j,k;
 Scanner obj1=new Scanner(System.in);
System.out.println("Enter number:");
 i=obj1.nextInt();

System.out.println("Enter second Number:");
j=obj1.nextInt();
k=i*j;
System.out.println("Result is:"+k);
}
}