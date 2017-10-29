import java.util.Scanner;
class simple_if
{
public static void main(String[] arg)
{
  Scanner obj1=new Scanner(System.in);
 int i,b ;
System.out.println("Enter number:");
i=obj1.nextInt();
if(i>5000)
{
b=(i*10)/100;
i=i+b;
System.out.println("Salary is :"+i);
}
}
}