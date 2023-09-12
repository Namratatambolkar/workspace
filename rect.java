class rectangle
{
    private int length;
    private int breadth;
    public rectangle()
    {
        this.length = 4;
        this.breadth =5;
    }
    public rectangle(int length,int breadth)
    {
       this.length=length;
       this.breadth = breadth;
    }
    public int getLength()
    {
       return length;
    }
    public int getBreadth()
    {
        return breadth;
    }
    
}
public class rect 
{
  public static void main(String args[])
  {
    rectangle r1 = new rectangle(4, 5);
    System.out.println(r1.getLength());
    System.out.println(r1.getBreadth());
  }
}