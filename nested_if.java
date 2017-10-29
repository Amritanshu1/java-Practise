import java.util.Scanner;
class nested_if
{
public static void main(String[] args)
{
Scanner obj1=new Scanner(System.in);
int a,b,c;
System.out.println("Enter 1st number");
a=obj1.nextInt();
System.out.println("Enter 2nd number");
b=obj1.nextInt();
System.out.println("Enter 3rd number");
c=obj1.nextInt();
if(a>b)
   {
       if(a>c)
      {
            System.out.println("First is greatter");
       }
        else{
             System.out.println("Third is greatter");
             }
}
else
{
if(b>c)
{
System.out.println("Second is greatter");
}
else
{
System.out.println("Third is greatter");
}
}
}
} 