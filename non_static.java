class static_var
{
 int i=5;
  
 public static void main(String[] args)
{
  int i=2;

static_var a1=new static_var();

  System.out.println(i);
 m1();
  System.out.println(a1.i);
}
public static void m1()
{
static_var a2=new static_var();

System.out.println(a2.i);

}
}