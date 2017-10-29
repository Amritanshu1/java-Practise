import java.util.Scanner;
class else_if
{
public static void main(String[] args)
{
Scanner obj1=new Scanner(System.in);
int i;
char grade;
System.out.println("Enter marks");
i=obj1.nextInt();
if(i>=90)
{
   grade='A';
}
else if(i>=80)
{
grade='B';
}
else if(i>=70)
{
grade='C';
}
else if(i>=60)
{
grade='D';
}
else if(i>=50)
{
grade='E';
}
else
{
grade='u';
}
  System.out.println("Grade is"+grade);
}
}