public class Circle extends Shape
{
    @Override
    public void calculateArea(int r, int pi) {
        System.out.println((pi*r)*(pi*r));
    }

    @Override
    public void calculatePerimeter(int r, int pi)
    {
        System.out.println(2*pi*r);
    }
}
