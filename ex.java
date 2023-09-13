   class cylinder
   {
    private int radius;
    private int height;
    public cylinder(int r,int h)
    {
       this.radius = r;
       this.height = h;
    }

    public void setRadius(int r)
    {
        this.radius = r;
    }
    public int getRadius()
    {
        return radius;
    }
    public void setHeight(int h)
    {
        this.height = h;
    }
    public int getHeight()
    {
        return height;
    }
    public double surfaceArea()
    {
        return 2* Math.PI *radius*radius +2 * Math.PI *radius *height;
    }
    public double volume()
    {
       return Math.PI *radius*radius*height;
    }
   }
   public class ex
   {
    public static void main(String args[])
    {
        cylinder e1= new cylinder(9,12);
        //e1.setRadius(9);
        //e1.setHeight(12);
        System.out.println(e1.getRadius());
        System.out.println(e1.getHeight());
        System.out.println(e1.surfaceArea());
        System.out.println(e1.volume());
    }
   }
