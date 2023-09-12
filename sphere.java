class sp
{
    private int radius;
    public void setRadius(int r)
    {
       this.radius=r;
    }
    public int getRadius()
    {
        return radius;
    }
    public double spArea()
    {
       return 4 * Math.PI* radius * radius;
    }


}
public class sphere
{
    public static void main(String args[])
    {
        sp s1 = new sp();
         s1.setRadius(3);
        System.out.println(s1.getRadius());
        System.out.println(s1.spArea());
    }
}