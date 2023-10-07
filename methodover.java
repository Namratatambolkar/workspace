class a
{
    public int a;
    public int harry()
    {
        return 4;
    }
    public void meth2()
    {
        System.out.println("i am method2 of class a");
    }
}
class b extends a
{
  public  void meth2()
  {
    System.out.println("i am method 3 of class b");
  }
}
public class methodover
{
    public static void main(String args[])
    {
        a A = new a();
        a.meth2();
        b B = new b();
        b.meth2();
    }
}
