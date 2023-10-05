class Base1
{
    Base1()
    {
        System.out.println("i am a constructor");
    }
    Base1(int x)
    {
        System.out.println("i am an overloaded constructor with value of x as:"+x);
    }
    
}
class Derived1 extends Base1{
    Derived1()
    {
       //super(0);
       System.out.println("i am a derived class constructor");
    }
    Derived1(int x,int y)
    {
        super(x);
        System.out.println("i am a overloaded constrctor of derived with with value of y as:"+y);

    }
} 
class ChildOfDerived extends Derived1
{
    ChildOfDerived()
    {
        System.out.println("i am child of derived costructor");
    }
    ChildOfDerived(int x,int y, int z)
    {
        super(x,y);
        System.out.println("i am an overloaded constructor  of derived with value of z as:"+z);
    }
}
class demo
{
    public static void main(String args[])
    {
        ChildOfDerived co =new ChildOfDerived(12,13,15);
    }
}